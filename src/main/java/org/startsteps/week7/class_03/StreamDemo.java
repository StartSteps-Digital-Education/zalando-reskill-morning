package org.startsteps.week7.class_03;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("Numbers list: " + number);
        List<Integer> square = number.stream()
                .map(x -> x * x).toList();

        System.out.println("*******");
        System.out.println("Square list: " + square);
        System.out.println("*******");
        System.out.println("Numbers list: " + number);

        System.out.println("--------------------");

        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        List<String> filteredNames = names.stream()
                .filter(s -> s.startsWith("S")) // Filter elements which start with "S"
                .map(s -> s.toUpperCase(Locale.ROOT))
                .toList();

        System.out.println("Original list: " + names);
        System.out.println("Filtered list: " + filteredNames);

        System.out.println("--------------------");

        List<String> namesList = Arrays.asList("Reflection", "Collection", "Stream");
        List<String> sortedNamesList = namesList.stream().sorted().toList();

        System.out.println("Original list: " + namesList);
        System.out.println("Sorted list: " + sortedNamesList);

        System.out.println("--------------------");

        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 3);
        Set<Integer> numbersSet = numbers.stream().map(x -> x*x).collect(Collectors.toSet());

        System.out.println("Original list: " + numbers);
        System.out.println("Set list: " + numbersSet);

        System.out.println("--------------------");

        List<Integer> numbersList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        numbersList.stream().map(x -> x * x).forEach(e -> System.out.println(e));

        System.out.println("--------------------");
        int even = numbersList.stream()
                .filter(integer -> integer % 2 == 0)
                .reduce(0, (ans, i) -> {
                    System.out.println("Ans is: " + ans + "; i is: " + i);
                    return ans + i;
                });
        System.out.println("The result of reduce is: " + even);



    }

}
