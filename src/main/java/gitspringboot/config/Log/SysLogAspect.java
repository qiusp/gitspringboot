package gitspringboot.config.Log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * 接口调用日志，需要记录接口的入参和返回值，
 * 这里使用到spring的AOP
 */
//@Aspect
@Component
@Slf4j
public class SysLogAspect {

}
