package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import model.bean.Reader;
import model.bo.ReaderBO;


public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		ReaderBO readerBO = new ReaderBO();
		Reader reader = readerBO.getReaderByLogin(username, password);
		ArrayList<Reader> readerArray = null;
		
		if (reader!=null) {
			request.getSession().setAttribute("user", reader);
			readerArray = readerBO.getReaderList("");
			//System.out.print(userArray.size());
			request.getSession().setAttribute("readerArray", readerArray);
			getServletContext().getRequestDispatcher("/Views/Pages/Home.jsp").forward(request, response);
		} else {
			getServletContext().getRequestDispatcher("/Views/Pages/Login.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
