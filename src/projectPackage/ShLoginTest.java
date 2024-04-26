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

public class ShLoginTest extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	private JTextField txtId;
	private JTextField txtPassword;
	
	public ShLoginTest(MainFrame mainFrame) {

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
		
		txtId = new JTextField();
		txtId.setText("ID");
		txtId.setBounds(560, 247, 160, 21);
		panel.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 50));
		lblNewLabel.setBounds(560, 163, 160, 50);
		panel.add(lblNewLabel);
		
		txtPassword = new JTextField();
		txtPassword.setText("Password");
		txtPassword.setColumns(10);
		txtPassword.setBounds(560, 292, 160, 21);
		panel.add(txtPassword);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton.setBounds(560, 361, 160, 50);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 20));
		btnNewButton_1.setBounds(560, 477, 160, 50);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("아이디가 없으시나요?");
		lblNewLabel_1.setBounds(560, 458, 160, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("CGVING에 오신 것을 환영합니다!");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("푸라닭 젠틀 고딕", Font.BOLD, 30));
		lblNewLabel_2.setBounds(390, 35, 500, 60);
		panel.add(lblNewLabel_2);

		this.setVisible(false);
	}
}
