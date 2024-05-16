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
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class AnCont3 extends JPanel {
	private MainFrame mainFrame;
	private static final long serialVersionUID = 1L;
	List<Integer> select_seat = new ArrayList<>();
	int key[] = new int[4];
	String select_movie[] = new String[4];
	JPanel panel_2 = new JPanel();
	
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
        radioButton1.setForeground(new Color(255, 255, 255));
        radioButton1.setBackground(new Color(0, 0, 0));
        radioButton1.setBounds(400, 350, 121, 23);
        panel.add(radioButton1); 
        buttonGroup.add(radioButton1); 

        JRadioButton radioButton2 = new JRadioButton("토스페이");
        radioButton2.setForeground(new Color(255, 255, 255));
        radioButton2.setBackground(new Color(0, 0, 0));
        radioButton2.setBounds(550, 350, 121, 23);
        panel.add(radioButton2); 
        buttonGroup.add(radioButton2); 

        JRadioButton radioButton3 = new JRadioButton("카카오페이");
        radioButton3.setBackground(new Color(0, 0, 0));
        radioButton3.setForeground(new Color(255, 255, 255));
        radioButton3.setBounds(700, 350, 121, 23);
        panel.add(radioButton3); 
        buttonGroup.add(radioButton3); 
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(245, 20, 790, 550);
		panel.add(panel_1);
		panel_1.setLayout(null);

		panel_2.setBounds(12, 10, 765, 530);
		panel_2.setBackground(new Color(0, 0, 0));
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		

//        this.setVisible(false);  
		
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AnCont3.class.getResource("/anSH_img/style_65e936963ad32.png")));
		lblNewLabel.setBounds(12, 10, 130, 185);
		panel_2.add(lblNewLabel);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBounds(12, 205, 741, 315);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(12, 10, 715, 295);
		panel_4.setBackground(new Color(0, 0, 0));
		panel_3.add(panel_4);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(593, 240, 110, 42);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openAnCont4Panel();
			}
		});
		panel_4.setLayout(null);
		btnNewButton.setIcon(new ImageIcon(AnCont3.class.getResource("/image/button/select.png")));
		panel_4.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBounds(12, 240, 110, 42);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				openAnCont2Panel();
		    	setVisible(false);
				
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(AnCont3.class.getResource("/image/button/back.png")));
		panel_4.add(btnNewButton_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(128, 128, 128));
		panel_5.setBounds(0, 0, 715, 3);
		panel_4.add(panel_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(AnCont3.class.getResource("/image/ohtani/cgving2.png")));
		lblNewLabel_2.setBounds(556, 0, 209, 89);
		panel_2.add(lblNewLabel_2);
		
	
	
		this.setVisible(false);
	}
	
	public void oppppen() {
	JLabel lblNewLabel_1 = new JLabel("영화 제목 : " +  select_movie[0]);
	lblNewLabel_1.setForeground(new Color(255, 255, 255));
	lblNewLabel_1.setBounds(184, 40, 531, 40);
	panel_2.add(lblNewLabel_1);
	
	JLabel lblNewLabel_2 = new JLabel(
			"지역  영화관 : " +  select_movie[1] +"  " +  select_movie[2] +  "\n");
	lblNewLabel_2.setForeground(new Color(255, 255, 255));
	lblNewLabel_2.setBounds(184, 10, 531, 185);
	panel_2.add(lblNewLabel_2);
	
	JLabel lblNewLabel_3 = new JLabel(
			"상영 시간 : " + select_movie[3]);
	lblNewLabel_3.setForeground(new Color(255, 255, 255));
	lblNewLabel_3.setBounds(184, 25, 531, 185);
	panel_2.add(lblNewLabel_3);
	
	JLabel lblNewLabel_4 = new JLabel(
			"좌석 번호 : " + select_seat);
	lblNewLabel_4.setForeground(new Color(255, 255, 255));
	lblNewLabel_4.setBounds(184, 40, 531, 185);
	panel_2.add(lblNewLabel_4);
	}
	
	public void PageInit2(List<Integer> select_seat) {
		this.select_seat = select_seat;
		oppppen();
		System.out.println("선택좌석표시" + select_seat);
	}
	
	public void pageInt_movie(String[] select_movie) {
		this.select_movie = select_movie;
		System.out.println(select_movie[0] + select_movie[1] + select_movie[2] + select_movie[3]);
	}
	
	
	private void openAnCont4Panel() {
		mainFrame.ansql.seat_size_set(select_seat);
		mainFrame.ansql.update();
        mainFrame.PageChange(MainFrame.PANELNAME.TICKET); 
        this.setVisible(false);
    }
	
	private void openAnCont2Panel() {
        mainFrame.PageChange(MainFrame.PANELNAME.SELECT); 
    }
}
