package projectPackage;
//

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//public class UserInfo_DAO {
//	String driver = "oracle.jdbc.driver.OracleDriver";
//	String url = "jdbc:oracle:thin:@14.42.124.21:1521:xe";
//	String user = "C##MOON";
//	String password = "MOON1234";
//
//	private Connection con;
//	private Statement stmt;
//	private ResultSet rs;
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
////	private CreateId_2 CreateId_2;
////	private MainFrame mainFrame;
//
//	// 특정 사용자 정보 검색
//
////	public ArrayList<UserInfoVo> list(String userName, String userId, String userPw, String userEmail, String userPhone) {
////		ArrayList<UserInfoVo> list = new ArrayList<UserInfoVo>();
////		
////		this.CreateId_2 = CreateId_2;
////		
////		try {
////			connDB(); // 데이터베이스 연결
////
////			String CreatId_query = "INSERT INTO user_info (user_id, user_pw, user_name, user_email, user_phone) "
////					 + "VALUES (?,?,?,?,?)" ;
////			System.out.println("SQL : " + CreatId_query);
//////			PreparedStatement pstmt = con.prepareStatement(CreatId_query);
//////			pstmt.setString(1, list.setUserId());
//////			pstmt.setString(2, list.setUserPw());
//////			pstmt.setString(3, list.setUserName());
//////			pstmt.setString(4, list.setUserEmail());
//////			pstmt.setString(5, list.setUserPhone());
//////			pstmt.executeUpdate();
//////			pstmt.close();
////			
////		} catch (Exception e) {
////			e.printStackTrace();
////		}
////
////		return list;
////	}
//
//	// 특정 사용자 정보 검색
//	public ArrayList<UserInfoVo> list(String inId) {
//		ArrayList<UserInfoVo> list_Lg = new ArrayList<UserInfoVo>();
//		try {
//			connDB(); // 데이터베이스 연결
//
//			String query = "SELECT * FROM USER_INFO";
//			if (inId != null) {
//				query += " WHERE USER_ID='" + inId + "'"; // ID로 필터링
//			}
//			System.out.println("SQL : " + query);
//
//			rs = stmt.executeQuery(query); // 쿼리 실행
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
//					list_Lg.add(data); // 검색 결과를 리스트에 추가. Login 클래스의 105행으로!
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return list_Lg;
//	}
//
//
//	ArrayList<UserInfoVo> list_Ct = new ArrayList<UserInfoVo>();{
//		try {
//		connDB();
//
//		String CreatId_query = "INSERT INTO USER_INFO (user_no, user_id, user_pw, user_name, user_email, user_phone) "
//				+ "VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, ?, ?)";
//		System.out.println("SQL : " + CreatId_query);
//		PreparedStatement pstmt = con.prepareStatement(CreatId_query);
//
//		pstmt = con.prepareStatement(CreatId_query);
//			pstmt.setString(1, list_Ct);
//			pstmt.setString(2, list_Ct.userPw);
//			pstmt.setString(3, list_Ct.userPw);
//			pstmt.setString(4, list_Ct.userEmail);
//			pstmt.setString(5, list_Ct.userPhone);
////			pstmt.setInt(5, ticketNo);
////			pstmt.setString(6, seat);
//
//		pstmt.executeUpdate();
//		pstmt.close();
//
//	}catch(
//	SQLException e)
//	{
//		e.printStackTrace();
////		}
////		return i;
//	}
//}
//	}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////	public ArrayList<UserInfoVo> list2(int userNo, String userName, String userId, String userPw, String userEmail, String userPhone, int ticketNo, String seat) {
////		ArrayList<UserInfoVo> list_Ct = new ArrayList<UserInfoVo>();
////		try {
////			connDB();
////
////			String CreatId_query = "INSERT INTO USER_INFO (user_no, user_id, user_pw, user_name, user_email, user_phone) "
////					+ "VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, ?, ?)";
////			System.out.println("SQL : " + CreatId_query);
////			PreparedStatement pstmt = con.prepareStatement(CreatId_query);
////
//////	         String sql = "" + "INSERT INTO USERS(NAME,USER_ID,PWD,PHONE,EMAIL,HEIGHT,YEAR) " + "VALUES(?,?,?,?,?,?,?)";
////			pstmt = con.prepareStatement(CreatId_query);
////			pstmt.setString(1, userId);
////			pstmt.setString(2, userPw);
////			pstmt.setString(3, userEmail);
////			pstmt.setString(4, userPhone);
////			pstmt.setInt(5, ticketNo);
////			pstmt.setString(6, seat);
////
////			pstmt.executeUpdate();
////			pstmt.close();
////
////		} catch (SQLException e) {
////			e.printStackTrace();
//////		}
//////		return i;
////	}
//
////	public create() {
////
////		UserInfoVo board = new UserInfoVo(driver, driver, driver, driver, driver);
////		System.out.println("[회원정보 입력]");
////		System.out.print("이름: ");
////		board.setBtitle(sc.nextLine());
////		System.out.print("아이디: ");
////		board.setBcontent(sc.nextLine());
////		System.out.print("비밀번호: ");
////		board.setBwriter(sc.nextLine());
////
////		System.out.println("------------------------------------------------------");
////		System.out.println("보조 메뉴: 1.회원가입 | 2. 홈으로");
////		System.out.print("버튼 선택: ");
////		String menuNo = sc.nextLine();
////		if (menuNo.equals("1")) {
////			try {
////				String sql = "" + "INSERT INTO boards (bno, btitle, bcontent, bwriter, bdate) "
////						+ "VALUES (SEQ_BNO.NEXTVAL, ?, ?, ?, SYSDATE)";
////				PreparedStatement pstmt = conn.prepareStatement(sql);
////				pstmt.setString(1, board.getBtitle());
////				pstmt.setString(2, board.getBcontent());
////				pstmt.setString(3, board.getBwriter());
////				pstmt.executeUpdate();
////				pstmt.close();
////			} catch (Exception e) {
////				e.printStackTrace();
////				exit();
////			}
////		}
////
////		list();
////	}
////}

//        public void insertUser(String name, String id, String pw, String email, String phone) {
//            try {
//                connDB();
//                String sql = "INSERT INTO USER_INFO (USER_NO, USER_NAME, USER_ID, USER_PW, USER_EMAIL, USER_PHONE) " +
//                             "VALUES (SEQ_USER_NO.NEXTVAL, ?, ?, ?, ?, ?)";
//                pstmt = con.prepareStatement(sql);
//                pstmt.setString(1, name);
//                pstmt.setString(2, id);
//                pstmt.setString(3, pw);
//                pstmt.setString(4, email);
//                pstmt.setString(5, phone);
//
//                int result = pstmt.executeUpdate();
//                if (result > 0) {
//                    System.out.println("Insertion successful");
//                } else {
//                    System.out.println("Insertion failed");
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            } finally {
//                try {
//                    if (pstmt != null) pstmt.close();
//                    if (con != null) con.close();
//                } catch (SQLException ex) {
//                    ex.printStackTrace();
//                }
//            }
//        }
//        }

import java.sql.*;
import java.util.ArrayList;

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
	
//	public ArrayList<UserInfoVo> myPage(String name, String id, String pw, String email, String phone) {
//		String sql = "SELECT * FROM USER_INFO";
//		ArrayList<UserInfoVo> list_Info = new ArrayList<UserInfoVo>();
//		try {
//			connDB(); // 데이터베이스 연결
////			if ( != null) {
//				sql += " WHERE USER_ID='" + inId + "'"; // ID로 필터링
////			}
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
//					list_Id.add(data); // 검색 결과를 리스트에 추가. Login 클래스의 105행으로!
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return list_Id;
//	}

//	public ArrayList<UserInfoVo> Delete(String inPw) {
//		String sql = "Delete FROM USER_INFO ";
//		ArrayList<UserInfoVo> list_Pw = new ArrayList<UserInfoVo>();
//		try {
//			connDB(); // 데이터베이스 연결
//			if (inPw != null) {
//				sql += " WHERE USER_PW='" + inPw + "'"; // ID로 필터링
//				PreparedStatement pstmt = con.prepareStatement(sql); {
//				pstmt.setString(1, rs.getString("USER_PW"));
//				int result = pstmt.executeUpdate();
//				if (result != 0) {
//					System.out.println("회원탈퇴가 성공적으로 완료되었습니다.");
//				} else {
//					System.out.println("비밀번호가 올바르지 않습니다.");
//			}
//		}
//			 
//		} 
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

//				System.out.println("SQL : " + sql);
//
//				rs = stmt.executeQuery(sql); // 쿼리 실행
//				rs.last();
//				System.out.println("rs.getRow() : " + rs.getRow());
//
//				if (rs.getRow() == 0) {
//					System.out.println("0 row selected...");
//				} else {
//					System.out.println(rs.getRow() + " rows selected...");
//					rs.previous();
//					while (rs.next()) {
//						int userNo = rs.getInt("user_no");
//						String userName = rs.getString("user_name");
//						String userId = rs.getString("USER_ID");
//						String userPw = rs.getString("USER_PW");
//						String userEmail = rs.getString("user_email");
//						String userPhone = rs.getString("user_phone");
//						int ticketNo = rs.getInt("ticket_no");
//						String seat = rs.getString("seat");
//
//						UserInfoVo data = new UserInfoVo(userNo, userName, userId, userPw, userEmail, userPhone, ticketNo,
//								seat);
//						list_Pw.add(data); // 검색 결과를 리스트에 추가. Login 클래스의 105행으로!
//					}
//				}
//			}
//		}catch (Exception e) {
//				e.printStackTrace();
//			}
//
//		return list_Pw;
//	}
}
