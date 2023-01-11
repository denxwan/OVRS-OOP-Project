package com.oop.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

import com.oop.model.Available;
import com.oop.util.DBConnectionUtil;

public class SearchService {
	
	public static final Logger log = Logger.getLogger(SearchService.class.getName());

	private static Connection connection;

	private static Statement statement;
	
	private static PreparedStatement preparedStatement;
	
	public static List<Available> search(String tripType, String no_p) {
		ArrayList<Available> av = new ArrayList<>();
		
		try {
			connection = DBConnectionUtil.getDBConnection();
			statement = connection.createStatement();
			
			String sql = "select * from available a, vehicle v where a.vehicleID = v.vehicleID and tripType='"+tripType+"' and status='available' and nop>='"+no_p+"'";
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				int nop = rs.getInt(7);
				String vehicle_Type = rs.getString(6);
				String vehicle_ID = rs.getString(2);
				String trip_Type = rs.getString(3);
				String status_s = rs.getString(4);
				int type_ver = rs.getInt(8);
				
				Available a = new Available(vehicle_ID, nop, trip_Type, status_s, vehicle_Type, type_ver);
				av.add(a);
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
				log.log(Level.INFO, "A search was done!");
				
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		
		return av;
	}

}
