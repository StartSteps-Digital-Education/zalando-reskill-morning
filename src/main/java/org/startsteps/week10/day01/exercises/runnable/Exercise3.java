package org.startsteps.week10.day01.exercises.runnable;

public class Exercise3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array
        SumCalculator calculator = new SumCalculator(numbers);

        Thread sumThread = new Thread(calculator);
        sumThread.start();

        // Join is used to wait for the thread to finish before accessing the sum
        try {
            sumThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // After the thread has finished, we can safely access the sum
        System.out.println("Total sum calculated by thread: " + calculator.getSum());
    }
}

class SumCalculator implements Runnable {
    private int[] numbers;
    private int sum;

    public SumCalculator(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("The sum is: " + sum);
    }

    public int getSum() {
        return sum;
    }
}