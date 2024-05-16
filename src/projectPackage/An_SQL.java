package projectPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class An_SQL {
	private Connection conn;
	private int selectedMovieNo , selectedLocalNo , SelectedHouseNo , Timeno;
	private MainFrame mainFrame;
	int key[]=new int[4];
	List<Integer> seat_no = new ArrayList<>();
	List<Integer> seat_size = new ArrayList<>();
	
	public void An_SQL1() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@14.42.124.21:1521/xe", "C##MOON", "MOON1234");
			Movielist();
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
	
	//영화 리스트 불러오기
	public HashMap<Integer,String> Movielist() {
		HashMap<Integer,String> movieMap = new HashMap<>();
		
		try {
			String sql ="" + " SELECT MOVIE_NO, MOVIE_NAME " + "FROM MOVIE ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				String movieName = rs.getString("MOVIE_NAME");
				int movieNo = rs.getInt("MOVIE_NO");
	            movieMap.put(movieNo,movieName);

		    }
			rs.close();
			pstmt.close();
		}catch(SQLException e) {
			e.printStackTrace();
			exit();
		}
		return movieMap;
		
	}

	

	public void setSelectedMovieNo(int selectedMovieNo) {
		this.selectedMovieNo = selectedMovieNo;
		key[0] = selectedMovieNo;
	}
	
	
	//지역 리스트 불러오기
	public HashMap<Integer, String> Allsearch() {
	HashMap<Integer, String> LocalMap = new HashMap<>();
	try {
		String sql = "" +
		        "SELECT m2.MOVIE_NAME, t.THEATER_NAME, m3.MOVIEHOUSE_NAME, l.LOCAL_NAME, " +
		        "       m.SCHEDULE_NO, m.MOVIE_NO, m.THEATER_NO, SCHEDULE_TIME, l.LOCAL_NO, m3.MOVIEHOUSE_NO " +
		        "FROM MOVIESCHEDULE m " +
		        "JOIN MOVIE m2 ON m2.MOVIE_NO = m.MOVIE_NO " +
		        "JOIN MOVIEHOUSE m3 ON m3.MOVIEHOUSE_NO = m.MOVIEHOUSE_NO " +
		        "JOIN LOCAL l ON l.LOCAL_NO = m3.LOCAL_NO " +
		        "JOIN THEATER t ON t.THEATER_NO = m.THEATER_NO " +
		        "WHERE m.MOVIE_NO = ?";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, key[0]);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			int LocalNo = rs.getInt("LOCAL_NO");
			String LocalName = rs.getString("LOCAL_NAME");
			LocalMap.put(LocalNo,LocalName);
		}
		rs.close();
		pstmt.close();
	} catch (SQLException e) {
		e.printStackTrace();
		exit();
	}
	return LocalMap;
	}
	
	public void setSelectedLocalNo(int selectedLocalNo) {
		this.selectedLocalNo = selectedLocalNo;
		key[1] = selectedLocalNo;
	}
	

	public HashMap<Integer, String> Allsearch2() {
	HashMap<Integer, String> HouseMap = new HashMap<>();
	try {
		String sql = "" +
		        "SELECT m2.MOVIE_NAME, t.THEATER_NAME, m3.MOVIEHOUSE_NAME, l.LOCAL_NAME, " +
		        "       m.SCHEDULE_NO, m.MOVIE_NO, m.THEATER_NO, SCHEDULE_TIME, l.LOCAL_NO, m3.MOVIEHOUSE_NO " +
		        "FROM MOVIESCHEDULE m " +
		        "JOIN MOVIE m2 ON m2.MOVIE_NO = m.MOVIE_NO " +
		        "JOIN MOVIEHOUSE m3 ON m3.MOVIEHOUSE_NO = m.MOVIEHOUSE_NO " +
		        "JOIN LOCAL l ON l.LOCAL_NO = m3.LOCAL_NO " +
		        "JOIN THEATER t ON t.THEATER_NO = m.THEATER_NO " +
		        "WHERE l.LOCAL_NO = ?";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, key[1]);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			int moviehouseno = rs.getInt("MOVIEHOUSE_NO");
			String moviehouseName = rs.getString("MOVIEHOUSE_NAME");
			HouseMap.put(moviehouseno,moviehouseName);
		}
		rs.close();
		pstmt.close();
	} catch (SQLException e) {
		e.printStackTrace();
		exit();
	}
	return HouseMap;
	}
	

	public void setSelectedHouseNo(int SelectedHouseNo) {
		this.SelectedHouseNo = SelectedHouseNo;
		key[2] = SelectedHouseNo;
	}
	
	public HashMap<Integer, String> Allsearch3() {
	HashMap<Integer, String> TimeMap = new HashMap<>();
	try {
		String sql = "" +
		        "SELECT m2.MOVIE_NAME, t.THEATER_NAME, m3.MOVIEHOUSE_NAME, l.LOCAL_NAME, " +
		        "       m.SCHEDULE_NO, m.MOVIE_NO, m.THEATER_NO, SCHEDULE_TIME, l.LOCAL_NO, m3.MOVIEHOUSE_NO " +
		        "FROM MOVIESCHEDULE m " +
		        "JOIN MOVIE m2 ON m2.MOVIE_NO = m.MOVIE_NO " +
		        "JOIN MOVIEHOUSE m3 ON m3.MOVIEHOUSE_NO = m.MOVIEHOUSE_NO " +
		        "JOIN LOCAL l ON l.LOCAL_NO = m3.LOCAL_NO " +
		        "JOIN THEATER t ON t.THEATER_NO = m.THEATER_NO " +
		        "WHERE m.THEATER_NO = ?";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, key[2]);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			int Timeno = rs.getInt("SCHEDULE_NO");
			String Timename = rs.getString("SCHEDULE_TIME");
			TimeMap.put(Timeno,Timename);
		}
		rs.close();
		pstmt.close();
	} catch (SQLException e) {
		e.printStackTrace();
		exit();
	}
	return TimeMap;
	}
	

	public void setSelectedTime(int Timeno) {
		this.Timeno = Timeno;
		key[3] = Timeno;
	}
	
	public List<Integer> seat_no(){
		try {
			String sql = "" +
					"SELECT * FROM TICKET t " +
					"JOIN MOVIESCHEDULE m ON m.SCHEDULE_NO = t.SCHEDULE_NO "+
					"JOIN MOVIE m2 ON m2.MOVIE_NO = m.MOVIE_NO "+
					"JOIN MOVIEHOUSE m3 ON m3.MOVIEHOUSE_NO = m.MOVIEHOUSE_NO "+
					"JOIN THEATER t2 ON t2.THEATER_NO = m.THEATER_NO "+
					"JOIN LOCAL l ON l.LOCAL_NO = m3.LOCAL_NO "+
					"WHERE t.SCHEDULE_NO = ? AND m2.MOVIE_NO = ? AND m3.MOVIEHOUSE_NO = ? AND l.LOCAL_NO = ?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, key[3]);
			pstmt.setInt(2, key[0]);
			pstmt.setInt(3, key[2]);
			pstmt.setInt(4, key[1]);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				seat_no.add(rs.getInt("SEAT_NO"));
			}
			rs.close();
			pstmt.close();
		}catch (SQLException e) {
			e.printStackTrace();
			exit();
		}
		return seat_no;
	}
	
	public void seat_size_set(List<Integer> select_seat) {
	    this.seat_size.clear(); 
	    this.seat_size = select_seat;
	}
	
	public void update() {
		for(int i = 0; i < seat_size.size(); i++) {
			try {
				String sql = "" + "  INSERT INTO TICKET (TICKET_NO, SCHEDULE_NO, SEAT_NO, USER_NO, TICKET_STATUS) "
						+ "  VALUES (SEQ_TICKET_NO.NEXTVAL, ?, ?, ?, 'av')";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, key[3]);
				pstmt.setInt(2, seat_size.get(i));   // 시트넘버 어떻게 가져오지
				pstmt.setInt(3,1);  //유저 넘버 어떻게 할거
				ResultSet rs = pstmt.executeQuery();
				System.out.println("쿼리문 확인 : " + key[3] + " 시트 사이즈 겟 확인 " + seat_size.get(i));
				rs.close();
				pstmt.close();
			}catch (SQLException e) {
				e.printStackTrace();
				exit();
			}
		}
	}
		
	public void exit() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {

			}
		}
		System.exit(0);
	}

}
	
