package org.startsteps.week10.day03.exercises.copyonwriteset;

import java.util.concurrent.CopyOnWriteArraySet;

public class Exercise2 {
    public static void main(String[] args) {
        CopyOnWriteArraySet<String> colorSet = new CopyOnWriteArraySet<>();

        colorSet.add("Red");
        colorSet.add("Green");
        colorSet.add("Red");

        for (String color : colorSet) {
            System.out.println(color);
        }

        System.out.println("Total colors in set: " + colorSet.size());
    }
}
