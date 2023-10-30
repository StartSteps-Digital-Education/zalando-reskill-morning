package org.startsteps.week9.day01.set.exercises;

import java.util.HashSet;

public class Exercise1 {

    public static void main(String[] args) {
        HashSet<Integer> integerSet = new HashSet<>();

        // Adding integers
        integerSet.add(10);
        integerSet.add(20);
        integerSet.add(30);
        integerSet.add(40);

        // Attempting to add a duplicate
        boolean wasAdded = integerSet.add(20); // This should not be added
        System.out.println("Was 20 added again? " + wasAdded);

        // Iterating and printing contents
        for (Integer num : integerSet) {
            System.out.println(num);
        }
    }
}
