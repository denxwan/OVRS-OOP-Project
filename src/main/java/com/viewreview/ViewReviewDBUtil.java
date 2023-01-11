package com.viewreview;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.oop.model.Review;
import com.oop.model.ReviewUser;
import com.oop.model.tempReview;

public class ViewReviewDBUtil {
	// done
	public static List<Review> view() {

		ArrayList<Review> vr = new ArrayList<>();

		// create database connection
		String url = "jdbc:mysql://localhost:3306/ovrs_database";
		String user = "root";
		String pass = "oopproject123";// "it21214752";

		// validate
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
//			String sql = "select * from available where tripType='"+tripType+"' and status='available'";

			String sql = "select * from review order by reviewID DESC";

			List<String> results = new ArrayList<String>();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int r_id = rs.getInt(1);
				String r_name = rs.getString(2);
				String r_email = rs.getString(3);
				String r_comment = rs.getString(4);

				Review a = new Review(r_id, r_name, r_email, r_comment);
				vr.add(a);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return vr;

	}

	// done
	public static boolean write(String r_name, String r_email, String r_comment) {

		boolean isSuccess = false;

		// create database connection
		String url = "jdbc:mysql://localhost:3306/ovrs_database";
		String user = "root";
		String pass = "oopproject123";// "it21214752";

		// validate
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();

			String sql = "insert into review values(0, '" + r_name + "', '" + r_email + "', '" + r_comment + "')";

			List<String> results = new ArrayList<String>();
			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;

	}

	// done
	public static boolean verify(String uname, String email) {

		boolean isSuccess = false;
		// ArrayList<Review> vr = new ArrayList<>();

		// create database connection
		String url = "jdbc:mysql://localhost:3306/ovrs_database";
		String user = "root";
		String pass = "oopproject123";// "it21214752";

		// validate
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
			String sql = "select * from review where rName='" + uname + "' and rEmail='" + email + "'";

			// List<String> results = new ArrayList<String>();
			ResultSet rs = stmt.executeQuery(sql);
			// int rs = stmt.executeUpdate(sql);

			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;

	}

	// done
	public static List<tempReview> tempUser(String name, String email) {

		ArrayList<tempReview> vr = new ArrayList<>();

//			//create database connection
//			String url = "jdbc:mysql://localhost:3306/ovrs_database";
//			String user = "root";
//			String pass = "oopproject123";
//			
//			//validate
//			try {
//				
//				Class.forName("com.mysql.jdbc.Driver");
//				
//				Connection con = DriverManager.getConnection(url, user, pass);
//				Statement stmt = con.createStatement();
////				String sql = "select * from available where tripType='"+tripType+"' and status='available'";
//				
//				String sql = "select * from review order by reviewID DESC";
//				
//				List<String> results = new ArrayList<String>();
//				ResultSet rs = stmt.executeQuery(sql);
//				
//				while(rs.next()) {
//					int r_id = rs.getInt(1);
//					String r_name = rs.getString(2);
//					String r_email = rs.getString(3);
//					String r_comment = rs.getString(4);
//					
//					Review a = new Review(r_id, r_name, r_email, r_comment);
//					vr.add(a);
//				}
//				
//			}
//			catch(Exception e) {
//				e.printStackTrace();
//			}

		tempReview a = new tempReview(name, email);
		vr.add(a);

		return vr;

	}

	// done
	public static List<tempReview> tempUser(String id, String name, String email, String comment) {

		ArrayList<tempReview> vr = new ArrayList<>();

		tempReview a = new tempReview(id, name, email, comment);
		vr.add(a);

		return vr;

	}

	// done
	public static List<Review> viewUserReviews(String name, String email) {

		ArrayList<Review> vr = new ArrayList<>();

		// create database connection
		String url = "jdbc:mysql://localhost:3306/ovrs_database";
		String user = "root";
		String pass = "oopproject123";// "it21214752";

		// validate
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();
//				String sql = "select * from available where tripType='"+tripType+"' and status='available'";

			String sql = "select * from review where rname='" + name + "' and remail='" + email
					+ "' order by reviewID DESC";

			List<String> results = new ArrayList<String>();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int r_id = rs.getInt(1);
				String r_name = rs.getString(2);
				String r_email = rs.getString(3);
				String r_comment = rs.getString(4);

				Review a = new Review(r_id, r_name, r_email, r_comment);
				vr.add(a);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return vr;

	}

	// done
	public static boolean deleteReview(String r_id) {

		int convId = Integer.parseInt(r_id);
		boolean isSuccess = false;

		// create database connection
		String url = "jdbc:mysql://localhost:3306/ovrs_database";
		String user = "root";
		String pass = "oopproject123";// "it21214752";

		// validate
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();

			// String sql = "insert into review values(0, '"+r_name+"', '"+r_email+"',
			// '"+r_comment+"')";
			String sql = "delete from review where reviewID='" + convId + "'";

			// List<String> results = new ArrayList<String>();
			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;

	}

	//done
	public static boolean updateReview(String r_id, String r_comment) {

		int convId = Integer.parseInt(r_id);
		boolean isSuccess = false;

		// create database connection
		String url = "jdbc:mysql://localhost:3306/ovrs_database";
		String user = "root";
		String pass = "it21214752";

		// validate
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, pass);
			Statement stmt = con.createStatement();

			String sql = "update review set rComment='" + r_comment + "' where reviewId='" + r_id + "'";

			// List<String> results = new ArrayList<String>();
			int rs = stmt.executeUpdate(sql);

			if (rs > 0) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return isSuccess;

	}
}
