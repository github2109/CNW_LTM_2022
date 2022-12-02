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
				Reader reader = new Reader(result.getInt(1), result.getString(2), result.getString(3), result.getString(4), result.getBytes(5),
						result.getString(6), result.getString(7), result.getString(8), result.getString(9), result.getInt(10));
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
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10));
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
						rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getInt(10)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public void createReader(int Id, String username, String password, String readerName, String readerEmail, String readerStreet, String readerCity, String readerState, int readerZipCode)
			throws Exception {
		PreparedStatement stmt = DBContext.getConnect().prepareStatement("select * from reader where Username=?");
		stmt.setInt(1, Id);
		ResultSet rs = stmt.executeQuery();
		if (rs.next()) {
			throw (new Exception("Reader is existed!!"));
		} else {
			stmt = DBContext.getConnect().prepareStatement("insert into reader values(?,?,?,?,'NULL',?,?,?,?,?)");
			stmt.setInt(1, Id);
			stmt.setString(2, username);
			stmt.setString(3, password);
			stmt.setString(4, readerName);
			stmt.setString(5, readerEmail);
			stmt.setString(6, readerStreet);
			stmt.setString(7, readerCity);
			stmt.setString(8, readerState);
			stmt.setInt(9, readerZipCode);
			stmt.executeUpdate();
		}
	}

	public void updateReader(int Id, String username, String password, String readerName, String readerEmail, String readerStreet, String readerCity, String readerState, int readerZipCode) {
		PreparedStatement stmt;
		try {
			stmt = DBContext.getConnect().prepareStatement("update reader set Username=?, Password=?, ReaderName=?, ReaderEmail =?, ReaderStreet=?, ReaderCity=?, ReaderState=?, ReaderZipCode=? where ID=?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			stmt.setString(3, readerName);
			stmt.setString(4, readerEmail);
			stmt.setString(5, readerStreet);
			stmt.setString(6, readerCity);
			stmt.setString(7, readerState);
			stmt.setInt(8, readerZipCode);
			stmt.setInt(9, Id);
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
