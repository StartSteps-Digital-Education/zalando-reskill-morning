package org.startsteps.week8.day05;

import java.io.*;
import static org.startsteps.week8.day04.Exercise1Solution.deserializeFromFile;



public class Demo {

    public static void main(String[] args) {
        ValueObject vo1 = new ValueObject("Hi");
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("src/main/java/org/startsteps/week8/day05/ValueObject.ser"));) {
            out.writeObject(vo1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("src/main/java/org/startsteps/week8/day05/ValueObject.ser"))){
            System.out.println(in.readObject());
        } catch (Exception e){
            e.printStackTrace();
        }
    }




}

class ValueObject implements Serializable {
    private String value;
    private String sideEffect;

    public ValueObject() {
        this("empty");
    }

    public ValueObject(String value) {
        this.value = value;
        this.sideEffect = java.time.LocalTime.now().toString();
    }

    @Override
    public String toString() {
        return "ValueObject{" +
                "value='" + value + '\'' +
                ", sideEffect='" + sideEffect + '\'' +
                '}';
    }
}
