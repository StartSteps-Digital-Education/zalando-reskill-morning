package org.startsteps.week9.day01.set;

import java.util.HashSet;
import java.util.Set;

public class RemovingDemo {

    public static void main(String[] args) {
        // Declaring object of Set of type String
        Set<String> hs = new HashSet<String>();

        // Elements are added using add() method
        // Custom input elements
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("B");
        hs.add("D");
        hs.add("E");
        // Printing initial Set elements
        System.out.println("Initial HashSet " + hs);
        // Removing custom element using remove() method
        hs.remove("B");
        // Printing Set elements after removing an element  and printing updated Set elements
        System.out.println("After removing element " + hs);
    }
}

