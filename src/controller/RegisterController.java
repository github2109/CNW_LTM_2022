package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.bean.Reader;
import model.bo.ReaderBO;

import java.io.IOException;

public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		String fullname = request.getParameter("fullname");
		String email = request.getParameter("email");
		
		ReaderBO readerBO = new ReaderBO();
		try {
			readerBO.createReader(new Reader(username,password,fullname,email));
			getServletContext().getRequestDispatcher("/Views/Pages/Login.jsp").forward(request, response);
		} catch (Exception e) {
			request.setAttribute("errorMessage", e.getMessage());
			getServletContext().getRequestDispatcher("/Views/Pages/Register.jsp").forward(request, response);
		}
	}

}
