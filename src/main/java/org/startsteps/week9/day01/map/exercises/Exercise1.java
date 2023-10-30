package org.startsteps.week9.day01.map.exercises;

import java.util.HashMap;

public class Exercise1 {

    public static void main(String[] args) {
        // Creating the HashMap
        HashMap<Integer, String> studentMap = new HashMap<>();

        // Adding students
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        // Retrieving and printing a specific student's name
        int studentId = 102; // Example student ID
        String name = studentMap.get(studentId);
        System.out.println("Name of student with ID " + studentId + ": " + name);

        // Confirming retrieval
        if (name != null) {
            System.out.println("Retrieval successful!");
        } else {
            System.out.println("No student found with that ID.");
        }
    }

}
