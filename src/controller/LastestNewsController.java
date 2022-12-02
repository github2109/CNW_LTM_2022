package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
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

/**
 * Servlet implementation class LatestNewsController
 */
public class LastestNewsController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		NewsBO newsBO = new NewsBO();
		request.setAttribute("news", newsBO.getNewsLastest());
		CommentBO commentBO = new CommentBO();
		ArrayList<Comment> listCommentEntity = commentBO.getCommentsByNewsId(newsBO.getNewsLastest().getNewsId());
		ArrayList<CommentDTO> listComments = new ArrayList<CommentDTO>();
		for (Comment comment : listCommentEntity) {
			listComments.add(AutoMapperEntityToDto.MapperComment(comment));
		}
		request.setAttribute("listComments", listComments);
		RequestDispatcher rd = getServletContext().getRequestDispatcher("/Views/Pages/News.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
