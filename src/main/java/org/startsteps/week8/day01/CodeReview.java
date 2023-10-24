package org.startsteps.week8.day01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CodeReview {

    Scanner sc = new Scanner(System.in);

    public void readFromConsole(){
        System.out.println("Say something: ");
        String string = sc.nextLine();
        System.out.println(string);
        sc.close();
    }

    public void writeToConsole(){
        System.out.println("What's your name?");
        String name = sc.nextLine();
        StringBuilder sb = new StringBuilder("Hello ");
        sb.append(name);
        sc.close();
    }

    public static void main(String[] args) {
        CodeReview codeReview = new CodeReview();
        codeReview.writeToConsole();
        codeReview.readFromConsole();
    }


    public void test(){
        //exercise 3
        try {
            FileWriter writer = new FileWriter("input.txt");
            writer.write("Hello world");
            writer.close();
            System.out.println("Successfully created input.txt");
            FileReader fileReader = new FileReader("input.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter outputWriter = new FileWriter("output.txt");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                outputWriter.write(line + "\n");
            }
            fileReader.close();
            bufferedReader.close();
            outputWriter.close();
            System.out.println("Successfully copied contents of input.txt to output.txt");
            FileReader outputReader = new FileReader("output.txt");
            BufferedReader outputBufferedReader = new BufferedReader(outputReader);
            System.out.println("Contents of 'output.txt':");
            while ((line = outputBufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            outputReader.close();
            outputBufferedReader.close();
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
