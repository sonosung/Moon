package projectPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class An_SQl2_seat {
	private Connection conn;
	private int selectedMovieNo, selectedLocalNo, SelectedHouseNo, Timeno;
	private MainFrame mainFrame;
	int key[] = new int[4];
	int sum[] = new int[4];
	int seat[] = new int[24];

	public void An_SQL1() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@14.42.124.21:1521/xe", "C##MOON", "MOON1234");
		} catch (Exception e) {
			e.printStackTrace();
			exit();
		}
	}
	public void seatlist2_keyset(int[] sum) {
		for(int i = 0; i < sum.length; i++) {
		this.sum[i] = sum[i];
		}
		seatlist();
	}

	public void seatlist() {
		System.out.println(sum[0] + " " +sum[1] + " " + sum[2] + " " + sum[3]);
		try {
			String sql = "" + " SELECT SEAT_NO FROM TICKET t "
					+ "JOIN MOVIESCHEDULE m ON m.SCHEDULE_NO = t.SCHEDULE_NO "
					+ "JOIN MOVIE m2 ON m2.MOVIE_NO = m.MOVIE_NO "
					+ "JOIN MOVIEHOUSE m3 ON m3.MOVIEHOUSE_NO =m.MOVIEHOUSE_NO "
					+ "JOIN THEATER t2 ON t2.THEATER_NO = m.THEATER_NO "
					+ "JOIN LOCAL l ON l.LOCAL_NO = m3.LOCAL_NO "
					+ "WHERE t.SCHEDULE_NO = ? AND m2.MOVIE_NO = ? AND m3.MOVIEHOUSE_NO = ? AND l.LOCAL_NO = ? ";		
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, key[3]);
			pstmt.setInt(2, key[0]);
			pstmt.setInt(3, key[2]);
			pstmt.setInt(4, key[1]);
			ResultSet rs = pstmt.executeQuery();
			for(int i = 0; i < 24 ; i ++) {
				seat[i] = rs.getInt("SEAT_NO");
			}
			rs.close();
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
			exit();
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
