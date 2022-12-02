package model.bean;

public class Member {
	private String MemberName;
	private String MemberPosition;
	private byte[] MemberImage;

	public String getMemberName() {
		return MemberName;
	}

	public void setMemberName(String memberName) {
		MemberName = memberName;
	}

	public String getMemberPosition() {
		return MemberPosition;
	}

	public void setMemberPosition(String memberPosition) {
		MemberPosition = memberPosition;
	}

	public byte[] getMemberImage() {
		return MemberImage;
	}

	public void setMemberImage(byte[] memberImage) {
		MemberImage = memberImage;
	}

	public Member(String memberName, String memberPosition, byte[] memberImage) {
		MemberName = memberName;
		MemberPosition = memberPosition;
		MemberImage = memberImage;
	}

}
