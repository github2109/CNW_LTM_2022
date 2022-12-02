package model.bean;

import java.util.Date;

public class Comment {
	private int CommentId;
	private int NewsId;
	private int ReaderId;
	private String CommentContent;
	private Date CommentCreatedAt;
	
	public Comment(int commentId, int newsId, int readerId, String commentContent, Date commentCreatedAt) {
		CommentId = commentId;
		NewsId = newsId;
		ReaderId = readerId;
		setCommentContent(commentContent);
		CommentCreatedAt = commentCreatedAt;
	}
	
	public Comment(int newsId, int readerId, String commentContent) {
		super();
		NewsId = newsId;
		ReaderId = readerId;
		setCommentContent(commentContent);
		CommentCreatedAt = new Date();
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

	public Date getCommentCreatedAt() {
		return CommentCreatedAt;
	}
	public void setCommentCreatedAt(Date commentCreatedAt) {
		CommentCreatedAt = commentCreatedAt;
	}

	public String getCommentContent() {
		return CommentContent;
	}

	public void setCommentContent(String commentContent) {
		CommentContent = commentContent;
	}
}
