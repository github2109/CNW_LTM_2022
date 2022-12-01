package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Category;
import model.bean.News;
import model.dao.NewsDAO;

public class NewsBO {
	NewsDAO newsDAO = new NewsDAO();
	public void createNews(News news) throws SQLException {
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
}
