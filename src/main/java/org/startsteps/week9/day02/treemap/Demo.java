package org.startsteps.week9.day02.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Demo {

    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>(Comparator.reverseOrder());
        map.put(3, "a");
        map.put(1, "a");
        map.put(5, "a");
        map.put(2, "a");
        map.put(4, "a");

        System.out.println(map.keySet());
    }
}
