package org.startsteps.week7.class_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapRealworldExample {

    public static void main(String[] args) {
        List<Class> classList = new ArrayList<>();
        classList.add(new Class("Zalando", 15));
        classList.add(new Class("Android", 10));
        classList.add(new Class("iOS", 5));

        for (Class classValue: classList) {
            if (classValue.className.equals("Zalando")){
                System.out.println("Number of students for Zalando is: " + classValue.numberOfStudents);
            }
        }

        System.out.println("****");

        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("Zalando", 15);
        stringIntegerMap.put("Android", 10);
        stringIntegerMap.put("iOS", 9);
        stringIntegerMap.put("iOS", 10);
        System.out.println("Number of students for Zalando is: " + stringIntegerMap.get("Zalando"));



    }
}



class Class {
    String className;
    int numberOfStudents;

    public Class(String className, int numberOfStudents){
        this.className = className;
        this.numberOfStudents = numberOfStudents;
    }
}