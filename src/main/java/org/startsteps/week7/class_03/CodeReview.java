package org.startsteps.week7.class_03;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodeReview {

    public static void main(String[] args) {
        CodeReview codeReview = new CodeReview();

        codeReview.exercise3();

        codeReview.joinWithComma(Arrays.asList("Tes", "Testing", "Hopala"));
    }


    // Corrections
    public Optional<String> shortestWord(List<String> list) {
        return list.stream().reduce((acc, str) -> acc.length() > str.length() ? str : acc); // We can use .min() function to achieve this
    }


    public String joinWithComma(List<String> list) {
        StringBuilder result = new StringBuilder();
        list.stream().forEach(e -> result.append(", ").append(e));
        return result.substring(2); // Hardcoding removing the first two chars
    }

    public String reverseString(List<String> list) {
        StringBuilder result = new StringBuilder();
        list.stream().forEach(string -> result.insert(0, ", ").insert(0, string));
        return result.substring(0, result.length() - 2); // Redundant toString call on a string, hardcoded removing characters
    }

    public void exercise1(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Stream<Integer> oddList = numbers.stream()
                .filter(x-> (x % 2) != 0);
        oddList.forEach(System.out::println); // We can chain forEach with filter so we don't have to create a separate variable for the stream

        numbers.stream()
                .filter(x-> (x % 2) != 0)
                .forEach(System.out::println);
    }

    public void exercise2(){
        List<String> words = Arrays.asList("hello", "world", "streams", "java");
        List<String> wordsUppercase = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList()); // We can call .toList directly
        System.out.println(wordsUppercase);

        int characterCount = wordsUppercase.stream()
                .mapToInt(s -> s.length()) // No need for replacing
                .sum();
        System.out.println("Total number of characters excluding spaces: " + characterCount);
    }

    public void exercise3(){
        // exercise 3
        List<Integer> numbersToSum = Arrays.asList(1, 2, 3, 4, 5, 6);
        int sum = numbersToSum.stream()
                .reduce(0, (a,b)->a+b);
        System.out.println("Exercise 3:");
        System.out.println(sum);
        //bonus
        int avg = sum / numbersToSum.size(); // This is saved as an int so no decimals for the average
        System.out.println("Exercise 3 bonus:");
        System.out.println(avg);
    }

    public static int filterNumbers(List<Integer> numbers) {
        return numbers.stream().filter(e -> e % 2 != 0).toList().stream().reduce(0, (acc, el) -> acc + el); // No need to create two streams
    }


}

class Employee {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
}