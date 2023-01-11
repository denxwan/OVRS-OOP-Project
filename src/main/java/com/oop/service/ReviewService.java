package com.oop.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.oop.model.Available;
import com.oop.model.Review;
import com.oop.model.ReviewUser;
import com.oop.model.tempReview;
import com.oop.util.DBConnectionUtil;

public class ReviewService {
	public static final Logger log = Logger.getLogger(ReviewService.class.getName());

	private static Connection connection;

	private static Statement statement;

	private static PreparedStatement preparedStatement;

	public static List<Review> view() {
		ArrayList<Review> vr = new ArrayList<>();
		
		//validate
		try {
			
			Class.forName("com.mysql.jdbc.Driver");

			connection = DBConnectionUtil.getDBConnection();
			statement = connection.createStatement();
			
			String sql = "select * from review order by reviewID DESC";
			
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				int r_id = rs.getInt(1);
				String r_name = rs.getString(2);
				String r_email = rs.getString(3);
				String r_comment = rs.getString(4);
				
				Review a = new Review(r_id, r_name, r_email, r_comment);
				vr.add(a);
			}
			
		}catch (SQLException | ClassNotFoundException e) {
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
				log.log(Level.INFO, "A retrival of review user details were done!");
				
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return vr;
	}

	public static boolean write(String r_name, String r_email, String r_comment) {
		
		boolean isSuccess = false;

		//validate
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DBConnectionUtil.getDBConnection();
			statement = connection.createStatement();
			
			String sql = "insert into review values(0, '"+r_name+"', '"+r_email+"', '"+r_comment+"')";
			
			int rs = statement.executeUpdate(sql);

			if(rs > 0) {
				isSuccess = true;
			} else {
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
				log.log(Level.INFO, "A retrival of review user details were done!");
				
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return isSuccess;
	}
	
	public static boolean verify(String uname, String email) {
		
		boolean isSuccess = false;
		
		//validate
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DBConnectionUtil.getDBConnection();
			statement = connection.createStatement();
			
			String sql = "select * from review where rName='"+uname+"' and rEmail='"+email+"'";

			ResultSet rs = statement.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
			} else {
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
				log.log(Level.INFO, "A retrival of review user details were done!");
				
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return isSuccess;
	}
	
	public static List<Review> viewUserReviews(String name, String email) {
		
		ArrayList<Review> vr = new ArrayList<>();
		
		//validate
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DBConnectionUtil.getDBConnection();
			statement = connection.createStatement();
			
			String sql = "select * from review where rname='"+name+"' and remail='"+email+"' order by reviewID DESC";
			
			List<String> results = new ArrayList<String>();
			ResultSet rs = statement.executeQuery(sql);
			
			while(rs.next()) {
				int r_id = rs.getInt(1);
				String r_name = rs.getString(2);
				String r_email = rs.getString(3);
				String r_comment = rs.getString(4);
				
				Review a = new Review(r_id, r_name, r_email, r_comment);
				vr.add(a);
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
				log.log(Level.INFO, "A retrival of review user details were done!");
				
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return vr;
	}

	public static List<tempReview> tempUser(String name, String email) {
		
		ArrayList<tempReview> vr = new ArrayList<>();
		
		tempReview a = new tempReview(name, email);
		vr.add(a);
		
		return vr;
	}
	
	public static List<tempReview> tempUser(String id, String name, String email, String comment) {
		
		ArrayList<tempReview> vr = new ArrayList<>();
		
		tempReview a = new tempReview(id, name, email, comment);
		vr.add(a);
		
		return vr;
	}

	public static boolean deleteReview(String r_id) {
		
		int convId = Integer.parseInt(r_id);
		boolean isSuccess = false;

		//validate
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DBConnectionUtil.getDBConnection();
			statement = connection.createStatement();
			
			String sql = "delete from review where reviewID='"+convId+"'";
			
			int rs = statement.executeUpdate(sql);

			if(rs > 0) {
				isSuccess = true;
			} else {
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
				log.log(Level.INFO, "A retrival of review user details were done!");
				
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return isSuccess;
	}

	public static boolean updateReview(String r_id, String r_comment) {
		
		int convId = Integer.parseInt(r_id);
		boolean isSuccess = false;

		//validate
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			connection = DBConnectionUtil.getDBConnection();
			statement = connection.createStatement();

			String sql = "update review set rComment='"+r_comment+"' where reviewId='"+r_id+"'";
			
			int rs = statement.executeUpdate(sql);

			if(rs > 0) {
				isSuccess = true;
			} else {
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
				log.log(Level.INFO, "A retrival of review user details were done!");
				
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return isSuccess;
	}
	
	public static List<ReviewUser> getUsernames() {
		ArrayList<ReviewUser> unames  = new ArrayList<>();
		
		try {
			connection = DBConnectionUtil.getDBConnection();
			statement = connection.createStatement();
		
			String sql = "select DISTINCT rName, rEmail from review GROUP BY rName";
			ResultSet rs = statement.executeQuery(sql);
		
			while(rs.next()) {
				String r_uid = rs.getString(1);
				String r_email = rs.getString(2);
				ReviewUser ru = new ReviewUser(r_uid, r_email);
				unames.add(ru);
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
				log.log(Level.INFO, "A retrival of review user details were done!");
				
			} catch (SQLException e) {
				log.log(Level.SEVERE, e.getMessage());
			}
		}
		return unames;
	}
}
