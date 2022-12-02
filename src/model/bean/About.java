package model.bean;

public class About {
	private String OurMission;
	private String OurVision;
	private String OurBestService;
	private String Address;
	private String Phone;
	private String EmailAddress;
	public About(String ourMission, String ourVision, String ourBestService, String address, String phone,
			String emailAddress) {
		OurMission = ourMission;
		OurVision = ourVision;
		OurBestService = ourBestService;
		Address = address;
		Phone = phone;
		EmailAddress = emailAddress;
	}
	public String getOurMission() {
		return OurMission;
	}
	public void setOurMission(String ourMission) {
		OurMission = ourMission;
	}
	public String getOurVision() {
		return OurVision;
	}
	public void setOurVision(String ourVision) {
		OurVision = ourVision;
	}
	public String getOurBestService() {
		return OurBestService;
	}
	public void setOurBestService(String ourBestService) {
		OurBestService = ourBestService;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
}
