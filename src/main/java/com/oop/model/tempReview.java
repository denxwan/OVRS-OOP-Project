package com.oop.model;

public class tempReview {
	private String rname;
	private String remail;
	private String rid;
	private String rcomment;
	
	public tempReview(String rname, String remail) {
		this.rname = rname;
		this.remail = remail;
	}
	
	public tempReview(String rid, String rname, String remail, String rcomment) {
		this.rid = rid;
		this.rname = rname;
		this.remail = remail;
		this.rcomment = rcomment;
	}

	public String getRname() {
		return rname;
	}
	
	public String getRemail() {
		return remail;
	}
	
	public String getRid() {
		return rid;
	}
	
	public String getRcomment() {
		return rcomment;
	}

}


