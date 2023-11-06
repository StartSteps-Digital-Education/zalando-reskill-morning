package org.startsteps.week10.day01.exercises.deamon;

public class Exercise2 {
    public static void main(String[] args) {
        // Creating the daemon thread
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon task running...");
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore interrupted status
                    break; // Exit the loop if the thread is interrupted
                }
            }
        });

        // Set the thread as a daemon thread
        daemonThread.setDaemon(true);

        // Start the daemon thread
        daemonThread.start();

        // Perform the main task
        for (int i = 0; i < 5; i++) {
            System.out.println("Main task running...");
            try {
                Thread.sleep(1200); // Sleep for a slightly longer time than the daemon thread
            } catch (InterruptedException e) {
                e.printStackTrace();
                // Handle the interrupted exception
            }
        }

        // After the loop, the main task is finished
        System.out.println("Main task completed. Exiting main thread.");
        // The program will exit after this message, causing the daemon thread to terminate
    }
}
