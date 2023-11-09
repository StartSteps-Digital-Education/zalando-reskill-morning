package org.startsteps.week10.day04.exercises.liskov;

public class Exercise2 {
    public static void main(String[] args) {
        Student student = new Student();
        Student undergrad = new UndergraduateStudent();
        Student grad = new GraduateStudent();

        student.study();
        undergrad.study();
        grad.study();
    }
}

class Student {
    public void study() {
        System.out.println("Studying general subjects.");
    }
}

class UndergraduateStudent extends Student {
    @Override
    public void study() {
        System.out.println("Studying undergraduate courses.");
    }
}

class GraduateStudent extends Student {
    @Override
    public void study() {
        System.out.println("Studying graduate courses.");
    }
}
