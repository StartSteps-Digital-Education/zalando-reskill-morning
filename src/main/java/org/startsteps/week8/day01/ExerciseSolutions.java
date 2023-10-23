package org.startsteps.week8.day01;

import java.io.*;
import java.util.Scanner;

public class ExerciseSolutions {

    // Exercise 1: Reading from the Console
    public static void readFromConsole() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String input = scanner.nextLine();
        System.out.println("You entered: " + input);
    }

    // Exercise 2: Writing to the Console
    public static void greetUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }

    // Exercise 3: Reading and Writing to Files
    public static void copyTextFile() {
        try (FileReader fr = new FileReader("src/main/java/org/startsteps/week8/day01/input.txt");
             FileWriter fw = new FileWriter("src/main/java/org/startsteps/week8/day01/output.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Exercise 4: Copying a File
    public static void copyBinaryFile() {
        try (FileInputStream fis = new FileInputStream("src/main/java/org/startsteps/week8/day01/source.txt");
             FileOutputStream fos = new FileOutputStream("src/main/java/org/startsteps/week8/day01/destination.txt")) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Exercise 5: Reading and Writing CSV Files
    public static void readCSVFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/org/startsteps/week8/day01/data.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
//         readFromConsole();
//         greetUser();
         copyTextFile();
//         copyBinaryFile();
//         readCSVFile();
    }
}
