package org.startsteps.week10.day03.exercises.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(() -> {
            System.out.println("Task 1: " + Thread.currentThread().getName());
        });

        executorService.submit(() -> {
            System.out.println("Task 2: " + Thread.currentThread().getName());
        });

        executorService.shutdown();
    }
}
