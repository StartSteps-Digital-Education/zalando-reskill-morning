package org.startsteps.week10.day03.exercises.concurrenthashmap;


import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class Exercise1 {

    public static void main(String[] args) {
        ConcurrentHashMap<String, String> countryCapitals = new ConcurrentHashMap<>();

        countryCapitals.put("USA", "Washington");
        countryCapitals.put("France", "Paris");
        countryCapitals.put("Japan", "Tokyo");

        for (Map.Entry<String, String> entry : countryCapitals.entrySet()) {
            System.out.println("Country: " + entry.getKey() + " - Capital: " + entry.getValue());
        }
    }

}
