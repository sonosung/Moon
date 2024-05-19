package projectPackage;

import java.util.EventListener;

//이벤트 리스너 인터페이스 정의
interface LogoutEventListener extends EventListener {
 void logoutSuccessful(LogoutEvent evt);
}

//로그아웃 이벤트 객체 정의
class LogoutEvent {
 private String userId;

 public LogoutEvent(String userId) {
     this.userId = userId;
 }

 public String getUserId() {
     return userId;
 }
}