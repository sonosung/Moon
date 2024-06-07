package projectPackage;

import java.util.ArrayList;

public class MyLoginListener implements LoginEventListener {
    
    private UserInfo_DAO dao; // DAO 클래스 인스턴스 생성
    private MainFrame mainFrame; // MainFrame 인스턴스
    
    public MyLoginListener(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        dao = new UserInfo_DAO(); // DAO 클래스 인스턴스 초기화
    }

    @Override
    public void loginSuccessful(LoginEvent evt) {
        String userId = evt.getUserId();
        int userNo = evt.getUserNo();
        System.out.println(userId + "님 환영합니다. 사용자 번호: " + userNo);
        
    }
}