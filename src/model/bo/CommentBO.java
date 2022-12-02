package model.bo;

import java.util.ArrayList;

import model.bean.Comment;
import model.dao.CommentDAO;

public class CommentBO {

	CommentDAO commentDAO = new CommentDAO();
	public void createComment(Comment comment) {
		commentDAO.createComment(comment);
	}
	public ArrayList<Comment> getCommentsByNewsId(int newsId) {
		return commentDAO.getCommentsByNewsId(newsId);
	}

}
