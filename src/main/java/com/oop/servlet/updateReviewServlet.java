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

@WebServlet("/updateReviewServlet")
public class updateReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String r_id = request.getParameter("rid");
		String runame = request.getParameter("name");
		String ruemail = request.getParameter("email");
		String r_comment = request.getParameter("comment");
		
		boolean isTrue;
		
		isTrue =  ReviewService.updateReview(r_id, r_comment);
		
		if(isTrue == true) {
//			List<Review> reviewDetails =  ViewReviewDBUtil.view();
//			request.setAttribute("reviewDetails", reviewDetails);
			
//			RequestDispatcher dis = request.getRequestDispatcher("viewReviews.jsp");
//			dis.forward(request, response);
			
			List<Review> reviewDetails = ReviewService.viewUserReviews(runame, ruemail);
			request.setAttribute("reviewDetails", reviewDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("reviewUserDashboard.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis = request.getRequestDispatcher("index.jsp");
			dis.forward(request, response);
		}
	}

}
