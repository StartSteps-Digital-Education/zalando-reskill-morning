package org.startsteps.week9.day01.set;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;

public class IteratingDemo {

    public static void main(String[] args) {
        // Creating object of Set and declaring String type
        Set<String> hs = new HashSet<String>();
        // Adding elements to Set using add() method

        // Custom input elements
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("B");
        hs.add("D");
        hs.add("E");

        // Iterating through the Set via for-each loop
        for (String value : hs)
            // Printing all the values inside the object
            System.out.print(value + ", ");

        System.out.println();
    }
}
