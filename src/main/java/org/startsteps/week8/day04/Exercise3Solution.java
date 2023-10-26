package org.startsteps.week8.day04;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import static org.startsteps.week8.day04.Exercise1Solution.deserializeFromFile;
import static org.startsteps.week8.day04.Exercise1Solution.serializeToFile;

public class Exercise3Solution {

    static class Vehicle implements Externalizable {
        private String make;
        private String model;
        private int year;


        public Vehicle(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public Vehicle() {
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeUTF(make);
            out.writeUTF(model);
            out.writeInt(year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException {
            make = in.readUTF();
            model = in.readUTF();
            year = in.readInt();
        }

        @Override
        public String toString() {
            return "Vehicle{make='" + make + "', model='" + model + "', year=" + year + "}";
        }


    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Camry", 2020);
        System.out.println("Before serialization " + vehicle);
        try {
            serializeToFile(vehicle, "src/main/java/org/startsteps/week8/day04/vehicle.ser");

            Vehicle deserializedVehicle = (Vehicle) deserializeFromFile("src/main/java/org/startsteps/week8/day04/vehicle.ser");
            System.out.println(deserializedVehicle);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
