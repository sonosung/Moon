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
	
	public enum PANELNAME {MAIN, PAGE0, PAGE1, PAGE2};

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
		JPanel ContentPanel2 = new ContentPanel2(this);
		JPanel ContentPanel3 = new ContentPanel3(this);
		JPanel ContentPanel4 = new ContentPanel4(this);
		
		//생성된 판넬 Map 자료 구조에 넣기
		panelMap.put(MainFrame.PANELNAME.MAIN, ContentPanel);
		panelMap.put(MainFrame.PANELNAME.PAGE0, ContentPanel2);
		panelMap.put(MainFrame.PANELNAME.PAGE1, ContentPanel3);
		panelMap.put(MainFrame.PANELNAME.PAGE2, ContentPanel4);
		
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
			panelMap.get(MainFrame.PANELNAME.MAIN).setVisible(true);
			break;
		case PAGE0:
			panelMap.get(MainFrame.PANELNAME.PAGE0).setVisible(true);
			break;
		case PAGE1:
			panelMap.get(MainFrame.PANELNAME.PAGE1).setVisible(true);
			break;		
		case PAGE2:
			panelMap.get(MainFrame.PANELNAME.PAGE2).setVisible(true);
			break;	
		}
	}

}
