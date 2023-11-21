package org.startsteps.week10;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter User name for register: ");
        String username = scanner.nextLine();
        //scanner.nextLine();
        System.out.println("Enter password: ");
        //scanner.nextLine();
        String password = scanner.nextLine();
        System.out.println("Choose your role ");
        System.out.println("'1'-ADMIN; 'n\''2'-TEACHER; 'n\''3'-STUDENT");
        int roleChoice = scanner.nextInt();
        scanner.nextLine();


        int test = 0;
    }
}
