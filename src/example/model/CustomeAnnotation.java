package example.model;

/*
* annotation is metadata that we can using when reflection
* annotation just can has method with simple data type and default value
*
* Attributes :
* @Target : describe annotation can used in class, method, field, or etc
* @Retention : describe is annotation is included in compile result or not (if not we cannot used it in reflection)
* */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(value = RetentionPolicy.RUNTIME)
@Target(value = {ElementType.TYPE})
public @interface CustomeAnnotation {
    // attributes
    String name() default "";
    String[] tags() default {};
}
