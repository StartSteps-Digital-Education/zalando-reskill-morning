package org.startsteps.week9.day03.reflection.exercises;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person {
    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }
}

public class Exercise1 {

    public static void main(String[] args) {
        try {
            Class<?> personClass = Person.class;

            System.out.println("Class name: " + personClass.getName());

            System.out.println("Fields:");
            Field[] fields = personClass.getDeclaredFields();
            for (Field field : fields) {
                System.out.println("  " + field.getType().getSimpleName() + " " + field.getName());
            }

            System.out.println("Methods:");
            Method[] methods = personClass.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("  " + method.getName());
            }

            Person person = new Person("Alice", 30, "New York");
            Method getNameMethod = personClass.getMethod("getName");
            String name = (String) getNameMethod.invoke(person);
            System.out.println("Invoked getName method: " + name);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

}
