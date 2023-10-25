package org.startsteps.week8.day03;

import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExtendedExercisesSolutions {

    public static void main(String[] args) {

    }

    public void exercise2() {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            int linesCount = 0;
            while (reader.readLine() != null) {
                linesCount++;
            }
            System.out.println("Total number of lines: " + linesCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

    public void exercise3() {
        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.toUpperCase());
                writer.newLine();  // to write a newline character for each line
            }
        } catch (IOException e) {
            System.err.println("Error handling the files: " + e.getMessage());
        }
    }

    public void exercise4() {
        Set<String> words = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (String word : line.split("\\W+")) {
                    if (words.contains(word)) {
                        duplicates.add(word);
                    } else {
                        words.add(word);
                    }
                }
            }

            for (String duplicate : duplicates) {
                System.out.println("Duplicate word: " + duplicate);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }

}
