package com.oop.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Available;
import com.oop.service.SearchService;

@WebServlet("/searchServlet")
public class searchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String triptype = request.getParameter("tripType");
		String no_p = request.getParameter("nofp");
		
		try {
//			Previous Method
//			List<Available> avDetails =  AvailableDBUtil.search(triptype, no_p);
//			request.setAttribute("avDetails", avDetails);
			
//			New Method
			SearchService searchService = new SearchService();
			List<Available> avDetails =  searchService.search(triptype, no_p);
			request.setAttribute("avDetails", avDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("searchResults.jsp");
		dis.forward(request, response);
	}

}
