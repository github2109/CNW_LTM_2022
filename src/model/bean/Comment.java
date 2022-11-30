package model.bean;

import java.util.Date;

public class Comment {
	private int CommentId;
	private int NewsId;
	private int ReaderId;
	private int CommentContent;
	private Date CommentCreatedAt;
	
	public Comment(int commentId, int newsId, int readerId, int commentContent, Date commentCreatedAt) {
		CommentId = commentId;
		NewsId = newsId;
		ReaderId = readerId;
		CommentContent = commentContent;
		CommentCreatedAt = commentCreatedAt;
	}
	
	public int getCommentId() {
		return CommentId;
	}
	public void setCommentId(int commentId) {
		CommentId = commentId;
	}
	public int getNewsId() {
		return NewsId;
	}
	public void setNewsId(int newsId) {
		NewsId = newsId;
	}
	public int getReaderId() {
		return ReaderId;
	}
	public void setReaderId(int readerId) {
		ReaderId = readerId;
	}
	public int getCommentContent() {
		return CommentContent;
	}
	public void setCommentContent(int commentContent) {
		CommentContent = commentContent;
	}
	public Date getCommentCreatedAt() {
		return CommentCreatedAt;
	}
	public void setCommentCreatedAt(Date commentCreatedAt) {
		CommentCreatedAt = commentCreatedAt;
	}
}
