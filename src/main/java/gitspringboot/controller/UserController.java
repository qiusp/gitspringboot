package gitspringboot.controller;

import gitspringboot.service.IUserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController//RestController是做rest服务的，以json方式返回数据。RequestMapping 路径映射配置。
@RequestMapping("/user")
public class UserController {

    IUserService userService;

    @PostMapping(value = "/user")
    public String test(@RequestParam("name") String username){
        return userService.test(username);
    }
}
