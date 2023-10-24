package org.startsteps.week8.day02;

import java.io.*;
import java.util.*;

public class ExerciseSolutions {

    public static void main(String[] args) {
//        exercise1();
//        exercise3();
//        exercise4();
//        exercise5();
//        exercise7();
        exercise8();
    }

    public static void exercise1() {
        System.out.println("Exercise 1:");
        try (FileInputStream fis = new FileInputStream("src/main/java/org/startsteps/week8/day02/input12323.txt")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exercise3() {
        System.out.println("Exercise 3:");
        try (FileInputStream fis = new FileInputStream("src/main/java/org/startsteps/week8/day02/image.jpg")) {
            int data;
            while ((data = fis.read()) != -1) {
                System.out.print(data + " ");
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exercise4() {
        System.out.println("Exercise 4:");
        try (FileInputStream fis = new FileInputStream("src/main/java/org/startsteps/week8/day02/image.jpg");
             FileOutputStream fos = new FileOutputStream("src/main/java/org/startsteps/week8/day02/copy_image.jpg")) {

            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("The image has been copied to copy_image.jpg");

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exercise5() {
        System.out.println("Exercise 5:");
        try (FileInputStream fis = new FileInputStream("src/main/java/org/startsteps/week8/day02/data.csv")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] values = line.split(",");
                for (String value : values) {
                    System.out.println(value + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exercise7() {
        System.out.println("Exercise 7:");
        int bufferSize = 1024;
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/main/java/org/startsteps/week8/day02/large_data.txt"))) {
            byte[] buffer = new byte[bufferSize];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void exercise8() {
        System.out.println("Exercise 8:");
        int bufferSize = 1024;
        long startTime = System.currentTimeMillis();

        try (FileInputStream fis = new FileInputStream("src/main/java/org/startsteps/week8/day02/large_data.txt")) {
            byte[] buffer = new byte[bufferSize];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, bytesRead));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.println("Time taken to read and display the large file: " + (endTime - startTime) + " milliseconds");
    }

}
