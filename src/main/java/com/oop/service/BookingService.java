package com.oop.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.oop.util.DBConnectionUtil;

public class BookingService {

	public static final Logger log = Logger.getLogger(BookingService.class.getName());

	private static Connection connection;

	private static Statement statement;
	
	private static PreparedStatement preparedStatement;
	
	public static boolean addBooking(String bid, String vehicleID) {
		
		boolean isSuccess = false;

		try {
			connection = DBConnectionUtil.getDBConnection();
			statement = connection.createStatement();
			
			String sql = "INSERT INTO booking VALUES('"+bid+"', '"+vehicleID+"')";
			int rs = statement.executeUpdate(sql);
			
			if(rs > 0)
			{
				isSuccess = true;
			}
			else
			{
				isSuccess = false;
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			log.log(Level.SEVERE, e.getMessage());
			
		} finally {
			try {
				//checking if the database connection is already off, otherwise it will turned off
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
				
				//logging that the a search has completed
				log.log(Level.INFO, "A booking was done!");
				
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		
		return isSuccess;
	}
}
