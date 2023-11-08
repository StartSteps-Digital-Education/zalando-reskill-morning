package org.startsteps.week10.day03;

import java.util.concurrent.*;

class MyScheduledExecutorService {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        System.out.println("The current time is: " + System.currentTimeMillis());

        executorService.scheduleWithFixedDelay(() -> {
            System.out.println("The current time in scheduleAtFixedRate: " + System.currentTimeMillis());
            System.out.println("Hello world");
        }, 2, 2, TimeUnit.SECONDS);


//        executorService.shutdown();

    }
}


// Break until 11:15