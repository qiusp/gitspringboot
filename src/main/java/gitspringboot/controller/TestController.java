package gitspringboot.controller;

import gitspringboot.entity.TestEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//RestController是做rest服务的，以json方式返回数据。RequestMapping 路径映射配置。
@RequestMapping("/test")
public class TestController {

    @PostMapping(value = "/hello")
    public String test(){
        return "hello";
    }

    //MediaType是什么？@RequestBody怎么用？
    @RequestMapping(value = "/testResXml",consumes= MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_XML_VALUE)
    public TestEntity hello(@RequestBody TestEntity json) {
        return json;
    }

}
