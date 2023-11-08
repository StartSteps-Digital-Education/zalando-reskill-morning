package org.startsteps.week10.day03.exercises.future;

import java.util.concurrent.*;

public class Exercise2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        String text = "Hello World";

        Future<Integer> future = executorService.submit(() -> text.length());

        try {
            Integer length = future.get();
            System.out.println("The length of the string is: " + length);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


