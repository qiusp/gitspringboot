package gitspringboot.modules.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import gitspringboot.modules.firstModule.entity.User;
import gitspringboot.modules.firstModule.model.LoginInfo;

public interface IUserLoginService extends IService<User> {

    User userlogin(LoginInfo loginInfo);

}
