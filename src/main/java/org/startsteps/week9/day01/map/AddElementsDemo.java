package org.startsteps.week9.day01.map;

import java.util.HashMap;
import java.util.Map;

public class AddElementsDemo {

    public static void main(String args[])
    {
        // Default Initialization of a Map
        Map<Integer, String> hm1 = new HashMap<>();

        // Initialization of a Map
        // using Generics
        Map<Integer, String> hm2 = new HashMap<Integer, String>();

        // Inserting the Elements
        hm1.put(1, "Monday");
        hm1.put(2, "And");
        hm1.put(3, "Friday");

        hm2.put(1, "Monday");
        hm2.put(2, "And");
        hm2.put(3, "Friday");

        System.out.println(hm1);
        System.out.println(hm2);
    }


}
