package org.startsteps.week8.day04;

import java.io.*;

import static org.startsteps.week8.day04.Exercise5Solution.Person.deserializeFromFile;
import static org.startsteps.week8.day04.Exercise5Solution.Person.serializeToFile;

public class Exercise5Solution {

    static class Person implements Serializable {
        private String name;
        private int age;
        private String address;

        public Person(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        private void writeObject(ObjectOutputStream oos) throws IOException {
            oos.defaultWriteObject();
            oos.writeObject(encrypt(name));
        }

        private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
            ois.defaultReadObject();
            name = decrypt((String) ois.readObject());
        }

        private static String encrypt(String data) {
            return new StringBuilder(data).reverse().toString();
        }

        private static String decrypt(String encryptedData) {
            return new StringBuilder(encryptedData).reverse().toString();
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + ", address='" + address + "'}";
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

    }

    public static void main(String[] args) {
        Person person = new Person("Charlie", 28, "789 Oak Lane");
        try {
            serializeToFile(person, "src/main/java/org/startsteps/week8/day04/person.ser");

            Person deserializedPerson = (Person) deserializeFromFile("src/main/java/org/startsteps/week8/day04/person.ser");
            System.out.println(deserializedPerson);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
