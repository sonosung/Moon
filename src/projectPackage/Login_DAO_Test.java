package projectPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Login_DAO_Test {
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@14.42.124.21:1521:xe";
	String user = "C##MOON";
	String password = "MOON1234";

	private Connection con;
	private Statement stmt;
	private ResultSet rs;
	private CreateId_2 CreateId_2;
//	private MainFrame mainFrame;

	// 특정 사용자 정보 검색
//	public ArrayList<UserInfoVo> list(String id, String uId, String uPw, String uEmail, String uPhone) {
	public ArrayList<UserInfoVo> list(String userName, String userId, String userPw, String userEmail, String userPhone) {
		ArrayList<UserInfoVo> list = new ArrayList<UserInfoVo>();
		
		this.CreateId_2 = CreateId_2;
		
		try {
			connDB(); // 데이터베이스 연결

			String CreatId_query = "INSERT INTO user_info (user_id, user_pw, user_name, user_email, user_phone) "
					 + "VALUES (?,?,?,?,?)" ;
			System.out.println("SQL : " + CreatId_query);
			PreparedStatement pstmt = con.prepareStatement(CreatId_query);
			pstmt.setString(1, list.setUserId());
			pstmt.setString(2, list.setUserPw());
			pstmt.setString(3, list.setUserName(userName));
			pstmt.setString(4, list.setUserEmail());
			pstmt.setString(5, list.setUserPhone());
			pstmt.executeUpdate();
			pstmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	public ArrayList<UserInfoVo> list(String inId) {
		ArrayList<UserInfoVo> list2 = new ArrayList<UserInfoVo>();
		try {
			connDB(); // 데이터베이스 연결

			String query = "SELECT * FROM USER_INFO";
			if (inId != null) {
				query += " WHERE USER_ID='" + inId + "'"; // ID로 필터링
			}
			System.out.println("SQL : " + query);

			rs = stmt.executeQuery(query); // 쿼리 실행
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected...");
			} else {
				System.out.println(rs.getRow() + " rows selected...");
				rs.previous();
				while (rs.next()) {
//					int user_no = rs.getInt("user_no");
					String userName = rs.getString("user_name");
					String userId = rs.getString("USER_ID");
					String userPw = rs.getString("USER_PW");
					String userEmail = rs.getString("user_email");
					String userPhone = rs.getString("user_phone");
//					int ticket_no = rs.getInt("ticket_no");
//					String seat = rs.getString("seat");

					UserInfoVo data = new UserInfoVo(userName, userId, userPw, userEmail, userPhone);
					list2.add(data); // 검색 결과를 리스트에 추가. Login 클래스의 105행으로!
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list2;
	}
	
	// 데이터베이스 연결 메서드
	private void connDB() {
		try {
			Class.forName(driver); // JDBC 드라이버 로드
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password); // 연결
			System.out.println("oracle connection success.\n");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

