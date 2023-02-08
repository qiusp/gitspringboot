package gitspringboot.modules.firstModule.firstmodule.service.Impl;


import gitspringboot.modules.firstModule.firstmodule.service.IRedisGrpcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;


//String（字符串）、List(列表)、Set(集合)、Hash(散列)、ZSet(有序集合)
//        stringRedisTemplate.opsForValue();[String(字符串)]
//        stringRedisTemplate.opsForList();[List(列表)]
//        stringRedisTemplate.opsForSet();[Set(集合)]
//        stringRedisTemplate.opsForHash();[Hash(散列)]
//        stringRedisTemplate.opsForZSet();[ZSet(有序集合)]

//操作Redis是两个类，RedisTemplate类和StringTemplate类

@Service
@Slf4j
public class RedisServiceImpl implements IRedisGrpcService {

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Override
    public void add() {
        stringRedisTemplate.opsForValue().append("first","success");
    }
}
