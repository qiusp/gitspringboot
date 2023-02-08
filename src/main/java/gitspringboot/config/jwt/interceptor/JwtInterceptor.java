package gitspringboot.config.jwt.interceptor;

import cn.hutool.json.JSONObject;
import com.alibaba.fastjson.JSON;
import gitspringboot.config.Redis.RedisUtils;
import gitspringboot.config.jwt.JtwUtils;
import gitspringboot.modules.firstModule.firstmodule.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * 拦截器，拦截带有@UserLoginToken注解的请求，有的话进行验证
 * preHandle: 预先处理,在目标的controller方法执行之前,进行处理
 *
 * postHandle: 在目标的controller方法执行之后,到达指定页面之前进行处理
 *
 * afterCompletion: 在页面渲染之后进行处理
 *
 * 1.Springboot通过实现HandlerInterceptor接口实现拦截器
 *
 * 2.通过WebMvcConfigurer实现一个配置类,再通过@Configuration 注解注入到容器
 *
 * 3.指定拦截规则
 */
@Component
public class JwtInterceptor implements HandlerInterceptor {
    @Autowired
    private RedisUtils redisUtils;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)throws Exception{

        //第一次请求的方法为"OPTIONS"，具体可以看TCP/IP协议
        // 这里是个坑，因为带请求带headers时，ajax会发送两次请求，
        // 第一次会发送OPTIONS请求，第二次才会发生get/post请求，所以要放行OPTIONS请求
        // 如果是OPTIONS请求，让其响应一个 200状态码，说明可以正常访问
        //if(request.getMethod().equals("OPTIONS")){
        String options= HttpMethod.OPTIONS.toString();
        if(request.getMethod().equals(options)){
            response.setStatus(HttpServletResponse.SC_OK);
            //登陆时判断redis是否有过期token,有的话清除

            return true;
        }

        response.setCharacterEncoding("utf-8");

        String token = request.getHeader("Authorization");
        if(token != null){
            //验证token
            boolean result = JtwUtils.verifyToken(token);
            if(!result){
                //Token过期处理
                User userInfo = (User)redisUtils.get(token);
                String newToken = JtwUtils.createToken(userInfo);
                response.setHeader("Authorization",newToken);
                if (!token.equals(newToken)){
                    redisUtils.del(token);
                    redisUtils.set(newToken, userInfo);
                }else {
                    System.out.println("redis不变");
                }

                //JSONObject json = new JSONObject();
                //json.put("msg","token自动续期");
                //json.put("code","300");
                //PrintWriter append = response.getWriter().append(JSON.toJSONString(json));
                return true;
            }
            if(result){
                return true;
            }
            //解析token 校验登录信息
            System.out.println("Token过期时间：" + JtwUtils.getTokenInfo(token).getExpiresAt());
        }


        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json; charset=utf-8");
        try{
            JSONObject json = new JSONObject();
            json.put("success","false");
            json.put("msg","认证失败，未通过拦截器");
            json.put("code","500");
            PrintWriter append = response.getWriter().append(JSON.toJSONString(json));
            System.out.println("认证失败，未通过拦截器");
        }catch (Exception e){
            e.printStackTrace();
            response.sendError(500);
            return false;
        }
        return false;
    }

}

