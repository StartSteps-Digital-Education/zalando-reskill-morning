package org.startsteps.week7.class_05;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4);

        List<Integer> squareResult = integerList.stream()
                .map(MathUtils::square) // Static method reference
                .toList();
        System.out.println(squareResult);


        System.out.println("***********");
        Printer printer = new Printer();

        List<String> stringList = Arrays.asList("Hey", "Hello");

        stringList.stream()
                .forEach(printer::print); // Instance method reference on an object


        System.out.println("***********");

        stringList.stream()
                .map(String::toUpperCase) // Method reference of an Arbitrary Object
                .forEach(printer::print);

        System.out.println("***********");


        stringList.stream()
                .map(Person::new)
                .forEach(System.out::println);

    }
}

// Class for static method reference
class MathUtils {
    public static int square(int number){
        return number * number;
    }
}

class Printer {
    void print(String message){
        System.out.println(message);
    }
}


class Person {
    private String name;

    public Person(String name){
        this.name = name;
    }
}
