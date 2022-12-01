package model.dto;

import java.util.Date;

public class NewsDto {
	private int NewsId;
	private String CategoryName;
	private String NewsSlug;
	private String NewsTitle;
	private String NewsWriter;
	private byte[] NewsThumb;
	private byte[] NewsCover;
	private String NewsOverviewContent;
	private String NewsContent;
	private boolean isActive;
	private int ViewsNumber;
	private Date NewsCreatedAt;
	
	public NewsDto(int newsId, 
					String categoryName, 
					String newsSlug, 
					String newsTitle, 
					String newsWriter, 
					byte[] newsThumb,
					byte[] newsCover,
					String NewsOverviewContent, 
					String newsContent, 
					boolean isActive, 
					int viewsNumber, 
					Date newsCreatedAt) {
		NewsId = newsId;
		CategoryName = categoryName;
		NewsSlug = newsSlug;
		NewsTitle = newsTitle;
		NewsWriter = newsWriter;
		NewsThumb = newsThumb;
		NewsCover = newsCover;
		NewsContent = newsContent;
		this.isActive = isActive;
		ViewsNumber = viewsNumber;
		NewsCreatedAt = newsCreatedAt;
		this.NewsOverviewContent = NewsOverviewContent;
	}
	public NewsDto(String categoryName, String newsSlug, String newsTitle, String newsWriter, byte[] newsThumb,
			byte[] newsCover, String NewsOverviewContent,String newsContent, boolean isActive) {
		CategoryName = categoryName;
		NewsSlug = newsSlug;
		NewsTitle = newsTitle;
		NewsWriter = newsWriter;
		NewsThumb = newsThumb;
		NewsCover = newsCover;
		NewsContent = newsContent;
		this.isActive = isActive;
	}
	public int getNewsId() {
		return NewsId;
	}

	public void setNewsId(int newsId) {
		NewsId = newsId;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public String getNewsSlug() {
		return NewsSlug;
	}

	public void setNewsSlug(String newsSlug) {
		NewsSlug = newsSlug;
	}

	public String getNewsTitle() {
		return NewsTitle;
	}

	public void setNewsTitle(String newsTitle) {
		NewsTitle = newsTitle;
	}

	public String getNewsWriter() {
		return NewsWriter;
	}

	public void setNewsWriter(String newsWriter) {
		NewsWriter = newsWriter;
	}

	public byte[] getNewsThumb() {
		return NewsThumb;
	}

	public void setNewsThumb(byte[] newsThumb) {
		NewsThumb = newsThumb;
	}

	public byte[] getNewsCover() {
		return NewsCover;
	}

	public void setNewsCover(byte[] newsCover) {
		NewsCover = newsCover;
	}

	public String getNewsContent() {
		return NewsContent;
	}

	public void setNewsContent(String newsContent) {
		NewsContent = newsContent;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public int getViewsNumber() {
		return ViewsNumber;
	}

	public void setViewsNumber(int viewsNumber) {
		ViewsNumber = viewsNumber;
	}

	public Date getNewsCreatedAt() {
		return NewsCreatedAt;
	}

	public void setNewsCreatedAt(Date newsCreatedAt) {
		NewsCreatedAt = newsCreatedAt;
	}
	public String getNewsOverviewContent() {
		return NewsOverviewContent;
	}
	public void setNewsOverviewContent(String newsOverviewContent) {
		NewsOverviewContent = newsOverviewContent;
	}
}
