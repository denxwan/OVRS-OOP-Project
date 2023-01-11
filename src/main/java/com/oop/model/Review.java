package com.oop.model;

public class Review {
	
	private int rid;
	private String rname;
	private String remail;
	private String rcomment;
	
	public Review(int rid, String rname, String remail, String rcomment) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.remail = remail;
		this.rcomment = rcomment;
	}

	public int getRid() {
		return rid;
	}

	public String getRname() {
		return rname;
	}
	
	public String getRemail() {
		return remail;
	}

	public String getRcomment() {
		return rcomment;
	}
	
}
