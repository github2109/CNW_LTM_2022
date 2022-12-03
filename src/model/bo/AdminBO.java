package model.bo;

import model.dao.AdminDAO;

public class AdminBO {

	AdminDAO adminDAO = new AdminDAO();
	public boolean checkLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return adminDAO.checkLogin(userName,password);
	}

}
