package org.startsteps.week9.day01.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        Set<String> lh = new LinkedHashSet<String>();

        // Adding elements into the LinkedHashSet using add()
        lh.add("India");
        lh.add("Australia");
        lh.add("South Africa");

        // Adding the duplicate  element
        lh.add("India");

        // Displaying the LinkedHashSet
        System.out.println(lh);
        // Removing items from LinkedHashSet using remove()
        lh.remove("Australia");
        System.out.println("Set after removing " + "Australia:" + lh);

        // Iterating over linked hash set items
        System.out.println("Iterating over set:");
        Iterator<String> i = lh.iterator();
        while (i.hasNext()) System.out.println(i.next());
    }
}
