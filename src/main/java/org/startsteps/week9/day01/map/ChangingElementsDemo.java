package org.startsteps.week9.day01.map;

import java.util.HashMap;
import java.util.Map;

public class ChangingElementsDemo {

    public static void main(String[] args) {
        // Initialization of a Map using Generics
        Map<Integer, String> hm1 = new HashMap<>();

        // Inserting the Elements
        hm1.put(1, "Zalando");
        hm1.put(2, "Zalando");
        hm1.put(3, "Zalando");

        System.out.println("Initial Map " + hm1);

        hm1.put(2, "For");

        System.out.println("Updated Map " + hm1);
    }
}
