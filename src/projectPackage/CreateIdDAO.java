//package projectPackage;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//public class CreateIdDAO {
//	String driver = "oracle.jdbc.driver.OracleDriver";
//	String url = "jdbc:oracle:thin:@14.42.124.21:1521:xe";
//	String user = "C##MOON";
//	String password = "MOON1234";
//
//	private Connection con;
//	private Statement stmt;
//	private ResultSet rs;
////	private MainFrame mainFrame;
//
//	// 특정 사용자 정보 검색
//	public ArrayList<UserInfoVo> list(String user_id, String user_pw, String user_name, String user_email, String user_phone) {
//		ArrayList<UserInfoVo> list = new ArrayList<UserInfoVo>();
//
//		try {
//			connDB(); // 데이터베이스 연결
//
//			String query = "INSERT INTO USER_INFO (String user_id, String user_pw, String user_name, String user_email, String user_phone) "
//						 + "VALUES (?,?,?,?,?)" ;
//			System.out.println("SQL : " + query);
//			PreparedStatement pstmt = con.prepareStatement(query);
//			pstmt.setString(1, UserInfoVo.getUser_id());
////			pstmt.setString(2, CreateId_2.getUser_pw());
////			pstmt.setString(3, CreateId_2.getUserName());
////			pstmt.setString(4, CreateId_2.getUser_email());
////			pstmt.setString(5, CreateId_2.getUser_phone());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return list;
//	}
//
//	// 데이터베이스 연결 메서드
//	private void connDB() {
//		try {
//			Class.forName(driver); // JDBC 드라이버 로드
//			System.out.println("jdbc driver loading success.");
//			con = DriverManager.getConnection(url, user, password); // 연결
//			System.out.println("oracle connection success.\n");
//			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}
