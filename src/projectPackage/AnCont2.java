package projectPackage;

import java.awt.Choice;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;

public class AnCont2 extends JPanel {
	private MainFrame mainFrame;
	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	int A1 = 0, A2 = 0, A3 = 0, A4 = 0, A5 = 0, A6 = 0,
			B1 = 0, B2 = 0, B3 = 0, B4 = 0, B5 = 0, B6 = 0,
			C1 = 0, C2 = 0, C3 = 0, C4 = 0, C5 = 0, C6 = 0,
			D1 = 0, D2 = 0, D3 = 0, D4 = 0, D5 = 0, D6 = 0;

	/**
	 * Create the panel.
	 */
	    
	public AnCont2(MainFrame mainFrame) {
		
		this.mainFrame = mainFrame;
		this.setSize(1280,800-150);
		this.setPreferredSize(new Dimension(1280,800-150));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
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
		
		btnNewButton_2.setIcon(new ImageIcon(AnCont2.class.getResource("/image/button/back.png")));
		btnNewButton_2.setBounds(396, 544, 110, 42);
		panel.add(btnNewButton_2);
		btnNewButton.setIcon(new ImageIcon(AnCont2.class.getResource("/image/button/select.png")));
		btnNewButton.setBounds(737, 544, 110, 42);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("선택 좌석 + 금액");
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
		
		
		RoundedButton_2 seat_A1 = new RoundedButton_2("A1");	
		seat_A1.setBounds(400, 100, 50, 50);
		seat_A1.setOpaque(false);
		seat_A1.setBackground(Color.DARK_GRAY);
		panel.add(seat_A1);
		seat_A1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				if(A1 % 2 == 0) {
					A1++;
					seat_A1.setBackground(Color.YELLOW);
				}else {
					A1 += 1;
					seat_A1.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_A2 = new RoundedButton_2("A2");
		seat_A2.setBounds(475, 100, 50, 50);
		seat_A2.setOpaque(false);
		seat_A2.setBackground(Color.DARK_GRAY);
		panel.add(seat_A2);
		seat_A2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(A2 % 2 == 0) {
					A2++;
					seat_A2.setBackground(Color.YELLOW);
				}else {
					A2 += 1;
					seat_A2.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_A3 = new RoundedButton_2("A3");
		seat_A3.setBounds(550, 100, 50, 50);
		seat_A3.setOpaque(false);
		seat_A3.setBackground(Color.DARK_GRAY);
		panel.add(seat_A3);
		seat_A3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(A3 % 2 == 0) {
					A3++;
					seat_A3.setBackground(Color.YELLOW);
				}else {
					A3 += 1;
					seat_A3.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_A4 = new RoundedButton_2("A4");
		seat_A4.setBounds(625, 100, 50, 50);
		seat_A4.setOpaque(false);
		seat_A4.setBackground(Color.DARK_GRAY);
		panel.add(seat_A4);
		seat_A4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(A4 % 2 == 0) {
					A4++;
					seat_A4.setBackground(Color.YELLOW);
				}else {
					A4 += 1;
					seat_A4.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_A5 = new RoundedButton_2("A5");
		seat_A5.setBounds(700, 100, 50, 50);
		seat_A5.setOpaque(false);
		seat_A5.setBackground(Color.DARK_GRAY);
		panel.add(seat_A5);
		seat_A5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(A5 % 2 == 0) {
					A5++;
					seat_A5.setBackground(Color.YELLOW);
				}else {
					A5 += 1;
					seat_A5.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_A6 = new RoundedButton_2("A6");
		seat_A6.setBounds(775, 100, 50, 50);
		seat_A6.setOpaque(false);
		seat_A6.setBackground(Color.DARK_GRAY);
		panel.add(seat_A6);
		seat_A6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(A6 % 2 == 0) {
					A6++;
					seat_A6.setBackground(Color.YELLOW);
				}else {
					A6 += 1;
					seat_A6.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_B1 = new RoundedButton_2("B1");
		seat_B1.setBounds(400, 175, 50, 50);
		seat_B1.setOpaque(false);
		seat_B1.setBackground(Color.DARK_GRAY);
		panel.add(seat_B1);
		seat_B1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(B1 % 2 == 0) {
					B1++;
					seat_B1.setBackground(Color.YELLOW);
				}else {
					B1 += 1;
					seat_B1.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_B2 = new RoundedButton_2("B2");
		seat_B2.setBounds(475, 175, 50, 50);
		seat_B2.setOpaque(false);
		seat_B2.setBackground(Color.DARK_GRAY);
		panel.add(seat_B2);
		seat_B2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(B2 % 2 == 0) {
					B2++;
					seat_B2.setBackground(Color.YELLOW);
				}else {
					B2 += 1;
					seat_B2.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_B3 = new RoundedButton_2("B3");
		seat_B3.setBounds(550, 175, 50, 50);
		seat_B3.setOpaque(false);
		seat_B3.setBackground(Color.DARK_GRAY);
		panel.add(seat_B3);
		seat_B3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(B3 % 2 == 0) {
					B3++;
					seat_B3.setBackground(Color.YELLOW);
				}else {
					B3 += 1;
					seat_B3.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_B4 = new RoundedButton_2("B4");
		seat_B4.setBounds(625, 175, 50, 50);
		seat_B4.setOpaque(false);
		seat_B4.setBackground(Color.DARK_GRAY);
		panel.add(seat_B4);
		seat_B4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(B4 % 2 == 0) {
					B4++;
					seat_B4.setBackground(Color.YELLOW);
				}else {
					B4 += 1;
					seat_B4.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_B5 = new RoundedButton_2("B5");
		seat_B5.setBounds(700, 175, 50, 50);
		seat_B5.setOpaque(false);
		seat_B5.setBackground(Color.DARK_GRAY);
		panel.add(seat_B5);
		seat_B5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(B5 % 2 == 0) {
					B5++;
					seat_B5.setBackground(Color.YELLOW);
				}else {
					B5 += 1;
					seat_B5.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_B6 = new RoundedButton_2("B6");
		seat_B6.setBounds(775, 175, 50, 50);
		seat_B6.setOpaque(false);
		seat_B6.setBackground(Color.DARK_GRAY);
		panel.add(seat_B6);
		seat_B6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(B6 % 2 == 0) {
					B6++;
					seat_B6.setBackground(Color.YELLOW);
				}else {
					B6 += 1;
					seat_B6.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_C1 = new RoundedButton_2("C1");	
		seat_C1.setBounds(400, 250, 50, 50);
		seat_C1.setOpaque(false);
		seat_C1.setBackground(Color.DARK_GRAY);
		panel.add(seat_C1);
		seat_C1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {	
				if(C1 % 2 == 0) {
					C1++;
					seat_C1.setBackground(Color.YELLOW);
				}else {
					C1 += 1;
					seat_C1.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_C2 = new RoundedButton_2("C2");
		seat_C2.setBounds(475, 250, 50, 50);
		seat_C2.setOpaque(false);
		seat_C2.setBackground(Color.DARK_GRAY);
		panel.add(seat_C2);
		seat_C2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(C2 % 2 == 0) {
					C2++;
					seat_C2.setBackground(Color.YELLOW);
				}else {
					C2 += 1;
					seat_C2.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_C3 = new RoundedButton_2("C3");
		seat_C3.setBounds(550, 250, 50, 50);
		seat_C3.setOpaque(false);
		seat_C3.setBackground(Color.DARK_GRAY);
		panel.add(seat_C3);
		seat_C3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(C3 % 2 == 0) {
					C3++;
					seat_C3.setBackground(Color.YELLOW);
				}else {
					C3 += 1;
					seat_C3.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_C4 = new RoundedButton_2("C4");
		seat_C4.setBounds(625, 250, 50, 50);
		seat_C4.setOpaque(false);
		seat_C4.setBackground(Color.DARK_GRAY);
		panel.add(seat_C4);
		seat_C4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(C4 % 2 == 0) {
					C4++;
					seat_C4.setBackground(Color.YELLOW);
				}else {
					C4 += 1;
					seat_C4.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_C5 = new RoundedButton_2("C5");
		seat_C5.setBounds(700, 250, 50, 50);
		seat_C5.setOpaque(false);
		seat_C5.setBackground(Color.DARK_GRAY);
		panel.add(seat_C5);
		seat_C5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(C5 % 2 == 0) {
					C5++;
					seat_C5.setBackground(Color.YELLOW);
				}else {
					C5 += 1;
					seat_C5.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_C6 = new RoundedButton_2("C6");
		seat_C6.setBounds(775, 250, 50, 50);
		seat_C6.setOpaque(false);
		seat_C6.setBackground(Color.DARK_GRAY);
		panel.add(seat_C6);
		seat_C6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(C6 % 2 == 0) {
					C6++;
					seat_C6.setBackground(Color.YELLOW);
				}else {
					C6 += 1;
					seat_C6.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_D1 = new RoundedButton_2("D1");
		seat_D1.setBounds(400, 325, 50, 50);
		seat_D1.setOpaque(false);
		seat_D1.setBackground(Color.DARK_GRAY);
		panel.add(seat_D1);
		seat_D1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(D1 % 2 == 0) {
					D1++;
					seat_D1.setBackground(Color.YELLOW);
				}else {
					D1 += 1;
					seat_D1.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_D2 = new RoundedButton_2("D2");
		seat_D2.setBounds(475, 325, 50, 50);
		seat_D2.setOpaque(false);
		seat_D2.setBackground(Color.DARK_GRAY);
		panel.add(seat_D2);
		seat_D2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(D2 % 2 == 0) {
					D2++;
					seat_D2.setBackground(Color.YELLOW);
				}else {
					D2 += 1;
					seat_D2.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_D3 = new RoundedButton_2("D3");
		seat_D3.setBounds(550, 325, 50, 50);
		seat_D3.setOpaque(false);
		seat_D3.setBackground(Color.DARK_GRAY);
		panel.add(seat_D3);
		seat_D3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(D3 % 2 == 0) {
					D3++;
					seat_D3.setBackground(Color.YELLOW);
				}else {
					D3 += 1;
					seat_D3.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_D4 = new RoundedButton_2("D4");
		seat_D4.setBounds(625, 325, 50, 50);
		seat_D4.setOpaque(false);
		seat_D4.setBackground(Color.DARK_GRAY);
		panel.add(seat_D4);
		seat_D4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(D4 % 2 == 0) {
					D4++;
					seat_D4.setBackground(Color.YELLOW);
				}else {
					D4 += 1;
					seat_D4.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_D5 = new RoundedButton_2("D5");
		seat_D5.setBounds(700, 325, 50, 50);
		seat_D5.setOpaque(false);
		seat_D5.setBackground(Color.DARK_GRAY);
		panel.add(seat_D5);
		seat_D5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(D5 % 2 == 0) {
					D5++;
					seat_D5.setBackground(Color.YELLOW);
				}else {
					D5 += 1;
					seat_D5.setBackground(Color.DARK_GRAY);
				}
			}
		});
		
		RoundedButton_2 seat_D6 = new RoundedButton_2("D6");
		seat_D6.setBounds(775, 325, 50, 50);
		seat_D6.setOpaque(false);
		seat_D6.setBackground(Color.DARK_GRAY);
		panel.add(seat_D6);
		seat_D6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(D6 % 2 == 0) {
					D6++;
					seat_D6.setBackground(Color.YELLOW);
				}else {
					D6 += 1;
					seat_D6.setBackground(Color.DARK_GRAY);
				}
			}
		});



		
		
		
		JLabel lblNewLabel_3 = new JLabel("좌석을 선택하시오");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(73, 165, 168, 15);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\1231231232131234124123.png"));
		lblNewLabel.setBounds(0, 0, 1280, 650);
		panel.add(lblNewLabel);
		
		this.setVisible(false);
	}
	private void openAnCont1Panel() {
		AnCont5_1panel anCont1Panel = new AnCont5_1panel(mainFrame);
        mainFrame.PageChange(MainFrame.PANELNAME.TICKETING); 
    }
	
	private void openAnCont3Panel() {
        AnCont2 anCont3Panel = new AnCont2(mainFrame);
        mainFrame.PageChange(MainFrame.PANELNAME.PAYMENT); 
    }
}