package org.startsteps.week10.day04.exercises.single;

public class Exercise1 {

    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();
        myDog.eat();
    }
}

class DogSound {
    void bark() {
        System.out.println("Woof!");
    }
}

class DogFood {
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog {
    private DogSound dogSound;
    private DogFood dogFood;

    public Dog() {
        dogSound = new DogSound();
        dogFood = new DogFood();
    }

    void bark() {
        dogSound.bark();
    }

    void eat() {
        dogFood.eat();
    }
}
