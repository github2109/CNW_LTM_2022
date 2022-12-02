package model.bo;

import model.bean.Comment;
import model.dao.CommentDAO;

public class CommentBO {

	CommentDAO commentDAO = new CommentDAO();
	public void createComment(Comment comment) {
		commentDAO.createComment(comment);
	}

}
