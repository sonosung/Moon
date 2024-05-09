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

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private int index;
	private JPanel MainPane;	
	private JPanel TopPanelTest;	
	
	private HashMap<MainFrame.PANELNAME, JPanel> panelMap;
	
	public enum PANELNAME {MAIN,TICKETING, SELECT, PAYMENT, TICKET, LOGIN, JOIN1, JOIN2, 
		JOIN3, BIRD, PAGE1 };

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		index = 0;		
		panelMap = new HashMap<MainFrame.PANELNAME, JPanel>();
		
		TopPanelTest = new TopPanelTest(this);	
		
		//생성 판넬 관리
		JPanel ContentPanel = new OhtanisPanel(this);
		JPanel ContentPanel2 = new AnCont5_1panel(this);
		JPanel ContentPanel3 = new AnCont2(this);
	    JPanel ContentPanel4 = new AnCont3(this);
	    JPanel ContentPanel5= new AnCont4(this);
	    JPanel ContentPanel6 = new Login(this);
	    JPanel ContentPanel7 = new CreateId_1(this);
	    JPanel ContentPanel8 = new CreateId_2(this);
	    JPanel ContentPanel9 = new CreateId_3(this);
	    JPanel ContentPanel10 = new BirdRichard(this);
//	    JPanel ContentPanel11 = new JinsungPanelT(this);

		
		//생성된 판넬 Map 자료 구조에 넣기
		panelMap.put(MainFrame.PANELNAME.MAIN, ContentPanel);
		panelMap.put(MainFrame.PANELNAME.TICKETING, ContentPanel2);
		panelMap.put(MainFrame.PANELNAME.SELECT, ContentPanel3);
	    panelMap.put(MainFrame.PANELNAME.PAYMENT, ContentPanel4);
	    panelMap.put(MainFrame.PANELNAME.TICKET, ContentPanel5);
	    panelMap.put(MainFrame.PANELNAME.LOGIN, ContentPanel6);
	    panelMap.put(MainFrame.PANELNAME.JOIN1, ContentPanel7);
	    panelMap.put(MainFrame.PANELNAME.JOIN2, ContentPanel8);
	    panelMap.put(MainFrame.PANELNAME.JOIN3, ContentPanel9);
	    panelMap.put(MainFrame.PANELNAME.BIRD, ContentPanel10);
//	    panelMap.put(MainFrame.PANELNAME.PAGE1, ContentPanel11);

		
		//System.out.println(MainFrame.class.getResource("./../image/ring.jpg"));
		//System.out.println(MainFrame.class.getResource("").getPath());
		
		//Main판넬 설정
		setBounds(100, 100, 1280, 800);
		MainPane = new JPanel();
		MainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(MainPane);
		MainPane.setLayout(new BoxLayout(MainPane, BoxLayout.Y_AXIS));
		
		//메인 페이지 초기화 코드
		ContentPanel.setVisible(true);		
		
		//Main 판넬에 하위 판넬 add 처리
		this.getContentPane().add(TopPanelTest);
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
//	    this.getContentPane().add(ContentPanel11);

	}
	
	public void Pagechange_init(JPanel _panel, boolean headVisible)
	{
		this.TopPanelTest.setVisible(headVisible);
		_panel.setVisible(true);
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
			Pagechange_init(panelMap.get(MainFrame.PANELNAME.MAIN), true);
			break;
	     case TICKETING:
	         panelMap.get(MainFrame.PANELNAME.TICKETING).setVisible(true);
	         break;   
	      case SELECT:
	         panelMap.get(MainFrame.PANELNAME.SELECT).setVisible(true);
	         break;   
	      case PAYMENT:
	         panelMap.get(MainFrame.PANELNAME.PAYMENT).setVisible(true);
	         break;     
	      case TICKET:
	         panelMap.get(MainFrame.PANELNAME.TICKET).setVisible(true);
	         break;
	      case LOGIN:
	         panelMap.get(MainFrame.PANELNAME.LOGIN).setVisible(true);
	         break;
	      case JOIN1:
	         panelMap.get(MainFrame.PANELNAME.JOIN1).setVisible(true);
	         break;
	      case JOIN2:
	         panelMap.get(MainFrame.PANELNAME.JOIN2).setVisible(true);
	         break;
	      case JOIN3:
	         panelMap.get(MainFrame.PANELNAME.JOIN3).setVisible(true);
	         break;
	      case BIRD:
	    	 panelMap.get(MainFrame.PANELNAME.BIRD).setVisible(true);
		     break;
	      case PAGE1:
	    	  panelMap.get(MainFrame.PANELNAME.PAGE1).setVisible(true);
	    	  break;
		}
	}

}
