package gitspringboot.modules.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import gitspringboot.modules.entity.User;

public interface IUserService extends IService<User> {

    IPage<User> test(Page<User> page);

    User addUser(User user);

    boolean addUser1(User user);

    User getDataById(int id);

    Boolean updateContentById(String contetnt, Long id);

    User userlogin();

}
