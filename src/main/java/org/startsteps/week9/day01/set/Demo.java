package org.startsteps.week9.day01.set;

import java.util.HashSet;
import java.util.Set;

public class Demo {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Cow");
        set.add("Lizard");
        set.add("Dog");
        set.add("Dog");
        set.add("Dog");
        set.add("Dog");
        set.add("Lizard");

        System.out.println(set);
    }
}
