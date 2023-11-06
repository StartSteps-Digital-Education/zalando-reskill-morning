package org.startsteps.week10.day01.exercises.deamon;

public class Exercise3 {
    public static void main(String[] args) {
        // Create the daemon thread simulating a garbage collector
        Thread gcSimulator = new Thread(() -> {
            while (true) {
                System.out.println("Garbage Collector: Cleaning up resources...");
                try {
                    Thread.sleep(5000); // Sleep for 5 seconds to simulate time between cleanups
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore interrupted status
                    break; // Exit the loop if the thread is interrupted
                }
            }
        });

        // Set the thread as a daemon thread
        gcSimulator.setDaemon(true);

        // Start the daemon thread
        gcSimulator.start();

        // Main thread doing some work, to simulate application behavior
        System.out.println("Application is starting...");
        try {
            // Simulate some work by sleeping for a short time
            Thread.sleep(15000); // Main thread sleeps for 15 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Application is shutting down...");

        // When the main thread finishes, the JVM exits and the daemon thread is terminated
    }
}
