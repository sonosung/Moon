package projectPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;

import javax.swing.BoxLayout;

public class MainTestFrame extends MainFrame {

	private static final long serialVersionUID = 1L;
	private int index;
	private JPanel MainPane;	
	private JPanel HeadPanel;	
	
	private HashMap<MainTestFrame.PANELNAME, JPanel> panelMap;
	
	public enum PANELNAME {MAIN, PAGE0, PAGE1, PAGE2, LOGIN, JOIN1, JOIN2, 
		JOIN3, SELECT, TICKETING, TICKET, PAYMENT};

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainTestFrame frame = new MainTestFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainTestFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		index = 0;		
		panelMap = new HashMap<MainTestFrame.PANELNAME, JPanel>();
		
		HeadPanel = new HeadPanel2(this);	
		
		//생성 판넬 관리
		JPanel ContentPanel = new OhtanisPanel(this);
		JPanel ContentPanel2 = new Admin_UserList(this);
		JPanel ContentPanel3 = new ContentPanel3(this);
		JPanel ContentPanel4 = new AnCont1(this);
	    JPanel ContentPanel5 = new AnCont2(this);
	    JPanel ContentPanel6 = new AnCont3(this);
	    JPanel ContentPanel7 = new AnCont4(this);
	    JPanel ContentPanel8 = new Login(this);
	    JPanel ContentPanel9 = new CreateId_1(this);
	    JPanel ContentPanel10 = new CreateId_2(this);
	    JPanel ContentPanel11 = new CreateId_3(this);

		
		//생성된 판넬 Map 자료 구조에 넣기
		panelMap.put(MainTestFrame.PANELNAME.MAIN, ContentPanel);
		panelMap.put(MainTestFrame.PANELNAME.PAGE0, ContentPanel2);
		panelMap.put(MainTestFrame.PANELNAME.PAGE1, ContentPanel3);
		panelMap.put(MainTestFrame.PANELNAME.PAGE2, ContentPanel4);
	    panelMap.put(MainTestFrame.PANELNAME.TICKETING, ContentPanel4);
	    panelMap.put(MainTestFrame.PANELNAME.SELECT, ContentPanel5);
	    panelMap.put(MainTestFrame.PANELNAME.PAYMENT, ContentPanel6);
	    panelMap.put(MainTestFrame.PANELNAME.TICKET, ContentPanel7);
	    panelMap.put(MainTestFrame.PANELNAME.LOGIN, ContentPanel8);
	    panelMap.put(MainTestFrame.PANELNAME.JOIN1, ContentPanel9);
	    panelMap.put(MainTestFrame.PANELNAME.JOIN2, ContentPanel10);
	    panelMap.put(MainTestFrame.PANELNAME.JOIN3, ContentPanel11);

		
		//System.out.println(MainFrame.class.getResource("./../image/ring.jpg"));
		//System.out.println(MainFrame.class.getResource("").getPath());
		
		//Main판넬 설정
		setBounds(100, 100, 1280, 800);
		MainPane = new JPanel();
		MainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(MainPane);
		MainPane.setLayout(new BoxLayout(MainPane, BoxLayout.Y_AXIS));
		
		//메인 페이지 초기화 코드
//		ContentPanel.setVisible(true);		
		
		//Main 판넬에 하위 판넬 add 처리
		this.getContentPane().add(HeadPanel);
		this.getContentPane().add(ContentPanel);
		this.getContentPane().add(ContentPanel2);
		this.getContentPane().add(ContentPanel3);
		this.getContentPane().add(ContentPanel4);
	    this.getContentPane().add(ContentPanel5);
	    this.getContentPane().add(ContentPanel6);
	    this.getContentPane().add(ContentPanel7);
	    this.getContentPane().add(ContentPanel8);   //LOGIN
	    this.getContentPane().add(ContentPanel9);   //JOIN1
	    this.getContentPane().add(ContentPanel10);   //JOIN2
	    this.getContentPane().add(ContentPanel11);   //JOIN3
	    
	    MainPane.setVisible(true);		
	}
	
	
	public void PageChange(PANELNAME name)
	{		
		 
		Iterator<PANELNAME> keys = panelMap.keySet().iterator();
		while (keys.hasNext()) {
			PANELNAME key = keys.next();
			panelMap.get(key).setVisible(false);
		}
		
		
		switch (name) {
		case MAIN: 
			panelMap.get(MainTestFrame.PANELNAME.MAIN).setVisible(true);
			break;
		case PAGE0:
			panelMap.get(MainTestFrame.PANELNAME.PAGE0).setVisible(true);
			break;
		case PAGE1:
			panelMap.get(MainTestFrame.PANELNAME.PAGE1).setVisible(true);
			break;	
		case PAGE2:
			panelMap.get(MainTestFrame.PANELNAME.PAGE2).setVisible(true);
			break;	
	     case TICKETING:
	         panelMap.get(MainTestFrame.PANELNAME.TICKETING).setVisible(true);
	         break;   
	      case SELECT:
	         panelMap.get(MainTestFrame.PANELNAME.SELECT).setVisible(true);
	         break;   
	      case PAYMENT:
	         panelMap.get(MainTestFrame.PANELNAME.PAYMENT).setVisible(true);
	         break;   
	      case TICKET:
	         panelMap.get(MainTestFrame.PANELNAME.TICKET).setVisible(true);
	         break;
	      case LOGIN:
	         panelMap.get(MainTestFrame.PANELNAME.LOGIN).setVisible(true);
	         break;
	      case JOIN1:
	         panelMap.get(MainTestFrame.PANELNAME.JOIN1).setVisible(true);
	         break;
	      case JOIN2:
	         panelMap.get(MainTestFrame.PANELNAME.JOIN2).setVisible(true);
	         break;
	      case JOIN3:
	         panelMap.get(MainTestFrame.PANELNAME.JOIN3).setVisible(true);
	         break;
		}
	}

}
