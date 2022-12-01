package model.bo;

import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Category;
import model.dao.CategoryDAO;

public class CategoryBO {

	CategoryDAO categoryDAO = new CategoryDAO();
	public ArrayList<Category> getAllCategories() throws SQLException {
		return categoryDAO.getAllCategories();
	}
	public Category getCategoryById(int id)
	{
		return categoryDAO.getCategoryById(id);
	}
}
