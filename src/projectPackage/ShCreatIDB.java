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
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class ShCreatIDB extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	private JTextField textField_1;
	private JTextField textField_id;
	private JTextField textField_pw;
	
	public ShCreatIDB(MainFrame mainFrame) {

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
		
		JLabel lblNewLabel = new JLabel("회원가입");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 50));
		lblNewLabel.setBounds(532, 187, 220, 50);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		btnNewButton_1.setBounds(390, 477, 500, 50);
		panel.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setColumns(10);
		textField_1.setBounds(462, 299, 350, 30);
		panel.add(textField_1);
		
		textField_id = new JTextField();
		textField_id.setHorizontalAlignment(SwingConstants.LEFT);
		textField_id.setColumns(10);
		textField_id.setBounds(462, 351, 350, 30);
		panel.add(textField_id);
		
		textField_pw = new JTextField();
		textField_pw.setHorizontalAlignment(SwingConstants.LEFT);
		textField_pw.setColumns(10);
		textField_pw.setBounds(462, 399, 350, 30);
		panel.add(textField_pw);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1_1_1.setLabelFor(textField_pw);
		lblNewLabel_1_1_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(390, 403, 60, 20);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("아이디");
		lblNewLabel_1_1_1_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1.setBounds(390, 355, 60, 20);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("이  름");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1.setBounds(390, 303, 60, 20);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("2. 회원정보 입력");
		lblNewLabel_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(390, 227, 130, 20);
		panel.add(lblNewLabel_1);
		
		JPanel border = new JPanel();
		border.setOpaque(false);
		border.setBorder(new LineBorder(new Color(255, 0, 0)));
		border.setBackground(new Color(224, 255, 255));
		border.setBounds(346, 75, 587, 512);
		panel.add(border);
		
		JLabel logo = new JLabel("");
		logo.setOpaque(true);
		Image img = new ImageIcon(this.getClass().getResource("/cgving.png")).getImage();
		logo.setIcon(new ImageIcon(img));
		logo.setBounds(211, 0, 889, 190);
		panel.add(logo);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\KDTFullStackClass\\TeamProject1\\img\\screen\\로그인2.png"));
		lblNewLabel_2.setBounds(0, 0, 1280, 650);
		panel.add(lblNewLabel_2);

		this.setVisible(false);
	}
}
