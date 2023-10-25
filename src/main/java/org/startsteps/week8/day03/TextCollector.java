package org.startsteps.week8.day03;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class TextCollector {

    private static final String FILE_PATH = "src/main/java/org/startsteps/week8/day03/output.txt";

    public static void main(String[] args) throws IOException {
        Set<String> previousContents = readPreviousContent();
        System.out.println("Previous contents:");
        previousContents.forEach(System.out::println);

        Set<String> newContents = new HashSet<>();

        System.out.println("Enter unique words (type 'Export' to save and exit):");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = reader.readLine();
            if (input.equalsIgnoreCase("Export")) {
                break;
            }
            if (!previousContents.contains(input) && !newContents.contains(input)) {
                newContents.add(input);
            } else {
                System.out.println("Duplicate word. Please enter a unique word.");
            }
        }

        writeNewContent(newContents);
    }

    private static Set<String> readPreviousContent() throws IOException {
        Set<String> contents = new HashSet<>();
        File file = new File(FILE_PATH);

        if (file.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                String line;
                while ((line = br.readLine()) != null) {
                    contents.add(line);
                }
            }
        }
        return contents;
    }

    private static void writeNewContent(Set<String> newContents) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            for (String word : newContents) {
                bw.write(word);
                bw.newLine();
            }
        }
    }
}
