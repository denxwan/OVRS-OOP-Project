package com.reviewUser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.oop.model.Review;
import com.oop.model.ReviewUser;

public class RUVerifyDBUtil {
	
	public static List<ReviewUser> verify(String uname, String email) {
		
		ArrayList<ReviewUser> vr = new ArrayList<>();
		
		//create database connection
		String url = "jdbc:mysql://localhost:3306/ovrs_database";
		String user = "root";
		String pass = "oopproject123"; //"it21214752";
		
		//validate
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql = "select * from review where Name='"+uname+"' and Email='"+email+"'";
			
			//List<String> results = new ArrayList<String>();
			ResultSet rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				String r_name = rs.getString(2);
				String r_email = rs.getString(3);
				
				ReviewUser ru = new ReviewUser(r_name, r_email);
				vr.add(ru);
			}
			
//			while(rs.next()) {
//				
//				String r_uname = rs.getString(3);
//				String r_email = rs.getString(4);
//				
//				ReviewUser a = new ReviewUser(r_uname, r_email);
//				vr.add(a);
//			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return vr;
		
	}
}
