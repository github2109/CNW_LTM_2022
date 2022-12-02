package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import model.bean.Category;
import model.bean.News;

public class NewsDAO {
	public void createNews(News news) throws SQLException {
		PreparedStatement stmt;

		stmt = DBContext.getConnect().prepareStatement("insert into news values(null,?,?,?,?,?,?,?,?,?,?,?)");
		stmt.setInt(1, news.getCategoryId());
		stmt.setString(2, news.getNewsSlug());
		stmt.setString(3, news.getNewsTitle());
		stmt.setString(4, news.getNewsWriter());
		stmt.setBytes(5, news.getNewsThumb());
		stmt.setBytes(6, news.getNewsCover());
		stmt.setString(7, news.getNewsOverviewContent());
		stmt.setString(8, news.getNewsContent());
		stmt.setBoolean(9, news.isActive());
		stmt.setInt(10, 0);
		stmt.setTimestamp(11, new java.sql.Timestamp((new Date()).getTime()));
		stmt.executeUpdate();
	}

	public ArrayList<News> getNewsMostRecentByCategoryId(int categoryId) throws SQLException {
		ArrayList<News> result = new ArrayList<News>();
		PreparedStatement stmt = DBContext.getConnect()
				.prepareStatement("select * from news where CategoryId=? order by NewsCreatedAt DESC limit 5");
		stmt.setInt(1, categoryId);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			result.add(new News(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
					rs.getBytes(6), rs.getBytes(7), rs.getString(8), rs.getString(9), rs.getBoolean(10), rs.getInt(11),
					rs.getDate(12)));
		}
		return result;
	}

	public ArrayList<News> getAllNews() {
		ArrayList<News> result = new ArrayList<News>();
		try {
			PreparedStatement stmt = DBContext.getConnect().prepareStatement("SELECT * FROM news");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				result.add(new News(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getBytes(6), rs.getBytes(7), rs.getString(8), rs.getString(9), rs.getBoolean(10),
						rs.getInt(11), rs.getDate(12)));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}

	public News getNewsByNewsId(int id) {
		ArrayList<News> result = new ArrayList<News>();
		try {
			PreparedStatement stmt = DBContext.getConnect().prepareStatement("SELECT * FROM news where NewsId=?");
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				return new News(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getBytes(6), rs.getBytes(7), rs.getString(8), rs.getString(9), rs.getBoolean(10),
						rs.getInt(11), rs.getDate(12));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public ArrayList<News> getNewsByCategoryId(int categoryId) {
		ArrayList<News> result = new ArrayList<News>();
		try {
			PreparedStatement stmt = DBContext.getConnect()
					.prepareStatement("select * from news where CategoryId=? order by NewsCreatedAt DESC");
			stmt.setInt(1, categoryId);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				result.add(new News(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5),
						rs.getBytes(6), rs.getBytes(7), rs.getString(8), rs.getString(9), rs.getBoolean(10),
						rs.getInt(11), rs.getDate(12)));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
}
