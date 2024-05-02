package projectPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Scanner;

public class An_SQL {
	private Scanner sc = new Scanner(System.in);
	private Connection conn;
	int key;
	int key2,key3;
	private int selectedMovieNo;
	
	public An_SQL() {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@14.42.124.35:1521/xe","C##wjrls","881125");
			list();
		}catch(Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	public HashMap<String,Integer> list() {
		HashMap<String,Integer> movieMap = new HashMap<>();

		try {
			String sql ="" + "SELECT MOVIE_NO, MOVIE_NAME " + "FROM MOVIE ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				AnBoard board = new AnBoard();
				board.setNo(rs.getString("MOVIE_NO"));
				board.setName(rs.getString("MOVIE_NAME"));
				
				String movieName = rs.getString("MOVIE_NAME");
				int movieNo = rs.getInt("MOVIE_NO");
	            movieMap.put(movieName,movieNo);

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
        mainMenu();
    }
    
    
	public void mainMenu() {
		
	switch(key) {
	case  2-> read();
	case  3-> read();
	case  4-> read();
	case  5-> read();
	}
	}
	
	public void read() {
		System.out.println("[지역 정보 불러오기]");
		try {
			String sql ="" + "SELECT Schedule_no, Schedule_time, Moviehouse_no, Theater_no, MOVIE_NO "+"FROM MOVIESCHEDULE "+"WHERE MOVIE_NO=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, key);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				AnBoard board = new AnBoard();
				board.setSchedule_no(rs.getInt("SCHEDULE_NO"));
				board.setSchedule_time(rs.getDate("Schedule_time"));
				board.setMoviehouse_no(rs.getInt("Moviehouse_no"));
				board.setTheater_no(rs.getInt("Theater_no"));
				board.setMovie_no(rs.getInt("Movie_no"));
				System.out.println(board.getSchedule_time());
				key2 = board.getTheater_no();
			}
			rs.close();
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
			exit();
		}
		
		try {
			String sql ="" + "SELECT THEATER_NAME ,MOVIEHOUSE_NO "+"FROM THEATER "+"WHERE THEATER_NO=?";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, Integer.toString(key2));
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				AnBoard board = new AnBoard();
				board.setTheater_name(rs.getString("THEATER_NAME"));
				board.setMoviehouse_no(rs.getInt("MOVIEHOUSE_NO"));
				System.out.println("지역이름 : " + board.getTheater_name());
				System.out.println();
			}
			rs.close();
			pstmt.close();
		}catch(Exception e) {
			e.printStackTrace();
			exit();
		}
		
	}
//	
//	public void theater() {
//		System.out.println();
//		System.out.println("----------------------------------------------------------");
//		System.out.println("[영화관 선택]");
//		System.out.print("영화관 선택 : ");
//		int menuNo = sc.nextInt();
//		key3 = menuNo;
//		System.out.println();
//	
//	
//	switch(menuNo) {
//	case 2 -> read2();
//	case 3 -> read2();
//	case 4 -> read2();
//	case 5 -> read2();
//	}
//	}
//	
//	public void read2() {
//		System.out.println("[영화관 정보 불러오기]");
//		try {
//			String sql ="" + "SELECT * "+"FROM MOVIEHOUSE "+"WHERE THEATER_NO=?";
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, Integer.toString(key3));
//			ResultSet rs = pstmt.executeQuery();
//			if(rs.next()) {
//				AnBoard board = new AnBoard();
//				board.setSchedule_no(rs.getInt("SCHEDULE_NO"));
//				System.out.println();
//				key2 = board.getMovie_no();
//			}
//			rs.close();
//			pstmt.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//			exit();
//		}
//		
//		try {
//			String sql ="" + "SELECT THEATER_NAME "+"FROM THEATER "+"WHERE THEATER_NO=?";
//			PreparedStatement pstmt = conn.prepareStatement(sql);
//			pstmt.setString(1, Integer.toString(key2));
//			ResultSet rs = pstmt.executeQuery();
//			if(rs.next()) {
//				AnBoard board = new AnBoard();
//				board.setTheater_name(rs.getString("THEATER_NAME"));
//				System.out.println("지역이름 : " + board.getTheater_name());
//				System.out.println();
//			}
//			rs.close();
//			pstmt.close();
//		}catch(Exception e) {
//			e.printStackTrace();
//			exit();
//		}
//		theater();
//		
//	}

	public void exit() {
		if(conn != null) {
			try {
				conn.close();
			}catch(SQLException e) {
				
			}
		}
		System.out.println("** 게시판 종료 **");
		System.exit(0);
	}
	
}

