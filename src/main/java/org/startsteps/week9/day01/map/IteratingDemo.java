package org.startsteps.week9.day01.map;

import java.util.HashMap;
import java.util.Map;

public class IteratingDemo {

    public static void main(String[] args) {
        // Initialization of a Map using Generics
        Map<Integer, String> hm1 = new HashMap<>();

        // Inserting the Elements
        hm1.put(1, "Hello");
        hm1.put(2, "Welcome");
        hm1.put(3, "To StartSteps");

        for (Map.Entry mapElement : hm1.entrySet()) {
            int key = (int) mapElement.getKey();

            // Finding the value
            String value = (String) mapElement.getValue();

            System.out.println(key + " : " + value);
        }
    }
}
