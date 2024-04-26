package projectPackage;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HeadPanel2 extends JPanel {

	private static final long serialVersionUID = 1L;

	private JTextField textField;

	public HeadPanel2(MainFrame mainFrame) {

		this.setSize(1280, 150);
		this.setPreferredSize(new Dimension(1280, 150));
		this.setBackground(Color.cyan);
		setLayout(null);

		JLabel lblNewLabel = new JLabel("HeadPanel2 --");
		lblNewLabel.setFont(new Font("Adobe 고딕 Std B", Font.PLAIN, 15));
		lblNewLabel.setBounds(24, 10, 246, 64);
		add(lblNewLabel);

		// 추가된 텍스트 필드
		textField = new JTextField();
		textField.setBounds(500, 10, 150, 30);
		add(textField);

		// 검색 버튼
		JButton searchButton = new JButton("Search");
		searchButton.setBounds(660, 10, 90, 30);
		searchButton.addActionListener(e -> {
			// 검색 관련 로직을 여기에 구현
		});
		add(searchButton);

		// 로그인 버튼
		JButton loginButton = new JButton("Log in");
		loginButton.setBounds(760, 10, 90, 30);
		add(loginButton);

		// 회원가입 버튼
		JButton joinButton = new JButton("Join");
		joinButton.setBounds(860, 10, 90, 30);
		add(joinButton);


		JButton btnNewButton = new JButton("New button");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.PageChange(MainFrame.PANELNAME.MAIN);
			}
		});

		btnNewButton.setBounds(24, 66, 127, 41);
		add(btnNewButton);
//-------------------------------------------------//

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.PageChange(MainFrame.PANELNAME.PAGE0);
			}
		});
		btnNewButton_1.setBounds(163, 66, 107, 41);
		add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.PageChange(MainFrame.PANELNAME.PAGE1);
			}
		});
		btnNewButton_2.setBounds(282, 66, 111, 41);
		add(btnNewButton_2);
	}

	class actionDefineClass implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(1111);
		}
	}
}