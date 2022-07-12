package gitspringboot.config.test.testannotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.FIELD})
public @interface FirstAnnotations{
    FirstAnnotation[] value();
}
