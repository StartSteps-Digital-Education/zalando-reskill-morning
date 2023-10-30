package org.startsteps.week9.day01.set.exercises;

import java.util.TreeSet;

class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        // Custom ordering by age
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}


public class Exercise4 {

    public static void main(String[] args) {
        TreeSet<Person> personSet = new TreeSet<>();

        // Adding persons
        personSet.add(new Person("Alice", 30));
        personSet.add(new Person("Bob", 25));
        personSet.add(new Person("Charlie", 35));

        // TreeSet sorts based on custom ordering
        for (Person p : personSet) {
            System.out.println(p);
        }
    }
}
