package org.startsteps.week10.day01;

public class StudyingThread extends Thread {
    @Override
    public void run() {
        System.out.println("Student starts studying...");
        try {
            // The student plans to study for 10,000 milliseconds (10 seconds)
            Thread.sleep(10000);
            System.out.println("Student finished studying.");
        } catch (InterruptedException e) {
            // If the student gets interrupted (e.g. by a phone call), this block of code is executed
            System.out.println("Student got interrupted by a phone call.");
            e.printStackTrace();
        }
    }
}

class InterruptedExceptionExample {
    public static void main(String[] args) {
        StudyingThread student = new StudyingThread();
        student.start();
        try {
            // Main thread sleeps for 5 seconds, simulating the time before a phone call interrupts the student
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // After 5 seconds, the main thread interrupts the student's studying thread
        student.interrupt();
    }
}
