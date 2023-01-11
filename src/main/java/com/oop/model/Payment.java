package com.oop.model;

public class Payment {
	private String payId;
	private String bookingId;
	private String userId;
	private String name;
	private int phoneNo;
	private String pdate;
	
	public Payment(String payId, String bookingId, String userId, String name, int phoneNo, String pdate) {
		this.payId = payId;
		this.bookingId = bookingId;
		this.userId = userId;
		this.name = name;
		this.phoneNo = phoneNo;
		this.pdate = pdate;
	}

	public String getPayId() {
		return payId;
	}

	public String getBookingId() {
		return bookingId;
	}

	public String getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public String getPdate() {
		return pdate;
	}
	
	
	
	
}
