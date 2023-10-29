package org.startsteps.week8.day05;

import java.io.*;

class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    transient private double salary; // This won't be serialized

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}


class ExercisesSolutions {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("John", 30, 1000.50);

        // Serialization
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("person_with_salary.ser"))) {
            out.writeObject(person);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Error initializing stream");
            e.printStackTrace();
        }

        // Deserialization
        Person deserializedPerson;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("person_with_salary.ser"))) {
            deserializedPerson = (Person) in.readObject();
            System.out.println(deserializedPerson);
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error initializing stream or class not found");
            e.printStackTrace();
        }
    }
}

