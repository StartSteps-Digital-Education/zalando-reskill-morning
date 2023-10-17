package org.startsteps.week7.class_02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] arg) {
        List<String> stringList = new LinkedList<>();
        stringList.add("Name");
        stringList.add("Age");
        stringList.add("Date");

        stringList.remove("Age");

        for (String value: stringList) {
            System.out.println(value);
        }
    }

}
