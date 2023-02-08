package gitspringboot.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import gitspringboot.modules.firstModule.firstmodule.entity.User;
import gitspringboot.modules.firstModule.firstmodule.model.LoginInfo;

public interface IUserLoginService extends IService<User> {

    User userlogin(LoginInfo loginInfo);

}
