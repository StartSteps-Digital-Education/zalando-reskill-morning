package org.startsteps.week10.day01.exercises.exception;

public class Exercise4 {
    public static void main(String[] args) {
        // Thread representing the file downloading process
        Thread downloadThread = new Thread(() -> {
            System.out.println("Download started.");

            // Simulate a long download task with a loop
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    // The download has been interrupted, which is akin to the user canceling the download
                    System.out.println("Download was canceled.");
                    return; // Stop downloading by exiting the run method
                }

                // Simulate doing a part of the download work
                try {
                    // Pretend that downloading takes time by sleeping
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    // Interrupt status is cleared when InterruptedException is thrown
                    System.out.println("Download was interrupted during sleep.");
                    return; // Stop downloading by exiting the run method
                }
            }

            System.out.println("Download completed.");
        });

        // Start the download thread
        downloadThread.start();

        // Create a thread to interrupt the download after 3 seconds
        Thread interruptingThread = new Thread(() -> {
            try {
                Thread.sleep(3000); // Sleep for 3 seconds
                System.out.println("User requests to cancel the download.");
                downloadThread.interrupt(); // Interrupt the download thread to simulate canceling the download
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        });

        // Start the thread that will interrupt the download
        interruptingThread.start();
    }
}
