package org.startsteps.week7.class_03;

import java.util.Arrays;
import java.util.List;

public class ExerciseSolutions {

    public static void main(String[] args) {
//        filterOddNumbers();
//        transformToUpperCase();
//        computeSum();
//        joinStrings();
        countWordsWithMoreThanThreeCharacters();
    }

    public static void filterOddNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .toList();
        System.out.println("Filtered Odd Numbers: " + oddNumbers);

        // Bonus
        int sum = oddNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of Filtered Odd Numbers: " + sum);
    }

    public static void transformToUpperCase() {
        List<String> words = Arrays.asList("hello", "world", "streams", "java");
        List<String> upperCaseWords = words.stream()
                .map(String::toUpperCase)
                .toList();
        System.out.println("Transformed Words: " + upperCaseWords);

        // Bonus
        int totalChars = upperCaseWords.stream().mapToInt(String::length).sum();
        System.out.println("Total Characters in Transformed List: " + totalChars);
    }

    public static void computeSum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of Numbers: " + sum);

        // Bonus:
        double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Average of Numbers: " + average);
    }

    public static void joinStrings() {
        List<String> words = Arrays.asList("apple", "banana", "cherry");
        String joinedString = String.join(",", words);
        System.out.println("Joined String: " + joinedString);

        // Bonus
        String reversedJoinedString = String.join(",", words.stream().reduce((first, second) -> second + "," + first).orElse(""));
        System.out.println("Reversed Joined String: " + reversedJoinedString);
    }

    public static void countWordsWithMoreThanThreeCharacters() {
        List<String> words = Arrays.asList("cat", "elephant", "dog", "dolphin");
        long count = words.stream().filter(w -> w.length() > 3).count();
        System.out.println("Count of Words With More Than 3 Characters: " + count);

        // Bonus
        String shortestWord = words.stream().min((w1, w2) -> w1.length() - w2.length()).orElse("");
        System.out.println("Shortest Word: " + shortestWord);
    }
}

