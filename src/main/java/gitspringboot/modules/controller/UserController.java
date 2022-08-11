package gitspringboot.modules.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import gitspringboot.config.util.R;
import gitspringboot.modules.entity.User;
import gitspringboot.modules.model.LoginInfo;
import gitspringboot.modules.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController//RestController是做rest服务的，以json方式返回数据。RequestMapping 路径映射配置。
@RequestMapping("/user")
public class UserController {

    @Resource
    IUserService userService;

    @PostMapping(value = "/userpage")
    public IPage<User> test(@RequestBody Page<User> page){
        return userService.test(page);
    }

    @PostMapping(value = "/userlogin")
    public R<User> userlogin(@RequestBody LoginInfo loginInfo){
        User user = userService.userlogin();
        return R.ok(user);
    }

    @PostMapping (value = "/adduser")
    public R addUser(@RequestBody User user){
        User resule = userService.addUser(user);
        return R.ok(resule);
    }

    @GetMapping (value = "/addUser1")
    public R<Boolean> addUser1(@RequestBody User user){
        Boolean u = userService.addUser1(user);
        return R.ok(u);
    }
    @GetMapping (value = "/getDataById")
    public R<User> getDataById(@RequestParam("id") int id){
        User user = userService.getDataById(id);
        return R.ok(user);
    }

    @GetMapping (value = "/updateDataById")
    public R<Boolean> updateDataById(@RequestParam("id") Long id, @RequestParam("id") String content){
        Boolean user = userService.updateContentById(content,id);
        return R.ok(user);
    }
}
