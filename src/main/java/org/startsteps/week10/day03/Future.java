package org.startsteps.week10.day03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MyFuture {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Future<String> future = executorService.submit(() -> {
            System.out.println("Thread name inside the task: " + Thread.currentThread().getName());
            System.out.println("Task started executing");
            Thread.sleep(5000l);
            return "Hello world";
        });
        Future<String> future2 = executorService.submit(() -> {
            System.out.println("Thread name inside the task: " + Thread.currentThread().getName());
            System.out.println("Task started executing");
            Thread.sleep(5000l);
            return "Hello world";
        });
        Future<String> future3 = executorService.submit(() -> {
            System.out.println("Thread name inside the task: " + Thread.currentThread().getName());
            System.out.println("Task started executing");
            Thread.sleep(5000l);
            return "Hello world";
        });


        try {
            System.out.println("Thread name: " + Thread.currentThread().getName());
            String futureResult = future.get();
            String futureResult2 = future2.get();
            String futureResult3 = future3.get();

            System.out.println("The result of future is: " + futureResult + "; Thread name: " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();

//        try {
//            future.get();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }

    }
}

