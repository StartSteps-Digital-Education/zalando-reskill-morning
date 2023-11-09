package org.startsteps.week10.day03.exercises.concurrenthashmap;

import java.util.concurrent.ConcurrentHashMap;

public class Exercise2 {

    private static final ConcurrentHashMap<String, String> fruitColors = new ConcurrentHashMap<>();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            fruitColors.put("Apple", "Red");
            fruitColors.put("Banana", "Yellow");
            fruitColors.put("Orange", "Orange");
        });

        Thread thread2 = new Thread(() -> {
            System.out.println("Apple: " + fruitColors.get("Apple"));
            System.out.println("Banana: " + fruitColors.get("Banana"));
            System.out.println("Orange: " + fruitColors.get("Orange"));
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
