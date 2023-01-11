package com.oop.model;

public class ReviewUser {
	
	private String uname;
	private String email;
	
	public ReviewUser(String uname) {
		this.uname = uname;
	}
	
	public ReviewUser(String uname, String email) {
		this.uname = uname;
		this.email = email;
	}

	public String getUname() {
		return uname;
	}

	public String getEmail() {
		return email;
	}

}
