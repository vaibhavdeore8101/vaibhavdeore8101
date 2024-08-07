package com.JDBC.operations;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class JdbcOperation {
	
	private static Connection connection;
	private static ResultSet resultset;
	private static Properties properties = new Properties();
	private static FileInputStream file;
	private static String filePath = "D:\\Adv. Java\\JDBC\\src\\resources\\db_info.properties";
	private static String query;
	private static int result ;
	private static Statement statement;
	
	public static void main(String[] args) throws Exception, IOException {
		
		// 1. Create a table
		openConnection();
		query = "create table stud_details "
				+ "(sid int(3) primary key, name varchar(50),"
				+ "email varchar(30), contact bigint(10))";
		try {
			result = statement.executeUpdate(query);
			System.out.println("Query OK, " + result 
					+ " row(s) affected.");
		} catch (SQLException e) {
			
			System.out.println("Query OK, " + result 
					+ " row(s) affected.");
			
closeConnection();
		}
		
		
		
		//2. Insert 5 records
		openConnection();
		Scanner scanner = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter id :");
			int sid = scanner.nextInt();
			System.out.println("Enter name :");
			String name = scanner.next();
			System.out.println("Enter email :");
			String email = scanner.next();
			System.out.println("Enter contact :");
			long contact = scanner.nextLong();
			
			query = "insert into stud_details "
					+ "values (" + sid + ",'"
					+ name + "','" + email + "'," + contact + ")";
			
			result = result + statement.executeUpdate(query);
			
			scanner.close();
			System.out.println("Query OK, " + result 
					+ " row(s) affected.");
		}
		
		
		//3. Select all records
		openConnection();
		query = "select * from stud_details";
		resultset = statement.executeQuery(query);
		while (resultset.next()) {
			System.out.println(resultset.getString(1) + " | "
					+ resultset.getString(2) + " | "
					+ resultset.getString(3) + " | "
					+ resultset.getString(4));
		}
	}

	private static void closeConnection() throws SQLException, IOException {
		
		if (connection != null) {
			connection.close();
		}
		if (statement != null) {
			statement.close();
		}
		if (resultset != null) {
			resultset.close();
		}
		if (file != null) {
			file.close();
		}
		if (result != 0) {
			result = 0;
		}
	}

	private static void openConnection() {
		try {
			file = new FileInputStream(filePath);
			properties.load(file);
			Class.forName(properties.getProperty("driverPath"));
			connection = DriverManager.getConnection
					(properties.getProperty("dburl"), properties);
			statement = connection.createStatement();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	

}
