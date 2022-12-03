package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.bo.NewsBO;

import java.io.IOException;

/**
 * Servlet implementation class DeleteNewsController
 */
public class DeleteNewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int NewsId = Integer.parseInt(request.getParameter("NewsId"));
		NewsBO newsBO = new NewsBO();
		newsBO.deleteNews(NewsId);
		response.sendRedirect("DashBoardController");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
