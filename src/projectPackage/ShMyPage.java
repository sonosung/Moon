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

public class ShMyPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	
	public ShMyPage(MainFrame mainFrame) {

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
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1.setBounds(647, 477, 240, 50);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("홈으로");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1_1.setBounds(393, 477, 240, 50);
		panel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("예매내역");
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(393, 291, 60, 20);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("아이디");
		lblNewLabel_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(393, 243, 60, 20);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("이  름");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1_1.setBounds(393, 191, 60, 20);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("마이페이지");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(70, 125, 120, 20);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setColumns(10);
		textField.setBounds(465, 287, 350, 30);
		panel.add(textField);
		
		textField_4 = new JTextField();
		textField_4.setHorizontalAlignment(SwingConstants.LEFT);
		textField_4.setColumns(10);
		textField_4.setBounds(465, 239, 350, 30);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setHorizontalAlignment(SwingConstants.LEFT);
		textField_5.setColumns(10);
		textField_5.setBounds(465, 187, 350, 30);
		panel.add(textField_5);
		

		this.setVisible(false);
	}
}
