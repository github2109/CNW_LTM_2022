package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Category;

public class CategoryDAO {

	public ArrayList<Category> getAllCategories() throws SQLException {
		ArrayList<Category> result = new ArrayList<Category>();
		PreparedStatement stmt = DBContext.getConnect().prepareStatement("select * from category");
		ResultSet rs = stmt.executeQuery();
		while(rs.next()) {
			result.add(new Category(rs.getInt(1), rs.getString(2)));
		}
		return result;
	}

}
