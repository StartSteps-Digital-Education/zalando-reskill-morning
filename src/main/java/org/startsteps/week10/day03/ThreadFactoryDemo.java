package org.startsteps.week10.day03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class ThreadFactoryDemo {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(10, new BaeldungThreadFactory("Faruk"));

        for (int i = 0; i < 10; i++) {

            executorService.submit(() -> {

            });
        }

    }
}


class BaeldungThreadFactory implements ThreadFactory {
    private int threadId;
    private String name;

    public BaeldungThreadFactory(String name) {
        threadId = 1;
        this.name = name;
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread t = new Thread(r, name + "-Thread_" + threadId);
        System.out.println("created new thread with id : " + threadId + " and name : " + t.getName());
        threadId++;
        return t;
    }
}
