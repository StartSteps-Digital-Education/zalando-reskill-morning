package org.startsteps.week10.day01.exercises.exception;

public class Exercise1 {
    public static void main(String[] args) {
        Thread sleeperThread = new Thread(() -> {
            try {
                System.out.println("Thread is going to sleep for 5 seconds.");
                Thread.sleep(5000); // Sleep for 5 seconds
                System.out.println("Awake");
            } catch (InterruptedException e) {
                System.out.println("Interrupted while sleeping");
            }
        });

        // Start the thread
        sleeperThread.start();
    }
}
