package org.startsteps.week10.day01.exercises.exception;

public class Exercise2 {
    public static void main(String[] args) {
        // Long-running task thread
        Thread longRunningThread = new Thread(() -> {
            long count = 0;
            while (true) {
                count++;
                try {
                    Thread.sleep(0); // This is to check for interruption if counting is too CPU-intensive
                } catch (InterruptedException e) {
                    System.out.println("Long-running task was interrupted during sleep!");
                    break; // Exit the loop if the thread is interrupted
                }

                if (Thread.interrupted()) {
                    // We've been interrupted: no more crunching.
                    System.out.println("Long-running task was interrupted!");
                    return;
                }
            }
        });

        // Interrupting thread
        Thread interruptingThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Sleep for 2 seconds
                System.out.println("Interrupting thread will interrupt the long-running task now.");
                longRunningThread.interrupt(); // Interrupt the long-running thread
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        });

        // Start both threads
        longRunningThread.start();
        interruptingThread.start();
    }
}
