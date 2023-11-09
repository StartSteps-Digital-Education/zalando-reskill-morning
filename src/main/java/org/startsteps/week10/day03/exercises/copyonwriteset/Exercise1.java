package org.startsteps.week10.day03.exercises.copyonwriteset;

import java.util.concurrent.CopyOnWriteArraySet;

public class Exercise1 {
    public static void main(String[] args) {
        // Create a CopyOnWriteArraySet to store unique color names
        CopyOnWriteArraySet<String> colorSet = new CopyOnWriteArraySet<>();

        colorSet.add("Red");
        colorSet.add("Green");
        colorSet.add("Blue");
        colorSet.add("Yellow");

        for (String color : colorSet) {
            System.out.println(color);
        }
    }
}
