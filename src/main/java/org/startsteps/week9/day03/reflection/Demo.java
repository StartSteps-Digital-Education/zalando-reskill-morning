package org.startsteps.week9.day03.reflection;

import java.lang.reflect.Field;

public class Demo {




    public static void main(String[] args) {

        MyPerson myPerson = new MyPerson("Faruk", 23);

        Field[] fields = myPerson.getClass().getDeclaredFields();

        for (Field field: fields){
            System.out.println(field.getName());
        }

    }
}

class MyPerson {
    private String name;
    private int age;

    public MyPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
