package org.startsteps.week10.day03.exercises.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Exercise1 {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(() -> System.out.println("ExecutorService in action!; Thread: " + Thread.currentThread().getName()));
    }
}
