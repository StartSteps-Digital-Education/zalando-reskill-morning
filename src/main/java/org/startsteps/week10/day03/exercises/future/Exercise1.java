package org.startsteps.week10.day03.exercises.future;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Exercise1 {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<Integer> future = executorService.submit(() -> {
            int number1 = 5;
            int number2 = 10;
            return number1 * number2;
        });

        if (future.isDone()){
            try {
                Integer result = future.get();
                System.out.println("The result of the multiplication is: " + result);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();
    }
}
