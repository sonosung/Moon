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
		txtId.setBounds(560, 167, 160, 21);
		panel.add(txtId);
		txtId.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("로그인");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 30));
		lblNewLabel.setBounds(502, 77, 275, 55);
		panel.add(lblNewLabel);
		
		txtPassword = new JTextField();
		txtPassword.setColumns(10);
		txtPassword.setBounds(560, 254, 160, 21);
		panel.add(txtPassword);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		btnNewButton.setBounds(390, 378, 500, 50);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		btnNewButton_1.setBounds(390, 498, 500, 50);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1 = new JLabel("아이디가 없으시나요?");
		lblNewLabel_1.setBounds(390, 456, 160, 15);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_3 = new JLabel("ID");
		lblNewLabel_3.setBounds(390, 167, 57, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Password");
		lblNewLabel_3_1.setBounds(390, 254, 57, 15);
		panel.add(lblNewLabel_3_1);
		
		JPanel border = new JPanel();
		border.setOpaque(false);
		border.setEnabled(false);
		border.setDoubleBuffered(false);
		border.setFocusTraversalKeysEnabled(false);
		border.setBorder(new LineBorder(new Color(255, 51, 51)));
		border.setBounds(346, 75, 587, 512);
		panel.add(border);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("E:\\KDTFullStackClass\\TeamProject1\\img\\screen\\로그인.png"));
		lblNewLabel_2.setBounds(0, 0, 1280, 650);
		panel.add(lblNewLabel_2);

		this.setVisible(false);
	}
}
