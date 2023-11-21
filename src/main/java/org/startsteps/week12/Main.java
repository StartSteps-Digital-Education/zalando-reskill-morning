package org.startsteps.week12;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.display();
    }

    private void display() {
        try {
            // Connection to your MySQL database
            String url = "jdbc:mysql://localhost:3306/practice";
            String user = "root";
            String password = "Password123.";
            Connection con = DriverManager.getConnection(url, user, password);

            // Query which needs parameters
            String query = "SELECT * FROM students WHERE age > ? AND name = ?";

            // Prepare Statement
            PreparedStatement myStmt = con.prepareStatement(query);

            // Set Parameters
            myStmt.setInt(1, 23);
            myStmt.setString(2, "Faruk");
            ResultSet myRs = myStmt.executeQuery();

            System.out.println("Age\t Name");

            // Display function to show the ResultSet
            while (myRs.next()) {
                String name = myRs.getString("name");
                int age = myRs.getInt("age");
                System.out.println(name + "\t " + age);
            }

            // Close the connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void update() {
        try {
            // Connection to your MySQL database
            String url = "jdbc:mysql://localhost:3306/practice";
            String user = "root";
            String password = "Password123.";
            Connection con = DriverManager.getConnection(url, user, password);
            // Query which needs parameters
            String query = "INSERT INTO Students VALUES (?, ?, ?)";
            // Prepare Statement
            PreparedStatement myStmt = con.prepareStatement(query);
            // Set Parameters
            myStmt.setInt(1, 0);
            myStmt.setString(2, "Mia");
            myStmt.setInt(3, 21);

            // Execute SQL query
            int res = myStmt.executeUpdate();
            // Display the records inserted
            System.out.println(res + " record(s) inserted");
            // Close the connection
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

