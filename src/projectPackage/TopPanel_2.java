package projectPackage;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.EmptyBorder;

public class TopPanel_2 extends JPanel {
	private static final long serialVersionUID = 1L;
	private JTextField tf_search;
	private MainFrame mainFrame;
	private String userId;
	
	public TopPanel_2(MainFrame mainFrame) {
		
		setLayout(null);
		this.mainFrame = mainFrame;
		this.setSize(1280, 150);
		this.setPreferredSize(new Dimension(1280, 150));

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 1280, 150);
		panel_1.setLayout(null);
		add(panel_1);

		String userId = Session.getInstance().getUserId();

		JLabel lblNewLabel_1 = new JLabel(userId + "님 환영합니다!");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBorder(new EmptyBorder(0, 0, 0, 10));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("NanumGothic", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(962, 20, 200, 32);
		panel_1.add(lblNewLabel_1);

		// 로고 이미지
		JLabel logo = new JLabel(new ImageIcon(TopPanel.class.getResource("/image/ohtani/cgving2.png")));
		logo.setBounds(45, 48, 200, 51);
		panel_1.add(logo);
		logo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainFrame.PageChange(MainFrame.PANELNAME.MAIN);
			}
		});

		JLabel lblNewLabel = new JLabel("C U L T U R E P L E X");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 16));
		lblNewLabel.setBounds(246, 77, 174, 15);
		panel_1.add(lblNewLabel);

		// 검색창
		tf_search = new JTextField();
		tf_search.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_search.setBounds(953, 101, 250, 21);
		panel_1.add(tf_search);
		tf_search.setColumns(40);

		// 검색 버튼
		JButton btn_search = new JButton("");
		btn_search.setBorderPainted(false);
		btn_search.setIcon(new ImageIcon(TopPanel.class.getResource("/image/button/search_s.png")));
		btn_search.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 14));
		btn_search.setBounds(1209, 92, 32, 32);
		panel_1.add(btn_search);

		// 검색창에 영화이름 입력후 버튼 클릭시, 해당 영화의 팝업 출력. 해당영화 없을 시 예외처리.
		btn_search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String searchText = tf_search.getText().toLowerCase();
				switch (searchText) {
				case "범죄도시4":
					new CrimePopup().setVisible(true);
					break;
				case "쿵푸팬더4":
					new KungfuPopup().setVisible(true);
					break;
				case "스턴트맨":
					new StuntPopup().setVisible(true);
					break;
				case "챌린저스":
					new ChalPopup().setVisible(true);
					break;
				case "몬스터 프렌즈":
					new MonPopup().setVisible(true);
					break;
				default:
					JOptionPane.showMessageDialog(null, "검색 결과가 없습니다.");
					break;
				}
			}
		});

		// 로그아웃 버튼
		JButton bt_logout = new JButton("");
		bt_logout.setForeground(Color.WHITE);
		bt_logout.setIcon(new ImageIcon(TopPanel.class.getResource("/image/button/logout_s.png")));
		bt_logout.setBounds(1170, 20, 32, 32);
		bt_logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				Session.getInstance().resetSession();
				mainFrame.switchToTopPanel();
				mainFrame.PageChange(MainFrame.PANELNAME.MAIN);
			}
		});
		panel_1.add(bt_logout);

		// 마이페이지 버튼
		JButton btn_myPage = new JButton("");
		btn_myPage.setBounds(1209, 20, 32, 32);
		btn_myPage.setIcon(new ImageIcon(TopPanel.class.getResource("/image/button/mypage_s.png")));
		btn_myPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.PageChange(MainFrame.PANELNAME.MYPAGE);
			}
		});
		panel_1.add(btn_myPage);

		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setIcon(new ImageIcon(TopPanel.class.getResource("/image/button/reserve.png")));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.PageChange(MainFrame.PANELNAME.TICKETING);
			}
		});
		btnNewButton_5.setBounds(784, 91, 110, 40);
		panel_1.add(btnNewButton_5);
	}
	public void loginSuccessful(LoginEvent event) {
		// 로그인 클래스에서 로그인 성공시, loginSuccessful 메소드를 호출.
		System.out.println("로그인 클래스에서 로그인 성공하여, 메인프레임의 loginSuccessful 메소드를 호출.");
		
		//현재 로그인된 사용자의 아이디와 user_no를 가져옴.
		String userId = event.getUserId();
		int userNo = event.getUserNo();
		System.out.println(userId + "님 환영합니다. 사용자 번호: " + userNo);
		
		//세션 클래스에 현재 입력된 사용자의 아이디 호출.
		Session.getInstance().setUserId(userId);
		System.out.println("userId : " + userId);
	}
}