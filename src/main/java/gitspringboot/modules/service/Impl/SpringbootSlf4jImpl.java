package gitspringboot.modules.service.Impl;

import gitspringboot.modules.service.ISlf4jService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SpringbootSlf4jImpl implements ISlf4jService {

    @Override
    public String testLog() {
        log.debug("控制台输出日志");
        return "成功";
    }
}
