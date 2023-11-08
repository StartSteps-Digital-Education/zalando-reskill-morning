package org.startsteps.week10.day03;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class MyCountDownLatch {

    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, () -> {
            // ...
            System.out.println("All previous tasks are completed");
        });

        Thread t1 = new Thread(new MyTask(cyclicBarrier), "T1");
        Thread t2 = new Thread(new MyTask(cyclicBarrier), "T2");
        Thread t3 = new Thread(new MyTask(cyclicBarrier), "T3");

        if (!cyclicBarrier.isBroken()) {
            t1.start();
            t2.start();
            t3.start();
        }

    }
}


class MyTask implements Runnable {
    private CyclicBarrier barrier;
    public MyTask(CyclicBarrier barrier) {
        this.barrier = barrier;
    }
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting");
            System.out.println(Thread.currentThread().getName() + " barrier isBroken: " + barrier.isBroken());
            barrier.await();
            System.out.println(Thread.currentThread().getName() + " barrier isBroken: " + barrier.isBroken());
            System.out.println(Thread.currentThread().getName() + " is released");
        } catch (InterruptedException | BrokenBarrierException e) {
//            e.printStackTrace();
            System.out.println(Thread.currentThread().getName() + " barrier isBroken: " + barrier.isBroken());
        }
    }
}
