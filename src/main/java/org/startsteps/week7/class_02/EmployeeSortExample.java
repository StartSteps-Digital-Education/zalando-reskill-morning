package org.startsteps.week7.class_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSortExample {


    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", 23));
        employeeList.add(new Employee("David", 18));
        employeeList.add(new Employee("Alice", 27));
        employeeList.add(new Employee("Martha", 30));

        Collections.sort(employeeList, (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));

        System.out.println("The elements are: " + employeeList);
    }

}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{age=" + age + " Name=" + name + "}";
    }
}
