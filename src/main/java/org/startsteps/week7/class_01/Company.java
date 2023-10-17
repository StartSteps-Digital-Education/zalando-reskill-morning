package org.startsteps.week7.class_01;

import java.lang.annotation.*;

@Inherited
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Company {
    String name() default "ABC";
    String city() default "XYZ";
}