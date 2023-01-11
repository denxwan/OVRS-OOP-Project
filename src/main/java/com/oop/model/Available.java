package com.oop.model;

public class Available {
	private int nop;
	private String vid;
	private String tt;
	private String status;
	private String vt;
	private int tv;
	
	public Available(String vid, int nop, String tt, String status, String vt, int tv) {
		this.nop = nop;
		this.vid = vid;
		this.tt = tt;
		this.status = status;
		this.vt = vt;
		this.tv = tv;
	}

	public int getNop() {
		return nop;
	}
	
	public String getVid() {
		return vid;
	}

	public String getTt() {
		return tt;
	}

	public String getStatus() {
		return status;
	}
	
	public String getVt() {
		return vt;
	}
	
	public int getTv() {
		return tv;
	}
	
}
