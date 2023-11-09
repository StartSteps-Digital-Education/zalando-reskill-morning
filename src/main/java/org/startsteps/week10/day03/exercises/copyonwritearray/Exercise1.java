package org.startsteps.week10.day03.exercises.copyonwritearray;

import java.util.concurrent.CopyOnWriteArrayList;

public class Exercise1 {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> animalList = new CopyOnWriteArrayList<>();

        animalList.add("Dog");
        animalList.add("Snake");
        animalList.add("Cow");

        for (String animal : animalList) {
            System.out.println(animal);
        }
    }
}

