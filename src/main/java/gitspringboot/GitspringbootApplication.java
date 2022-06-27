package gitspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("gitspringboot.mapper*")
public class GitspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(GitspringbootApplication.class, args);
    }

}
