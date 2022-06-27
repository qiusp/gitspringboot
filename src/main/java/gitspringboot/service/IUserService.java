package gitspringboot.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import gitspringboot.entity.User;

public interface IUserService extends IService<User> {

    IPage<User> test();

}
