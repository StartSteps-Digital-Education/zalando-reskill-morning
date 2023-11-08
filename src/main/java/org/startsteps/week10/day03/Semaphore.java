package org.startsteps.week10.day03;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class MySemaphore {
    static Semaphore semaphore = new Semaphore(10);

    public static void main(String[] args) {
        System.out.println("Available permit : " + semaphore.availablePermits());
        System.out.println("Number of threads waiting to acquire: " + semaphore.getQueueLength());

        for (int i = 0; i < 20; i++) {
            new Thread(() -> {
                System.out.println(Thread.currentThread().getName());
                try {
                    if (semaphore.tryAcquire(2, TimeUnit.SECONDS)) {
                        try {
                            System.out.println("Acquired!, available permits: " + semaphore.availablePermits());

                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                throw new RuntimeException(e);
                            }

                        } finally {
                            semaphore.release();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, "CustomThread-" + i).start();

        }
    }

}
