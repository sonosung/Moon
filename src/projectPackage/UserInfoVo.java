package projectPackage;

public class UserInfoVo {
	
	private String userId;
	private String userPw;

	public UserInfoVo(String userId, String userPw) {
		this.userId = userId;
		this.userPw = userPw;
	}

	public String getUser_id() {
		return userId;
	}

	public String getUser_Pw() {
		return userPw;
	}
}

//	private int user_no;
//	private String user_name;
//	private String user_id;
//	private String user_pw;
//	private String user_email;
//	private String user_phone;
//	private int ticket_no;
//	private String seat;
//
//	
//	public UserInfoVo() {}
//	
//	public UserInfoVo(int user_no, String user_id, String user_pw, String user_name, String user_email, String user_phone, int ticket_no,
//			String seat) {
//		super();
//		this.user_no = user_no;
//		this.user_id = user_id;
//		this.user_name = user_name;
//		this.user_pw = user_pw;
//		this.user_email = user_email;
//		this.user_phone = user_phone;
//		this.ticket_no = ticket_no;
//		this.seat = seat;
//	}
//	
//	public int getUser_no() {
//		return user_no;
//	}
//	public void setUser_no(int user_no) {
//		this.user_no = user_no;
//	}
//	public String getUser_name() {
//		return user_name;
//	}
//	public String getUser_id() {
//		return user_id;
//	}
//	public void setUser_id(String user_id) {
//		this.user_id = user_id;
//	}
//	public void setUser_name(String user_name) {
//		this.user_name = user_name;
//	}
//	public String getUser_pw() {
//		return user_pw;
//	}
//	public void setUser_pw(String user_pw) {
//		this.user_pw = user_pw;
//	}
//	public String getUser_email() {
//		return user_email;
//	}
//	public void setUser_email(String user_email) {
//		this.user_email = user_email;
//	}
//	public String getUser_phone() {
//		return user_phone;
//	}
//	public void setUser_phone(String user_phone) {
//		this.user_phone = user_phone;
//	}
//	public int getTicket_no() {
//		return ticket_no;
//	}
//	public void setTicketnum(int ticket_no) {
//		this.ticket_no = ticket_no;
//	}
//	public String getSeat() {
//		return seat;
//	}
//	public void setSeat(String seat) {
//		this.seat = seat;
//	}
//	
//	public void RenderInfo()
//	{
//		System.out.println("NO : "  + this.user_no);
//		System.out.println("ID : " + this.user_id);
//		System.out.println("NAME : "  + this.user_name);
//		
//	}
//	
//}
