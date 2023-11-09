package org.startsteps.week10.day04.exercises.dependency;

public class Exercise1 {
    public static void main(String[] args) {
        Device lightBulb = new LightBulb();
        Device fan = new Fan();
        Device heater = new Heater();

        Switch lightSwitch = new Switch(lightBulb);
        Switch fanSwitch = new Switch(fan);
        Switch heaterSwitch = new Switch(heater);

        lightSwitch.toggle();
        fanSwitch.toggle();
        heaterSwitch.toggle();
    }
}


interface Device {
    void turnOn();
    void turnOff();
    boolean isOn();
}

class LightBulb implements Device {

    private boolean on;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Turned on.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Turned off.");
    }

    @Override
    public boolean isOn() {
        return on;
    }
}

class Fan implements Device {

    private boolean on;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Turned on.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Turned off.");
    }

    @Override
    public boolean isOn() {
        return on;
    }
}

class Heater implements Device {
    private boolean on;

    @Override
    public void turnOn() {
        on = true;
        System.out.println("Turned on.");
    }

    @Override
    public void turnOff() {
        on = false;
        System.out.println("Turned off.");
    }

    @Override
    public boolean isOn() {
        return on;
    }
}

class Switch {
    private Device device;

    public Switch(Device device) {
        this.device = device;
    }

    public void toggle() {
        if (device.isOn()) {
            device.turnOff();
        } else {
            device.turnOn();
        }
    }
}
