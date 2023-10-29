package org.startsteps.week8.day05;

import java.io.*;

class Student implements Serializable {
    private int id;
    private double grade;

    public Student(int id, double grade) {
        this.id = id;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", grade=" + grade + "}";
    }
}

public class Exercise2Solution {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student[] students = {
                new Student(1, 85.5),
                new Student(2, 90.0),
                new Student(3, 78.6)
        };

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("students.ser"))) {
            out.writeObject(students);
        }

        // Deserialization
        Student[] deserializedStudents;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("students.ser"))) {
            deserializedStudents = (Student[]) in.readObject();
            for (Student s : deserializedStudents) {
                System.out.println(s);
            }
        }
    }
}