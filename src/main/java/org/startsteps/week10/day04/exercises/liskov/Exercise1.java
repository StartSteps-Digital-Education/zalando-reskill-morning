package org.startsteps.week10.day04.exercises.liskov;

public class Exercise1 {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        BirdCage birdCage = new BirdCage();
        birdCage.addBird(sparrow);
        birdCage.addBird(penguin);
    }
}


abstract class Bird {
}

interface FlyingBird {
    void fly();
}

class Sparrow extends Bird implements FlyingBird {
    @Override
    public void fly() {
        System.out.println("Sparrow flying high!");
    }
}

class Penguin extends Bird {
    public void swim() {
        System.out.println("Penguin swimming in the water!");
    }
}

class BirdCage {
    public void addBird(Bird bird) {
        if (bird instanceof FlyingBird) {
            ((FlyingBird) bird).fly();
        } else {
            System.out.println("This bird can't fly!");
        }
    }
}
