package projectPackage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		
        ButtonGroup buttonGroup = new ButtonGroup(); // 라디오 버튼 그룹 생성

        // 라디오 버튼 추가
        JRadioButton radioButton1 = new JRadioButton("신용카드");
        radioButton1.setBounds(400, 350, 121, 23);
        panel.add(radioButton1); 
        buttonGroup.add(radioButton1); 

        JRadioButton radioButton2 = new JRadioButton("토스페이");
        radioButton2.setBounds(550, 350, 121, 23);
        panel.add(radioButton2); 
        buttonGroup.add(radioButton2); 

        JRadioButton radioButton3 = new JRadioButton("카카오페이");
        radioButton3.setBounds(700, 350, 121, 23);
        panel.add(radioButton3); 
        buttonGroup.add(radioButton3); 
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(245, 20, 790, 550);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(12, 10, 765, 530);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		

        this.setVisible(false);  
		
		
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
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openAnCont4Panel();
		    	setVisible(false);
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\우당탕.png"));
		btnNewButton.setBounds(603, 235, 100, 50);
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openAnCont2Panel();
		    	setVisible(false);
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\아르헨티바 백브레이커.png"));
		btnNewButton_2.setBounds(12, 235, 100, 50);
		panel_4.add(btnNewButton_2);
		
	
	
		this.setVisible(false);
       
	}
	private void openAnCont4Panel() {
        AnCont4 anCont4Panel = new AnCont4(mainFrame);
        mainFrame.PageChange(MainFrame.PANELNAME.TICKET); 
    }
	
	private void openAnCont2Panel() {
        AnCont4 anCont2Panel = new AnCont4(mainFrame);
        mainFrame.PageChange(MainFrame.PANELNAME.SELECT); 
    }
	
}
