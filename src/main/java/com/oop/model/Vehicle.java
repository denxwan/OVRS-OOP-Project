package com.oop.model;

public class Vehicle {
	private String vid;

	public Vehicle(String vid) {
		this.vid = vid;
		System.out.println("in vehicle model");
	}

	public String getVid() {
		return vid;
	}
}
