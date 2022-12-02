package model.dto;

import java.util.Date;

import model.bean.Reader;

public class CommentDTO {
	private int CommentId;
	private Reader reader;
	private String CommentContent;
	private Date CommentCreatedAt;
	
	public CommentDTO(int commentId, Reader reader, String commentContent, Date commentCreatedAt) {
		CommentId = commentId;
		this.reader = reader;
		CommentContent = commentContent;
		CommentCreatedAt = commentCreatedAt;
	}
	
	public int getCommentId() {
		return CommentId;
	}
	public void setCommentId(int commentId) {
		CommentId = commentId;
	}
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	public String getCommentContent() {
		return CommentContent;
	}
	public void setCommentContent(String commentContent) {
		CommentContent = commentContent;
	}
	public Date getCommentCreatedAt() {
		return CommentCreatedAt;
	}
	public void setCommentCreatedAt(Date commentCreatedAt) {
		CommentCreatedAt = commentCreatedAt;
	}
}
