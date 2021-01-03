package com.store.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	private static String url = "jdbc:mysql://localhost:3306/okisa_cloths";
	private static String userName = "root";
	private static String password = "s@vij#nu315";
	private static Connection con;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, userName, password);
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Database connection is not successfull!");
		}
		return con;
		
	}
}
