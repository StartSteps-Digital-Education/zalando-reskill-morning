package org.startsteps.week8.day03;

import java.io.*;

public class ExercisesSolutions {

    // Exercise 1
    public void readFile() {
        try (FileReader reader = new FileReader("src/main/java/org/startsteps/week8/day03/input.txt")) {
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Exercise 2
    public void writeFile() {
        try (FileWriter writer = new FileWriter("src/main/java/org/startsteps/week8/day03/output.txt")) {
            writer.write("Sample sentence.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Exercise 3
    public void copyFile() {
        try (FileReader reader = new FileReader("src/main/java/org/startsteps/week8/day03/source.txt");
             FileWriter writer = new FileWriter("src/main/java/org/startsteps/week8/day03/destination.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                writer.write((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Exercise 4
    public void appendToFile() {
        try (FileWriter writer = new FileWriter("src/main/java/org/startsteps/week8/day03/destination.txt", true)) {
            writer.write("\nAppended text.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Exercise 5
    public void sumNumbers() {
        try (FileReader reader = new FileReader("src/main/java/org/startsteps/week8/day03/input_numbers.txt");
             BufferedReader br = new BufferedReader(reader);
             FileWriter writer = new FileWriter("src/main/java/org/startsteps/week8/day03/output_sum.txt")) {
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                sum += Integer.parseInt(line.trim());
            }
            writer.write(String.valueOf(sum));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExercisesSolutions solutions = new ExercisesSolutions();
//        solutions.readFile();
//        solutions.writeFile();
//        solutions.copyFile();
//        solutions.appendToFile();
        solutions.sumNumbers();
    }
}
