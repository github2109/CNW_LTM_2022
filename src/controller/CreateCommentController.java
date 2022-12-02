package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.bean.Comment;
import model.bean.Reader;
import model.bo.CommentBO;

import java.io.IOException;

/**
 * Servlet implementation class CreateCommentController
 */
public class CreateCommentController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Reader reader = (Reader) request.getSession().getAttribute("user");
		if (reader == null) {
			getServletContext().getRequestDispatcher("/LoginRedirectController").forward(request, response);
		} else {
			int NewsId = Integer.parseInt(request.getParameter("NewsId"));
			if (request.getParameter("message").length() == 0)
				response.sendRedirect("NewsController?NewsId=" + NewsId);
			else {
				String message = request.getParameter("message");
				Comment comment = new Comment(NewsId, reader.getReaderId(), message);
				CommentBO commentBO = new CommentBO();
				commentBO.createComment(comment);
				response.sendRedirect("NewsController?NewsId=" + NewsId);
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
