package projectPackage;

import java.util.EventListener;

//이벤트 리스너 인터페이스 정의
interface LoginEventListener extends EventListener {
 void loginSuccessful(LoginEvent evt);
}

//로그인 이벤트 객체 정의
class LoginEvent {
 private String userId;
 private int userNo;

 public LoginEvent(String userId, int userNo) {
     this.userId = userId;
     this.userNo = userNo;
 }

 public String getUserId() {
     return userId;
 }

 public int getUserNo() {
     return userNo;
 }
}
