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
import javax.swing.border.LineBorder;
import javax.swing.Icon;

public class deleteId_2 extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	Color btcolor = new Color(0x276bf0);
	
	public deleteId_2(MainFrame mainFrame) {

		this.mainFrame = mainFrame;
		this.setSize(1280, 800 - 150);
		this.setPreferredSize(new Dimension(1280, 800 - 150));
		this.setBackground(bg);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 1280, 650);
		add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("홈으로");
		btnNewButton_1.setBackground(UIManager.getColor("Button.background"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel imageLabel = new JLabel((Icon) null);
		imageLabel.setBounds(528, 35, 200, 42);
		panel.add(imageLabel);
		btnNewButton_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		btnNewButton_1.setBounds(390, 500, 500, 50);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("그동안 CGVING을 이용해주셔서 감사합니다!");
		lblNewLabel_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(365, 230, 550, 50);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
//		JPanel panel_1 = new JPanel();
//		panel_1.setOpaque(false);
//		panel_1.setBorder(new LineBorder(new Color(255, 0, 0)));
//		panel_1.setBackground(new Color(224, 255, 255));
//		panel_1.setBounds(346, 75, 587, 512);
//		panel.add(panel_1);
		

		this.setVisible(false);
	}
}
