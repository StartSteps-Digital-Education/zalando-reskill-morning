package org.startsteps.week9.day01.map.exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Exercise5 {
    public static void main(String[] args) {
        String text = "hello world hello everyone";
        String[] words = text.split(" ");

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Printing word counts
        for (HashMap.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println("Word: " + entry.getKey() + ", Count: " + entry.getValue());
        }
    }
}
