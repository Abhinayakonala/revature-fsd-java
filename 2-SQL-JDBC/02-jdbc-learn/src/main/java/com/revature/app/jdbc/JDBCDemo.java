package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo {

	public static void main(String[] args) {
	
		try {
			// Driver driver = new Driver();
			// Load the driver
			Class.forName("com.mysql.cj.jdbc.Driver" );
			
			Connection connection = DriverManager.getConnection( 
					"jdbc:mysql://localhost:3307/learndb",
					"root",
					"Abhi@2766");
			System.out.println(connection.getClass().getName());
			System.out.println("Connection successfull.");
			Statement statement = connection.createStatement();
			String sql = "insert into department (name) values ('Innovation')";
	
			statement.executeUpdate(sql);
			connection.close();		
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
