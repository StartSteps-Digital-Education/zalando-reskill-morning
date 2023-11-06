package org.startsteps.week10.day01.exercises.runnable;

public class Exercise1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new AlphabetPrinter());
        thread.start();
    }
}

class AlphabetPrinter implements Runnable {

    @Override
    public void run() {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.println(letter);
            try {
                Thread.sleep(500); // Sleep for 500 milliseconds between letters
            } catch (InterruptedException e) {
                e.printStackTrace();
                // If the thread was interrupted, stop printing the alphabet
                break;
            }
        }
    }
}