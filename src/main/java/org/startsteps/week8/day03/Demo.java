package org.startsteps.week8.day03;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo {

    public static void main(String[] args) {
        createTextFile();
        readTextFile();
    }

    static void createTextFile(){
        String str = "File Handling in Java using FileWriter and FileReader";

        try(FileWriter fileWriter = new FileWriter("src/main/java/org/startsteps/week8/day03/output.txt")) {
            fileWriter.write(str);
//            for (int i = 0; i < str.length(); i++) {
//                fileWriter.write(str.charAt(i));
//            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void readTextFile(){
        try(FileReader fileReader = new FileReader("src/main/java/org/startsteps/week8/day03/output.txt")) {
            int ch;
            while ((ch = fileReader.read()) != -1){
                System.out.print((char) ch);
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }


}
