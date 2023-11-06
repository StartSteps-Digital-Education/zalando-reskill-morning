package org.startsteps.week10.day01;

public class Demo {

    public static void main(String[] args) {
        System.out.println("Name of thread in Demo is: " + Thread.currentThread().getName());

        Thread thread1 = new Thread(() -> {
            System.out.println("Start of Thread 1");
            System.out.println("Name of thread in Thread1 is: " + Thread.currentThread().getName());
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("A");
            System.out.println("B");
            System.out.println("End of Thread 1");
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("Start of Thread 2");
            System.out.println("Name of thread in Thread2 is: " + Thread.currentThread().getName());
            System.out.println("1");
            System.out.println("2");
            System.out.println("End of Thread 2");
        });

        thread1.start();
        thread2.start();
    }
}


class CustomThread extends Thread {

    CustomThread(){
        start();
    }

    @Override
    public void run() {
        System.out.println("run method");
    }
}