package projectPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnCont2 extends JPanel {

	private MainFrame mainFrame;
	private JPanel contentPane;
	private static final long serialVersionUID = 1L;
	int A1 = 0, A2 = 0, A3 = 0, A4 = 0, A5 = 0, A6 = 0,
			B1 = 0, B2 = 0, B3 = 0, B4 = 0, B5 = 0, B6 = 0,
			C1 = 0, C2 = 0, C3 = 0, C4 = 0, C5 = 0, C6 = 0,
			D1 = 0, D2 = 0, D3 = 0, D4 = 0, D5 = 0, D6 = 0;
	List<Integer> seat_no = new ArrayList<>();
	int[] key = new int[4];
	int seat[] = new int[24];
	JPanel panel = new JPanel();

	/**
	 * Create the panel.
	 */
	
	public void PageInit(List<Integer> seat_no) {
		this.seat_no = seat_no;
		System.out.println(seat_no);
		Seat_Seeting();
	}

	public AnCont2(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		this.setSize(1280,800-150);
		this.setPreferredSize(new Dimension(1280,800-150));
		setLayout(null);
		
		panel.setBackground(new Color(0, 0, 0));
		panel.setForeground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 1280, 650);
		this.add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openAnCont3Panel();
			}
		});
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openAnCont1Panel();
			}
		});
		
		btnNewButton_2.setIcon(new ImageIcon(AnCont2.class.getResource("/image/button/back.png")));
		btnNewButton_2.setBounds(396, 544, 110, 42);
		panel.add(btnNewButton_2);
		btnNewButton.setIcon(new ImageIcon(AnCont2.class.getResource("/image/button/select.png")));
		btnNewButton.setBounds(737, 544, 110, 42);
		panel.add(btnNewButton);
		
		this.setVisible(false);
	}
	public void Seat_Seeting() {
		RoundedButton_2 seat_A1 = new RoundedButton_2("1");	
		seat_A1.setBounds(400, 100, 50, 50);
		seat_A1.setOpaque(false);
		seat_A1.setBackground(Color.DARK_GRAY);
		Integer ing = 1;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing == seat_no.get(i)) {
				seat_A1.setBackground(Color.RED);
				seat_A1.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_A2 = new RoundedButton_2("2");
		seat_A2.setBounds(475, 100, 50, 50);
		seat_A2.setOpaque(false);
		seat_A2.setBackground(Color.DARK_GRAY);
		Integer ing2 = 2;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing2 == seat_no.get(i)) {
				seat_A2.setBackground(Color.RED);
				seat_A2.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_A3 = new RoundedButton_2("3");
		seat_A3.setBounds(550, 100, 50, 50);
		seat_A3.setOpaque(false);
		seat_A3.setBackground(Color.DARK_GRAY);
		Integer ing3 = 3;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing3 == seat_no.get(i)) {
				seat_A3.setBackground(Color.RED);
				seat_A3.setEnabled(false);
				break;
			}else {
			}
		}
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
		

		RoundedButton_2 seat_A4 = new RoundedButton_2("4");
		seat_A4.setBounds(625, 100, 50, 50);
		seat_A4.setOpaque(false);
		seat_A4.setBackground(Color.DARK_GRAY);
		Integer ing4 = 4;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing4 == seat_no.get(i)) {
				seat_A4.setBackground(Color.RED);
				seat_A4.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_A5 = new RoundedButton_2("5");
		seat_A5.setBounds(700, 100, 50, 50);
		seat_A5.setOpaque(false);
		seat_A5.setBackground(Color.DARK_GRAY);
		Integer ing5 = 5;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing5 == seat_no.get(i)) {
				seat_A5.setBackground(Color.RED);
				seat_A5.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_A6 = new RoundedButton_2("6");
		seat_A6.setBounds(775, 100, 50, 50);
		seat_A6.setOpaque(false);
		seat_A6.setBackground(Color.DARK_GRAY);
		Integer ing6 = 6;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing6 == seat_no.get(i)) {
				seat_A6.setBackground(Color.RED);
				seat_A6.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_B1 = new RoundedButton_2("7");
		seat_B1.setBounds(400, 175, 50, 50);
		seat_B1.setOpaque(false);
		seat_B1.setBackground(Color.DARK_GRAY);
		Integer ing7 = 7;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing7 == seat_no.get(i)) {
				seat_B1.setBackground(Color.RED);
				seat_B1.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_B2 = new RoundedButton_2("8");
		seat_B2.setBounds(475, 175, 50, 50);
		seat_B2.setOpaque(false);
		seat_B2.setBackground(Color.DARK_GRAY);
		Integer ing8 = 8;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing8 == seat_no.get(i)) {
				seat_B2.setBackground(Color.RED);
				seat_B2.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_B3 = new RoundedButton_2("9");
		seat_B3.setBounds(550, 175, 50, 50);
		seat_B3.setOpaque(false);
		seat_B3.setBackground(Color.DARK_GRAY);
		Integer ing9 = 9;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing9 == seat_no.get(i)) {
				seat_B3.setBackground(Color.RED);
				seat_B3.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_B4 = new RoundedButton_2("10");
		seat_B4.setBounds(625, 175, 50, 50);
		seat_B4.setOpaque(false);
		seat_B4.setBackground(Color.DARK_GRAY);
		Integer ing10 = 10;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing10 == seat_no.get(i)) {
				seat_B4.setBackground(Color.RED);
				seat_B4.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_B5 = new RoundedButton_2("11");
		seat_B5.setBounds(700, 175, 50, 50);
		seat_B5.setOpaque(false);
		seat_B5.setBackground(Color.DARK_GRAY);
		Integer ing11 = 11;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing11 == seat_no.get(i)) {
				seat_B5.setBackground(Color.RED);
				seat_B5.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_B6 = new RoundedButton_2("12");
		seat_B6.setBounds(775, 175, 50, 50);
		seat_B6.setOpaque(false);
		seat_B6.setBackground(Color.DARK_GRAY);
		Integer ing12 = 12;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing12 == seat_no.get(i)) {
				seat_B6.setBackground(Color.RED);
				seat_B6.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_C1 = new RoundedButton_2("13");	
		seat_C1.setBounds(400, 250, 50, 50);
		seat_C1.setOpaque(false);
		seat_C1.setBackground(Color.DARK_GRAY);
		Integer ing13 = 13;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing13 == seat_no.get(i)) {
				seat_C1.setBackground(Color.RED);
				seat_C1.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_C2 = new RoundedButton_2("14");
		seat_C2.setBounds(475, 250, 50, 50);
		seat_C2.setOpaque(false);
		seat_C2.setBackground(Color.DARK_GRAY);
		Integer ing14 = 14;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing14 == seat_no.get(i)) {
				seat_C2.setBackground(Color.RED);
				seat_C2.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_C3 = new RoundedButton_2("15");
		seat_C3.setBounds(550, 250, 50, 50);
		seat_C3.setOpaque(false);
		seat_C3.setBackground(Color.DARK_GRAY);
		Integer ing15 = 15;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing15 == seat_no.get(i)) {
				seat_C3.setBackground(Color.RED);
				seat_C3.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_C4 = new RoundedButton_2("16");
		seat_C4.setBounds(625, 250, 50, 50);
		seat_C4.setOpaque(false);
		seat_C4.setBackground(Color.DARK_GRAY);
		Integer ing16 = 16;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing16 == seat_no.get(i)) {
				seat_C4.setBackground(Color.RED);
				seat_C4.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_C5 = new RoundedButton_2("17");
		seat_C5.setBounds(700, 250, 50, 50);
		seat_C5.setOpaque(false);
		seat_C5.setBackground(Color.DARK_GRAY);
		Integer ing17 = 17;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing17 == seat_no.get(i)) {
				seat_C5.setBackground(Color.RED);
				seat_C5.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_C6 = new RoundedButton_2("18");
		seat_C6.setBounds(775, 250, 50, 50);
		seat_C6.setOpaque(false);
		seat_C6.setBackground(Color.DARK_GRAY);
		Integer ing18 = 18;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing18 == seat_no.get(i)) {
				seat_C5.setBackground(Color.RED);
				seat_C5.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_D1 = new RoundedButton_2("19");
		seat_D1.setBounds(400, 325, 50, 50);
		seat_D1.setOpaque(false);
		seat_D1.setBackground(Color.DARK_GRAY);
		Integer ing19 = 19;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing19 == seat_no.get(i)) {
				seat_D1.setBackground(Color.RED);
				seat_D1.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_D2 = new RoundedButton_2("20");
		seat_D2.setBounds(475, 325, 50, 50);
		seat_D2.setOpaque(false);
		seat_D2.setBackground(Color.DARK_GRAY);
		Integer ing20 = 20;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing20 == seat_no.get(i)) {
				seat_D2.setBackground(Color.RED);
				seat_D2.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_D3 = new RoundedButton_2("21");
		seat_D3.setBounds(550, 325, 50, 50);
		seat_D3.setOpaque(false);
		seat_D3.setBackground(Color.DARK_GRAY);
		Integer ing21 = 21;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing21 == seat_no.get(i)) {
				seat_D3.setBackground(Color.RED);
				seat_D3.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_D4 = new RoundedButton_2("22");
		seat_D4.setBounds(625, 325, 50, 50);
		seat_D4.setOpaque(false);
		seat_D4.setBackground(Color.DARK_GRAY);
		Integer ing22= 22;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing22 == seat_no.get(i)) {
				seat_D4.setBackground(Color.RED);
				seat_D4.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_D5 = new RoundedButton_2("23");
		seat_D5.setBounds(700, 325, 50, 50);
		seat_D5.setOpaque(false);
		seat_D5.setBackground(Color.DARK_GRAY);
		Integer ing23 = 23;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing23 == seat_no.get(i)) {
				seat_D5.setBackground(Color.RED);
				seat_D5.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		RoundedButton_2 seat_D6 = new RoundedButton_2("24");
		seat_D6.setBounds(775, 325, 50, 50);
		seat_D6.setOpaque(false);
		seat_D6.setBackground(Color.DARK_GRAY);
		Integer ing24 = 24;
		for(int i = 0; i < seat_no.size() ; i++) {
			if(ing24 == seat_no.get(i)) {
				seat_D6.setBackground(Color.RED);
				seat_D6.setEnabled(false);
				break;
			}else {
			}
		}
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
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(0, 0, 0));
		lblNewLabel.setIcon(new ImageIcon(AnCont2.class.getResource("/image/screen/1231231232131234124123.png")));
		lblNewLabel.setBounds(0, 0, 1280, 650);
		panel.add(lblNewLabel);
		
		
		this.setVisible(false);
	}

	private void openAnCont1Panel() {
//		AnCont5_1panel anCont1Panel = new AnCont5_1panel(mainFrame);
        mainFrame.PageChange(MainFrame.PANELNAME.TICKETING); 
        this.setVisible(false);
    }
	
	private void openAnCont3Panel() {
		List<Integer> select_seat = new ArrayList<>();
		if(A1 % 2 == 1) {
			select_seat.add(1);
		}
		if(A2 % 2 == 1) {
			select_seat.add(2);
		}
		if(A3 % 2 == 1) {
			select_seat.add(3);
		}
		if(A4 % 2 == 1) {
			select_seat.add(4);
		}
		if(A5 % 2 == 1) {
			select_seat.add(5);
		}
		if(A6 % 2 == 1) {
			select_seat.add(6);
		}
		if(B1 % 2 == 1) {
			select_seat.add(7);
		}
		if(B2 % 2 == 1) {
			select_seat.add(8);
		}
		if(B3 % 2 == 1) {
			select_seat.add(9);
		}
		if(B4 % 2 == 1) {
			select_seat.add(10);
		}
		if(B5 % 2 == 1) {
			select_seat.add(11);
		}
		if(B6 % 2 == 1) {
			select_seat.add(12);
		}
		if(C1 % 2 == 1) {
			select_seat.add(13);
		}
		if(C2 % 2 == 1) {
			select_seat.add(14);
		}
		if(C3 % 2 == 1) {
			select_seat.add(15);
		}
		if(C4 % 2 == 1) {
			select_seat.add(16);
		}
		if(C5 % 2 == 1) {
			select_seat.add(17);
		}
		if(C6 % 2 == 1) {
			select_seat.add(18);
		}
		if(D1 % 2 == 1) {
			select_seat.add(19);
		}
		if(D2 % 2 == 1) {
			select_seat.add(20);
		}
		if(D3 % 2 == 1) {
			select_seat.add(21);
		}
		if(D4 % 2 == 1) {
			select_seat.add(22);
		}
		if(D5 % 2 == 1) {
			select_seat.add(23);
		}
		if(D6 % 2 == 1) {
			select_seat.add(24);
		}
		if(0 < select_seat.size()) {
		mainFrame.Set_SeatValue2(select_seat);
        mainFrame.PageChange(MainFrame.PANELNAME.PAYMENT); 
        this.setVisible(false);
		}else {
			
		}
    }
}