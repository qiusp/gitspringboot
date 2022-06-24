package gitspringboot.config.annotation;

import java.lang.annotation.*;

/**
 * @author Administrator
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface OperLog {

    /**
     * 说明
     */
    String Title();
}
