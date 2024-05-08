package projectPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class An_SQL {
	private Connection conn;
	private int selectedMovieNo;
	private int selectedTheaterNo;
	private MainFrame mainFrame;
	int key=0;

	public void An_SQL1() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@14.42.124.35:1521/xe", "C##wjrls", "881125");
			Movielist();
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	
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

	public void setSelectedMovieNo(int selectedMovieNo) {
		this.selectedMovieNo = selectedMovieNo;
		key = selectedMovieNo;
		Allsearch();
		
	}
	
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
		pstmt.setInt(1, key);
		ResultSet rs = pstmt.executeQuery();
		while (rs.next()) {
			int LocalNo = rs.getInt("LOCAL_NO");
			String LocalName = rs.getString("LOCAL_NAME");
			LocalMap.put(LocalNo,LocalName);
			System.out.println(LocalNo + "번과 이름" + LocalName);
		}
		rs.close();
		pstmt.close();
	} catch (SQLException e) {
		e.printStackTrace();
		exit();
	}
	return LocalMap;
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
	
