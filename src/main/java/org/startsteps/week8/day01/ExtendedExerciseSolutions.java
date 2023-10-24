package org.startsteps.week8.day01;

import java.io.*;
import java.util.*;

public class ExtendedExerciseSolutions {

    // Exercise 1: Counting Words in a File
    public static void countWordsInFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/org/startsteps/week8/day01/input.txt"))) {
            String line;
            int wordCount = 0;
            Map<String, Integer> frequencyMap = new HashMap<>();

            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;

                // Bonus: Counting frequency
                for (String word : words) {
                    word = word.toLowerCase().replaceAll("[^a-z]", "");
                    frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
                }
            }

            System.out.println("Total words: " + wordCount);

            // Bonus: Print word frequency
            System.out.println("\nWord Frequencies:");
            for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Exercise 2: Reading User Input until 'Exit'
    public static void readUntilExit() {
        Scanner scanner = new Scanner(System.in);
        List<String> inputs = new ArrayList<>(); // For the bonus task

        while (true) {
            System.out.println("Enter a string (type 'Exit' to quit):");
            String input = scanner.nextLine();
            if ("Exit".equalsIgnoreCase(input)) {
                break;
            }
            inputs.add(input);  // For the bonus task
        }

        // Bonus: Write to file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/main/java/org/startsteps/week8/day01/userInputs.txt"))) {
            for (String input : inputs) {
                bw.write(input + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Exercise 3: Appending to a File
    public static void appendToFile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter content to append to the file:");
        String content = scanner.nextLine();

        // Bonus: Check if content exists
        try (BufferedReader br = new BufferedReader(new FileReader("src/main/java/org/startsteps/week8/day01/appendFile.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.equals(content)) {
                    System.out.println("Content already exists in the file!");
                    return;
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        try (FileWriter fw = new FileWriter("appendFile.txt", true)) {
            fw.write(content + "\n");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Exercise 4: Reading a Properties File
    public static void readPropertiesFile() {
        Properties prop = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/java/org/startsteps/week8/day01/config.properties")) {
            prop.load(fis);

            // Print properties
            for (String key : prop.stringPropertyNames()) {
                System.out.println(key + " = " + prop.getProperty(key));
            }

            // Bonus: Search for a key
            Scanner scanner = new Scanner(System.in);
            System.out.println("\nEnter a key to search:");
            String searchKey = scanner.nextLine();
            if (prop.containsKey(searchKey)) {
                System.out.println(searchKey + " = " + prop.getProperty(searchKey));
            } else {
                System.out.println("Key not found!");
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Exercise 5: Creating Directories
    public static void createDirectories() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the path for directory creation (e.g., folder/subfolder/subsubfolder):");
        String path = scanner.nextLine();

        File directory = new File(path);
        if (directory.mkdirs()) {
            System.out.println("Directories created successfully!");
        } else {
            System.out.println("Failed to create directories. They might already exist.");
        }
    }

    public static void main(String[] args) {
//         countWordsInFile();
//         readUntilExit();
//         appendToFile();
//         readPropertiesFile();
//         createDirectories();
    }
}
