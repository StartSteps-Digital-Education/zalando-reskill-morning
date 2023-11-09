package org.startsteps.week10.day04.exercises.interfaceseg;

public class Exercise1 {
    public static void main(String[] args) {
        Student student = new Student();
        Worker worker = new Worker();

        student.study();
        student.play();

        worker.work();
        worker.play();
    }
}

interface Studyable {
    void study();
}

interface Workable {
    void work();
}

interface Playable {
    void play();
}

class Student implements Studyable, Playable {
    @Override
    public void study() {
        System.out.println("Student is studying.");
    }

    @Override
    public void play() {
        System.out.println("Student is playing.");
    }
}

class Worker implements Workable, Playable {
    @Override
    public void work() {
        System.out.println("Worker is working.");
    }

    @Override
    public void play() {
        System.out.println("Worker is playing.");
    }
}
