package gitspringboot.config.jwt;

import cn.hutool.core.date.DateUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.DecodedJWT;
import gitspringboot.modules.firstModule.entity.User;

import java.util.Calendar;
import java.util.Date;

public class JtwUtils {


    //密钥
    public static final String SECRET = "qspJwt";

    //过期时间
    private static final Integer EXPIRE = 5;
    //需要重新生成的天数 如果token的时间超过这个 则重新生成token
    private static final Integer NEED_CREATE_DAY = 60;


    /**
     * 生成token
     * @return
     */
    public static String createToken(User user){
        //获取当前的时间，还能指定需要获取的时间点,当前时间加5分钟
        Calendar nowTime = Calendar.getInstance();
        nowTime.add(Calendar.SECOND,EXPIRE);
        Date expiresDate = nowTime.getTime();
        //签发对象
        return JWT.create().withAudience("Qsp")
                //发行时间
                .withIssuedAt(new Date())
                //设置过期时间
                .withExpiresAt(expiresDate)
                //载荷，随便写几个都可以
                .withClaim("userName", user.getUserName())
                .withClaim("password", user.getPassWord())
                //加密
                .sign(Algorithm.HMAC256(SECRET));
    }

    /**TokenExpiredException token过期则自动续期
     * 检验合法性，其中secret参数就应该传入的是用户的id
     * @param token
     */
    public static Boolean verifyToken(String token){
        try {
            DecodedJWT decodedJWT = JWT.require(Algorithm.HMAC256(SECRET)).build().verify(token);
            //创建token验证器
            String ExpiresAt = DateUtil.format(decodedJWT.getExpiresAt(), "yyyy/MM/dd HH:mm:ss");

            System.out.println("认证通过");
            System.out.println("username: " + decodedJWT.getClaim("userName").asString());
            System.out.println("过期时间：  " + ExpiresAt);
        } catch (TokenExpiredException tokenExpiredException) {
            System.out.println("token自动续期");
            return false;
        }
        return true;
    }

    /**
     * 获取token信息方法
     *  验证token,正确通过,否则抛出异常
     *
     *  verify
     * @param token
     * @return
     */
    public static DecodedJWT getTokenInfo(String token) {
        try {
            return JWT.require(Algorithm.HMAC256(SECRET)).build().verify(token);
        }catch (Exception e){
            return null;
        }
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
     * 是否需要重新生成token （为了延续token时长）
     * @param decodedJWT
     * @return
     */
    public static boolean needCreate(DecodedJWT decodedJWT){
        Date timeoutDate = decodedJWT.getExpiresAt();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE,EXPIRE - NEED_CREATE_DAY);
        System.out.println(calendar.getTime());
        if(timeoutDate.before(calendar.getTime())){
            return true;
        }
        return false;
    }


}
