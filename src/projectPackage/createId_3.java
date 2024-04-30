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

public class createId_3 extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	
	public createId_3(MainFrame mainFrame) {

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
		
		JLabel lblNewLabel = new JLabel("회원가입이 완료되었습니다!");
		lblNewLabel.setMinimumSize(new Dimension(81, 23));
		lblNewLabel.setMaximumSize(new Dimension(81, 23));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		lblNewLabel.setBounds(393, 230, 500, 50);
		panel.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("홈으로");
		btnNewButton_1.setPreferredSize(new Dimension(81, 23));
		btnNewButton_1.setMinimumSize(new Dimension(81, 23));
		btnNewButton_1.setMaximumSize(new Dimension(81, 23));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		btnNewButton_1.setBounds(390, 500, 500, 50);
		panel.add(btnNewButton_1);
		
//		JPanel panel_1 = new JPanel();
//		panel_1.setOpaque(false);
//		panel_1.setBorder(new LineBorder(new Color(255, 0, 0)));
//		panel_1.setBackground(new Color(224, 255, 255));
//		panel_1.setBounds(346, 75, 587, 512);
//		panel.add(panel_1);

		this.setVisible(false);
	}
}
