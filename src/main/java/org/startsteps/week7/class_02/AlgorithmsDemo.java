package org.startsteps.week7.class_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AlgorithmsDemo {

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(4);
        integerList.add(20);
        integerList.add(15);
        integerList.add(100);

        for (Integer value:integerList) {
            System.out.println(value);
        }

        System.out.println("****");

        Collections.sort(integerList);
        for (Integer value:integerList) {
            System.out.println(value);
        }

        System.out.println("*****");

        // ctrl + G

        List<Integer> unshuffledList = new ArrayList<>();
        unshuffledList.add(1);
        unshuffledList.add(2);
        unshuffledList.add(3);
        unshuffledList.add(4);
        unshuffledList.add(5);

        for (Integer value:unshuffledList) {
            System.out.println(value);
        }

        System.out.println("*****");

        Collections.shuffle(unshuffledList);

        for (Integer value:unshuffledList) {
            System.out.println(value);
        }

        System.out.println("*******");


        List<Integer> searchingList = Arrays.asList(1, 4, 8, 20, 25, 30, 50, 60);
        Collections.shuffle(searchingList);
        Collections.sort(searchingList);
        int searchResultIndex = Collections.binarySearch(searchingList, 1);
        System.out.println("The search index is: " + searchResultIndex
                + "; The value on that index is: "
                + searchingList.get(searchResultIndex));

        System.out.println("*******");


        List<Integer> integers = Arrays.asList(10, 29, 3, 4, 51, 6, 7, 6, 6, 80);
        int frequency = Collections.frequency(integers, 10);
        System.out.println("The number 10 occurs: " + frequency);

        System.out.println("*******");

        // Duplicate: command + D
        List<Integer> firstList = Arrays.asList(2, 10, 20, 30);
        List<Integer> secondList = Arrays.asList(2, 21, 31, 41);

        boolean hasElementsNotCommon = Collections.disjoint(firstList, secondList);
        System.out.println("Do the two lists have elements in common: " + hasElementsNotCommon);

        System.out.println("*******");

        List<Integer> maxList = Arrays.asList(2, 10, 30, 20, 12, 100, 200, 1, 20);
        System.out.println("The max value in list maxList is: " + Collections.max(maxList));

        System.out.println("*******");

        List<Integer> minList = Arrays.asList(2, 10, 30, 20, 12, 100, 200, 20);
        System.out.println("The min value in list minList is: " + Collections.min(minList));




    }
}
