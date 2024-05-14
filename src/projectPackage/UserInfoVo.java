package projectPackage;

public class UserInfoVo {
	
	private String userName;
	private String userId;
	private String userPw;
	private String userEmail;
	private String userPhone;

	public UserInfoVo(String userName, String userId, String userPw, String userEmail, String userPhone) {
		this.userName = userName;
		this.userId = userId;
		this.userPw = userPw;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
	}

//	public String getUserName() {
//		return userName;
//	}
//
//	public String getUserId() {
//		return userId;
//	}
//
//	public String getUserPw() {
//		return userPw;
//	}
//
//	public String getUserEmail() {
//		return userEmail;
//	}
//
//	public String getUserPhone() {
//		return userPhone;
//	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUser_Name() {
		return userName;
	}

	public String getUser_Email() {
		return userEmail;
	}

	public String getUser_Phone() {
		return userPhone;
	}

	public String getUser_Id() {
		return userId;
	}

	public String getUser_Pw() {
		return userPw;
	}

}