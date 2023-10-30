package org.startsteps.week9.day01.set.exercises;

import java.util.Arrays;
import java.util.HashSet;

public class Exercise2 {

    public static void main(String[] args) {
        String[] strings = {"apple", "banana", "apple", "cherry"};

        // Adding strings and deduplicating
        HashSet<String> uniqueStrings = new HashSet<>(Arrays.asList(strings));

        // Printing unique strings
        for (String str : uniqueStrings) {
            System.out.println(str);
        }
    }
}
