package projectPackage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import projectPackage.MainTestFrame.PANELNAME;

import java.awt.Component;
import javax.swing.border.BevelBorder;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.Iterator;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.DropMode;
import java.awt.TextField;
import java.awt.Rectangle;

public class login extends JPanel {

	private static final long serialVersionUID = 1L;
//	private MainFrame maintestframe;
	private MainFrame mainTestFrame;
	private login login_test;
	private JPanel MainPane;	
	private JPanel HeadPanel;	

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	private JPasswordField pf_password;
	
	public void testSet_MainFrame(MainFrame maintestframe)
	{
		this.mainTestFrame = maintestframe;
		System.out.println("this : " + this);
		System.out.println("value : " + maintestframe);
		System.out.println("maintestframe : " + this.mainTestFrame);
	}

	public login(MainFrame maintestframe) {
//	public login(MainTestFrame mainFrame) {
		
		//this.mainTestFrame = mainTestFrame;
		this.testSet_MainFrame(maintestframe);
		
		this.setSize(1280, 800 - 150);
		this.setPreferredSize(new Dimension(1280, 800 - 150));
		this.setBackground(bg);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 1280, 650);
		add(panel);
		panel.setLayout(null);
		
		JLabel cgving = new JLabel(new ImageIcon(TopPanelTest.class.getResource("/image/ohtani/cgving2.png")));
		panel.add(cgving);
		cgving.setBounds(540, 20, 200, 42);
		
		JLabel lb_login = new JLabel("로그인");
		lb_login.setForeground(Color.WHITE);
		lb_login.setHorizontalAlignment(SwingConstants.CENTER);
		lb_login.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		lb_login.setBounds(502, 115, 275, 50);
		panel.add(lb_login);
		

		
//---------------------------------------텍스트필드 부-----------------------------------------------//
		
		JTextField tf_id = new JTextField(125);
		tf_id.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		tf_id.setColumns(125);
		tf_id.setForeground(Color.BLACK);
		tf_id.setText("");
		tf_id.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_id.setBounds(390, 210, 500, 30);
		panel.add(tf_id);
		
//		tf_id.addFocusListener(new FocusListener() {
//			
//			@Override
//			public void focusLost(FocusEvent e) {
////				if
//			
//			}
//			@Override
//			public void focusGained(FocusEvent e) {
//			// TODO Auto-generated method stub
//			
//			}
//		});
		
//		TextField tf_password = new TextField();
//		tf_password.setVisible(false);
//		tf_password.setEchoChar('*');
//		tf_password.setBounds(390, 260, 500, 30);
//		panel.add(tf_password);
		
		pf_password = new JPasswordField();
		pf_password.setBorder(new EmptyBorder(0, 10, 0, 0));
		pf_password.setEchoChar('*');
		pf_password.setBounds(390, 260, 500, 30);
		panel.add(pf_password);
		
//-------------------------------------------버튼 부-----------------------------------------------//
		
		JButton bt_login = new JButton("로그인");
		bt_login = new JButton(new ImageIcon(login.class.getResource("/image/seungho/lb_login.png")));
		bt_login.setHorizontalTextPosition(SwingConstants.CENTER);
		bt_login.setBounds(390, 360, 500, 50);
		
		bt_login.setBackground(Color.LIGHT_GRAY);
		bt_login.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		
//-------로그인 버튼 클릭시, DB와 연동하여 입력값과 출력, 그리고 DB정보값과 입력값 비교하여 로그인 성공/실패 유무 판단!---//		
//		mainTestFrame = new MainTestFrame();
		
		bt_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String inId = new String(tf_id.getText());
				String inPw = new String(pf_password.getPassword());
				
				
				System.out.println(inId + " : " + inPw);
				//setVisible(false);  
				
				
				System.out.println("123213");
				mainTestFrame.PageChange(MainFrame.PANELNAME.MAIN);
				//setVisible(true);
				
//				public void PageChange(PANELNAME name)
//				{		
//					 
//					Iterator<PANELNAME> keys = panelMap.keySet().iterator();
//					while (keys.hasNext()) {
//						PANELNAME key = keys.next();
//						panelMap.get(key).setVisible(false);
//					}
//					
//					
//					switch (name) {
//					case MAIN: 
//						panelMap.get(MainTestFrame.PANELNAME.MAIN).setVisible(true);
//						break;
//					case PAGE0:
//						panelMap.get(MainTestFrame.PANELNAME.PAGE0).setVisible(true);
//						break;
//					case PAGE1:
//						panelMap.get(MainTestFrame.PANELNAME.PAGE1).setVisible(true);
//						break;	
//					case PAGE2:
//						panelMap.get(MainTestFrame.PANELNAME.PAGE2).setVisible(true);
//						break;	
//				     case TICKETING:
//				         panelMap.get(MainTestFrame.PANELNAME.TICKETING).setVisible(true);
//				         break;   
//				      case SELECT:
//				         panelMap.get(MainTestFrame.PANELNAME.SELECT).setVisible(true);
//				         break;   
//				      case PAYMENT:
//				         panelMap.get(MainTestFrame.PANELNAME.PAYMENT).setVisible(true);
//				         break;   
//				      case TICKET:
//				         panelMap.get(MainTestFrame.PANELNAME.TICKET).setVisible(true);
//				         break;
//				      case LOGIN:
//				         panelMap.get(MainTestFrame.PANELNAME.LOGIN).setVisible(true);
//				         break;
//				      case JOIN1:
//				         panelMap.get(MainTestFrame.PANELNAME.JOIN1).setVisible(true);
//				         break;
//				      case JOIN2:
//				         panelMap.get(MainTestFrame.PANELNAME.JOIN2).setVisible(true);
//				         break;
//				      case JOIN3:
//				         panelMap.get(MainTestFrame.PANELNAME.JOIN3).setVisible(true);
//				         break;
//					}
				
				
				
//				mainFrame.PageChange(MainTestFrame.PANELNAME.MAIN);
//				MainPane.PageChange(MainFrame.PANELNAME.MAIN);
//				setVisible(true);
//				mainFrame.PageChange(MainTestFrame.PANELNAME.MAIN).setVisible(true);
				//System.out.println(inId + " : " + inPw);
			}
		});
		
		panel.add(bt_login);
		
		JButton bt_join = new JButton("");		
		bt_join.setIcon(new ImageIcon(login.class.getResource("/image/seungho/bt_join.png")));
		bt_join.setFont(new Font("나눔고딕", Font.BOLD, 13));
		bt_join.setBounds(390, 500, 500, 50);
		bt_join.addActionListener(new ActionListener() {

	public void actionPerformed(ActionEvent e) {
		System.out.println("회원가입");
		maintestframe.PageChange(MainFrame.PANELNAME.JOIN1);
	}});panel.add(bt_join);

//-------------------회원가입 유도 라벨--------------------------------------------//		

	JLabel lb_noId = new JLabel("아이디가 없으시나요?");
	lb_noId.setForeground(Color.WHITE);
	lb_noId.setFont(new Font("나눔고딕",Font.BOLD,12));
	lb_noId.setBounds(390,475,160,15);
	panel.add(lb_noId);

//-------------------로그인 결과 라벨---------------------------------------------//	
	JLabel lb_warning = new JLabel("");
	lb_warning.setForeground(Color.WHITE);
	lb_warning.setHorizontalAlignment(SwingConstants.CENTER);
	lb_warning.setFont(new Font("나눔고딕",Font.BOLD,12));
	lb_warning.setBounds(390,310,500,30);
	panel.add(lb_warning);

	this.setVisible(false);
}}
