package org.startsteps.week10.day04.exercises.openclosed;

public class Exercise3 {
    public static void main(String[] args) {
        Person person = new Person("John");
        Student student = new Student("Jane", "123");
        Teacher teacher = new Teacher("Mike", "Science");

        person.introduceYourself();
        student.introduceYourself();
        teacher.introduceYourself();
    }
}

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void introduceYourself() {
        System.out.println("Hello, my name is " + name + ".");
    }
}

class Student extends Person {
    private String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Hello, my name is " + name + " and I am a student with ID: " + studentId + ".");
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Hello, my name is " + name + " and I teach " + subject + ".");
    }
}
