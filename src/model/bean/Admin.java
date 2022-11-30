package model.bean;

public class Admin {
	private int AdminId;
	private String Username;
	private String Password;
	public Admin(int adminId, String username, String password) {
		AdminId = adminId;
		Username = username;
		Password = password;
	}
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
	}
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
	
	
}
