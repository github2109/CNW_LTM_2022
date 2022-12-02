package model.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.bean.About;
import model.bean.Member;

public class MemberDAO {

	public ArrayList<Member> getAllMember() {
		ArrayList<Member> result = new ArrayList<Member>();
		try {
			PreparedStatement stmt = DBContext.getConnect().prepareStatement("SELECT * FROM member");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				result.add(new Member(rs.getString(1),rs.getString(2),rs.getBytes(3)));
			}
			return result;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

}
