package org.startsteps.week10.day03.exercises.copyonwritearray;

import java.util.concurrent.CopyOnWriteArrayList;

public class Exercise2 {
    private static final CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            list.add("Sparrow");
            list.add("Peacock");
            list.add("Parrot");
        });

        Thread thread2 = new Thread(() -> {
            for (String item : list) {
                System.out.println(item);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

