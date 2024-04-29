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
import javax.swing.border.LineBorder;

public class ShDeleteID extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	private JTextField textField_3;
	
	public ShDeleteID(MainFrame mainFrame) {

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
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 12));
		btnNewButton_1.setBounds(393, 477, 500, 50);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("회원탈퇴");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		btnNewButton_1_1.setBounds(393, 380, 500, 50);
		panel.add(btnNewButton_1_1);
		
		textField_3 = new JTextField();
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(10);
		textField_3.setBounds(493, 270, 380, 30);
		panel.add(textField_3);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("비밀번호");
		lblNewLabel_1_1_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(421, 274, 60, 20);
		panel.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("회원탈퇴를 위해 비밀번호를 입력해주세요");
		lblNewLabel_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1.setBounds(490, 216, 300, 20);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("회원탈퇴");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(540, 125, 200, 50);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setOpaque(false);
		panel_1_1.setBorder(new LineBorder(new Color(255, 0, 0)));
		panel_1_1.setBackground(new Color(224, 255, 255));
		panel_1_1.setBounds(346, 75, 587, 512);
		panel.add(panel_1_1);
		

		this.setVisible(false);
	}
}
