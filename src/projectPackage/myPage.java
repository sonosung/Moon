package projectPackage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.Icon;

public class myPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	private JTextField myReservation;
	private JTextField inputId;
	private JTextField inputName;
	private JTextField textField;
	private JTextField textField_1;
	
	public myPage(MainFrame mainFrame) {

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
		
		JButton btnNewButton_1 = new JButton("회원탈퇴");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel cgving = new JLabel(new ImageIcon(myPage.class.getResource("/image/ohtani/cgving2.png")));
		cgving.setBounds(540, 20, 200, 42);
		panel.add(cgving);
		btnNewButton_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		btnNewButton_1.setBounds(645, 500, 245, 50);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("홈으로");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(390, 500, 245, 50);
		panel.add(btnNewButton_1_1);
		
		JLabel myRes = new JLabel("예매내역");
		myRes.setHorizontalAlignment(SwingConstants.LEFT);
		myRes.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		myRes.setBounds(390, 410, 60, 30);
		panel.add(myRes);
		
		JLabel myId = new JLabel("아이디");
		myId.setHorizontalAlignment(SwingConstants.LEFT);
		myId.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		myId.setBounds(390, 260, 60, 30);
		panel.add(myId);
		
		JLabel myName = new JLabel("이  름");
		myName.setHorizontalAlignment(SwingConstants.LEFT);
		myName.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		myName.setBounds(390, 210, 60, 30);
		panel.add(myName);
		
		JLabel myPage = new JLabel("마이페이지");
		myPage.setHorizontalAlignment(SwingConstants.CENTER);
		myPage.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		myPage.setBounds(565, 80, 150, 50);
		panel.add(myPage);
		
		myReservation = new JTextField();
		myReservation.setHorizontalAlignment(SwingConstants.LEFT);
		myReservation.setColumns(10);
		myReservation.setBounds(465, 410, 350, 30);
		panel.add(myReservation);
		
		inputId = new JTextField();
		inputId.setHorizontalAlignment(SwingConstants.LEFT);
		inputId.setColumns(10);
		inputId.setBounds(465, 260, 350, 30);
		panel.add(inputId);
		
		inputName = new JTextField();
		inputName.setHorizontalAlignment(SwingConstants.LEFT);
		inputName.setColumns(10);
		inputName.setBounds(465, 210, 350, 30);
		panel.add(inputName);
		
		JLabel lb_user_email = new JLabel("이메일");
		lb_user_email.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lb_user_email.setBounds(390, 310, 57, 30);
		panel.add(lb_user_email);
		
		JLabel lb_user_phone = new JLabel("휴대전화");
		lb_user_phone.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lb_user_phone.setBounds(390, 360, 57, 30);
		panel.add(lb_user_phone);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(465, 360, 350, 30);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(465, 310, 350, 30);
		panel.add(textField_1);
		
		JLabel lb_subTitle = new JLabel("회원정보");
		lb_subTitle.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lb_subTitle.setBounds(390, 180, 130, 20);
		panel.add(lb_subTitle);
		
//		JPanel border = new JPanel();
//		border.setVisible(false);
//		border.setOpaque(false);
//		border.setBorder(new LineBorder(Color.RED));
//		border.setBackground(new Color(224, 255, 255));
//		border.setBounds(346, 75, 587, 512);
//		panel.add(border);
		
//		JLabel ProtLog = new JLabel("");
//		ProtLog.setIcon(new ImageIcon("E:\\KDTFullStackClass\\TeamProject1\\img\\screen\\로그인.png"));
//		ProtLog.setBounds(0, 0, 1280, 650);
//		panel.add(ProtLog);
		

		this.setVisible(false);
	}
}
