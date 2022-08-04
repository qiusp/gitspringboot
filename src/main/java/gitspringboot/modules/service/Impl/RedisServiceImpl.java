package gitspringboot.modules.service.Impl;


import gitspringboot.modules.service.IRedisGrpcService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
@Slf4j
public class RedisServiceImpl  implements IRedisGrpcService {

    @Autowired
    //StringRedisTemplate stringRedisTemplate;
    @Override
    public void add() {
        //stringRedisTemplate.opsForValue().append("first","success");
    }
}
