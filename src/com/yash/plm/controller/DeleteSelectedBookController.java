package com.yash.plm.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.plm.exception.BookException;
import com.yash.plm.service.BookService;
import com.yash.plm.serviceimpl.BookServiceImpl;

/**
 * Servlet implementation class DeleteSelectedBookController
 */
@WebServlet("/DeleteSelectedBookController")
public class DeleteSelectedBookController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String[] isbnList = null;
		isbnList = (String[]) request.getAttribute("isbnList");
		BookService bookservice = new BookServiceImpl();
		for (String isbn : isbnList) {
			try {
				bookservice.delete(Long.parseLong(isbn));
			} catch (BookException e) {
				System.out.println(e.getMessage());
			}
		}
		getServletContext().getRequestDispatcher("/ListBookController").forward(request, response);
		
	}

}
