package org.startsteps.week10.day01.exercises.deamon;

public class Exercise1 {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Background task running");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore interrupted status
                    break; // Optional: Stop the loop if the thread is interrupted
                }
            }
        });

        // Set the thread as a daemon thread
        daemonThread.setDaemon(true);

        // Start the daemon thread
        daemonThread.start();

        // To ensure that the JVM has time to execute the daemon thread a bit,
        // because once the main thread (which is not a daemon) finishes, the JVM will exit
        try {
            Thread.sleep(3000); // Main thread sleeps for 3 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // The program will exit after the main thread wakes up, as the only remaining thread is a daemon.
        System.out.println("Main thread finished. Daemon thread will also finish.");
    }
}
