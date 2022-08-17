package gitspringboot.config.jwt;

import cn.hutool.core.date.DateUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import gitspringboot.modules.model.LoginInfo;

import java.util.Calendar;
import java.util.Date;

public class JtwUtils {

    //密钥
    public static final String SECRET = "qspJwt";
    //过期时间:秒
    public static final int EXPIRE = 60;


    /**
     * 生成token
     * @return
     */
    public static String createToken(LoginInfo user){
        //获取当前的时间，还能指定需要获取的时间点,当前时间加5分钟
        Calendar nowTime = Calendar.getInstance();
        nowTime.add(Calendar.MINUTE,EXPIRE);
        Date expiresDate = nowTime.getTime();
        //签发对象
        return JWT.create().withAudience()
                //发行时间
                .withIssuedAt(new Date())
                //设置过期时间
                .withExpiresAt(expiresDate)
                //载荷，随便写几个都可以
                .withClaim("userName", user.getUsername())
                .withClaim("password", user.getPassword())
                //加密
                .sign(Algorithm.HMAC256(SECRET));
    }

    /**
     * 检验合法性，其中secret参数就应该传入的是用户的id
     * @param token
     */
    public static Boolean verifyToken(String token){
        try {
            //创建token验证器
            JWTVerifier jwtVerifier=JWT.require(Algorithm.HMAC256(SECRET)).build();
            DecodedJWT decodedJWT=jwtVerifier.verify(token);
            String ExpiresAt = DateUtil.format(decodedJWT.getExpiresAt(), "yyyy/MM/dd HH:mm:ss");

            System.out.println("认证通过：");
            System.out.println("username: " + decodedJWT.getClaim("userName").asString());
            System.out.println("过期时间：  " + ExpiresAt);
        } catch (Exception e) {
            //抛出错误即为验证不通过
            System.out.println(e);
            return false;
        }
        return true;

    }


    /**
     * 获取token信息方法
     *  验证token,正确通过,否则抛出异常
     * @param token
     * @return
     */
    public static DecodedJWT getTokenInfo(String token) {
        DecodedJWT verify = JWT.require(Algorithm.HMAC256(SECRET)).build().verify(token);
        return verify;
    }


    /**
     * 获取签发对象
     * @param token
     * @return
     */
    public static  String getAudience(String token){
        String audience = null;
        try {
            audience =JWT.decode(token).getAudience().get(0);
        }catch (JWTDecodeException j){
            System.out.println(j);
        }
        return audience;
    }

    /**
     * 通过载荷名字获取载荷的值
     */
    public static Claim getClaimByName(String token, String name){
        return JWT.decode(token).getClaim(name);
    }
}
