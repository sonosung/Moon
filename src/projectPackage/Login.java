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
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;

//import Login_Test.UserDAO;

//import Login_Test.UserDAO;
//import Login_Test.loginVo;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Login extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;
	private JPasswordField pf_password;
	private UserInfo_DAO dao;
	ArrayList<UserInfoVo> list_Id;
	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);

	public Login(MainFrame mainFrame) {
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

		JLabel lb_login = new JLabel("로그인");
		lb_login.setForeground(Color.WHITE);
		lb_login.setHorizontalAlignment(SwingConstants.CENTER);
		lb_login.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		lb_login.setBounds(502, 80, 275, 50);
		panel.add(lb_login);

		JTextField tf_id = new JTextField(125);
		tf_id.setBackground(Color.WHITE);
		tf_id.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		tf_id.setColumns(125);
		tf_id.setText("");
		tf_id.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_id.setBounds(390, 170, 500, 30);
		panel.add(tf_id);

		pf_password = new JPasswordField(16);
		pf_password.setBackground(Color.WHITE);
		pf_password.setBorder(new EmptyBorder(0, 10, 0, 0));
		pf_password.setEchoChar('*');
		pf_password.setBounds(390, 230, 500, 30);
		panel.add(pf_password);

		// "아이디가 없으시나요?" 라벨
		JLabel lb_noId = new JLabel("아이디가 없으시나요?");
		lb_noId.setForeground(Color.WHITE);
		lb_noId.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_noId.setBounds(390, 450, 160, 15);
		panel.add(lb_noId);

		// 로그인 버튼
		JButton bt_login = new JButton("로그인");
		bt_login = new JButton(new ImageIcon(Login.class.getResource("/image/seungho/lb_login.png")));
		bt_login.setHorizontalTextPosition(SwingConstants.CENTER);
		bt_login.setBounds(390, 330, 500, 50);
		bt_login.setBackground(Color.LIGHT_GRAY);
		bt_login.setFont(new Font("나눔고딕", Font.PLAIN, 12));

		// 로그인 버튼 클릭시, DB와 연동하여 입력값과 출력 그리고 DB정보값과 입력값 비교하여 로그인 성공/실패 유무 판단!
		bt_login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String inId = new String(tf_id.getText());
				dao = new UserInfo_DAO();
				list_Id = dao.Login(inId); // DAO 클래스 출력값 호출

				if (list_Id.size() != 0) {
					for (int i = 0; i < list_Id.size(); i++) {
						UserInfoVo data = (UserInfoVo) list_Id.get(i);
						String gid = data.getUserId();
						String gpwd = data.getUserPw();

						char[] pw = (pf_password.getPassword());
						
						System.out.println(gid + " : " + gpwd);
						
						if (tf_id.getText().equals(gid) && String.valueOf(pw).equals(gpwd)) {
							System.out.println("로그인이 성공했습니다.");

							mainFrame.PageChange(MainFrame.PANELNAME.MAIN);
							
						} else {
							System.out.println("로그인이 실패했습니다.");
							JOptionPane.showMessageDialog(null, "아이디나 패스워드가 올바르지 않습니다.", "로그인 실패", 1);
							tf_id.setText("");
							pf_password.setText("");
						}
					}

				} else {
					System.out.println("로그인이 실패했습니다.");
					JOptionPane.showMessageDialog(null, "아이디나 패스워드가 올바르지 않습니다.", "로그인 실패", 1);
					tf_id.setText("");
					pf_password.setText("");
				}
			}
		});
		
		panel.add(bt_login);

		JButton bt_join = new JButton("");
		bt_join.setIcon(new ImageIcon(Login.class.getResource("/image/seungho/bt_join.png")));
		bt_join.setFont(new Font("나눔고딕", Font.BOLD, 13));
		bt_join.setBounds(390, 470, 500, 50);
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