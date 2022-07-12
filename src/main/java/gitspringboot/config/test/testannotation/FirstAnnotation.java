package gitspringboot.config.test.testannotation;

import java.lang.annotation.*;

/**
 * 注解
 * @author Administrator
 */

//义注解@FirstAnnotation可用在方法或字段上
@Inherited
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FirstAnnotation {
    int type() default 0;
    String level() default "info";
    String value() default "";
}


