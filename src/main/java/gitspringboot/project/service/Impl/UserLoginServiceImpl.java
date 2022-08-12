package gitspringboot.project.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.ServiceException;
import gitspringboot.config.jwt.JtwUtils;
import gitspringboot.config.util.RedisUtils;
import gitspringboot.modules.entity.User;
import gitspringboot.modules.mapper.UserMapper;
import gitspringboot.modules.model.LoginInfo;
import gitspringboot.project.service.IUserLoginService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
        if (userList.size() > 0){
            return userList.get(0);
        }
        return null;
    }
}
