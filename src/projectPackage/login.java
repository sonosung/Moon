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

public class login extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	private JTextField txtId;
	private JTextField txtPassword;
	private JButton btnNewButton_2;
	
	public login(MainFrame mainFrame) {

		this.mainFrame = mainFrame;
		this.setSize(1280, 800 - 150);
		this.setPreferredSize(new Dimension(1280, 800 - 150));
		this.setBackground(bg);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 1280, 650);
		add(panel);
		panel.setLayout(null);
		
		JLabel cgving = new JLabel(new ImageIcon(TopPanelTest.class.getResource("/image/ohtani/cgving2.png")));
		panel.add(cgving);
		cgving.setBounds(539, 20, 200, 42);
		
		txtId = new JTextField();
		txtId.setBounds(465, 210, 350, 30);
		panel.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("로그인");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		lblNewLabel.setBounds(502, 80, 275, 50);
		panel.add(lblNewLabel);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(465, 260, 350, 30);
		panel.add(txtPassword);
		
		JButton btnNewButton = new JButton("로그인");
		
//		// 로고 객체 생성
//	      JButton logo;
//	      // 로고 이미지 생성
//	      btnNewButton = new JButton(new ImageIcon("C:/Users/Manic-063/git/AccountManagement/src/1o0.jpg"));
//	      // 로고 이미지 크기 및 위치
//	      logo.setSize(100, 90);
//	      logo.setLocation(60, 60);
	
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.setFont(new Font("나눔고딕", Font.BOLD, 13));
		btnNewButton_1.setBounds(390, 500, 500, 50);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("아이디가 없으시나요?");
		lblNewLabel_1.setBounds(390, 475, 160, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("ID");
		lblNewLabel_3.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(390, 210, 57, 30);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Password");
		lblNewLabel_3_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(390, 260, 57, 30);
		panel.add(lblNewLabel_3_1);
		btnNewButton_2 = new JButton(new ImageIcon("E:\\KDTFullStackClass\\TeamProject1\\img\\button1.png"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setText("로그인");
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2.setPreferredSize(new Dimension(500, 50));
		btnNewButton_2.setMargin(new Insets(0, 0, 0, 0));
		btnNewButton_2.setMinimumSize(new Dimension(500, 50));
		btnNewButton_2.setMaximumSize(new Dimension(500, 50));
		btnNewButton_2.setBounds(390, 360, 500, 50);
		panel.add(btnNewButton_2);
		btnNewButton_2.setBackground(Color.LIGHT_GRAY);
		btnNewButton_2.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		
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
