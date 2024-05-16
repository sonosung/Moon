//package projectPackage;
//
//public class UserInfoVo {
//	
//	private String userName;
//	private String userId;
//	private String userPw;
//	private String userEmail;
//	private String userPhone;
//
//	public UserInfoVo(String userName, String userId, String userPw, String userEmail, String userPhone) {
//		this.userName = userName;
//		this.userId = userId;
//		this.userPw = userPw;
//		this.userEmail = userEmail;
//		this.userPhone = userPhone;
//	}
//
////	public String getUserName() {
////		return userName;
////	}
////
////	public String getUserId() {
////		return userId;
////	}
////
////	public String getUserPw() {
////		return userPw;
////	}
////
////	public String getUserEmail() {
////		return userEmail;
////	}
////
////	public String getUserPhone() {
////		return userPhone;
////	}
//
//	public void setUserName(String userName) {
//		this.userName = userName;
//	}
//
//	public void setUserId(String userId) {
//		this.userId = userId;
//	}
//
//	public void setUserPw(String userPw) {
//		this.userPw = userPw;
//	}
//
//	public void setUserEmail(String userEmail) {
//		this.userEmail = userEmail;
//	}
//
//	public void setUserPhone(String userPhone) {
//		this.userPhone = userPhone;
//	}
//
//	public String getUser_Name() {
//		return userName;
//	}
//
//	public String getUser_Email() {
//		return userEmail;
//	}
//
//	public String getUser_Phone() {
//		return userPhone;
//	}
//
//	public String getUser_Id() {
//		return userId;
//	}
//
//	public String getUser_Pw() {
//		return userPw;
//	}
//
//}

package projectPackage;

public class UserInfoVo {
//	private String currentUser;
	private int userNo;
	private String userId;
	private String userName;
	private String userPw;
	private String userEmail;
	private String userPhone;
	private int ticketNo;
	private String seat;
//	private String udata;

	public UserInfoVo(int userNo, String userName, String userId, String userPw, String userEmail, String userPhone, int ticketNo, String seat) {
		
		this.userNo = userNo;
		this.userName = userName;
		this.userId = userId;
		this.userPw = userPw;
		this.userEmail = userEmail;
		this.userPhone = userPhone;
		this.ticketNo = ticketNo;
		this.seat = seat;
	}
	
//	public String getUser() {
//		return currentUser;
//	}

	public int getUserNo() {
		return userNo;
	}
	
	public String getUserName() {
		return userName;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserPw() {
		return userPw;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}
	public int getTicketNo() {
		return ticketNo;
	}
	public String getSeat() {
		return seat;
	}
	
//	public String getData() {
//		return udata;
//	}
	
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
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
	
	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
//	public void displayUserInfo(String udata) {
//		this.udata = udata;
//		
//        System.out.println("사용자 정보:");
//        System.out.println("사용자 번호: " + userNo);
//        System.out.println("사용자 이름: " + userName);
//        System.out.println("사용자 ID: " + userId);
//        System.out.println("사용자 이메일: " + userEmail);
//        System.out.println("사용자 전화번호: " + userPhone);
//        System.out.println("티켓 번호: " + ticketNo);
//        System.out.println("좌석: " + seat);
//    }
}
//
//	public String getUser_Name() {
//		return userName;
//	}
//
//	public String getUser_Email() {
//		return userEmail;
//	}
//
//	public String getUser_Phone() {
//		return userPhone;
//	}
//
//	public String getUser_Id() {
//		return userId;
//	}
//
//	public String getUser_Pw() {
//		return userPw;
//	}
//}
