package gitspringboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import gitspringboot.entity.User;
import gitspringboot.mapper.UserMapper;
import gitspringboot.service.IUserService;

import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public IPage<User> test() {
        LambdaQueryWrapper<User> queryWrapper = Wrappers.<User>query().lambda();
        queryWrapper.eq(User::getUserName,"qsp");
        List<User> userList= this.list();

        Page<User> userPage = new Page<>(1,userList.size(),userList.size(),true);
        userPage.setRecords(userList);
        return userPage;
    }

}
