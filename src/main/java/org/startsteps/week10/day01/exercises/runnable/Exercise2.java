package org.startsteps.week10.day01.exercises.runnable;

public class Exercise2 {
    public static void main(String[] args) {
        Thread cookingThread = new Thread(new CookingRunnable());
        Thread eatingThread = new Thread(new EatingRunnable());

        cookingThread.start(); // Start cooking
        eatingThread.start(); // Start eating
    }
}


class CookingRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Cooking");
            try {
                Thread.sleep(1000); // Simulate time spent cooking
            } catch (InterruptedException e) {
                System.out.println("Cooking interrupted!");
                return; // Stop cooking if interrupted
            }
        }
    }
}

class EatingRunnable implements Runnable {
    @Override
    public void run() {
        while (true) {
            System.out.println("Eating");
            try {
                Thread.sleep(1000); // Simulate time spent eating
            } catch (InterruptedException e) {
                System.out.println("Eating interrupted!");
                return; // Stop eating if interrupted
            }
        }
    }
}