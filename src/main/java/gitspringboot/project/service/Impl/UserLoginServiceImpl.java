package gitspringboot.project.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import gitspringboot.modules.firstModule.firstmodule.entity.User;
import gitspringboot.modules.firstModule.firstmodule.mapper.UserMapper;
import gitspringboot.modules.firstModule.firstmodule.model.LoginInfo;
import gitspringboot.project.service.IUserLoginService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class UserLoginServiceImpl extends ServiceImpl<UserMapper, User> implements IUserLoginService {

    @Override
    public User userlogin(LoginInfo loginInfo) {
        LambdaQueryWrapper<User> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(User::getUserName,loginInfo.getUsername());
        queryWrapper.eq(User::getPassWord,loginInfo.getPassword());
        List<User> userList= this.list(queryWrapper);

        LoginInfo loginInfo1 = new LoginInfo();
        if (userList.size() > 0){
            //BeanUtil.copyProperties(userList.get(0), loginInfo1);
            return userList.get(0);
        }
        return null;
    }
}
