package org.startsteps.week9.day01.map;

import java.util.HashMap;
import java.util.Map;

public class RemovingElementsDemo {

    public static void main(String[] args) {
        // Initialization of a Map using Generics
        Map<Integer, String> hm1 = new HashMap<>();

        // Inserting the Elements
        hm1.put(1, "Monday");
        hm1.put(2, "Tuesday");
        hm1.put(3, "and");
        hm1.put(4, "Friday");

        // Initial Map
        System.out.println(hm1);

        hm1.remove(4);
        // Final Map
        System.out.println(hm1);
    }
}
