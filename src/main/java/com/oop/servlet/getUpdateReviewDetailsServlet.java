package com.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.tempReview;
import com.oop.service.ReviewService;

@WebServlet("/getUpdateReviewDetailsServlet")
public class getUpdateReviewDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String ruid = request.getParameter("rid");
		String runame = request.getParameter("name");
		String ruemail = request.getParameter("email");
		String rucomment = request.getParameter("comment");
		
		List<tempReview> reviewDetails =  ReviewService.tempUser(ruid, runame, ruemail, rucomment);
		request.setAttribute("reviewDetails", reviewDetails);
			
		RequestDispatcher dis = request.getRequestDispatcher("updateReviews.jsp");
		dis.forward(request, response);
	}

}
