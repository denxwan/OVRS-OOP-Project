package com.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Review;
import com.oop.model.tempReview;
import com.oop.service.ReviewService;
import com.viewreview.ViewReviewDBUtil;

@WebServlet("/existingReviewUserServlet")
public class existingReviewUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String runame = request.getParameter("name");
		String ruemail = request.getParameter("email");
		
		List<tempReview> reviewDetails =  ReviewService.tempUser(runame, ruemail);
		
		request.setAttribute("reviewDetails", reviewDetails);
			
		RequestDispatcher dis = request.getRequestDispatcher("writeReviews.jsp");
		dis.forward(request, response);
	}

}
