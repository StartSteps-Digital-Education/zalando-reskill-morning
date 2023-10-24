package org.startsteps.week8.day02;


import java.io.*;

public class Demo {

    public static void main(String[] args) {
//        fileInputStream();
//        bufferedInputStream();
//        byteArrayInputStream();
//        fileOutputStream();
//        bufferedOutputStream();
        byteArrayOutputStream();
    }

    static void fileInputStream() {
        try (FileInputStream fileInputStream = new FileInputStream("src/main/java/org/startsteps/week8/day02/input.txt")) {
            int x = 0;
            while ((x = fileInputStream.read()) != -1) {
                System.out.println((char) x);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }



    static void bufferedInputStream() {
        try (FileInputStream fileInputStream = new FileInputStream("src/main/java/org/startsteps/week8/day02/input.txt");
             BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream)) {

            int x = 0;
            while ((x = bufferedInputStream.read()) != -1) {
                System.out.println((char) x);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void byteArrayInputStream(){
        try (FileInputStream fileInputStream = new FileInputStream("src/main/java/org/startsteps/week8/day02/input.txt")) {
            StringBuilder text = new StringBuilder();
            int x = 0;
            while ((x = fileInputStream.read()) != -1) {
                text.append((char) x);
            }

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(text.toString().getBytes());
            int y = 0;
            while ((y = byteArrayInputStream.read()) != -1) {
                System.out.println((char) y);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void fileOutputStream(){
        try(FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/org/startsteps/week8/day02/output.txt")) {
            String text = "WELCOME";
            char arr[] = text.toCharArray();

            int x = 0;
            while (x < text.length()){
                fileOutputStream.write(arr[x++]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void bufferedOutputStream(){
        try(FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/org/startsteps/week8/day02/output.txt");
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {

            String text = "WELCOME";
            char arr[] = text.toCharArray();

            int x = 0;
            while (x < text.length()){
                bufferedOutputStream.write(arr[x++]);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }

    static void byteArrayOutputStream(){
        try(FileOutputStream fileOutputStream = new FileOutputStream("src/main/java/org/startsteps/week8/day02/output.txt")) {
            String text = "Welcome from byteArrayOutputStream function";

            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(text.getBytes());
            byteArrayOutputStream.writeTo(fileOutputStream);
        } catch (Exception e){
            System.out.println(e);
        }
    }

}
