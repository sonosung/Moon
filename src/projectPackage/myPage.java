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
		btnNewButton_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		btnNewButton_1.setBounds(647, 498, 285, 50);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("홈으로");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(350, 498, 285, 50);
		panel.add(btnNewButton_1_1);
		
		JLabel myRes = new JLabel("예매내역");
		myRes.setHorizontalAlignment(SwingConstants.LEFT);
		myRes.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		myRes.setBounds(350, 368, 60, 20);
		panel.add(myRes);
		
		JLabel myId = new JLabel("아이디");
		myId.setHorizontalAlignment(SwingConstants.LEFT);
		myId.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		myId.setBounds(350, 258, 60, 20);
		panel.add(myId);
		
		JLabel myName = new JLabel("이  름");
		myName.setHorizontalAlignment(SwingConstants.LEFT);
		myName.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		myName.setBounds(350, 148, 60, 20);
		panel.add(myName);
		
		JLabel myPage = new JLabel("마이페이지");
		myPage.setHorizontalAlignment(SwingConstants.CENTER);
		myPage.setFont(new Font("굴림", Font.BOLD, 20));
		myPage.setBounds(70, 125, 120, 20);
		panel.add(myPage);
		
		myReservation = new JTextField();
		myReservation.setHorizontalAlignment(SwingConstants.LEFT);
		myReservation.setColumns(10);
		myReservation.setBounds(400, 354, 480, 50);
		panel.add(myReservation);
		
		inputId = new JTextField();
		inputId.setHorizontalAlignment(SwingConstants.LEFT);
		inputId.setColumns(10);
		inputId.setBounds(400, 244, 480, 50);
		panel.add(inputId);
		
		inputName = new JTextField();
		inputName.setHorizontalAlignment(SwingConstants.LEFT);
		inputName.setColumns(10);
		inputName.setBounds(400, 134, 480, 50);
		panel.add(inputName);
		
		JPanel border = new JPanel();
		border.setVisible(false);
		border.setOpaque(false);
		border.setBorder(new LineBorder(Color.RED));
		border.setBackground(new Color(224, 255, 255));
		border.setBounds(346, 75, 587, 512);
		panel.add(border);
		
		JLabel ProtLog = new JLabel("");
		ProtLog.setIcon(new ImageIcon("E:\\KDTFullStackClass\\TeamProject1\\img\\screen\\로그인.png"));
		ProtLog.setBounds(0, 0, 1280, 650);
		panel.add(ProtLog);
		

		this.setVisible(false);
	}
}
