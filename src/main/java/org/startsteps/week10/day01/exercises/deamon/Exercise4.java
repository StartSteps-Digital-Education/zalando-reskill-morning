package org.startsteps.week10.day01.exercises.deamon;

public class Exercise4 {
    public static void main(String[] args) {
        // Creating the daemon thread for playing background music
        Thread musicPlayer = new Thread(() -> {
            while (true) {
                System.out.println("Playing background music...");
                try {
                    Thread.sleep(1000); // Sleep for 1 second to simulate the periodicity of playing music
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt(); // Restore interrupted status
                    break; // Exit the loop if the thread is interrupted
                }
            }
        });

        // Set the thread as a daemon thread
        musicPlayer.setDaemon(true);

        // Start the daemon thread
        musicPlayer.start();

        // Main thread simulates some application logic
        System.out.println("Application is running. You hear background music.");
        try {
            // Main thread is doing something else for a while
            Thread.sleep(5000); // Main thread sleeps for 5 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Application is shutting down. Background music stops.");

        // When the main thread finishes its work, the application will shut down
        // and the daemon thread will be terminated by the JVM
    }
}
