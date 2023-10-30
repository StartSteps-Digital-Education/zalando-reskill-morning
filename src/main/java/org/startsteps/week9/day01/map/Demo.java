package org.startsteps.week9.day01.map;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Demo {


    public static void main(String[] args) {
        Map<String, Integer> tm = new TreeMap<>();

        tm.put("b", 20);
        tm.put("a", 10);
        tm.put("d", 40);
        tm.put("e", 50);
        tm.put("c", 30);

        for (Map.Entry<String, Integer> entry: tm.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }




    }
}

