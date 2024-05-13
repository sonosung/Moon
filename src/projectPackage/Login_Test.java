package projectPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

//import Login_Test.UserDAO;

//import Login_Test.UserDAO;
//import Login_Test.loginVo;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Login_Test extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;
	private JTextField tf_id;
	private JPasswordField pf_password;
	private Login_DAO_Test dao;
	ArrayList<UserInfoVo> list;
	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);

	public Login_Test(MainFrame mainFrame) {
		dao = new Login_DAO_Test();

		this.mainFrame = mainFrame;
		this.setSize(1280, 800 - 150);
		this.setPreferredSize(new Dimension(1280, 800 - 150));
		this.setBackground(bg);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 1280, 650);
		add(panel);
		panel.setLayout(null);

		JLabel cgving = new JLabel(new ImageIcon(TopPanelTest.class.getResource("/image/ohtani/cgving2.png")));
		panel.add(cgving);
		cgving.setBounds(540, 20, 200, 42);

		JLabel lb_login = new JLabel("로그인");
		lb_login.setForeground(Color.WHITE);
		lb_login.setHorizontalAlignment(SwingConstants.CENTER);
		lb_login.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		lb_login.setBounds(502, 115, 275, 50);
		panel.add(lb_login);

		JTextField tf_id = new JTextField(125);
		tf_id.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		tf_id.setColumns(125);
//		tf_id.setForeground(Color.BLACK);
		tf_id.setText("");
		tf_id.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_id.setBounds(390, 210, 500, 30);
		panel.add(tf_id);

//		JPasswordField
		pf_password = new JPasswordField(16);
		pf_password.setBorder(new EmptyBorder(0, 10, 0, 0));
		pf_password.setEchoChar('*');
		pf_password.setBounds(390, 260, 500, 30);
		panel.add(pf_password);
//		JTextField pf_password = new JTextField(125);
//		pf_password.setBorder(new EmptyBorder(0, 10, 0, 0));
//		pf_password.setEchoChar('*');
//		pf_password.setBounds(390, 260, 500, 30);
//		panel.add(pf_password);
//		

		// 회원가입 유도 라벨
		JLabel lb_noId = new JLabel("아이디가 없으시나요?");
		lb_noId.setForeground(Color.WHITE);
		lb_noId.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_noId.setBounds(390, 475, 160, 15);
		panel.add(lb_noId);

		// 로그인 결과 라벨
		JLabel lb_warning = new JLabel("");
		lb_warning.setForeground(Color.WHITE);
		lb_warning.setHorizontalAlignment(SwingConstants.CENTER);
		lb_warning.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_warning.setBounds(390, 310, 500, 30);
		panel.add(lb_warning);

		// 로그인 버튼
		JButton bt_login = new JButton("로그인");
		bt_login = new JButton(new ImageIcon(Login_Test.class.getResource("/image/seungho/lb_login.png")));
		bt_login.setHorizontalTextPosition(SwingConstants.CENTER);
		bt_login.setBounds(390, 360, 500, 50);
		bt_login.setBackground(Color.LIGHT_GRAY);
		bt_login.setFont(new Font("나눔고딕", Font.PLAIN, 12));

		// 로그인 버튼 클릭시, DB와 연동하여 입력값과 출력 그리고 DB정보값과 입력값 비교하여 로그인 성공/실패 유무 판단!
		bt_login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(tf_id.getText() + " : " + pf_password.getPassword());
				String inId = new String(tf_id.getText());
//				String inPw = new String(pf_password.getPassword());

//				System.out.println(inId + " : " + inPw);// 아이디, 패스워드 입력 확인용.
//
				list = dao.list(inId);

				if (list.size() != 0) {
					for (int i = 0; i < list.size(); i++) {
						UserInfoVo data = (UserInfoVo) list.get(i);
						String gid = data.getUser_id();
						String gpwd = data.getUser_Pw();
//						String pw = new String(char[]); 
//								new String(pf_password.getPassword());

						char[] pw =(pf_password.getPassword());


						
						System.out.println(gid + " : " + pw);

//						if (tf_id.getText().equals(gid) && pf_password.getPassword().equals(pw)) {
							if (tf_id.getText().equals(gid) && String.valueOf(pw).equals(gpwd)) {
							System.out.println("로그인이 성공했습니다.");
							mainFrame.PageChange(MainFrame.PANELNAME.MAIN);
						} else {
							System.out.println("로그인이 실패했습니다.");
						}
					}
				} else {
					System.out.println("로그인이 실패했습니다.");
				}

				for (int i = 0; i < list.size(); i++) {
					UserInfoVo data = (UserInfoVo) list.get(i);
					String gid = data.getUser_id();
					String gpwd = data.getUser_Pw();

					System.out.println(gid + " : " + gpwd);
				}
			}

		});

		panel.add(bt_login);

		JButton bt_join = new JButton("");
		bt_join.setIcon(new ImageIcon(Login_Test.class.getResource("/image/seungho/bt_join.png")));
		bt_join.setFont(new Font("나눔고딕", Font.BOLD, 13));
		bt_join.setBounds(390, 500, 500, 50);
		bt_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("회원가입 화면으로 이동"); // 버튼 클릭 확인용.
				mainFrame.PageChange(MainFrame.PANELNAME.CREATE1);
			}
		});
		panel.add(bt_join);

		this.setVisible(false);

	}

}