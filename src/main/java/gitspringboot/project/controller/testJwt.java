package gitspringboot.project.controller;

import gitspringboot.config.util.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//RestController是做rest服务的，以json方式返回数据。RequestMapping 路径映射配置。
@RequestMapping("/testJwt")
public class testJwt {
    @PostMapping(value = "/testJwt")
    public R<Boolean> testJwt() {
        return R.ok("成功");
    }

}
