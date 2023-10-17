package org.startsteps.week7.class_01;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Test {
}

class AnnotatedMethods {

    @Test
    public void test1(){
        System.out.println("This is the first test");
    }

    @Test
    public void test2(){
        System.out.println("This is the second test");
    }

    @Test
    public void test3(){
        System.out.println("This is the third test");
    }

    public void test4(){
        System.out.println("This is the fourth test");
    }



}

class TestAnnotatedMethods {


    public static void main(String[] args){
        Class<AnnotatedMethods> annotatedMethodsClass = AnnotatedMethods.class;
        for (Method method: annotatedMethodsClass.getMethods()) {
            Annotation annotation = method.getAnnotation(Test.class);
            if (method.isAnnotationPresent(Test.class)){
                try {
                    method.invoke(annotatedMethodsClass.getDeclaredConstructor().newInstance());
                } catch (Throwable e) {
                    System.out.println(e.getCause());
                }
            }
        }
    }

}