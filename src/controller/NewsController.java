package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.bean.Comment;
import model.bo.CommentBO;
import model.bo.NewsBO;
import model.dto.AutoMapperEntityToDto;
import model.dto.CommentDTO;

import java.io.IOException;
import java.util.ArrayList;

public class NewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int NewsId = Integer.parseInt(request.getParameter("NewsId"));
		NewsBO newsBO = new NewsBO();
		CommentBO commentBO = new CommentBO();
		ArrayList<Comment> listCommentEntity = commentBO.getCommentsByNewsId(NewsId);
		ArrayList<CommentDTO> listComments = new ArrayList<CommentDTO>();
		for (Comment comment : listCommentEntity) {
			listComments.add(AutoMapperEntityToDto.MapperComment(comment));
		}
		request.setAttribute("news", newsBO.getNewsByNewsId(NewsId));
		request.setAttribute("listComments", listComments);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/Views/Pages/News.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
