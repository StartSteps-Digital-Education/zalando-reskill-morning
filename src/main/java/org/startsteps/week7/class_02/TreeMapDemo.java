package org.startsteps.week7.class_02;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args) {
        Map<Integer, Integer> treeMap = new TreeMap<>();
        treeMap.put(10, 10);
        treeMap.put(6, 15);
        treeMap.put(20, 8);

        System.out.println("Contents of the map: " + treeMap);
    }
}
