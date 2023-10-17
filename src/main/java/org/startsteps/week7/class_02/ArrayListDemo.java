package org.startsteps.week7.class_02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] arg) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Name");
        stringList.add("Age");
        stringList.add("Date");

        stringList.remove("Age");

        for (String value: stringList) {
            System.out.println(value);
        }
    }

}
