package model.bean;

public class Reader {
	private int ReaderId;
	private String Username;
	private String Password;
	private String ReaderName;
	private byte[] ReaderAvatar;
	private String ReaderEmail;
	
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
	
	public Reader(String username, String password, String readerName, String readerEmail) {
		Username = username;
		Password = password;
		ReaderName = readerName;
		ReaderEmail = readerEmail;
		ReaderAvatar = null;
	}

	public Reader(int readerId, String username, String password, String readerName, byte[] readerAvatar, String readerEmail) {
		ReaderId = readerId;
		Username = username;
		Password = password;
		ReaderName = readerName;
		ReaderAvatar = readerAvatar;
		ReaderEmail = readerEmail;
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
}
