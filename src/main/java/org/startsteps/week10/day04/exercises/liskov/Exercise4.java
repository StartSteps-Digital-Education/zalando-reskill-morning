package org.startsteps.week10.day04.exercises.liskov;

public class Exercise4 {
    public static void main(String[] args) {
        Flower rose = new Rose();
        Flower cactus = new Cactus();

        Gardener gardener = new Gardener();
        gardener.attend(rose);
        gardener.attend(cactus);
    }
}

abstract class Flower {
    public abstract void bloom();
}

class Rose extends Flower {
    @Override
    public void bloom() {
        System.out.println("The rose blooms.");
    }
}

class Cactus extends Flower {
    @Override
    public void bloom() {
        System.out.println("The cactus blooms.");
    }
}

class Gardener {
    public void attend(Flower flower) {
        flower.bloom();
    }
}
