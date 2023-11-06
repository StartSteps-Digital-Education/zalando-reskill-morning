package org.startsteps.week10.day01.exercises.exception;

public class Exercise3 {
    public static void main(String[] args) {
        // Teacher thread
        Thread teacherThread = new Thread(() -> {
            try {
                System.out.println("Teacher starts lecturing...");
                Thread.sleep(10000); // The teacher is lecturing for a while (10 seconds)
                System.out.println("Teacher finishes lecturing.");
            } catch (InterruptedException e) {
                System.out.println("Teacher is interrupted by a question.");
            }
        });

        // Student thread
        Thread studentThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // Wait for 2 seconds before asking a question
                System.out.println("Student asks a question.");
                teacherThread.interrupt(); // Student interrupts the teacher (asks a question)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore interrupted status
            }
        });

        // Start both threads
        teacherThread.start();
        studentThread.start();
    }
}
