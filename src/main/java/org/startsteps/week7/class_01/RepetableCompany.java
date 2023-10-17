package org.startsteps.week7.class_01;

import java.lang.annotation.*;

@Repeatable(RepeatableCompanies.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RepetableCompany {
    String name() default "Name_1";
    String city() default "City_1";
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface RepeatableCompanies {
    RepetableCompany[] value() default {};
}
