package org.startsteps.week10.day04;

public class LiskovDemo {
}


interface Car {

    void turnOnEngine();
    void accelerate();
}

class MotorCar implements Car {

    private Engine engine;

    //Constructors, getters + setters

    public void turnOnEngine() {
        //turn on the engine!
        engine.on();
    }

    public void accelerate() {
        //move forward!
        engine.powerOn(1000);
    }
}

class ElectricCar implements Car {

    public void turnOnEngine() {
        throw new IllegalStateException("I don't have an engine!");
    }

    public void accelerate() {
    }
}


class Engine {
    public void on(){

    }

    public void powerOn(int power){

    }
}