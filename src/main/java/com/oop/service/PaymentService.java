package com.oop.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.oop.util.DBConnectionUtil;

public class PaymentService {
	
	public static final Logger log = Logger.getLogger(PaymentService.class.getName());

	private static Connection connection;

	private static Statement statement;
	
	private static PreparedStatement preparedStatement;
	
	static String nullText = "";
	
	//static String sqlStmt;
	
//	public static int checkValue(String text)
//	{
//		int newValue = 0;
//		
//		if(text.equals(nullText) || text.equals(nullText))
//		{
//			newValue = 0;
//		}
//		else
//		{
//			newValue = Integer.parseInt(text);
//		}
//		
//		return newValue;
//	}
	
//	public static StringBuffer checkText(String bid, String uid, String uname, String pno)
//	{
//		//String sqlStmt = "";
//		StringBuffer sqlStmt = new StringBuffer();
//		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
//		LocalDateTime now = LocalDateTime.now();  
//		//System.out.println(dtf.format(now));  
//		
//		int phoneNumber;
//		int dynamicValue;
//		
//		if(uname.equals(nullText))
//		{
//			uname = null;
//			sqlStmt.append("INSERT INTO payment VALUES(0, '"+bid+"', "+uid+", "+uname+", "+pno+", '"+dtf.format(now)+"')");
//		}
//		else
//		{
//			sqlStmt.append("INSERT INTO payment VALUES(0, '"+bid+"', "+uid+", '"+uname+"', "+pno+", '"+dtf.format(now)+"')");
//		}
//		
//		System.out.println(sqlStmt);
//		
//		return sqlStmt;
//	}
	
	public static boolean addPayment(String bid, String uid, String uname, String pno, String fee) {
		
		boolean isSuccess = false;
		
		
		
		try {
			connection = DBConnectionUtil.getDBConnection();
			statement = connection.createStatement();
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now();  
			//System.out.println(dtf.format(now));  
			
			int phoneNumber;
			int dynamicValue;
				
			if(uname.equals(nullText))
			{
				uname = null;
			}
			
			if(uid.equals(nullText))
			{
				uid = null;
			}
			
			if(pno.equals(nullText))
			{
				pno = null;
			}
			 
			//uid = null; checkValue(uid)
			
			if(uid!=null)
			{
				System.out.println("ane ane" + uname);
				String sql = "INSERT INTO payment VALUES(0, '"+bid+"', '"+uid+"', "+uname+", "+pno+", '"+dtf.format(now)+"', '"+fee+"')";
				int rs = statement.executeUpdate(sql);
				
				if(rs > 0) {
					String sql2 ="UPDATE available SET status='unavailable' WHERE vehicleID=(SELECT vehicleID FROM booking WHERE bookingID='"+uid+"')";
					int rs2 = statement.executeUpdate(sql2);
					
					if(rs2 > 0)
					{
						System.out.println("athule");
						isSuccess = true;
					}
					else
					{
						System.out.println("eliye");
						isSuccess = false;
					}
				}
			}
			else
			{
				System.out.println(uname);
				String hello = "ane bn plis";
				String sql = "INSERT INTO payment VALUES(0, '"+bid+"', "+uid+", '"+uname+"', "+pno+", '"+dtf.format(now)+"', '"+fee+"')";
				int rs = statement.executeUpdate(sql);
				
				if(rs > 0) {
					String sql2 ="UPDATE available SET status='unavailable' WHERE vehicleID=(SELECT vehicleID FROM booking WHERE bookingID='"+bid+"')";
					int rs2 = statement.executeUpdate(sql2);
					
					if(rs2 > 0)
					{
						System.out.println("athule");
						isSuccess = true;
					}
					else
					{
						System.out.println("eliye");
						isSuccess = false;
					}
				}
				else
				{
					isSuccess = false;
				}
			}
			
			//String sql = "INSERT INTO payment VALUES(0, '"+bid+"', "+uid+", '"+uname+"', "+pno+", '"+dtf.format(now)+"')";
//			int rs = statement.executeUpdate(sql);
//			
//			if(rs > 0) {
//				isSuccess = true;
//			}
//			else
//			{
//				isSuccess = false;
//			}
			
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
				log.log(Level.INFO, "A payment was done!");
				
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		
		return isSuccess;
	}
}
