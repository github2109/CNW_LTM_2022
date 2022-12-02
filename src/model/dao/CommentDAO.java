package model.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import model.bean.Comment;

public class CommentDAO {

	public void createComment(Comment comment) {
		PreparedStatement stmt;
		try {
			stmt = DBContext.getConnect().prepareStatement("insert into comment values(null,?,?,?,?)");
			stmt.setInt(1, comment.getNewsId());
			stmt.setInt(2, comment.getReaderId());
			stmt.setString(3, comment.getCommentContent());
			stmt.setTimestamp(4, new java.sql.Timestamp(comment.getCommentCreatedAt().getTime()));
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
