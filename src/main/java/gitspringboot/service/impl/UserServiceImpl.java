package gitspringboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import gitspringboot.entity.User;
import gitspringboot.mapper.UserMapper;
import gitspringboot.service.IUserService;


@Service
@Slf4j
@AllArgsConstructor
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public String test(String username) {

        LambdaQueryWrapper<User> queryWrapper = Wrappers.<User>query().lambda();
        queryWrapper.eq(User::getUserName,username);
//        this.baseMapper.selectOne(queryWrapper).getPassWord()
        return null;
    }

}
