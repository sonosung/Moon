package projectPackage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.Icon;
import java.awt.Rectangle;
import javax.swing.border.EmptyBorder;
import javax.swing.DropMode;
import javax.swing.JPasswordField;

public class CreateId_2 extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;
	private Login_DAO_Test dao;
	private connDB con;

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	private JTextField tf_user_name;
	private JTextField tf_user_id;
	private JTextField tf_user_email;
	private JTextField tf_user_phone;
	private JPasswordField tf_user_pw;
	ArrayList<UserInfoVo> list;
	
	public CreateId_2(MainFrame mainFrame) {
		dao = new Login_DAO_Test();
		con = new connDB();
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
		
		JLabel lb_MainTitle = new JLabel("회원가입");
		lb_MainTitle.setForeground(Color.WHITE);
		lb_MainTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lb_MainTitle.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		lb_MainTitle.setBounds(530, 80, 220, 50);
		panel.add(lb_MainTitle);
		
		JLabel lb_subTitle = new JLabel("2. 회원정보 입력");
		lb_subTitle.setForeground(Color.WHITE);
		lb_subTitle.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_subTitle.setBounds(390, 150, 130, 20);
		panel.add(lb_subTitle);
		
		JLabel lb_user_name = new JLabel("이  름");
		lb_user_name.setForeground(Color.WHITE);
		lb_user_name.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_user_name.setBounds(340, 172, 50, 30);
		panel.add(lb_user_name);
		
		tf_user_name = new JTextField();
		tf_user_name.setDropMode(DropMode.INSERT);
		tf_user_name.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_user_name.setHorizontalAlignment(SwingConstants.LEFT);
		tf_user_name.setColumns(125);
		tf_user_name.setBounds(390, 172, 500, 30);
		tf_user_name.setText("");
		panel.add(tf_user_name);
		
		JLabel lb_user_id = new JLabel("아이디");
		lb_user_id.setForeground(Color.WHITE);
		lb_user_id.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_user_id.setBounds(340, 226, 50, 30);
		panel.add(lb_user_id);
		
		tf_user_id = new JTextField();
		tf_user_id.setDropMode(DropMode.INSERT);
		tf_user_id.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_user_id.setHorizontalAlignment(SwingConstants.LEFT);
		tf_user_id.setColumns(125);
		tf_user_id.setBounds(390, 226, 500, 30);
		panel.add(tf_user_id);

		JLabel lb_user_pw = new JLabel("비밀번호");
		lb_user_pw.setForeground(Color.WHITE);
		lb_user_pw.setLabelFor(tf_user_pw);
		lb_user_pw.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_user_pw.setBounds(340, 280, 50, 30);
		panel.add(lb_user_pw);
		
		tf_user_pw = new JPasswordField();
		tf_user_pw.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_user_pw.setEchoChar('*');
		tf_user_pw.setBounds(390, 280, 500, 30);
		panel.add(tf_user_pw);
		

		JLabel lb_user_email = new JLabel("이메일");
		lb_user_email.setForeground(Color.WHITE);
		lb_user_email.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_user_email.setBounds(340, 334, 50, 30);
		panel.add(lb_user_email);
		
		tf_user_email = new JTextField();
		tf_user_email.setDropMode(DropMode.INSERT);
		tf_user_email.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_user_email.setBounds(390, 334, 500, 30);
		panel.add(tf_user_email);
		tf_user_email.setColumns(125);
		
		JLabel lb_user_phone = new JLabel("휴대전화");
		lb_user_phone.setForeground(Color.WHITE);
		lb_user_phone.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_user_phone.setBounds(340, 388, 50, 30);
		panel.add(lb_user_phone);
		
		tf_user_phone = new JTextField();
		tf_user_phone.setDropMode(DropMode.INSERT);
		tf_user_phone.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_user_phone.setBounds(390, 388, 500, 30);
		panel.add(tf_user_phone);
		tf_user_phone.setColumns(125);
		
		JButton bt_join = new JButton("");
		bt_join.setIcon(new ImageIcon(CreateId_2.class.getResource("/image/seungho/bt_join2.png")));
		
		//회원가입 버튼 클릭시 텍스트필드 값 출력 확인
		bt_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String uName = new String(tf_user_name.getText());
				String uId = new String(tf_user_id.getText());
				String uPw = new String(tf_user_pw.getPassword());
				String uEmail = new String(tf_user_email.getText());
				String uPhone = new String(tf_user_phone.getText());
				
				Connection con = mainFrame.getConnection(url, user, password);
				
				list = dao.list(uName, uId, uPw, uEmail, uPhone);
				
				System.out.println(uName + "\n" + uId + "\n" + uPw+ "\n" + uEmail + "\n" + uPhone);//아이디, 패스워드 입력 확인.
				
				System.out.println("회원가입 완료 페이지로 이동");
				mainFrame.PageChange(MainFrame.PANELNAME.JOIN3);
				
				tf_user_name.setText("");
				tf_user_id.setText("");
				tf_user_pw.setText("");
				tf_user_email.setText("");
				tf_user_phone.setText("");
			}
		});
		bt_join.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		bt_join.setBounds(390, 470, 500, 50);
		panel.add(bt_join);

		this.setVisible(false);
	}

}
