package com.yash.plm.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yash.plm.exception.UserNotFoundException;
import com.yash.plm.model.User;
import com.yash.plm.service.UserService;
import com.yash.plm.serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class UserAuthentication
 */
@WebServlet("/UserAuthentication")
public class UserAuthentication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserService userService = new UserServiceImpl();
		try {
			User user = userService.getUser(request.getParameter("username"), request.getParameter("password"));
			System.out.println(user);
			if(user!=null) {
				HttpSession session = request.getSession(true);
				session.setAttribute("user", user);
				getServletContext().getRequestDispatcher("/view/Home.jsp").forward(request, response);
			}
			else {
				request.setAttribute("loginErrMsg", "Invalid Login Details");
				getServletContext().getRequestDispatcher("/view/login.jsp").forward(request, response);
			}
			
		} catch (UserNotFoundException e) {
			e.printStackTrace();
		}
	}
	


}





