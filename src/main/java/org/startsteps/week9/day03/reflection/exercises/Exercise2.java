package org.startsteps.week9.day03.reflection.exercises;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;

class Car {
    private String make;
    private String model;
    private int year;

    public Car() {
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class Exercise2 {
    public static void main(String[] args) {
        try {
            Class<?> carClass = Car.class;

            // Get the Constructor object for the Car class and create an instance of Car using reflection
            Constructor<?> constructor = carClass.getConstructor();
            Object carObject = constructor.newInstance();

            // Set the values of the private fields make, model, and year using reflection
            Field makeField = carClass.getDeclaredField("make");
            makeField.setAccessible(true);
            makeField.set(carObject, "Toyota");

            Field modelField = carClass.getDeclaredField("model");
            modelField.setAccessible(true);
            modelField.set(carObject, "Corolla");

            Field yearField = carClass.getDeclaredField("year");
            yearField.setAccessible(true);
            yearField.set(carObject, 2020);

            // Invoke the public methods to get the values of these fields and print them
            Method getMakeMethod = carClass.getMethod("getMake");
            String make = (String) getMakeMethod.invoke(carObject);
            System.out.println("Make: " + make);

            Method getModelMethod = carClass.getMethod("getModel");
            String model = (String) getModelMethod.invoke(carObject);
            System.out.println("Model: " + model);

            Method getYearMethod = carClass.getMethod("getYear");
            int year = (int) getYearMethod.invoke(carObject);
            System.out.println("Year: " + year);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException | InstantiationException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
