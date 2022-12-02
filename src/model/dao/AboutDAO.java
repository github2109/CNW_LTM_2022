package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.bean.About;
import model.bean.News;

public class AboutDAO {
	
	public About getAbout() {
		try {
			PreparedStatement stmt = DBContext.getConnect().prepareStatement("SELECT * FROM about");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				return new About(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
			}
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		return null;
	}
}
