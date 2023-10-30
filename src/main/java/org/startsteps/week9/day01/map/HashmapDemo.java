package org.startsteps.week9.day01.map;

import java.util.HashMap;
import java.util.Map;

public class HashmapDemo {

    public static void main(String[] args) {
        // Creating an empty HashMap
        Map<String, Integer> hm = new HashMap<>();

        // Inserting pairs in above Map using put() method
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);

        // Traversing through Map using for-each loop
        for (Map.Entry<String, Integer> me: hm.entrySet()) {
            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }

}
