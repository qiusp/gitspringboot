package gitspringboot.project.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import gitspringboot.config.jwt.JtwUtils;
import gitspringboot.config.jwt.PassToken;
import gitspringboot.config.util.R;
import gitspringboot.modules.entity.User;
import gitspringboot.modules.model.LoginInfo;
import gitspringboot.project.service.IUserLoginService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

@RestController//RestController是做rest服务的，以json方式返回数据。RequestMapping 路径映射配置。
@RequestMapping("/login")
public class LoginController {
    @Resource
    IUserLoginService userLoginService;

    @PostMapping(value = "/userlogin")
    public R<User> userlogin(@RequestBody LoginInfo loginInfo, HttpServletResponse response) {
        User user = userLoginService.userlogin(loginInfo);
        if(user != null){
            String token = JtwUtils.createToken(loginInfo);
            //设置首次登录respone
            response.setHeader("Authorization",token);
            user.setToken(token);
            return R.ok(user);
        }
        else {
            return R.failure("登录失败");
        }

    }

}
