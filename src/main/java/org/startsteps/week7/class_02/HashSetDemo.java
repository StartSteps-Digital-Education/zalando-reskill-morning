package org.startsteps.week7.class_02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {

    public static void main(String[] args) {


        List<Integer> array = new ArrayList<>();
        array.add(9);
        array.add(2);
        array.add(6);
        array.add(8);
        array.add(10);
        array.add(9);
        for (int value: array) {
            System.out.println(value);
        }

        System.out.println("************");

        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(9);
        integerSet.add(2);
        integerSet.add(6);
        integerSet.add(8);
        integerSet.add(10);
        integerSet.add(9);

        for (int value: integerSet) {
            System.out.println(value);
        }


    }

}
