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
	
	public void createReader(Reader reader) throws Exception {
		readerDAO.createReader(reader);
	}

	public void updateReader(Reader reader) {
		readerDAO.updateReader(reader);
	}

	public void deleteReader(int Id) {
		readerDAO.deleteReader(Id);	
	}
}
