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
import com.oop.service.ReviewService;

@WebServlet("/writeReviewServlet")
public class writeReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String r_name = request.getParameter("name");
		String r_email = request.getParameter("email");
		String r_comment = request.getParameter("comment");
		
		boolean isTrue;
		
		isTrue =  ReviewService.write(r_name, r_email, r_comment);
		
		if(isTrue == true) {
			List<Review> reviewDetails = ReviewService.view();
			request.setAttribute("reviewDetails", reviewDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("viewReviews.jsp");
			dis.forward(request, response);
		} else {
//			RequestDispatcher dis = request.getRequestDispatcher("viewReviews.jsp");
//			dis.forward(request, response);
		}
		
		
	}

}

