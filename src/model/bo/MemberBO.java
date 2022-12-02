package model.bo;

import java.util.ArrayList;

import model.bean.Member;
import model.dao.MemberDAO;

public class MemberBO {

	MemberDAO memberDAO = new MemberDAO();
	public ArrayList<Member> getAllMember() {
		return memberDAO.getAllMember();
	}

}
