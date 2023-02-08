package gitspringboot.project.controller;

import gitspringboot.config.Redis.RedisUtils;
import gitspringboot.config.jwt.JtwUtils;
import gitspringboot.config.util.R;
import gitspringboot.modules.firstModule.firstmodule.entity.User;
import gitspringboot.modules.firstModule.firstmodule.model.LoginInfo;
import gitspringboot.project.service.IUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@RestController//RestController是做rest服务的，以json方式返回数据。RequestMapping 路径映射配置。
@RequestMapping("/login")
public class LoginController {
    @Resource
    private IUserLoginService userLoginService;

    @Autowired
    private RedisUtils redisUtils;
    @PostMapping(value = "/userlogin")
    public R<User> userlogin(@RequestBody LoginInfo loginInfo, HttpServletResponse response) {
        User user = userLoginService.userlogin(loginInfo);
        if(user != null){
            String token = JtwUtils.createToken(user);
            //设置首次登录respone头部
            response.setHeader("Authorization",token);
            //缓存当前用户token
            redisUtils.set(token, user);
            return R.ok(user);
        }
        else {
            return R.failure("登录失败");
        }

    }

}
