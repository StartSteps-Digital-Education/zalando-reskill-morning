package org.startsteps.week10.day01;

/**
 * CalculatePrimes -- calculate as many primes as we can in ten seconds
 */

public class CalculatePrimes extends Thread {

    public static final int MAX_PRIMES = 100000;
    public static final int TEN_SECONDS = 10000;
    public volatile boolean finished = false;

    @Override
    public void run() {
        System.out.println("Name of thread CalculatePrimes: " + Thread.currentThread().getName());
        int[] primes = new int[MAX_PRIMES];
        int count = 0;
        for (int i = 2; count < MAX_PRIMES; i++) {
            // Check to see if the timer has expired
            if (finished) {
                break;
            }
            boolean prime = true;
            for (int j = 0; j < count; j++) {
                if (i % primes[j] == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                primes[count++] = i;
                System.out.println("Found prime: " + i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Name of thread before creating CalculatePrimes: " + Thread.currentThread().getName());

        CalculatePrimes calculator = new CalculatePrimes();
        calculator.start();

        try {
            System.out.println("Name of thread which is sleeping: " + Thread.currentThread().getName());
            Thread.sleep(TEN_SECONDS);
        } catch (Exception e) {
            // fall through
        }

        calculator.finished = true;
    }
}


