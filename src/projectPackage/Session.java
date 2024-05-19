package projectPackage;

public class Session {
	private static Session instance;

	private boolean loggedIn;
	private String userId;
	private int userNo;

	private Session() {
		// 외부에서 인스턴스화 방지
	}

	public static Session getInstance() {
		if (instance == null) {
			instance = new Session();
		}
		return instance;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public int getUserNo() {
		return userNo;
	}

	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}

// 세션 정보 초기화 메서드
	public void resetSession() {
		loggedIn = false;
		userId = null;
		userNo = 0;
		System.out.println("로그아웃되었습니다.");
	}
}