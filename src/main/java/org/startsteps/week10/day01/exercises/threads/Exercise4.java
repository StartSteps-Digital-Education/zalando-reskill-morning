package org.startsteps.week10.day01.exercises.threads;

public class Exercise4 {
    public static void main(String[] args) {
        Thread countdownThread = new Countdown();
        countdownThread.start();
    }
}

class Countdown extends Thread {

    @Override
    public void run() {
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Sleep for 1 second between numbers
            } catch (InterruptedException e) {
                e.printStackTrace();
                // If the thread was interrupted, stop the countdown
                break;
            }
        }
        System.out.println("Time's up!");
    }
}