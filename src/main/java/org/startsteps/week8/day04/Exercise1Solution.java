package org.startsteps.week8.day04;

import java.io.*;
import java.time.LocalDateTime;

public class Exercise1Solution {

    static class Person implements Serializable {
        private String name;
        private int age;
        private String address;
        private transient LocalDateTime currentDateTime;

        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
            this.currentDateTime = LocalDateTime.now();
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + ", address='" + address + "', currentDateTime='" + currentDateTime +"' }";
        }
    }

    public static void serializeToFile(Object obj, String filename) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(obj);
        }
    }

    public static Object deserializeFromFile(String filename) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return ois.readObject();
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Alice", 30, "123 Elm Street");
        try {
            serializeToFile(person, "src/main/java/org/startsteps/week8/day04/person.out");
            Person deserializedPerson = (Person) deserializeFromFile("src/main/java/org/startsteps/week8/day04/person.out");
            System.out.println(deserializedPerson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
