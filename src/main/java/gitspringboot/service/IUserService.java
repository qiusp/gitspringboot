package gitspringboot.service;

import com.baomidou.mybatisplus.extension.service.IService;
import gitspringboot.entity.User;

public interface IUserService extends IService<User> {

    String test(String username);

}
