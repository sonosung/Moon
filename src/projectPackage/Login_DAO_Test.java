package projectPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
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
	private MainFrame mainFrame;

//	this.mainFrame = mainFrame;
	// 특정 사용자 정보 검색

//	this.bt_login=bt_login;

//	Login_Test log = new Login_Test(mainFrame);


	public ArrayList<UserInfoVo> list(String id) {
		ArrayList<UserInfoVo> list = new ArrayList<UserInfoVo>();

		try {
			connDB(); // 데이터베이스 연결

			String query = "SELECT * FROM USER_INFO";
			if (id != null) {
				query += " WHERE USER_ID='" + id + "'"; // ID로 필터링
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
//					String user_name = rs.getString("user_name");
					String userId = rs.getString("USER_ID");
					String userPw = rs.getString("USER_PW");
//					String user_email = rs.getString("user_email");
//					String user_phone = rs.getString("user_phone");
//					int ticket_no = rs.getInt("ticket_no");
//					String seat = rs.getString("seat");

					UserInfoVo data = new UserInfoVo(userId, userPw);
					list.add(data); // 검색 결과를 리스트에 추가
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
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

