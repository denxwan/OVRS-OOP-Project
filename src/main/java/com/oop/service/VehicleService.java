package com.oop.service;

import java.util.ArrayList;
import java.util.List;

import com.oop.model.Vehicle;

public class VehicleService {
	public static List<Vehicle> tempVehicle(String vid) {
		
		ArrayList<Vehicle> vr = new ArrayList<>();
		
		Vehicle v = new Vehicle(vid);
		vr.add(v);
		System.out.println("in vehicle service");
		
		return vr;
	}
}
