package org.startsteps.week10.day04.exercises.openclosed;

public class Exercise2 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        PerimeterCalculator calculator = new PerimeterCalculator();

        System.out.println("The perimeter of a circle is: " + calculator.calculate(circle));
        System.out.println("The perimeter of a square is: " + calculator.calculate(square));
    }
}

interface Shape {
    double calculatePerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}

class PerimeterCalculator {
    public double calculate(Shape shape) {
        return shape.calculatePerimeter();
    }
}


// Break until 12:05
