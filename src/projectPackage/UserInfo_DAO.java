package projectPackage;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class UserInfo_DAO {
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
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

//	public ArrayList<UserInfoVo> Delete(String inPw) {
//		String sql = "Delete FROM USER_INFO ";
//		ArrayList<UserInfoVo> list_Pw = new ArrayList<UserInfoVo>();
//		try {
//			connDB(); // 데이터베이스 연결
//			if (inPw != null) {
//				sql += " WHERE USER_PW='" + inPw + "'"; // ID로 필터링
//
//				// g
//				System.out.println("SQL : " + sql);
//
//				rs = stmt.executeQuery(sql); // 쿼리 실행
//				rs.last();
//				System.out.println("rs.getRow() : " + rs.getRow());
//
//				PreparedStatement pstmt = con.prepareStatement(sql);
//				{
//					System.out.println(pstmt);
//					pstmt.setString(1, rs.getString("USER_PW"));
//					int result = pstmt.executeUpdate();
//					if (result != 0) {
//						System.out.println("회원탈퇴가 성공적으로 완료되었습니다.");
//					} else {
//						System.out.println("비밀번호가 올바르지 않습니다.");
//					}
//				}
//
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return list_Pw;
//	}

	// g
	public ArrayList<UserInfoVo> DeleteId(String inId, String inPw) {
		ArrayList<UserInfoVo> delete_id = new ArrayList<>();
		try {
			connDB(); // 데이터베이스 연결
			// 1. 해당 아이디와 비밀번호가 일치하는 사용자의 USER_NO 가져오기
			String getUserNoQuery = "SELECT USER_NO FROM USER_INFO WHERE USER_ID = ? AND USER_PW = ?";
			PreparedStatement getUserNoStmt = con.prepareStatement(getUserNoQuery);
			getUserNoStmt.setString(1, inId);
			System.out.println("inId의 값 : " + inId);
			String inId2 = Session.getInstance().getUserId();
			System.out.println("inId2의 값 : " + inId2);
			getUserNoStmt.setString(2, inPw);
			ResultSet rs = getUserNoStmt.executeQuery();

			int userNo = Session.getInstance().getUserNo();
			if (rs.next()) {
				userNo = rs.getInt("USER_NO");
			}

			if (userNo != 0) {
				// 2. 해당 사용자의 티켓 정보 삭제
				String deleteTicketQuery = "DELETE FROM TICKET WHERE USER_NO = ?";
				PreparedStatement deleteTicketStmt = con.prepareStatement(deleteTicketQuery);
				deleteTicketStmt.setInt(1, userNo);
				deleteTicketStmt.executeUpdate();
				System.out.println("quary : " + deleteTicketQuery);
				System.out.println(userNo);

				// 3. 부모 테이블(USER_INFO)에서 해당 아이디와 비밀번호가 일치하는 사용자 삭제
				String deleteUserQuery = "DELETE FROM USER_INFO WHERE USER_ID = ? AND USER_PW = ?";
				PreparedStatement deleteUserStmt = con.prepareStatement(deleteUserQuery);
				deleteUserStmt.setString(1, inId);
				deleteUserStmt.setString(2, inPw);
				int rowsDeleted = deleteUserStmt.executeUpdate();

				if (rowsDeleted > 0) {
					System.out.println("회원탈퇴가 완료되었습니다.");
				} else {
					System.out.println("아이디나 비밀번호가 일치하지 않습니다.");
					JOptionPane.showMessageDialog(null, "아이디나 비밀번호가 일치하지 않습니다.", "회원탈퇴 실패", 1);
				}
			} else {
				System.out.println("해당 아이디와 비밀번호를 가진 사용자가 존재하지 않습니다.");
				JOptionPane.showMessageDialog(null, "해당 아이디와 비밀번호를 가진 사용자가 존재하지 않습니다.", "회원탈퇴 실패", 1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return delete_id;
	}

	// g
	public UserInfoVo getUserInfo(String userId) {
		UserInfoVo userInfo = null;
		String sql = "SELECT * FROM USER_INFO WHERE USER_ID = ?";

		try {
			connDB(); // 데이터베이스 연결
			PreparedStatement pstmt = con.prepareStatement(sql);
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();

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



//	public ArrayList<UserInfoVo> myPage(String userId) {
//		String sql = "SELECT user_no, user_name, user_id, user_pw, user_email, user_phone, ticket_no, seat " 
//				   + "FROM USER_INFO ";
////				   + "WHERE user_no=?";
//		ArrayList<UserInfoVo> list_Info = new ArrayList<UserInfoVo>();
//		try {
//			connDB(); // 데이터베이스 연결
//			if (userId != null) {
//				sql += " WHERE user_id='" + userId + "'"; // ID로 필터링
//			}
//			System.out.println("SQL : " + sql);
//
//			rs = stmt.executeQuery(sql); // 쿼리 실행
//			rs.last();
//			System.out.println("rs.getRow() : " + rs.getRow());
//
//			if (rs.getRow() == 0) {
//				System.out.println("0 row selected...");
//			} else {
//				System.out.println(rs.getRow() + " rows selected...");
//				rs.previous();
//				while (rs.next()) {
//					int userNo = rs.getInt("user_no");
//					String userName = rs.getString("user_name");
//					String userID = rs.getString("user_id");
//					String userPw = rs.getString("user_pw");
//					String userEmail = rs.getString("user_email");
//					String userPhone = rs.getString("user_phone");
//					int ticketNo = rs.getInt("ticket_no");
//					String seat = rs.getString("seat");
//
//					UserInfoVo data = new UserInfoVo(userNo, userName, userID, userPw, userEmail, userPhone, ticketNo, seat);
//					list_Info.add(data); // 검색 결과를 리스트에 추가.
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return list_Info;
//	}

//	public ArrayList<UserInfoVo> myPage(String user_ID) {
//		String sql = "SELECT * FROM USER_INFO";
//		ArrayList<UserInfoVo> list_Info = new ArrayList<UserInfoVo>();
//		try {
//			connDB(); // 데이터베이스 연결
//			if (user_ID != null) {
//				sql += " WHERE USER_ID='" + user_ID + "'"; // ID로 필터링
//			}
//			System.out.println("SQL : " + sql);
//
//			rs = stmt.executeQuery(sql); // 쿼리 실행
//			rs.last();
//			System.out.println("rs.getRow() : " + rs.getRow());
//
//			if (rs.getRow() == 0) {
//				System.out.println("0 row selected...");
//			} else {
//				System.out.println(rs.getRow() + " rows selected...");
//				rs.previous();
//				while (rs.next()) {
//					int userNo = rs.getInt("user_no");
//					String userName = rs.getString("user_name");
//					String userID = rs.getString("USER_ID");
//					String userPw = rs.getString("USER_PW");
//					String userEmail = rs.getString("user_email");
//					String userPhone = rs.getString("user_phone");
//					int ticketNo = rs.getInt("ticket_no");
//					String seat = rs.getString("seat");
//
//					UserInfoVo data = new UserInfoVo(userNo, userName, userID, userPw, userEmail, userPhone, ticketNo,
//							seat);
//					list_Info.add(data); // 검색 결과를 리스트에 추가. Login 클래스의 105행으로!
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return list_Info;
//	}

//	public ArrayList<UserInfoVo> DeleteId(String inPw) {
//		ArrayList<UserInfoVo> delete_id = new ArrayList<>();
//		try {
//			connDB(); // 데이터베이스 연결
//
//			// 1. 자식 테이블의 데이터 삭제 또는 업데이트
//			String childTableQuery = "DELETE FROM TICKET WHERE USER_NO IN (SELECT USER_NO FROM USER_INFO WHERE USER_PW = ?)";
//			PreparedStatement childStmt = con.prepareStatement(childTableQuery);
//			childStmt.setString(1, inPw);
//			childStmt.executeUpdate();
//
//			// 2. 부모 테이블(USER_INFO) 데이터 삭제
//			String parentTableQuery = "DELETE FROM USER_INFO WHERE USER_PW = ?";
//			PreparedStatement parentStmt = con.prepareStatement(parentTableQuery);
//			parentStmt.setString(1, inPw);
//			int rowsDeleted = parentStmt.executeUpdate();
//
//			if (rowsDeleted > 0) {
//				System.out.println("회원탈퇴가 완료되었습니다.");
//			} else {
//				System.out.println("비밀번호가 일치하지 않습니다.");
//				JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.", "회원탈퇴 실패", 1);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return delete_id;
//	}
}

//	public ArrayList<UserInfoVo> DeleteId(String inPw) {
//		String sql = "DELETE FROM USER_INFO";
//		ArrayList<UserInfoVo> delete_id = new ArrayList<UserInfoVo>();
//		try {
//			connDB(); // 데이터베이스 연결
//			if (inPw != null) {
//				sql += " WHERE USER_PW='" + inPw + "'"; // PW로 필터링
//			}
//			System.out.println("SQL : " + sql);
//
//			rs = stmt.executeQuery(sql); // 쿼리 실행
//			rs.last();
//			System.out.println("rs.getRow() : " + rs.getRow());
//
//			if (rs.getRow() == 0) {
//				System.out.println("0 row selected...");
//			} else {
//				System.out.println(rs.getRow() + " rows selected...");
//				rs.previous();
//				while (rs.next()) {
//					int userNo = rs.getInt("user_no");
//					String userName = rs.getString("user_name");
//					String userId = rs.getString("USER_ID");
//					String userPw = rs.getString("USER_PW");
//					String userEmail = rs.getString("user_email");
//					String userPhone = rs.getString("user_phone");
//					int ticketNo = rs.getInt("ticket_no");
//					String seat = rs.getString("seat");
//
//					UserInfoVo data = new UserInfoVo(userNo, userName, userId, userPw, userEmail, userPhone, ticketNo,
//							seat);
//					delete_id.add(data); // 검색 결과를 리스트에 추가. Login 클래스의 105행으로!
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return delete_id;
//	}

//public ArrayList<UserInfoVo> User_no(List<Integer> user_No) {
//	String sql = "SELECT USER_NO FROM USER_INFO";
//	ArrayList<UserInfoVo> Loged_User = new ArrayList<UserInfoVo>();
//	try {
//		connDB(); // 데이터베이스 연결
//		if (user_No != null) {
//			sql += " WHERE USER_NO='" + user_No + "'"; // ID로 필터링
//		}
//		System.out.println("SQL : " + sql);
//
//		rs = stmt.executeQuery(sql); // 쿼리 실행
//		rs.last();
//		System.out.println("rs.getRow() : " + rs.getRow());
//
//		if (rs.getRow() == 0) {
//			System.out.println("0 row selected...");
//		} else {
//			System.out.println(rs.getRow() + " rows selected...");
//			rs.previous();
//			while (rs.next()) {
//				int userNo = rs.getInt("user_no");
//				String userName = rs.getString("user_name");
//				String userId = rs.getString("USER_ID");
//				String userPw = rs.getString("USER_PW");
//				String userEmail = rs.getString("user_email");
//				String userPhone = rs.getString("user_phone");
//				int ticketNo = rs.getInt("ticket_no");
//				String seat = rs.getString("seat");
//
//				UserInfoVo data = new UserInfoVo(userNo, userName, userId, userPw, userEmail, userPhone, ticketNo, seat);
//				Loged_User.add(data); // 검색 결과를 리스트에 추가. Login 클래스의 105행으로!
//			}
//		}
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//
//	return Loged_User;
//}