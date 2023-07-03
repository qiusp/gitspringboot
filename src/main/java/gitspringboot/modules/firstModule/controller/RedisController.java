package gitspringboot.modules.firstModule.controller;

import gitspringboot.modules.firstModule.service.IRedisGrpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    IRedisGrpcService redisGrpcService;

    @GetMapping("/add")
    public void getMsgCount() {
        redisGrpcService.add();
    }

}
