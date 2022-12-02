package model.bo;

import model.bean.About;
import model.dao.AboutDAO;

public class AboutBO {
	
	AboutDAO aboutDAO = new AboutDAO();
	public About getAbout() {
		return aboutDAO.getAbout();
	}

}
