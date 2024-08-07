package com.JDBC.Select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectDemo3 {
	
	public static Connection connection;
	public static ResultSet resultSet;
	public static Statement statement;
	public static String driverPath="com.mysql.cj.jdbc.Driver";
	public static String dburl= "jdbc:mysql://localhost:3306/jdbc_db";
	private static String user = "root";
	private static String password = "root";
	private static String query;
	
	public static void main(String[] args) {
		
		try {
			// 1. Load the Driver class
			            Class.forName(driverPath);
			
			// 2. Open connection
			            connection = DriverManager.getConnection(dburl,user,password);
			
			// 3. Create Statement
						statement = connection.createStatement();
						query = "select * from emp1";
						resultSet = statement.executeQuery(query);
						
			// 4. Process the result
						while(resultSet.next()) {
							System.out.println(resultSet.getString(1) + " | "
											+ resultSet.getString(2) + " | "
											+ resultSet.getInt(3));
						}
						
						
						
			
		}
		catch (ClassNotFoundException | SQLException e) {
	} finally {
		try {
			// 5. Close connection
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
			if (resultSet != null) {
				resultSet.close();
			}
		} catch (SQLException e) {
		}

}
}
	}