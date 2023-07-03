package gitspringboot.config.annotation;

import gitspringboot.modules.firstModule.entity.User;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Beanss {
    public void user(){
        User user = new User();
        System.out.println("我是Beanss");
    }
}
