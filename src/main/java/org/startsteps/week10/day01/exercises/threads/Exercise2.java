package org.startsteps.week10.day01.exercises.threads;

public class Exercise2 {

    public static void main(String[] args) {
        Thread evenThread = new NumberPrinter2(true);
        Thread oddThread = new NumberPrinter2(false);

        evenThread.start();
        oddThread.start();
    }

}

class NumberPrinter2 extends Thread {
    private boolean printEven;

    public NumberPrinter2(boolean printEven) {
        this.printEven = printEven;
    }

    @Override
    public void run() {
        // Start from 1 if printing odd numbers, 2 if printing even numbers.
        int start = this.printEven ? 2 : 1;
        for (int i = start; i <= 20; i += 2) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Sleep for half a second between numbers
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

