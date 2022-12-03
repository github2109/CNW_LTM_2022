package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class AdminDAO {

	public boolean checkLogin(String userName, String password) {
		try {
			PreparedStatement stmt = DBContext.getConnect()
					.prepareStatement("select * from admin where Username=? and Password=?");
			stmt.setString(1, userName);
			stmt.setString(2, password);
			ResultSet result = stmt.executeQuery();
			if (result.next()) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			System.out.println(e);
			return false;
		}
	}

}
