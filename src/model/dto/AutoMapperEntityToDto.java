package model.dto;

import model.bean.Comment;
import model.bean.News;
import model.bean.Reader;
import model.bo.CategoryBO;
import model.bo.ReaderBO;

public class AutoMapperEntityToDto {
	private static CategoryBO categoryBO = new CategoryBO();
	private static ReaderBO readerBO = new ReaderBO();
	public static NewsDto MapperNews(News news)
	{
		var category = categoryBO.getCategoryById(news.getCategoryId());
		NewsDto newsDto = new NewsDto (news.getNewsId(),
								category.getCategoryName(),
								news.getNewsSlug(),
								news.getNewsTitle(),
								news.getNewsWriter(),
								news.getNewsThumb(),
								news.getNewsCover(),
								news.getNewsOverviewContent(),
								news.getNewsContent(),
								news.isActive(),
								news.getViewsNumber(),
								news.getNewsCreatedAt());
		return newsDto;
	}
	
	public static CommentDTO MapperComment(Comment comment)
	{
		Reader reader = readerBO.getReaderByID(comment.getReaderId());
		CommentDTO commentDTO = new CommentDTO(comment.getCommentId(),reader,comment.getCommentContent(),comment.getCommentCreatedAt());
		return commentDTO;
	}
}
