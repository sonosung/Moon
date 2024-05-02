package projectPackage;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnCont2 extends JPanel {
	private MainFrame mainFrame;
	private JPanel contentPane;
	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	    
	public AnCont2(MainFrame mainFrame) {
		
		this.mainFrame = mainFrame;
		this.setSize(1280,800-150);
		this.setPreferredSize(new Dimension(1280,800-150));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 1280, 650);
		this.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openAnCont3Panel();
		    	setVisible(false);
			}
		});
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openAnCont1Panel();
		    	setVisible(false);
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\아르헨티바 백브레이커.png"));
		btnNewButton_2.setBounds(396, 544, 100, 50);
		panel.add(btnNewButton_2);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\우당탕.png"));
		btnNewButton.setBounds(725, 544, 100, 50);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("고른좌석 금액");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(139, 469, 202, 73);
		panel.add(lblNewLabel_1);
		
		
		Choice choice = new Choice();
		choice.setBounds(73, 200, 168, 21);	
		choice.add("1명");
		choice.add("2명");
		choice.add("3명");
		choice.add("4명");
		choice.add("5명");
		choice.add("6명");
		choice.add("7명");
		choice.add("8명");
		choice.setVisible(true);
		panel.add(choice);
		
		JLabel lblNewLabel_2 = new JLabel("    A1");
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBackground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(400, 100, 35, 50);		
		panel.add(lblNewLabel_2);
		
		
		JButton btnNewButton_1 = new JButton("");	
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1.setBounds(400, 100, 50, 50);
		btnNewButton_1.setOpaque(false);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("A2");
		lblNewLabel_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1.setBackground(Color.BLACK);
		lblNewLabel_2_1.setBounds(490, 100, 20, 50);
		panel.add(lblNewLabel_2_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1.setBounds(475, 100, 50, 50);
		btnNewButton_1_1.setOpaque(false);
		panel.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("A3");
		lblNewLabel_2_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1.setBackground(Color.BLACK);
		lblNewLabel_2_1_1.setBounds(565, 100, 20, 50);
		panel.add(lblNewLabel_2_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_1.setBounds(550, 100, 50, 50);
		btnNewButton_1_1_1.setOpaque(false);
		panel.add(btnNewButton_1_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("A4");
		lblNewLabel_2_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_2.setBackground(Color.BLACK);
		lblNewLabel_2_1_2.setBounds(640, 100, 20, 50);
		panel.add(lblNewLabel_2_1_2);
		
		JButton btnNewButton_1_1_2 = new JButton("");
		btnNewButton_1_1_2.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_2.setBounds(625, 100, 50, 50);
		btnNewButton_1_1_2.setOpaque(false);
		panel.add(btnNewButton_1_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("A5");
		lblNewLabel_2_1_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_3.setBackground(Color.BLACK);
		lblNewLabel_2_1_3.setBounds(715, 100, 20, 50);
		panel.add(lblNewLabel_2_1_3);
		
		JButton btnNewButton_1_1_3 = new JButton("");
		btnNewButton_1_1_3.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_3.setBounds(700, 100, 50, 50);
		btnNewButton_1_1_3.setOpaque(false);
		panel.add(btnNewButton_1_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("A6");
		lblNewLabel_2_1_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_4.setBackground(Color.BLACK);
		lblNewLabel_2_1_4.setBounds(790, 100, 20, 50);
		panel.add(lblNewLabel_2_1_4);
		
		JButton btnNewButton_1_1_4 = new JButton("");
		btnNewButton_1_1_4.setBounds(775, 100, 50, 50);
		btnNewButton_1_1_4.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_4.setOpaque(false);
		panel.add(btnNewButton_1_1_4);
		
		JLabel lblNewLabel_2_2 = new JLabel("B1");
		lblNewLabel_2_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_2.setBackground(Color.BLACK);
		lblNewLabel_2_2.setBounds(415, 176, 20, 50);
		panel.add(lblNewLabel_2_2);
		
		JButton btnNewButton_1_2 = new JButton("");
		btnNewButton_1_2.setBounds(400, 176, 50, 50);
		btnNewButton_1_2.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\내자리.png"));
		btnNewButton_1_2.setOpaque(false);
		panel.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("B2");
		lblNewLabel_2_1_5.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_5.setBackground(Color.BLACK);
		lblNewLabel_2_1_5.setBounds(490, 176, 20, 50);
		panel.add(lblNewLabel_2_1_5);
		
		JButton btnNewButton_1_1_5 = new JButton("");
		btnNewButton_1_1_5.setBounds(475, 176, 50, 50);
		btnNewButton_1_1_5.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_5.setOpaque(false);
		panel.add(btnNewButton_1_1_5);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("B3");
		lblNewLabel_2_1_1_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1_1.setBackground(Color.BLACK);
		lblNewLabel_2_1_1_1.setBounds(565, 176, 20, 50);
		panel.add(lblNewLabel_2_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1.setBounds(550, 176, 50, 50);
		btnNewButton_1_1_1_1.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\먹은자리.png"));
		btnNewButton_1_1_1_1.setOpaque(false);
		panel.add(btnNewButton_1_1_1_1);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("B4");
		lblNewLabel_2_1_2_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_2_1.setBackground(Color.BLACK);
		lblNewLabel_2_1_2_1.setBounds(640, 176, 20, 50);
		panel.add(lblNewLabel_2_1_2_1);
		
		JButton btnNewButton_1_1_2_1 = new JButton("");
		btnNewButton_1_1_2_1.setBounds(625, 176, 50, 50);
		btnNewButton_1_1_2_1.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_2_1.setOpaque(false);
		panel.add(btnNewButton_1_1_2_1);
		
		JLabel lblNewLabel_2_1_3_1 = new JLabel("B5");
		lblNewLabel_2_1_3_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_3_1.setBackground(Color.BLACK);
		lblNewLabel_2_1_3_1.setBounds(715, 176, 20, 50);
		panel.add(lblNewLabel_2_1_3_1);
		
		JButton btnNewButton_1_1_3_1 = new JButton("");
		btnNewButton_1_1_3_1.setBounds(700, 176, 50, 50);
		btnNewButton_1_1_3_1.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_3_1.setOpaque(false);
		panel.add(btnNewButton_1_1_3_1);
		
		JLabel lblNewLabel_2_1_4_1 = new JLabel("B6");
		lblNewLabel_2_1_4_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_4_1.setBackground(Color.BLACK);
		lblNewLabel_2_1_4_1.setBounds(790, 176, 20, 50);
		panel.add(lblNewLabel_2_1_4_1);
		
		JButton btnNewButton_1_1_4_1 = new JButton("");
		btnNewButton_1_1_4_1.setBounds(775, 176, 50, 50);
		btnNewButton_1_1_4_1.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_4_1.setOpaque(false);
		panel.add(btnNewButton_1_1_4_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("C1");
		lblNewLabel_2_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_3.setBackground(Color.BLACK);
		lblNewLabel_2_3.setBounds(415, 251, 20, 50);
		panel.add(lblNewLabel_2_3);
		
		JButton btnNewButton_1_3 = new JButton("");
		btnNewButton_1_3.setBounds(400, 251, 50, 50);
		btnNewButton_1_3.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_3.setOpaque(false);
		panel.add(btnNewButton_1_3);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("C2");
		lblNewLabel_2_1_6.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_6.setBackground(Color.BLACK);
		lblNewLabel_2_1_6.setBounds(490, 251, 20, 50);
		panel.add(lblNewLabel_2_1_6);
		
		JButton btnNewButton_1_1_6 = new JButton("");
		btnNewButton_1_1_6.setBounds(475, 251, 50, 50);
		btnNewButton_1_1_6.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_6.setOpaque(false);
		panel.add(btnNewButton_1_1_6);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("C3");
		lblNewLabel_2_1_1_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1_2.setBackground(Color.BLACK);
		lblNewLabel_2_1_1_2.setBounds(565, 251, 20, 50);
		panel.add(lblNewLabel_2_1_1_2);
		
		JButton btnNewButton_1_1_1_2 = new JButton("");
		btnNewButton_1_1_1_2.setBounds(550, 251, 50, 50);
		btnNewButton_1_1_1_2.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_1_2.setOpaque(false);
		panel.add(btnNewButton_1_1_1_2);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("C4");
		lblNewLabel_2_1_2_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_2_2.setBackground(Color.BLACK);
		lblNewLabel_2_1_2_2.setBounds(640, 251, 20, 50);
		panel.add(lblNewLabel_2_1_2_2);
		
		JButton btnNewButton_1_1_2_2 = new JButton("");
		btnNewButton_1_1_2_2.setBounds(625, 251, 50, 50);
		btnNewButton_1_1_2_2.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_2_2.setOpaque(false);
		panel.add(btnNewButton_1_1_2_2);
		
		JLabel lblNewLabel_2_1_3_2 = new JLabel("C5");
		lblNewLabel_2_1_3_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_3_2.setBackground(Color.BLACK);
		lblNewLabel_2_1_3_2.setBounds(715, 251, 20, 50);
		panel.add(lblNewLabel_2_1_3_2);
		
		JButton btnNewButton_1_1_3_2 = new JButton("");
		btnNewButton_1_1_3_2.setBounds(700, 251, 50, 50);
		btnNewButton_1_1_3_2.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_3_2.setOpaque(false);
		panel.add(btnNewButton_1_1_3_2);
		
		JLabel lblNewLabel_2_1_4_2 = new JLabel("C6");
		lblNewLabel_2_1_4_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_4_2.setBackground(Color.BLACK);
		lblNewLabel_2_1_4_2.setBounds(790, 251, 20, 50);
		panel.add(lblNewLabel_2_1_4_2);
		
		JButton btnNewButton_1_1_4_2 = new JButton("");
		btnNewButton_1_1_4_2.setBounds(775, 251, 50, 50);
		btnNewButton_1_1_4_2.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_4_2.setOpaque(false);
		panel.add(btnNewButton_1_1_4_2);
		
		JLabel lblNewLabel_2_4 = new JLabel("D1");
		lblNewLabel_2_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_4.setBackground(Color.BLACK);
		lblNewLabel_2_4.setBounds(415, 328, 20, 50);
		panel.add(lblNewLabel_2_4);
		
		JButton btnNewButton_1_4 = new JButton("");
		btnNewButton_1_4.setBounds(400, 328, 50, 50);
		btnNewButton_1_4.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_4.setOpaque(false);
		panel.add(btnNewButton_1_4);
		
		JLabel lblNewLabel_2_1_7 = new JLabel("D2");
		lblNewLabel_2_1_7.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_7.setBackground(Color.BLACK);
		lblNewLabel_2_1_7.setBounds(490, 328, 20, 50);
		panel.add(lblNewLabel_2_1_7);
		
		JButton btnNewButton_1_1_7 = new JButton("");
		btnNewButton_1_1_7.setBounds(475, 328, 50, 50);
		btnNewButton_1_1_7.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_7.setOpaque(false);
		panel.add(btnNewButton_1_1_7);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("D3");
		lblNewLabel_2_1_1_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_1_3.setBackground(Color.BLACK);
		lblNewLabel_2_1_1_3.setBounds(565, 328, 20, 50);
		panel.add(lblNewLabel_2_1_1_3);
		
		JButton btnNewButton_1_1_1_3 = new JButton("");
		btnNewButton_1_1_1_3.setBounds(550, 328, 50, 50);
		btnNewButton_1_1_1_3.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_1_3.setOpaque(false);
		panel.add(btnNewButton_1_1_1_3);
		
		JLabel lblNewLabel_2_1_2_3 = new JLabel("D4");
		lblNewLabel_2_1_2_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_2_3.setBackground(Color.BLACK);
		lblNewLabel_2_1_2_3.setBounds(640, 328, 20, 50);
		panel.add(lblNewLabel_2_1_2_3);
		
		JButton btnNewButton_1_1_2_3 = new JButton("");
		btnNewButton_1_1_2_3.setBounds(625, 328, 50, 50);
		btnNewButton_1_1_2_3.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_2_3.setOpaque(false);
		panel.add(btnNewButton_1_1_2_3);
		
		JLabel lblNewLabel_2_1_3_3 = new JLabel("D5");
		lblNewLabel_2_1_3_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_3_3.setBackground(Color.BLACK);
		lblNewLabel_2_1_3_3.setBounds(715, 328, 20, 50);
		panel.add(lblNewLabel_2_1_3_3);
		
		JButton btnNewButton_1_1_3_3 = new JButton("");
		btnNewButton_1_1_3_3.setBounds(700, 328, 50, 50);
		btnNewButton_1_1_3_3.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_3_3.setOpaque(false);
		panel.add(btnNewButton_1_1_3_3);
		
		JLabel lblNewLabel_2_1_4_3 = new JLabel("D6");
		lblNewLabel_2_1_4_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_2_1_4_3.setBackground(Color.BLACK);
		lblNewLabel_2_1_4_3.setBounds(790, 328, 20, 50);
		panel.add(lblNewLabel_2_1_4_3);
		
		JButton btnNewButton_1_1_4_3 = new JButton("");
		btnNewButton_1_1_4_3.setBounds(775, 328, 50, 50);
		btnNewButton_1_1_4_3.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\공석.png"));
		btnNewButton_1_1_4_3.setOpaque(false);
		panel.add(btnNewButton_1_1_4_3);
		
		JLabel lblNewLabel_3 = new JLabel("좌석을 선택하시오");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(73, 165, 168, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\1231231232131234124123.png"));
		lblNewLabel.setBounds(0, 0, 1280, 650);
		panel.add(lblNewLabel);		
		
		this.setVisible(false);
	}
	private void openAnCont1Panel() {
        AnCont1 anCont1Panel = new AnCont1(mainFrame);
        mainFrame.PageChange(MainFrame.PANELNAME.PAGE0); 
    }
	
	private void openAnCont3Panel() {
        AnCont2 anCont3Panel = new AnCont2(mainFrame);
        mainFrame.PageChange(MainFrame.PANELNAME.PAGE2); 
    }
	
}
