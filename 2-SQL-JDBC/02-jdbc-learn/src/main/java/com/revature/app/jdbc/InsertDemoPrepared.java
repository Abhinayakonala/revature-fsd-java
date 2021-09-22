package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class InsertDemoPrepared {

	public static void main(String[] args) {
		Connection connection = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/learndb", "root", "Abhi@2766");

			String sql = "insert into department (name) values (?)";
			//SQL Injection Demo Code
			/*String departmentName = "Statistics";
			String sql = "insert into department (name) values ('" + departmentName + "')";
			statement.executeUpdate(sql);
			
			departmentName = "Research";
			sql = "insert into department (name) values ('" + departmentName + "')";
			statement.executeUpdate(sql);
			
			String email = "123@gmail.com' or 1 = 1";
			sql = "select * from user where email = '" + email + "'";
			
			
			sql = "select * from user where email = '123@gmail.com' or 1 = 1";*/

			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, "Research");
			statement.executeUpdate();
			statement.setString(1,  "Statistics");
			statement.executeUpdate();
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
