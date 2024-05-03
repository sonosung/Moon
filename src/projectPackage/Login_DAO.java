package projectPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Login_DAO {
    String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@//localhost:1521/XE";
    String user = "c##green";
    String password = "green1234";

    private Connection con;
    private Statement stmt;
    private ResultSet rs;

    // 특정 사용자 정보 검색
    public ArrayList<UserInfoVo> list(String pid) {
        ArrayList<UserInfoVo> list = new ArrayList<UserInfoVo>();

        try {
            connDB(); // 데이터베이스 연결

            String query = "SELECT * FROM login";
            if (pid != null) {
                query += " where id='" + pid + "'"; // ID로 필터링
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
                    String id = rs.getString("id");
                    String pwd = rs.getString("pwd");

                    UserInfoVo data = new UserInfoVo(0, id, pwd, pwd, pwd, pwd, 0);
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