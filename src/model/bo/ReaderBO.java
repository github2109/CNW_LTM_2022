package model.bo;

import java.util.ArrayList;

import model.bean.Reader;
import model.dao.ReaderDAO;

public class ReaderBO {
	ReaderDAO readerDAO = new ReaderDAO();
	public Reader getReaderByLogin(String username, String password) {
		return readerDAO.getReaderByLogin(username,password);
	}

	public Reader getReaderByID(int Id) {
		return readerDAO.getReaderByID(Id);
	}

	public ArrayList<Reader> getReaderList(String search) {
		return readerDAO.getReaderList(search);
	}
	
	public void createReader(int Id, String username, String password, String readerName, String readerEmail, String readerStreet, String readerCity, String readerState, int readerZipCode) throws Exception {
		readerDAO.createReader(Id,username,password,readerName,readerEmail,readerStreet,readerCity,readerState,readerZipCode);
	}

	public void updateReader(int Id, String username, String password, String readerName, String readerEmail, String readerStreet, String readerCity, String readerState, int readerZipCode) {
		readerDAO.updateReader(Id,username,password,readerName,readerEmail,readerStreet,readerCity,readerState,readerZipCode);
	}

	public void deleteReader(int Id) {
		readerDAO.deleteReader(Id);	
	}
}
