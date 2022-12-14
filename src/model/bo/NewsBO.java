package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Category;
import model.bean.News;
import model.dao.NewsDAO;

public class NewsBO {
	NewsDAO newsDAO = new NewsDAO();
	public void createNews(News news) throws SQLException {
		System.out.print("BO error " + news.getNewsOverviewContent());
		newsDAO.createNews(news);
	}

	public ArrayList<News> getNewsMostRecentByCategoryId(int categoryId) throws SQLException {
		// TODO Auto-generated method stub
		return newsDAO.getNewsMostRecentByCategoryId(categoryId);
	}

	public ArrayList<News> getAllNews() {
		// TODO Auto-generated method stub
		return newsDAO.getAllNews();
	}
	
	public News getNewsByNewsId(int id) {
		return newsDAO.getNewsByNewsId(id);
	}

	public ArrayList<News> getNewsByCategoryId(int categoryId) {
		// TODO Auto-generated method stub
		return newsDAO.getNewsByCategoryId(categoryId);
	}

	public News getNewsLastest() {
		// TODO Auto-generated method stub
		return newsDAO.getNewsLastest();
	}

	public void updateNews(News news, int newsId) {
		
		newsDAO.updateNews(news,newsId);
	}

	public void deleteNews(int newsId) {
		newsDAO.deleteNews(newsId);
		
	}
}
