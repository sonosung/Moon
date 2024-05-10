package projectPackage;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class An_SQL {
	private Connection conn;
	private int selectedMovieNo , selectedLocalNo , selectedTheaterNo , Time;
	private MainFrame mainFrame;
	int key[]=new int[5];

	public void An_SQL1() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@14.42.124.35:1521/xe", "C##WJRLS", "881125");
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
				
				AnBoard board = new AnBoard();
				board.setNo(rs.getString("MOVIE_NO"));
				board.setName(rs.getString("MOVIE_NAME"));
				
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

	
	//영화 클릭 시 선택 영화 넘버 저장
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
	
	//선택한 지역 넘버 저장하기
	public void setSelectedLocalNo(int selectedLocalNo) {
		this.selectedLocalNo = selectedLocalNo;
		key[1] = selectedLocalNo;
	}
	
	// 극장 선택하기
	public HashMap<Integer, String> Allsearch2() {
	HashMap<Integer, String> TheaterMap = new HashMap<>();
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
			int TheaterNo = rs.getInt("THEATER_NO");
			String TheaterName = rs.getString("THEATER_NAME");
			TheaterMap.put(TheaterNo,TheaterName);
		}
		rs.close();
		pstmt.close();
	} catch (SQLException e) {
		e.printStackTrace();
		exit();
	}
	return TheaterMap;
	}
	
	//선택한 극장 번호 저장하기
	public void setSelectedTheaterNo(int selectedTheaterNo) {
		this.selectedTheaterNo = selectedTheaterNo;
		key[2] = selectedTheaterNo;
	}
	
	//시간 선택하기
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
			int SCHEDULE_NO = rs.getInt("SCHEDULE_NO");
			String SCHEDULEName = rs.getString("SCHEDULE_TIME");
			TimeMap.put(SCHEDULE_NO,SCHEDULEName);

		}
		rs.close();
		pstmt.close();
	} catch (SQLException e) {
		e.printStackTrace();
		exit();
	}
	return TimeMap;
	}
	
	//볼 시간 번호 저장하기
	public void setSelectedTime(int Time) {
		this.Time = Time;
		key[2] = Time;
	}
	
	
//	public Map<Integer, String>[] Allsearch() {
//	    Map<Integer, String>[] maps = new HashMap[4];
//	    try {
//			String sql = "" +
//			        "SELECT m2.MOVIE_NAME, t.THEATER_NAME, m3.MOVIEHOUSE_NAME, l.LOCAL_NAME, " +
//			        "       m.SCHEDULE_NO, m.MOVIE_NO, m.THEATER_NO, SCHEDULE_TIME, l.LOCAL_NO, m3.MOVIEHOUSE_NO " +
//			        "FROM MOVIESCHEDULE m " +
//			        "JOIN MOVIE m2 ON m2.MOVIE_NO = m.MOVIE_NO " +
//			        "JOIN MOVIEHOUSE m3 ON m3.MOVIEHOUSE_NO = m.MOVIEHOUSE_NO " +
//			        "JOIN LOCAL l ON l.LOCAL_NO = m3.LOCAL_NO " +
//			        "JOIN THEATER t ON t.THEATER_NO = m.THEATER_NO " +
//			        "WHERE m.MOVIE_NO = ?";
//
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setInt(1, key[0]);
//			ResultSet rs = pstmt.executeQuery();
//			while (rs.next()) {
//				int LocalNo = rs.getInt("l.LOCAL_NO");
//				String LocalName = rs.getString("l.LOCAL_NAME");
//				maps[0] = new HashMap<>();
//				maps[0].put((LocalNo), LocalName);
//
//				int TheaterNo = rs.getInt("m.THEATER_NO");
//				String TheaterName = rs.getString("t.THEATER_NAME");
//				maps[1] = new HashMap<>();
//				maps[1].put((TheaterNo), TheaterName);
//
//				int ScheduleNo = rs.getInt("m.SCHEDULE_NO");
//				Date ScheduleDate = rs.getDate("SCHEDULE_TIME");
//				String ScheduleDate2 = Integer.toString(ScheduleNo);
//				maps[2] = new HashMap<>();
//		    	maps[2].put((ScheduleNo),ScheduleDate2);		
//
//		    	int MovieHouseNo = rs.getInt("m3.MOVIEHOUSE_NO");
//		    	String MovieHouseName = rs.getString("m3.MOVIEHOUSE_NAME");
//		    	maps[3] = new HashMap<>();
//		    	maps[3].put((MovieHouseNo), MovieHouseName);
//			}	
//			rs.close();
//			pstmt.close();	    
//	    
//	    }
// catch (SQLException e) {
//			e.printStackTrace();
//			exit();
//		}
//	    return maps;
//}



	public int[] All_NUMBER() {
		return key;
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
	
