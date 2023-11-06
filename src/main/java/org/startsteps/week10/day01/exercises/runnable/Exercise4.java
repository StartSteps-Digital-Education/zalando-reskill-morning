package org.startsteps.week10.day01.exercises.runnable;

public class Exercise4 {
    public static void main(String[] args) {
        // Create an array or a list of names for your racers
        String[] names = {"Runner1", "Runner2", "Runner3", "Runner4", "Runner5"};

        // Start each thread (racer) to run the race
        for (String name : names) {
            Thread racerThread = new Thread(new Racer(name));
            racerThread.start();
        }
    }
}

class Racer implements Runnable {

    private String racerName;

    public Racer(String racerName) {
        this.racerName = racerName;
    }

    @Override
    public void run() {
        System.out.println(racerName + " is Running");
    }
}