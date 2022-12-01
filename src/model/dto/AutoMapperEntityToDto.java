package model.dto;

import java.util.Locale.Category;

import model.bean.News;
import model.bo.CategoryBO;

public class AutoMapperEntityToDto {
	private static CategoryBO categoryBO = new CategoryBO();
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
}
