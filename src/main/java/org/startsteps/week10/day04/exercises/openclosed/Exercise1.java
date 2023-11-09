package org.startsteps.week10.day04.exercises.openclosed;

public class Exercise1 {
    public static void main(String[] args) {
        Animal[] animals = {new Dog(), new Cat(), new Cow()};

        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

abstract class Animal {
    public abstract void makeSound();
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Cow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Moo!");
    }
}

class Crow extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Ka!");
    }
}
