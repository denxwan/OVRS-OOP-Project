package com.search;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.oop.model.Available;

public class AvailableDBUtil {
	
	public static List<Available> search(String tripType, String no_p) {
		
		ArrayList<Available> av = new ArrayList<>();
		
		//create database connection
		String url = "jdbc:mysql://localhost:3306/ovrs_database";
		String user = "root";
		String pass = "oopproject123";
		
		//validate
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
//			String sql = "select * from available where tripType='"+tripType+"' and status='available'";
			
			String sql = "select * from available a, vehicle v where a.vehicleID = v.vehicleID and tripType='"+tripType+"' and status='available' and nop>='"+no_p+"'";
			
			List<String> results = new ArrayList<String>();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				int nop = rs.getInt(7);
				String vehicle_Type = rs.getString(6);
				String vehicle_ID = rs.getString(2);
				String trip_Type = rs.getString(3);
				String status_s = rs.getString(4);
				
				//Available a = new Available(vehicle_ID, nop, trip_Type, status_s, vehicle_Type);
				//av.add(a);
			}
			
//			if(rs.next()) {
//				int aid = rs.getInt(1);
//				String vehicle_ID = rs.getString(2);
//				String trip_Type = rs.getString(3);
//				String status_s = rs.getString(4);
//				
//				Available a = new Available(aid, vehicle_ID, trip_Type, status_s);
//				av.add(a);
//			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return av;
		
	}

}
