package org.startsteps.week10.day03.exercises.scheduledexecutorservice;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Exercise1 {

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();
        executor.schedule(() -> System.out.println("I'm scheduled"), 2, TimeUnit.SECONDS);
    }
}
