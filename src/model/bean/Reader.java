package model.bean;

public class Reader {
	private int ReaderId;
	private String Username;
	private String Password;
	private String ReaderName;
	private byte[] ReaderAvatar;
	private String ReaderEmail;
	private String ReaderStreet;
	private String ReaderCity;
	private String ReaderState;
	private int ReaderZipCode;
	
	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	
	public Reader(int readerId, String username, String password, String readerName, byte[] readerAvatar, String readerEmail, String readerStreet,
			String readerCity, String readerState, int readerZipCode) {
		ReaderId = readerId;
		Username = username;
		Password = password;
		ReaderName = readerName;
		ReaderAvatar = readerAvatar;
		ReaderEmail = readerEmail;
		ReaderStreet = readerStreet;
		ReaderCity = readerCity;
		ReaderState = readerState;
		ReaderZipCode = readerZipCode;
	}
	
	public int getReaderId() {
		return ReaderId;
	}
	public void setReaderId(int readerId) {
		ReaderId = readerId;
	}
	public String getReaderName() {
		return ReaderName;
	}
	public void setReaderName(String readerName) {
		ReaderName = readerName;
	}
	public byte[] getReaderAvatar() {
		return ReaderAvatar;
	}
	public void setReaderAvatar(byte[] readerAvatar) {
		ReaderAvatar = readerAvatar;
	}
	public String getReaderEmail() {
		return ReaderEmail;
	}
	public void setReaderEmail(String readerEmail) {
		ReaderEmail = readerEmail;
	}
	public String getReaderStreet() {
		return ReaderStreet;
	}
	public void setReaderStreet(String readerStreet) {
		ReaderStreet = readerStreet;
	}
	public String getReaderCity() {
		return ReaderCity;
	}
	public void setReaderCity(String readerCity) {
		ReaderCity = readerCity;
	}
	public String getReaderState() {
		return ReaderState;
	}
	public void setReaderState(String readerState) {
		ReaderState = readerState;
	}
	public int getReaderZipCode() {
		return ReaderZipCode;
	}
	public void setReaderZipCode(int readerZipCode) {
		ReaderZipCode = readerZipCode;
	}
}
