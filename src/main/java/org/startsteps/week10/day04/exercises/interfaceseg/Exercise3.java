package org.startsteps.week10.day04.exercises.interfaceseg;

public class Exercise3 {
    public static void main(String[] args) {
        MyStudent student = new MyStudent();
        Teacher teacher = new Teacher();

        student.attendClasses();
        student.payFees();

        teacher.attendClasses();
        teacher.giveLectures();
    }
}

interface Attendable {
    void attendClasses();
}

interface Lecturable {
    void giveLectures();
}

interface FeePayable {
    void payFees();
}

class MyStudent implements Attendable, FeePayable {
    @Override
    public void attendClasses() {
        System.out.println("Student is attending classes.");
    }

    @Override
    public void payFees() {
        System.out.println("Student is paying fees.");
    }
}

class Teacher implements Attendable, Lecturable {
    @Override
    public void attendClasses() {
        System.out.println("Teacher is attending classes for supervision.");
    }

    @Override
    public void giveLectures() {
        System.out.println("Teacher is giving lectures.");
    }
}

