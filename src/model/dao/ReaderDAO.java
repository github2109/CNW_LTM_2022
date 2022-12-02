package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Reader;

public class ReaderDAO {
	public Reader getReaderByLogin(String username, String password) {
		try {
			PreparedStatement stmt = DBContext.getConnect()
					.prepareStatement("select * from reader where Username=? and Password=?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			ResultSet result = stmt.executeQuery();
			while (result.next()) {
				Reader reader = new Reader(result.getInt(1), result.getString(2), result.getString(3),
						result.getString(4), result.getBytes(5), result.getString(6));
				return reader;
			}
			return null;
		} catch (SQLException e) {
			System.out.println(e);
			return null;
		}

	}

	public Reader getReaderByID(int readerId) {
		PreparedStatement stmt;
		try {
			stmt = DBContext.getConnect().prepareStatement("select * from reader where ReaderId=?");

			stmt.setInt(1, readerId);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				return new Reader(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBytes(5),
						rs.getString(6));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		return null;
	}

	public ArrayList<Reader> getReaderList(String search) {
		ArrayList<Reader> result = new ArrayList<Reader>();
		try {
			PreparedStatement stmt = DBContext.getConnect()
					.prepareStatement("select * from reader where Username LIKE ?");
			stmt.setString(1, "%" + search + "%");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				result.add(new Reader(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBytes(5),
						rs.getString(6)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public void createReader(Reader reader) throws Exception {
		PreparedStatement stmt = DBContext.getConnect().prepareStatement("select * from reader where Username=?");
		stmt.setString(1, reader.getUsername());
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			throw (new Exception("Reader is existed!!"));
		} else {
			stmt = DBContext.getConnect().prepareStatement("insert into reader values(null,?,?,?,?,?)");
			stmt.setString(1, reader.getUsername());
			stmt.setString(2, reader.getPassword());
			stmt.setString(3, reader.getReaderName());
			stmt.setBytes(4, reader.getReaderAvatar());
			stmt.setString(5, reader.getReaderEmail());
			stmt.executeUpdate();
		}
	}

	public void updateReader(Reader reader) {
		PreparedStatement stmt;
		try {
			stmt = DBContext.getConnect().prepareStatement(
					"update reader set Username=?, Password=?, ReaderName=?, ReaderEmail =?, ReaderAvatar=? where ReaderId=?");
			stmt.setString(1, reader.getUsername());
			stmt.setString(2, reader.getPassword());
			stmt.setString(3, reader.getReaderName());
			stmt.setString(4, reader.getReaderEmail());
			stmt.setBytes(5, reader.getReaderAvatar());
			stmt.setInt(6, reader.getReaderId());
			stmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public void deleteReader(int Id) {
		PreparedStatement stmt;
		try {
			stmt = DBContext.getConnect().prepareStatement("delete from reader where ReaderId=?");
			stmt.setInt(1, Id);
			stmt.executeUpdate();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
