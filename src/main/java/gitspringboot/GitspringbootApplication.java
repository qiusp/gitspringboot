package gitspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("gitspringboot.mapper*")
@EnableScheduling
public class GitspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitspringbootApplication.class, args);
    }

}
