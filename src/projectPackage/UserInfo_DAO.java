package projectPackage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class UserInfo_DAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@14.42.124.21:1521:xe";
	private String user = "C##MOON";
	private String password = "MOON1234";
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	private Connection connDB() {
		try {
			Class.forName(driver); // JDBC 드라이버 로드
			System.out.println("jdbc driver loading success.");
			con = DriverManager.getConnection(url, user, password); // 연결
			System.out.println("oracle connection success.\n");
			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

	public void Creat_Id(String name, String id, String pw, String email, String phone) {
		String sql = "INSERT INTO USER_INFO (USER_NO, USER_NAME, USER_ID, USER_PW, USER_EMAIL, USER_PHONE) VALUES (SEQ_USER_NO.NEXTVAL, ?, ?, ?, ?, ?)";
		try (Connection con = connDB(); PreparedStatement pstmt = con.prepareStatement(sql)) {
			pstmt.setString(1, name);
			pstmt.setString(2, id);
			pstmt.setString(3, pw);
			pstmt.setString(4, email);
			pstmt.setString(5, phone);
			int result = pstmt.executeUpdate();
			if (result != 0) {
				System.out.println("회원가입이 성공적으로 완료되었습니다.");
			} else if (result == 0) {
				System.out.println("회원가입에 실패하였습니다.");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ArrayList<UserInfoVo> Login(String inId) {
		String sql = "SELECT * FROM USER_INFO";
		ArrayList<UserInfoVo> list_Id = new ArrayList<UserInfoVo>();
		try {
			connDB(); // 데이터베이스 연결
			if (inId != null) {
				sql += " WHERE USER_ID='" + inId + "'"; // ID로 필터링
			}
			System.out.println("SQL : " + sql);

			rs = stmt.executeQuery(sql); // 쿼리 실행
			rs.last();
			System.out.println("rs.getRow() : " + rs.getRow());

			if (rs.getRow() == 0) {
				System.out.println("0 row selected...");
			} else {
				System.out.println(rs.getRow() + " rows selected...");
				rs.previous();
				while (rs.next()) {
					int userNo = rs.getInt("user_no");
					String userName = rs.getString("user_name");
					String userId = rs.getString("USER_ID");
					String userPw = rs.getString("USER_PW");
					String userEmail = rs.getString("user_email");
					String userPhone = rs.getString("user_phone");
					int ticketNo = rs.getInt("ticket_no");
					String seat = rs.getString("seat");

					UserInfoVo data = new UserInfoVo(userNo, userName, userId, userPw, userEmail, userPhone, ticketNo,
							seat);
					list_Id.add(data); // 검색 결과를 리스트에 추가. Login 클래스의 105행으로!
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list_Id;
	}

	public boolean deleteUser(String inId, String inPw) {
		boolean success = false; // 성공 여부를 추적하는 변수
		try {
			connDB(); // 데이터베이스 연결 메소드

			// 사용자 존재 및 비밀번호 일치 확인
			String getUserNoQuery = "SELECT USER_NO FROM USER_INFO WHERE USER_ID = ? AND USER_PW = ?";
			PreparedStatement getUserNoStmt = con.prepareStatement(getUserNoQuery);
			getUserNoStmt.setString(1, inId);
			getUserNoStmt.setString(2, inPw);
			ResultSet rs = getUserNoStmt.executeQuery();

			if (rs.next()) { // 일치하는 사용자가 있으면
				int userNo = rs.getInt("USER_NO");

				// 사용자 티켓 데이터 삭제 (옵션, 필요에 따라)
				String deleteTicketQuery = "DELETE FROM TICKET WHERE USER_NO = ?";
				PreparedStatement deleteTicketStmt = con.prepareStatement(deleteTicketQuery);
				deleteTicketStmt.setInt(1, userNo);
				deleteTicketStmt.executeUpdate();

				// 사용자 정보 삭제
				String deleteUserQuery = "DELETE FROM USER_INFO WHERE USER_ID = ? AND USER_PW = ?";
				PreparedStatement deleteUserStmt = con.prepareStatement(deleteUserQuery);
				deleteUserStmt.setString(1, inId);
				deleteUserStmt.setString(2, inPw);
				int rowsDeleted = deleteUserStmt.executeUpdate();

				if (rowsDeleted > 0) {
					success = true;
					System.out.println("회원탈퇴가 완료되었습니다.");
				} else {
					System.out.println("아이디나 비밀번호가 일치하지 않습니다.");
				}
			} else {
				System.out.println("해당 아이디와 비밀번호를 가진 사용자가 존재하지 않습니다.");
			}
		} catch (SQLException e) {
			System.err.println("SQL Error: " + e.getMessage());
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (stmt != null)
					stmt.close();
				if (con != null)
					con.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
		return success;
	}
	
	public UserInfoVo getUserInfo(String userId) {
	    // 데이터베이스에서 사용자 정보를 가져오는 코드를 작성
	    // 예시로는 사용자 ID를 기반으로 데이터베이스 쿼리를 실행하여 사용자 정보를 가져온다고 가정합니다.
	    UserInfoVo userInfo = null;
	    String sql = "SELECT * FROM USER_INFO WHERE USER_ID = ?";

	    try {
	        connDB(); // 데이터베이스 연결
	        PreparedStatement pstmt = con.prepareStatement(sql);
	        pstmt.setString(1, userId);
	        ResultSet rs = pstmt.executeQuery();

	        if (rs.next()) {
	            int userNo = rs.getInt("user_no");
	            String userName = rs.getString("user_name");
	            String userEmail = rs.getString("user_email");
	            String userPhone = rs.getString("user_phone");
	            int ticketNo = rs.getInt("ticket_no");

	            userInfo = new UserInfoVo(userNo, userName, userId, null, userEmail, userPhone, ticketNo, null);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }

	    return userInfo;
	}

	public ArrayList<UserInfoVo> myPage(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

}