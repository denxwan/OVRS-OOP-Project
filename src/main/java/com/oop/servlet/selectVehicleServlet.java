package com.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Vehicle;
import com.oop.service.VehicleService;

@WebServlet("/selectVehicleServlet")
public class selectVehicleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String vehicleID = request.getParameter("vehicleID");
		System.out.println(vehicleID);
		String b_type = request.getParameter("bookingType");
		
		try {
//			SearchService searchService = new SearchService();
//			List<Available> avDetails =  searchService.search(triptype, no_p);
//			request.setAttribute("avDetails", avDetails);
//			VehicleService vehicleService = new VehicleService();
			List<Vehicle> vDetails = VehicleService.tempVehicle(vehicleID);
			request.setAttribute("vDetails", vDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		if(b_type.equals("full"))
		{
//			VehicleService vehicleService = new VehicleService();
//			List<Vehicle> vDetails = vehicleService.tempVehicle(vehicleID);
			System.out.println("testing");
//			request.setAttribute("vDetails", vDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("full_booking.jsp");
			dis.forward(request, response);
		}
		else if(b_type.equals("quick"))
		{
			RequestDispatcher dis = request.getRequestDispatcher("quickBooking.jsp");
			dis.forward(request, response);
		}
		else {
			System.out.println("testing");
		}
	}
}

