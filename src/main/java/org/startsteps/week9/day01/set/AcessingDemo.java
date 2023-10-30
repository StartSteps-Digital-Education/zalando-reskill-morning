package org.startsteps.week9.day01.set;

import java.util.HashSet;
import java.util.Set;

public class AcessingDemo {

    public static void main(String[] args) {
        // Creating an object of Set and  declaring object of type String
        Set<String> hs = new HashSet<>();
        // Elements are added using add() method Later onwards we will show accessing the same
        // Custom input elements
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        // Print the Set object elements
        System.out.println("Set is " + hs);
        // Declaring a string
        String check = "D";
        // Check if the above string exists in  the HashSet or not using contains() method
        System.out.println("Contains " + check + " " + hs.contains(check));
    }
}

