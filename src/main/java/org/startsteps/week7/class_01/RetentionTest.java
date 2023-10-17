package org.startsteps.week7.class_01;

public class RetentionTest {

    public static void main(String[] args){
        SourceRetention[] sourceRetention = new EmployeeRetentionAnnotation()
                .getClass()
                .getAnnotationsByType(SourceRetention.class);
        System.out.println("Source Retentions at runtime: " + sourceRetention.length);

        RuntimeRetention[] runtimeRetention = new EmployeeRetentionAnnotation()
                .getClass()
                .getAnnotationsByType(RuntimeRetention.class);
        System.out.println("Runtime Retentions at runtime: " + runtimeRetention.length);

        ClassRetention[] classRetention = new EmployeeRetentionAnnotation()
                .getClass()
                .getAnnotationsByType(ClassRetention.class);
        System.out.println("Class Retentions at runtime: " + classRetention.length);

    }

}
