package gitspringboot;

import gitspringboot.modules.firstModule.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class GitspringbootApplicationTests {

    @Resource
    private IUserService userService;

    @Test
    void user() {
        userService.getDataById(55);
    }

    @Test
    void contextLoads() {
    }

}
