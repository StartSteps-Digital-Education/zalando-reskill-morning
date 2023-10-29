package org.startsteps.week8.day05;

import java.util.Arrays;
import java.util.List;

public class AbstractClassDemo {

    public static void main(String[] args) {

        List<Calculate> objects = Arrays.asList(
                new Addition(1, 20),
                new Subtraction(1, 3456),
                new Multiplication(12, 2),
                new Addition(10, 2),
                new Subtraction(32, 211)
        );

        for (Calculate object: objects) {
            System.out.println("The result of operation is: " + object.calculate());
        }
    }

}

interface Calculate {
    int calculate();
}

class Addition implements Calculate {


    private int x;
    private int y;

    public Addition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int calculate() {
        return x + y;
    }

}

class Subtraction implements Calculate {

    private int x;
    private int y;

    public Subtraction(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int calculate() {
        return y - x;
    }

}

class Multiplication implements Calculate {
    private int x;
    private int y;

    public Multiplication(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int calculate() {
        return y * x;
    }
}



