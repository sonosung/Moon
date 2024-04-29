package projectPackage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class ShDeleteComplete extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	
	public ShDeleteComplete(MainFrame mainFrame) {

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
		
		JButton btnNewButton_1 = new JButton("홈으로");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		btnNewButton_1.setBounds(390, 423, 500, 50);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("그동안 CGVING을 이용해주셔서 감사합니다!");
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(365, 214, 550, 50);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(UIManager.getBorder("Menu.border"));
		panel_1.setBackground(new Color(224, 255, 255));
		panel_1.setBounds(346, 75, 587, 510);
		panel.add(panel_1);
		

		this.setVisible(false);
	}
}
