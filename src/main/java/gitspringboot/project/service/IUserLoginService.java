package gitspringboot.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fasterxml.jackson.core.JsonProcessingException;
import gitspringboot.modules.entity.User;
import gitspringboot.modules.model.LoginInfo;

public interface IUserLoginService extends IService<User> {

    User userlogin(LoginInfo loginInfo);

}
