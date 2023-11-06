package org.startsteps.week10.day01.exercises.threads;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Exercise3 {
    public static void main(String[] args) {
        Clock clock = new Clock();
        clock.start();


    }
}

class Clock extends Thread {

    @Override
    public void run() {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        while (true) {
            System.out.println(LocalTime.now().format(timeFormatter));
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
                break; // Optional: Exit the loop if the thread is interrupted
            }
        }
    }
}