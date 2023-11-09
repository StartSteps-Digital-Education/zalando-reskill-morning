package org.startsteps.week10.day04.exercises.interfaceseg;

public class Exercise4 {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone();
        TableLamp tableLamp = new TableLamp();

        smartphone.turnOn();
        smartphone.charge();
        smartphone.playMusic();

        tableLamp.turnOn();
        tableLamp.turnOff();
    }
}

interface PowerControllable {
    void turnOn();
    void turnOff();
}

interface Rechargeable {
    void charge();
}

interface MusicPlayable {
    void playMusic();
}

class Smartphone implements PowerControllable, Rechargeable, MusicPlayable {
    @Override
    public void turnOn() {
        System.out.println("Turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off.");
    }

    @Override
    public void charge() {
        System.out.println("Charging.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music.");
    }
}

class TableLamp implements PowerControllable {
    @Override
    public void turnOn() {
        System.out.println("Turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off.");
    }
}
