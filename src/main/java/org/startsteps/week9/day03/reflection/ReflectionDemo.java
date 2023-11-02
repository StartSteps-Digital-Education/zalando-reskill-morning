package org.startsteps.week9.day03.reflection;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private int age;
}


public class ReflectionDemo {
    public static void main(String[] args) {
        Object person = new Person();
        Field[] fields = person.getClass().getDeclaredFields();

        List<String> actualFieldNames = getFieldNames(fields);
        System.out.println(actualFieldNames);
    }

    private static List<String> getFieldNames(Field[] fields) {
        List<String> fieldNames = new ArrayList<>();
        for (Field field : fields)
            fieldNames.add(field.getName());
        return fieldNames;
    }

}
