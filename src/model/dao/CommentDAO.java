package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

	public ArrayList<Comment> getCommentsByNewsId(int newsId) {
		ArrayList<Comment> result = new ArrayList<Comment>();
		try {
			PreparedStatement stmt = DBContext.getConnect().prepareStatement("SELECT * FROM comment where NewsId=?");
			stmt.setInt(1, newsId);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				result.add(new Comment(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getDate(5)));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

}
