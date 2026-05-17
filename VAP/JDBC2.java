package com.example.com;

import java.sql.*;

public class JDBC2 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/CSE_DB"; // FIXED
        String user = "root";
        String password = "Purvesh@123";

        try {
            // Step 1: Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Connect
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Database Connected Successfully");

            // Step 3: Create statement
            Statement stmt = con.createStatement();

            // Step 4: Create table
            String createTable = "CREATE TABLE IF NOT EXISTS employees ("
                    + "emp_no INT PRIMARY KEY, "
                    + "emp_name VARCHAR(100), "
                    + "salary DOUBLE)";

            stmt.executeUpdate(createTable);
            System.out.println("Table 'employees' created successfully.");

            // Step 5: Insert data using PreparedStatement
            String insertData = "INSERT INTO employees(emp_no, emp_name, salary) VALUES(?,?,?)";
            PreparedStatement pst = con.prepareStatement(insertData);

            // Employee 1
            pst.setInt(1, 301);
            pst.setString(2, "Amey");
            pst.setDouble(3, 12345.67);
            pst.executeUpdate();

            // Employee 2
            pst.setInt(1, 302);
            pst.setString(2, "Prathamesh");
            pst.setDouble(3, 21456.67);
            pst.executeUpdate();

            // Employee 3
            pst.setInt(1, 303);
            pst.setString(2, "Aditya");
            pst.setDouble(3, 32546.67);
            pst.executeUpdate();

            // Employee 4
            pst.setInt(1, 304);
            pst.setString(2, "Purvesh");
            pst.setDouble(3, 12456.67);
            pst.executeUpdate();

            System.out.println("Employees record inserted successfully");

            // Close
            pst.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}