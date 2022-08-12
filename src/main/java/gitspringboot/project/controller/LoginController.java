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
import java.util.HashMap;

@RestController//RestController是做rest服务的，以json方式返回数据。RequestMapping 路径映射配置。
@RequestMapping("/login")
public class LoginController {
    @Resource
    IUserLoginService userLoginService;

    @PassToken
    @PostMapping(value = "/userlogin")
    public R<User> userlogin(@RequestBody LoginInfo loginInfo) throws JsonProcessingException {
        User user = userLoginService.userlogin(loginInfo);
        if(user != null){
            String token = JtwUtils.createToken(loginInfo);
            HashMap<String,Object> hs=new HashMap<>();
            hs.put("token",token);

            ObjectMapper objectMapper=new ObjectMapper();
            String tokenResult = objectMapper.writeValueAsString(hs);

            user.setToken(token);
            return R.ok(user);
        }
        else {
            return R.failure("登录失败");
        }

    }

}
