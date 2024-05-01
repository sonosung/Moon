package projectPackage;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AnCont3 extends JPanel {
	private MainFrame mainFrame;
	private static final long serialVersionUID = 1L;

	public AnCont3(MainFrame mainFrame) {
		
		this.mainFrame = mainFrame;
		this.setSize(1280,800-150);
		this.setPreferredSize(new Dimension(1280,800-150));
		setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 1280, 650);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(245, 20, 790, 550);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(12, 10, 765, 530);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\style_65e936963ad32.png"));
		lblNewLabel.setBounds(12, 10, 130, 185);
		panel_2.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("영화 제목 정보");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(184, 10, 531, 185);
		panel_2.add(lblNewLabel_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_3.setBounds(12, 205, 741, 315);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 0));
		panel_4.setBounds(12, 10, 715, 295);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\확인 버튼 - 복사본 - 복사본.png"));
		btnNewButton.setBounds(320, 235, 100, 50);
		panel_4.add(btnNewButton);
		ButtonGroup buttonGroup = new ButtonGroup(); // 라디오 버튼 그룹 생성

		for (int i = 0; i <= 2; i++) {
			if(i==0) {
			JRadioButton radioButton = new JRadioButton("신용카드");
			radioButton.setBounds(400, 350, 121, 23);
			panel.add(radioButton); 
			buttonGroup.add(radioButton); 
			}else if(i==1) {JRadioButton radioButton = new JRadioButton("토스페이");
			radioButton.setBounds(400 + i * 150, 350, 121, 23);
			panel.add(radioButton); 
			buttonGroup.add(radioButton); 
				
			}else if(i == 2) {
				JRadioButton radioButton = new JRadioButton("카카오페이");
				radioButton.setBounds(400 + i * 150, 350, 121, 23);
				panel.add(radioButton); 
				buttonGroup.add(radioButton); 
			}
		}
	
        
       
	}
}
