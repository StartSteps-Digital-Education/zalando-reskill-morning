package org.startsteps.week10.day03.exercises.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.submit(() -> {
            System.out.println("Task 1: " + Thread.currentThread().getName());
        });

        executorService.submit(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task 2: " + Thread.currentThread().getName());
        });
        executorService.submit(() -> {
            System.out.println("Task 3: " + Thread.currentThread().getName());
        });

        executorService.submit(() -> {
            System.out.println("Task 4: " + Thread.currentThread().getName());
        });
        executorService.submit(() -> {
            System.out.println("Task 5: " + Thread.currentThread().getName());
        });

        executorService.submit(() -> {
            System.out.println("Task 6: " + Thread.currentThread().getName());
        });
        executorService.submit(() -> {
            System.out.println("Task 7: " + Thread.currentThread().getName());
        });

        executorService.submit(() -> {
            System.out.println("Task 8: " + Thread.currentThread().getName());
        });
        executorService.submit(() -> {
            System.out.println("Task 9: " + Thread.currentThread().getName());
        });

        executorService.submit(() -> {
            System.out.println("Task 10: " + Thread.currentThread().getName());
        });

        executorService.shutdown();

        if (!executorService.isShutdown()) {
            executorService.submit(() -> {
                System.out.println("Task 11: " + Thread.currentThread().getName());
            });
        }


        try {
            boolean finished = executorService.awaitTermination(1, TimeUnit.SECONDS);
            if (!finished) {
                executorService.shutdownNow();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
