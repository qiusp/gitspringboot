package gitspringboot.modules.firstModule.firstmodule.controller;

import gitspringboot.modules.firstModule.firstmodule.service.ISlf4jService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/slf4j")
public class SpringbootSlf4jController {

    @Resource
    ISlf4jService slf4jService;

    @GetMapping("/log")
    public String testLog(@RequestParam String param1){
        return slf4jService.testLog();
    }
}
