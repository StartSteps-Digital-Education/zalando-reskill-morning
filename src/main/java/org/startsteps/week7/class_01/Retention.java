package org.startsteps.week7.class_01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
@interface ClassRetention {
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
@interface SourceRetention {
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface RuntimeRetention {
}

@ClassRetention
@SourceRetention
@RuntimeRetention
class EmployeeRetentionAnnotation {

}