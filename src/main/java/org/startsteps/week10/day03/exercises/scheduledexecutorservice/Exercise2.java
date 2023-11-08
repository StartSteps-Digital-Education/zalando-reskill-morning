package org.startsteps.week10.day03.exercises.scheduledexecutorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Exercise2 {

    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        executorService.scheduleAtFixedRate(() -> System.out.println("Repeating task"), 0, 1, TimeUnit.SECONDS);
    }
}
