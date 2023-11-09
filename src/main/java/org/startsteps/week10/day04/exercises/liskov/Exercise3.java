package org.startsteps.week10.day04.exercises.liskov;

public class Exercise3 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        VehicleOperator operator = new VehicleOperator();
        operator.operate(car);
        operator.operate(bicycle);
    }
}

interface EngineCapable {
    void startEngine();
}

abstract class Vehicle {
}

class Car extends Vehicle implements EngineCapable {
    @Override
    public void startEngine() {
        System.out.println("Car engine started.");
    }
}

class Bicycle extends Vehicle {
    public void startPedaling() {
        System.out.println("Bicycle pedaling started.");
    }
}

class VehicleOperator {
    public void operate(Vehicle vehicle) {
        if (vehicle instanceof EngineCapable) {
            ((EngineCapable) vehicle).startEngine();
        } else {
            System.out.println("This vehicle does not have an engine.");
        }
    }
}
