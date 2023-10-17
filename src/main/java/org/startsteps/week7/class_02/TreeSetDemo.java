package org.startsteps.week7.class_02;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args){
        Set<Integer> integerSet = new TreeSet<>();
        integerSet.add(3);
        integerSet.add(1);
        integerSet.add(30);
        integerSet.add(2);
        integerSet.add(56);
        integerSet.add(0);

        System.out.println("Treeset: " + integerSet);
    }

}
