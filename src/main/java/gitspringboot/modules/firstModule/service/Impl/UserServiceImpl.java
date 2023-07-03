package gitspringboot.modules.firstModule.service.Impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.protobuf.ServiceException;
import gitspringboot.config.Redis.RedisUtils;
import gitspringboot.modules.firstModule.entity.User;
import gitspringboot.modules.firstModule.model.LoginInfo;
import gitspringboot.modules.firstModule.mapper.UserMapper;
import gitspringboot.modules.firstModule.service.IUserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@AllArgsConstructor
@CacheConfig(cacheNames = "userCache")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Autowired
    RedisUtils redisUtils;
    @Override
    public IPage<User> test(Page<User> page) {
        LambdaQueryWrapper<User> queryWrapper = Wrappers.<User>query().lambda();
        queryWrapper.eq(User::getUserName,"qsp");
        List<User> userList= this.list();
        page = new Page<>(1,userList.size(),userList.size(),true);
        page.setRecords(userList);
        return page;
    }

    @CachePut(key = "#user.id")
    @Override
    public User addUser(User user) {
        user.setUserName(user.getUserName()).setPassWord(user.getPassWord()).setId(user.getId());
        baseMapper.insert(user);
        return user;
    }

    @Override
    public boolean addUser1(User user) {
        user.setUserName(user.getUserName()).setPassWord(user.getPassWord());
        user.setId(user.getId());
        baseMapper.insert(user);
        redisUtils.set(user.getId().toString(),user);
        return true;
    }

    @Override
    @Cacheable(key="#id")
    public User getDataById(int id){
        User user = this.getById(id);
        System.out.println("搜索记录id:{}查看数据缓存:"+user.getId());
        return user;
    }

    /**
     * 通过id更新内容 清除以id作为键的缓存
     *
     * @param id
     * @return
     */
    @Override
    @CacheEvict(key = "#id")
    public Boolean updateContentById(String contetnt, Long id) {
        User user = new User();
        user.setUserName(contetnt).setId(id);
        Boolean result = this.updateById(user);
        System.out.println("--执行更新操作id:--"+id);
        return result;
    }

    @Override
    public String userlogin(LoginInfo loginInfo) throws ServiceException {
        LambdaQueryWrapper<User> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(User::getUserName,loginInfo.getUsername());
        queryWrapper.eq(User::getPassWord,loginInfo.getPassword());
        List<User> userList= this.list(queryWrapper);
        User user = new User();
        if (userList.size() == 0) {
            return "登录失败";
        }
        return "登录成功";
    }
}
