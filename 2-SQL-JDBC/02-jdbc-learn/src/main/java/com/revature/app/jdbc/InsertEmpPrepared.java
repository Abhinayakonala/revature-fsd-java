package com.revature.app.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertEmpPrepared {

	public static void main(String[] args) {
		Connection connection = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/learndb", "root", "Abhi@2766");

			String sql = "insert into learndb.employee (name, salary, gender, department_id) values (?.?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, "Jacob");
			statement.setDouble(2,  1500);
			statement.setString(3, "M");
			statement.setInt(4, 2);
			statement.executeUpdate();
			connection.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();

	}
	}
}
