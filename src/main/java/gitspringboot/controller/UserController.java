package gitspringboot.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import gitspringboot.entity.User;
import gitspringboot.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController//RestController是做rest服务的，以json方式返回数据。RequestMapping 路径映射配置。
@RequestMapping("/user")
public class UserController {

    @Resource
    IUserService userService;

    @GetMapping(value = "/user")
    public IPage<User> test(){
        return userService.test();
    }

}
