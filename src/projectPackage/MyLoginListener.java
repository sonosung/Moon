//package projectPackage;
//
//import java.util.ArrayList;
//
//import projectPackage.LoginEvent;
//import projectPackage.LoginEventListener;
//
//public class MyLoginListener implements LoginEventListener {
//    
//    private Login loginPanel;
//    private UserInfo_DAO dao; // DAO 클래스 인스턴스 생성
//    
//    public MyLoginListener(Login loginPanel) {
//        this.loginPanel = loginPanel;
//        this.loginPanel.addLoginEventListener(this);
//        dao = new UserInfo_DAO(); // DAO 클래스 인스턴스 초기화
//    }
//
//    @Override
//    public void loginSuccessful(LoginEvent evt) {
//        String userId = evt.getUserId();
//        int userNo = evt.getUserNo();
//        System.out.println(userId + "님 환영합니다. 사용자 번호: " + userNo);
//        
//     // DAO를 통해 사용자 정보 가져오기
//        ArrayList<UserInfoVo> userInfoList = dao.myPage(null, userId, null, null, null);
//        if (!userInfoList.isEmpty()) { // 사용자 정보가 존재하면
//            UserInfoVo userInfo = userInfoList.get(0); // 첫 번째 사용자 정보만 가져옴
//            // MyPage 클래스에 사용자 정보 설정
//            MyPage myPage = loginPanel.getMainFrame().getMyPage(); // MyPage 클래스 가져오기
////            MyPage myPage = new MyPage(); // MyPage 인스턴스 생성
//            myPage.setUserName(userInfo.getUserName());
//            myPage.setUserId(userInfo.getUserId());
//            myPage.setUserEmail(userInfo.getUserEmail());
//            myPage.setUserPhone(userInfo.getUserPhone());
//            // 티켓 정보 등 필요한 정보 추가 설정 가능
//            
////            // MainFrame에 MyPage 설정
////            MainFrame mainFrame = MainFrame.getInstance(); // MainFrame 인스턴스 가져오기
////            mainFrame.setMyPage(myPage);
//        }
//    }
//}
//

package projectPackage;

import java.util.ArrayList;

import projectPackage.LoginEvent;
import projectPackage.LoginEventListener;

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
        
     // DAO를 통해 해당 사용자의 정보 가져오기
//        ArrayList<UserInfoVo> userInfoList = dao.myPage(userId);
//        ArrayList<UserInfoVo> userInfo = myPage(userId);
//        if (!userInfoList.isEmpty()) { // 사용자 정보가 존재하면
//            UserInfoVo userInfo = userInfoList.get(0); // 첫 번째 사용자 정보만 가져옴
//            
//             MyPage 클래스에 사용자 정보 설정
//            mainFrame.getMyPage().setUserName(userInfoList.getUserName());
//            mainFrame.getMyPage().setUserId(userInfoList.getUserId());
//            mainFrame.getMyPage().setUserEmail(userInfoList.getUserEmail());
//            mainFrame.getMyPage().setUserPhone(userInfoList.getUserPhone());
//            mainFrame.getMyPage().setTicketNo(userInfoList.getTicketNo());
//        }
    }
}

//	private ArrayList<UserInfoVo> myPage(String userId) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//}

