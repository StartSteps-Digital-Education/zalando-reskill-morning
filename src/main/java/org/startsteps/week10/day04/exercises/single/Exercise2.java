package org.startsteps.week10.day04.exercises.single;

public class Exercise2 {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 39.9);
        ReportCardPrinter printer = new ReportCardPrinter();
        printer.printReportCard(student);
    }
}

class GradeCalculator {
    private double score;

    public GradeCalculator(double score) {
        this.score = score;
    }

    public char calculateGrade() {
        if (score >= 90) {
            return 'A';
        } else if (score >= 80) {
            return 'B';
        } else if (score >= 70) {
            return 'C';
        } else if (score >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

class ReportCardPrinter {
    public void printReportCard(Student student) {
        System.out.println("Report Card for " + student.getName());
        System.out.println("Grade: " + student.getGrade());
    }
}

class Student {
    private String name;
    private double score;
    private GradeCalculator gradeCalculator;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
        this.gradeCalculator = new GradeCalculator(score);
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return gradeCalculator.calculateGrade();
    }

}
