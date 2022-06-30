package gitspringboot.modules.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import gitspringboot.modules.entity.User;
import gitspringboot.modules.mapper.UserMapper;
import gitspringboot.modules.service.IUserService;

import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public IPage<User> test(Page<User> page) {
        LambdaQueryWrapper<User> queryWrapper = Wrappers.<User>query().lambda();
        queryWrapper.eq(User::getUserName,"qsp");
        List<User> userList= this.list();

        page = new Page<>(1,userList.size(),userList.size(),true);
        page.setRecords(userList);
        return page;
    }

    @Override
    public boolean addUser(User user) {
        user.setUserName("qsp").setPassWord("789").setId(3L);
        return baseMapper.insert(user) > 0;
    }

}
