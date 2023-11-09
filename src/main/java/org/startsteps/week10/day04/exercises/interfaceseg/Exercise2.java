package org.startsteps.week10.day04.exercises.interfaceseg;

public class Exercise2 {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Bird bird = new Bird();
        Dog dog = new Dog();

        fish.swim();
        bird.fly();
        bird.run();
        dog.run();
    }
}

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Runnable {
    void run();
}

class Fish implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Fish is swimming.");
    }
}

class Bird implements Flyable, Runnable {
    @Override
    public void fly() {
        System.out.println("Bird is flying.");
    }

    @Override
    public void run() {
        System.out.println("Bird is running.");
    }
}

class Dog implements Runnable {
    @Override
    public void run() {
        System.out.println("Dog is running.");
    }
}
