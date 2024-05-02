package projectPackage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Component;
import javax.swing.border.BevelBorder;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;

public class login extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	private JTextField tf_id;
	private JButton bt_login;
	private JPasswordField tf_password;
	
	public login(MainFrame mainFrame) {

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
		
		JLabel cgving = new JLabel(new ImageIcon(TopPanelTest.class.getResource("/image/ohtani/cgving2.png")));
		panel.add(cgving);
		cgving.setBounds(540, 20, 200, 42);
		
		JLabel lb_login = new JLabel("로그인");
		lb_login.setForeground(Color.WHITE);
		lb_login.setHorizontalAlignment(SwingConstants.CENTER);
		lb_login.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		lb_login.setBounds(502, 115, 275, 50);
		panel.add(lb_login);
		
		JLabel lb_id = new JLabel("아이디");
		lb_id.setForeground(Color.WHITE);
		lb_id.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_id.setBounds(390, 210, 57, 30);
		panel.add(lb_id);
		
		tf_id = new JTextField(125);
		tf_id.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_id.setBounds(465, 210, 350, 30);
		panel.add(tf_id);
		tf_id.setColumns(125);
		
		JLabel lb_pw = new JLabel("비밀번호");
		lb_pw.setForeground(Color.WHITE);
		lb_pw.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_pw.setBounds(390, 260, 57, 30);
		panel.add(lb_pw);
		
		JButton bt_login = new JButton("로그인");
		bt_login = new JButton(new ImageIcon(login.class.getResource("/image/seungho/lb_login.png")));
		bt_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
		        setVisible(false);
			}
		});
		
		tf_password = new JPasswordField();
		tf_password.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_password.setEchoChar('*');
		tf_password.setBounds(465, 260, 350, 30);
		panel.add(tf_password);
		bt_login.setHorizontalTextPosition(SwingConstants.CENTER);
		bt_login.setBounds(390, 360, 500, 50);
		panel.add(bt_login);
		bt_login.setBackground(Color.LIGHT_GRAY);
		bt_login.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		
		JLabel lb_noId = new JLabel("아이디가 없으시나요?");
		lb_noId.setForeground(Color.WHITE);
		lb_noId.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_noId.setBounds(390, 475, 160, 15);
		panel.add(lb_noId);
		
		JButton bt_join = new JButton("");
		bt_join.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				createId_1 cr = new createId_1(mainFrame);
				cr.setVisible(false);
		
			}
		});
		bt_join.setIcon(new ImageIcon(login.class.getResource("/image/seungho/bt_join.png")));
		bt_join.setFont(new Font("나눔고딕", Font.BOLD, 13));
		bt_join.setBounds(390, 500, 500, 50);
		panel.add(bt_join);
		
//		JPanel border = new JPanel();
//		border.setOpaque(false);
//		border.setEnabled(false);
//		border.setDoubleBuffered(false);
//		border.setFocusTraversalKeysEnabled(false);
//		border.setBorder(new LineBorder(new Color(255, 51, 51)));
//		border.setBounds(346, 75, 587, 512);
//		panel.add(border);
		
//		JLabel lblNewLabel_2 = new JLabel("New label");
//		lblNewLabel_2.setIcon(new ImageIcon("E:\\KDTFullStackClass\\TeamProject1\\img\\screen\\로그인.png"));
//		lblNewLabel_2.setBounds(0, 0, 1280, 650);
//		panel.add(lblNewLabel_2);

		this.setVisible(false);
	}
}
