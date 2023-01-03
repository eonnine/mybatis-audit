package spring.audit.annotation;

import spring.audit.type.CommandType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Audit {

    Class<?> target();

    String label() default "";

    String format() default "%s"; // s는 label이 들어감

    CommandType commandType() default CommandType.NONE;

}