package org.startsteps.week10.day01.exercises.threads;

public class Exercise1 {
    public static void main(String[] args) {
        Thread thread = new NumberPrinter();
        thread.start();
    }
}

class NumberPrinter extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Sleep for 1 second between numbers
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}