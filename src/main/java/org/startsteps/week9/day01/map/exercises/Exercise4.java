package org.startsteps.week9.day01.map.exercises;

import java.util.HashMap;

public class Exercise4 {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        // Removing a student
        int studentIdToRemove = 102;
        studentMap.remove(studentIdToRemove);

        // Verifying removal
        if (studentMap.get(studentIdToRemove) == null) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student still exists.");
        }

        System.out.println(studentMap);
    }
}
