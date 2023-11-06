package org.startsteps.week10.day01;

public class AutoSaveThread extends Thread {
    public AutoSaveThread() {
        // Set this thread as a daemon thread
//        setDaemon(true);
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Simulate auto-saving every 2 seconds
                Thread.sleep(2000);
                System.out.println("Document auto-saved");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class DaemonThreadExample {
    public static void main(String[] args) {
        // Start the auto-save daemon thread
        new AutoSaveThread().start();

        // Simulate writing a document for 10 seconds
        try {
            System.out.println("Writing document...");
            Thread.sleep(15000);
            System.out.println("Finished writing document");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

