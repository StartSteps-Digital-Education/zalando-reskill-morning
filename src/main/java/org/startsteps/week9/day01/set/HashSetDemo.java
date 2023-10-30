package org.startsteps.week9.day01.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {
        // Creating object of Set of type String
        Set<String> h = new HashSet<>();

        // Adding elements into the HashSet
        // using add() method

        // Custom input elements
        h.add("India");
        h.add("Australia");
        h.add("South Africa");

        // Adding the duplicate element
        h.add("India");

        // Displaying the HashSet
        System.out.println(h);

        // Removing items from HashSet using remove() method
        h.remove("Australia");
        System.out.println("Set after removing Australia:" + h);

        // Iterating over hash set items
        System.out.println("Iterating over set:");

        // Iterating through iterators
        Iterator<String> i = h.iterator();

        // It holds true till there is a single element
        // remaining in the object
        while (i.hasNext())
            System.out.println(i.next());
    }
}
