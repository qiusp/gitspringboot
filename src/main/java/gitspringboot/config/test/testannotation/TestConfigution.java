package gitspringboot.config.test.testannotation;

import gitspringboot.modules.firstModule.firstmodule.entity.TestStudent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfigution {

    @Bean
    public TestStudent student(){
        return new TestStudent("qsp",18);
    }

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(TestConfigution.class);
        context.refresh();
    }
}
