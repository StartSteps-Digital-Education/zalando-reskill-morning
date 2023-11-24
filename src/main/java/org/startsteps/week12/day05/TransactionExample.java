package org.startsteps.week12.day05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/practice";
        String user = "root";
        String password = "Password123.";

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(url, user, password);

            connection.setAutoCommit(false);

            String insertStudentSQL = "INSERT INTO students (id, name, age) VALUES (0, ?, ?)";
            String insertCourseSQL = "INSERT INTO courses (course_name) VALUES (?)";

            PreparedStatement insertStudentStatement = connection.prepareStatement(insertStudentSQL);
            PreparedStatement insertCourseStatement = connection.prepareStatement(insertCourseSQL);

            insertStudentStatement.setString(1, "Alice");
            insertStudentStatement.setInt(2, 22);
            insertStudentStatement.executeUpdate();

            insertCourseStatement.setString(1, "Mathematics");
            insertCourseStatement.executeUpdate();

            connection.commit();
            System.out.println("Transaction committed successfully.");
        } catch (SQLException e) {
            try {
                if (connection != null) {
                    connection.rollback();
                    System.err.println("Transaction rolled back due to an error: " + e.getMessage());
                }
            } catch (SQLException rollbackException) {
                System.err.println("Error rolling back transaction: " + rollbackException.getMessage());
            }
        } finally {
            try {
                if (connection != null) {
                    connection.setAutoCommit(true);
                    connection.close();
                }
            } catch (SQLException closeException) {
                System.err.println("Error closing connection: " + closeException.getMessage());
            }
        }
    }
}
