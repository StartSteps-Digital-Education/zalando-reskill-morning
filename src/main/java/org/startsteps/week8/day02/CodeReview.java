package org.startsteps.week8.day02;

import java.io.FileInputStream;
import java.io.IOException;

public class CodeReview {

    public static void main(String[] args) {
        readBinaryFile();
    }

    static void readBinaryFile() {
        try (FileInputStream fileInputStream = new FileInputStream("src/main/java/org/startsteps/week8/day02/image.jpg")) {
            int data;
            int count = 0;

            while ((data = fileInputStream.read()) != -1) {
                String hex = Integer.toHexString(data);

                if (hex.length() < 2) {
                    hex = "0" + hex;
                }

                System.out.print(hex + " ");
                count++;

                if (count % 16 == 0) {
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
