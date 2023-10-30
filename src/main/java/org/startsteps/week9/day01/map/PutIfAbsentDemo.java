package org.startsteps.week9.day01.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PutIfAbsentDemo {

    public static void main(String[] args) {
        int[] a = { 1, 13, 4, 1, 41, 31, 31, 4, 13, 2 };

        // put all elements in arraylist
        ArrayList<Integer> aa = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            aa.add(a[i]);
        }

        HashMap<Integer, Integer> h = new HashMap<>();

        // counting occurrence of numbers
        for (int i = 0; i < aa.size(); i++) {
            h.putIfAbsent(aa.get(i), Collections.frequency(aa, aa.get(i)));
        }
        System.out.println(h);
    }
}
