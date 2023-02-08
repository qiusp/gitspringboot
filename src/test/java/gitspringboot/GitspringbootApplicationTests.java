package gitspringboot;

import gitspringboot.modules.firstModule.firstmodule.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitspringbootApplicationTests {

    IUserService userService;

    @Test
    void user() {
        userService.getDataById(55);
    }

    @Test
    void contextLoads() {
    }

}
