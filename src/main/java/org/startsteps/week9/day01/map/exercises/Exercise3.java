package org.startsteps.week9.day01.map.exercises;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise3 {
    public static void main(String[] args) {
        LinkedHashMap<String, String> capitalMap = new LinkedHashMap<>();

        // Adding country-capital pairs in a specific order
        capitalMap.put("USA", "Washington, D.C.");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("France", "Paris");

        // Iterating to show insertion order is maintained
        for (Map.Entry<String, String> entry : capitalMap.entrySet()) {
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }
    }
}
