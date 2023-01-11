package com.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Payment;
import com.oop.service.PaymentService;

@WebServlet("/dummyServlet")
public class dummyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String bID = request.getParameter("bookingID");
		String uID = request.getParameter("userID");
		String uName = request.getParameter("userName");
		String pNo = request.getParameter("phoneNo");
		String fee = request.getParameter("fee");
		
		//System.out.println(bID);
		
		boolean isTrue;
		
		isTrue = PaymentService.addPayment(bID, uID, uName, pNo, fee);
		
		if(isTrue == true)
		{
			//List<Payment> paymentDetails = PaymentService.view();
			//request.setAttribute("paymentDetails", paymentDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
			dis.forward(request, response);
		}
		else
		{
			RequestDispatcher dis = request.getRequestDispatcher("viewReviews.jsp");
			dis.forward(request, response);
		}
	}
}
