package org.startsteps.week8.day05;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

abstract class Animal implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public abstract String sound();
}

class Mammal extends Animal {
    @Serial
    private static final long serialVersionUID = 1L;

    public Mammal(String name, int age) {
        super(name, age);
    }

    @Override
    public String sound() {
        return "Mammal Sound!";
    }
}

class Bird extends Animal {
    @Serial
    private static final long serialVersionUID = 1L;

    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public String sound() {
        return "Bird Sound!";
    }
}

interface SerializableInterface {
    void serialize(String filename);
    void deserialize(String filename);
}

class Zoo implements SerializableInterface, Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    @Override
    public void serialize(String filename) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
            out.writeObject(this);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deserialize(String filename) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
            Zoo loadedZoo = (Zoo) in.readObject();
            this.animals = loadedZoo.getAnimals();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

public class ExtendedExerciseSolution {
    public static void main(String[] args) {
        Mammal mammal1 = new Mammal("Lion", 5);
        Mammal mammal2 = new Mammal("Tiger", 4);
        Bird bird1 = new Bird("Parrot", 2);

        Zoo zoo = new Zoo();
        zoo.addAnimal(mammal1);
        zoo.addAnimal(mammal2);
        zoo.addAnimal(bird1);

        zoo.serialize("zoo.ser");

        Zoo newZoo = new Zoo();
        newZoo.deserialize("zoo.ser");

        for (Animal animal : newZoo.getAnimals()) {
            System.out.println(animal.getName() + " makes " + animal.sound());
        }

    }
}