package org.startsteps.week7.class_05;

public class LambdaDemo {

    public static void main(String[] args) {
        Greeting greeting = () -> {
            System.out.println("Hello");
        };

        greeting.greet();

        Square square = (e) -> e * e;

        int e = 3;
        System.out.println("Square of " + e + " is: " + square.square(3));



        Add add = (first, second) -> first + second;
        System.out.println("The result of add is: " + add.add(10, 20));
    }



}


@FunctionalInterface
interface Greeting {
    void greet();
}

@FunctionalInterface
interface Square {
    int square(int number);
}

@FunctionalInterface
interface Add {
    int add(int first, int second);
}