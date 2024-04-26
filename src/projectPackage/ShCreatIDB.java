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
		lblNewLabel.setBounds(530, 39, 220, 50);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1.setBounds(393, 477, 500, 50);
		panel.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setHorizontalAlignment(SwingConstants.LEFT);
		textField_1.setColumns(10);
		textField_1.setBounds(465, 187, 350, 30);
		panel.add(textField_1);
		
		textField_id = new JTextField();
		textField_id.setHorizontalAlignment(SwingConstants.LEFT);
		textField_id.setColumns(10);
		textField_id.setBounds(465, 239, 350, 30);
		panel.add(textField_id);
		
		textField_pw = new JTextField();
		textField_pw.setHorizontalAlignment(SwingConstants.LEFT);
		textField_pw.setColumns(10);
		textField_pw.setBounds(465, 287, 350, 30);
		panel.add(textField_pw);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1_1_1.setLabelFor(textField_pw);
		lblNewLabel_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1.setBounds(393, 291, 60, 20);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("아이디");
		lblNewLabel_1_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1.setBounds(393, 243, 60, 20);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("이  름");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_1_1_1_1_1.setBounds(393, 191, 60, 20);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("2. 회원정보 입력");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(393, 115, 130, 20);
		panel.add(lblNewLabel_1);

		this.setVisible(false);
	}
}
