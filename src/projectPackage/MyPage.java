package projectPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;

public class MyPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	private JTextField tf_myTicket;
	private JTextField tf_user_id;
	private JTextField tf_user_name;
	private JTextField tf_user_phone;
	private JTextField tf_user_email;

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "C##MOON";
	private String password = "MOON1234";
	private Connection con;
	private Statement stmt;
	private ResultSet rs;

	private UserInfo_DAO dao;

	public MyPage(MainFrame mainFrame, String userId) {
	
		//DAO참조변수 초기화
		dao = new UserInfo_DAO();

		UserInfo_DAO dao = new UserInfo_DAO(); // DAO 인스턴스 생성
		ArrayList<UserInfoVo> userInfoList = dao.Login(userId);

		this.mainFrame = mainFrame;
		this.setSize(1280, 800 - 150);
		this.setPreferredSize(new Dimension(1280, 800 - 150));
		this.setBackground(bg);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 1280, 650);
		add(panel);
		panel.setLayout(null);

		JLabel lb_title_myPage = new JLabel("마이페이지");
		lb_title_myPage.setForeground(Color.WHITE);
		lb_title_myPage.setHorizontalAlignment(SwingConstants.CENTER);
		lb_title_myPage.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		lb_title_myPage.setBounds(565, 80, 150, 50);
		panel.add(lb_title_myPage);

		JLabel lb_subTitle = new JLabel("회원정보");
		lb_subTitle.setForeground(Color.WHITE);
		lb_subTitle.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_subTitle.setBounds(390, 150, 130, 20);
		panel.add(lb_subTitle);

		JLabel lb_user_name = new JLabel("이  름");
		lb_user_name.setForeground(Color.WHITE);
		lb_user_name.setHorizontalAlignment(SwingConstants.LEFT);
		lb_user_name.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_user_name.setBounds(340, 172, 50, 30);
		panel.add(lb_user_name);

		tf_user_name = new JTextField();
		tf_user_name.setText("");
		tf_user_name.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		tf_user_name.setBackground(Color.WHITE);
		tf_user_name.setEditable(false);
		tf_user_name.setColumns(125);
		tf_user_name.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_user_name.setHorizontalAlignment(SwingConstants.LEFT);
		tf_user_name.setBounds(390, 172, 500, 30);
		panel.add(tf_user_name);

		JLabel lb_user_id = new JLabel("아이디");
		lb_user_id.setForeground(Color.WHITE);
		lb_user_id.setHorizontalAlignment(SwingConstants.LEFT);
		lb_user_id.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_user_id.setBounds(340, 226, 50, 30);
		panel.add(lb_user_id);

		tf_user_id = new JTextField();
		tf_user_id.setText("");
		tf_user_id.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		tf_user_id.setBackground(Color.WHITE);
		tf_user_id.setEditable(false);
		tf_user_id.setColumns(125);
		tf_user_id.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_user_id.setHorizontalAlignment(SwingConstants.LEFT);
		tf_user_id.setBounds(390, 226, 500, 30);
		panel.add(tf_user_id);

		JLabel lb_user_email = new JLabel("이메일");
		lb_user_email.setForeground(Color.WHITE);
		lb_user_email.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_user_email.setBounds(340, 280, 50, 30);
		panel.add(lb_user_email);

		tf_user_email = new JTextField();
		tf_user_email.setBackground(Color.WHITE);
		tf_user_email.setHorizontalAlignment(SwingConstants.LEFT);
		tf_user_email.setEditable(false);
		tf_user_email.setColumns(125);
		tf_user_email.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_user_email.setBounds(390, 280, 500, 30);
		panel.add(tf_user_email);

		JLabel lb_user_phone = new JLabel("휴대전화");
		lb_user_phone.setForeground(Color.WHITE);
		lb_user_phone.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_user_phone.setBounds(340, 334, 50, 30);
		panel.add(lb_user_phone);

		tf_user_phone = new JTextField();
		tf_user_phone.setBackground(Color.WHITE);
		tf_user_phone.setHorizontalAlignment(SwingConstants.LEFT);
		tf_user_phone.setEditable(false);
		tf_user_phone.setColumns(125);
		tf_user_phone.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_user_phone.setBounds(390, 334, 500, 30);
		panel.add(tf_user_phone);

		JLabel lb_myTicket = new JLabel("예매내역");
		lb_myTicket.setForeground(Color.WHITE);
		lb_myTicket.setHorizontalAlignment(SwingConstants.LEFT);
		lb_myTicket.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_myTicket.setBounds(340, 388, 50, 30);
		panel.add(lb_myTicket);

		tf_myTicket = new JTextField();
		tf_myTicket.setBackground(Color.WHITE);
		tf_myTicket.setColumns(125);
		tf_myTicket.setEditable(false);
		tf_myTicket.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_myTicket.setHorizontalAlignment(SwingConstants.LEFT);
		tf_myTicket.setBounds(390, 388, 395, 30);
		panel.add(tf_myTicket);

		// 회원탈퇴 버튼
		JButton bt_delete_myPage = new JButton("");
		bt_delete_myPage.setIcon(new ImageIcon(MyPage.class.getResource("/image/seungho/bt_delete.png")));
		bt_delete_myPage.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		bt_delete_myPage.setBounds(390, 470, 500, 50);
		bt_delete_myPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				mainFrame.PageChange(MainFrame.PANELNAME.DELETE1);
			}
		});
		panel.add(bt_delete_myPage);

		// 예매확인 버튼.
		JButton btnNewButtonS = new JButton("");
		btnNewButtonS.setIcon(new ImageIcon(AnCont5_1panel.class.getResource("/image/button/search.png")));
		btnNewButtonS.setBounds(790, 388, 100, 30);
		panel.add(btnNewButtonS);

		btnNewButtonS.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				An_zzz_Go();
			}
		});

		this.setVisible(false);

		if (!userInfoList.isEmpty()) {
			UserInfoVo userInfo = userInfoList.get(0); // 첫 번째 사용자 정보만 사용

			// 사용자 정보를 각각의 JTextField에 설정
			tf_user_name.setText(userInfo.getUserName());
			tf_user_id.setText(userInfo.getUserId());
			tf_user_email.setText(userInfo.getUserEmail());
			tf_user_phone.setText(userInfo.getUserPhone());
			tf_myTicket.setText(Integer.toString(userInfo.getTicketNo()));
		}
	}

	// 예매확인 버튼
	private void An_zzz_Go() {
		String[] jinsung = mainFrame.ansql.Yes();
		mainFrame.Set_jinsung(jinsung);
		mainFrame.PageChange(MainFrame.PANELNAME.YES);
		this.setVisible(false);
	}

	public void showUserInfo(String userId) {
		// UserInfo_DAO 객체 생성
		UserInfo_DAO dao = new UserInfo_DAO();

		// DAO를 사용하여 사용자 정보를 가져옴
		UserInfoVo userInfo = dao.getUserInfo(userId);

		// 가져온 사용자 정보를 JTextField에 설정
		if (userInfo != null) {
			tf_user_name.setText(userInfo.getUserName());
			tf_user_id.setText(userInfo.getUserId());
			tf_user_email.setText(userInfo.getUserEmail());
			tf_user_phone.setText(userInfo.getUserPhone());
			tf_myTicket.setText(Integer.toString(userInfo.getTicketNo()));
		} else {
			System.out.println("사용자 정보가 없음.");

		}

	}

//	private Connection connDB() {
//		try {
//			Class.forName(driver); // JDBC 드라이버 로드
//			System.out.println("jdbc driver loading success.");
//			con = DriverManager.getConnection(url, user, password); // 연결
//			System.out.println("oracle connection success.\n");
//			stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return con;
//	}


//	public ArrayList<UserInfoVo> myPage(String userId) {
//		// 로그인한 사용자의 정보만 필터링하기 위해 WHERE 조건에 userId 추가
////		String sql = "SELECT * FROM USER_INFO WHERE USER_ID = ?";
//		String sql = "SELECT (user_no, user_name, user_pw, user_email, user_phone, ticket_no, seat) FROM USER_INFO ui JOIN TICKET t ON t.USER_NO = ui.USER_NO WHERE USER_ID = ?";
//		ArrayList<UserInfoVo> list_Info = new ArrayList<UserInfoVo>();
//		try {
//			connDB(); // 데이터베이스 연결
//			// SQL문에 userId를 바인딩
//			PreparedStatement pstmt = con.prepareStatement(sql);
//			pstmt.setString(1, userId);
//
//			rs = pstmt.executeQuery(); // 쿼리 실행
//			rs.last();
//			System.out.println("rs.getRow() : " + rs.getRow());
//
//			if (rs.getRow() == 0) {
//				System.out.println("0 row selected...");
//				System.out.println("실행 안됨.");
//			} else {
//				System.out.println(rs.getRow() + " rows selected...");
//				rs.beforeFirst(); // 커서를 첫 번째 레코드 이전으로 이동
//				while (rs.next()) {
//					int userNo = rs.getInt("user_no");
//					String userName = rs.getString("user_name");
//					String userPw = rs.getString("user_pw");
//					String userEmail = rs.getString("user_email");
//					String userPhone = rs.getString("user_phone");
//					int ticketNo = rs.getInt("ticket_no");
//					String seat = rs.getString("seat");
//
//					UserInfoVo data = new UserInfoVo(userNo, userName, userId, userPw, userEmail, userPhone, ticketNo,
//							seat);
//					list_Info.add(data); // 검색 결과를 리스트에 추가
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		return list_Info;
//	}
}