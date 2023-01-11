package com.oop.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBConnectionUtil extends CommonUtil{
	
	//Singleton design pattern is used here to ensure only one connection object can be made.
	private static Connection connection;
	
	private DBConnectionUtil() {
	}
	
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
		
		if(connection == null || connection.isClosed()) {
			Class.forName(properties.getProperty("driverName"));
			connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
		}
		return connection;
	}
}
