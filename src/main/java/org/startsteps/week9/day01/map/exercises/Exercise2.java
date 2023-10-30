package org.startsteps.week9.day01.map.exercises;

import java.util.HashMap;

public class Exercise2 {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        // Iterating over the HashMap
        for (HashMap.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
        // Note: The order is not guaranteed
    }
}
