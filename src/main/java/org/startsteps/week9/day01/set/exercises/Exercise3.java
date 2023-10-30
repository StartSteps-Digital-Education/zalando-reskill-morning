package org.startsteps.week9.day01.set.exercises;

import java.util.TreeSet;

public class Exercise3 {

    public static void main(String[] args) {
        TreeSet<Integer> sortedSet = new TreeSet<>();

        // Adding integers
        sortedSet.add(50);
        sortedSet.add(10);
        sortedSet.add(40);
        sortedSet.add(20);

        // TreeSet sorts in natural order
        for (Integer num : sortedSet) {
            System.out.println(num);
        }
    }
}
