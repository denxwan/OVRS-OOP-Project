package com.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.ReviewUser;
import com.oop.service.ReviewService;

@WebServlet("/getUsernamesServlet")
public class getUsernamesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ReviewService reviewService = new ReviewService();
			List<ReviewUser> ruDetails = reviewService.getUsernames();
			request.setAttribute("ruDetails", ruDetails);
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("reviewUserVerification.jsp");
		dis.forward(request, response);
	}

}
