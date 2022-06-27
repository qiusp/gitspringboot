package gitspringboot.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import gitspringboot.config.util.R;
import gitspringboot.entity.User;
import gitspringboot.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController//RestController是做rest服务的，以json方式返回数据。RequestMapping 路径映射配置。
@RequestMapping("/user")
public class UserController {

    @Resource
    IUserService userService;

    @PostMapping(value = "/user")
    public IPage<User> test(Page<User> page){
        return userService.test(page);
    }

    @PostMapping (value = "/adduser")
    public R test(@RequestBody User user){
        return R.ok(userService.addUser(user));
    }


}
