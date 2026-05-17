package com.example.com;
//Step 1 : import pkg
import java.sql.*;
public class JDBC {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/";
		String user="root";
		String password ="Purvesh@123";
		
		String dbName = "CSE_DB";
		
		try {
			
			//step 2 : Load & register the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//step 3 : connect to database
			Connection con=DriverManager.getConnection(url, user, password);
			System.out.println("DB connected successfully");
			
			//step 4 : connect to database 
			Statement stmt=con.createStatement();
			String sqlQuery="CREATE DATABASE " +dbName;
			
			//step 5 : execute the sql query 
			stmt.executeUpdate(sqlQuery);
			System.out.println("Database connected successfully");
			
			//step 6 : result
			
			//step 7: close the connection
			con.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
