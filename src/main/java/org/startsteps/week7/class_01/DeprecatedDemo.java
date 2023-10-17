package org.startsteps.week7.class_01;


public class DeprecatedDemo {

    @Deprecated(since = "4.5", forRemoval = true)
    public void testLegacyFunction() {
        System.out.println("This is a legacy function");
    }
}

