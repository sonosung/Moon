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
	
	public enum PANELNAME {MAIN, SELECT, PAYMENT, OHYES, LOGIN, CREATE1, CREATE2, 
		JOIN3, TICKET, BIRD, PAGE1, PAGE2, MYPAGE, DELETE1, DELETE2};

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
//		JPanel ContentPanel2 = new AnCont5_1panel(this);
		JPanel ContentPanel3 = new AnCont2(this);
	    JPanel ContentPanel4 = new AnCont3(this);
	    JPanel ContentPanel5 = new AnCont4(this);
	    JPanel PLogin = new Login(this);
	    JPanel PCreateId_1 = new CreateId_1(this);
	    JPanel PCreateId_2 = new CreateId_2(this);
	    JPanel PCreateId_3 = new CreateId_3(this);
	    JPanel ContentPanel10 = new BirdRichard(this);
//	    JPanel ContentPanel11 = new JinsungPanelT(this);
	    JPanel ContentPanel12 = new MyPage(this);
	    JPanel ContentPanel13 = new DeleteId_1(this);
	    JPanel ContentPanel14 = new DeleteId_2(this);

		
		//생성된 판넬 Map 자료 구조에 넣기
		panelMap.put(MainFrame.PANELNAME.MAIN, ContentPanel);
//		panelMap.put(MainFrame.PANELNAME.TICKETING, ContentPanel2);
		panelMap.put(MainFrame.PANELNAME.SELECT, ContentPanel3);
	    panelMap.put(MainFrame.PANELNAME.PAYMENT, ContentPanel4);
	    panelMap.put(MainFrame.PANELNAME.OHYES, ContentPanel5);
	    panelMap.put(MainFrame.PANELNAME.LOGIN, PLogin);
	    panelMap.put(MainFrame.PANELNAME.CREATE1, PCreateId_1);
	    panelMap.put(MainFrame.PANELNAME.CREATE2, PCreateId_2);
	    panelMap.put(MainFrame.PANELNAME.JOIN3, PCreateId_3);
	    panelMap.put(MainFrame.PANELNAME.BIRD, ContentPanel10);
//	    panelMap.put(MainFrame.PANELNAME.PAGE1, ContentPanel11);
	    panelMap.put(MainFrame.PANELNAME.MYPAGE, ContentPanel12);
	    panelMap.put(MainFrame.PANELNAME.DELETE1, ContentPanel13);
	    panelMap.put(MainFrame.PANELNAME.DELETE2, ContentPanel14);

		
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
//		this.getContentPane().add(ContentPanel2);
		this.getContentPane().add(ContentPanel3);
		this.getContentPane().add(ContentPanel4);
	    this.getContentPane().add(ContentPanel5);
	    this.getContentPane().add(PLogin);	//LOGIN
	    this.getContentPane().add(PCreateId_1);	//CreateId_1
	    this.getContentPane().add(PCreateId_2);   //CreateId_2
	    this.getContentPane().add(PCreateId_3);   //CreateId_3
	    this.getContentPane().add(ContentPanel10);  //BirdRichard
//	    this.getContentPane().add(ContentPanel11);
	    this.getContentPane().add(ContentPanel12);
	    this.getContentPane().add(ContentPanel13);
	    this.getContentPane().add(ContentPanel14);

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
//	     case TICKETING:
//	         panelMap.get(MainFrame.PANELNAME.TICKETING).setVisible(true);
//	         break;   
	      case SELECT:
	         panelMap.get(MainFrame.PANELNAME.SELECT).setVisible(true);
	         break;   
	      case PAYMENT:
	         panelMap.get(MainFrame.PANELNAME.PAYMENT).setVisible(true);
	         break;   
	      case OHYES:
		      panelMap.get(MainFrame.PANELNAME.PAYMENT).setVisible(true);
		      break;   
	      case TICKET:
	         panelMap.get(MainFrame.PANELNAME.TICKET).setVisible(true);
	         break;
	      case LOGIN:
	         panelMap.get(MainFrame.PANELNAME.LOGIN).setVisible(true);
	         break;
	      case CREATE1:
	         panelMap.get(MainFrame.PANELNAME.CREATE1).setVisible(true);
	         break;
	      case CREATE2:
	         panelMap.get(MainFrame.PANELNAME.CREATE2).setVisible(true);
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
	      case MYPAGE:
	    	  panelMap.get(MainFrame.PANELNAME.MYPAGE).setVisible(true);
	    	  break;
	      case DELETE1:
	    	  panelMap.get(MainFrame.PANELNAME.DELETE1).setVisible(true);
	    	  break;
	      case DELETE2:
	    	  panelMap.get(MainFrame.PANELNAME.DELETE2).setVisible(true);
	    	  break;
		}
	}

}
