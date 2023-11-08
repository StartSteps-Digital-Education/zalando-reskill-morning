package org.startsteps.week10.day03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class MyExecutorService {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
//        executor.submit(new Task());


        try {
            executor.awaitTermination(100, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}


class TestTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


class ExecService2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(()->
        {
            new MyeTask().run();
        });
    }
}
class MyeTask implements Runnable{
    @Override
    public void run() {
        System.out.println("ExecutorService in action!" + Thread.currentThread().getName());
    }
}
