package org.startsteps.week10.day04;

public class LiskovCorrectDemo {
}

interface MyCar {
    void accelerate();
}

interface EngineCar extends MyCar {
    void turnOnEngine();
}

class MyMotorCar implements EngineCar {

    private MyEngine engine;

    @Override
    public void turnOnEngine() {
        engine.on();
    }

    @Override
    public void accelerate() {
        engine.powerOn(1000);
    }
}

class MyElectricCar implements MyCar {

    @Override
    public void accelerate() {
        // Implementation for electric car to accelerate
    }
}

class MyEngine {
    public void on() {
        // Engine is turned on
    }

    public void powerOn(int power) {
        // Engine power is set
    }
}
