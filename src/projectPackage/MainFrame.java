package projectPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame implements LoginEventListener {

	private static final long serialVersionUID = 1L;
	private JLabel lblWelcome;
	private int index;
	private JPanel MainPane;
	private JPanel TopPanel;
	private JPanel TopPanel_2;

	// MainFrame 클래스 내부에서 사용할 참조변수 선언.
	private Login loginPanel;
	
	private HashMap<MainFrame.PANELNAME, JPanel> panelMap;

	An_SQL ansql = new An_SQL();

	public enum PANELNAME {
		MAIN, TICKETING, SELECT, PAYMENT, TICKET, LOGIN, CREATE1, CREATE2, CREATE3, BIRD, PAGE1, PAGE2, MYPAGE, DELETE1,
		DELETE2 
	};

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

	public MainFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		panelMap = new HashMap<MainFrame.PANELNAME, JPanel>();
		TopPanel = new TopPanel(this);
		TopPanel_2 = new TopPanel_2(this);
		lblWelcome = new JLabel();

		// 로그인 클래스의 이벤트 처리를 위해 로그인패널 생설, 이벤트 리스너 등록.
		loginPanel = new Login(this);
		loginPanel.addLoginEventListener(this);

		// 생성 판넬 관리
		JPanel ContentPanel = new OhtanisPanel(this);
		JPanel ContentPanel2 = new AnCont5_1panel(this); //나중에 꼭 해제하기.
		JPanel ContentPanel3 = new AnCont2(this);
		JPanel ContentPanel4 = new AnCont3(this);
		JPanel ContentPanel5 = new AnCont4(this);
		JPanel PLogin = new Login(this);
		JPanel PCreateId_1 = new CreateId_1(this);
		JPanel PCreateId_2 = new CreateId_2(this);
		JPanel PCreateId_3 = new CreateId_3(this);
		JPanel ContentPanel10 = new BirdRichard(this);
//	    JPanel ContentPanel11 = new JinsungPanelT(this); //사용하지 않는 클래스.
		JPanel ContentPanel12 = new MyPage(this);
		JPanel ContentPanel13 = new DeleteId_1(this);
		JPanel ContentPanel14 = new DeleteId_2(this);


		ContentPanel.setVisible(true);

		// 생성된 판넬 Map 자료 구조에 넣기
		panelMap.put(MainFrame.PANELNAME.MAIN, ContentPanel);
		panelMap.put(MainFrame.PANELNAME.TICKETING, ContentPanel2); //나중에 꼭 해제하기.
		panelMap.put(MainFrame.PANELNAME.SELECT, ContentPanel3);
		panelMap.put(MainFrame.PANELNAME.PAYMENT, ContentPanel4);
		panelMap.put(MainFrame.PANELNAME.TICKET, ContentPanel5);
		panelMap.put(MainFrame.PANELNAME.LOGIN, PLogin);
		panelMap.put(MainFrame.PANELNAME.CREATE1, PCreateId_1);
		panelMap.put(MainFrame.PANELNAME.CREATE2, PCreateId_2);
		panelMap.put(MainFrame.PANELNAME.CREATE3, PCreateId_3);
		panelMap.put(MainFrame.PANELNAME.BIRD, ContentPanel10);
		panelMap.put(MainFrame.PANELNAME.MYPAGE, ContentPanel12);
		panelMap.put(MainFrame.PANELNAME.DELETE1, ContentPanel13);
		panelMap.put(MainFrame.PANELNAME.DELETE2, ContentPanel14);

		// Main판넬 설정
		setBounds(100, 100, 1280, 800);
		MainPane = new JPanel();
		MainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(MainPane);
		MainPane.setLayout(new BorderLayout());

		MainPane.add(TopPanel, BorderLayout.NORTH);

		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		centerPanel.add(ContentPanel);
		centerPanel.add(ContentPanel2);
		centerPanel.add(ContentPanel3);
		centerPanel.add(ContentPanel4);
		centerPanel.add(ContentPanel5);
		centerPanel.add(PLogin);
		centerPanel.add(PCreateId_1);
		centerPanel.add(PCreateId_2);
		centerPanel.add(PCreateId_3);
		centerPanel.add(ContentPanel10);
		centerPanel.add(ContentPanel12);
		centerPanel.add(ContentPanel13);
		centerPanel.add(ContentPanel14);


		MainPane.add(centerPanel, BorderLayout.CENTER);
	}

	public void Pagechange_init(JPanel _panel, boolean headVisible) {
		this.TopPanel.setVisible(headVisible);
		_panel.setVisible(true);
	}

	public void switchToTopPanel2() {
		this.getContentPane().remove(TopPanel); 
		TopPanel_2 topPanel_2 = new TopPanel_2(this); // TopPanel_2의 인스턴스 생성.
		this.getContentPane().add(topPanel_2);
		this.revalidate();
		this.repaint();
	}
	
	public void switchToTopPanel() {
	
		    this.getContentPane().removeAll();
		    this.getContentPane().add(TopPanel, BorderLayout.NORTH);
		    JPanel centerPanel = new JPanel();
		    centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));
		    centerPanel.add(panelMap.get(MainFrame.PANELNAME.MAIN));
		    centerPanel.add(panelMap.get(MainFrame.PANELNAME.TICKETING));
		    centerPanel.add(panelMap.get(MainFrame.PANELNAME.SELECT));
		    centerPanel.add(panelMap.get(MainFrame.PANELNAME.PAYMENT));
		    centerPanel.add(panelMap.get(MainFrame.PANELNAME.TICKET));
		    centerPanel.add(panelMap.get(MainFrame.PANELNAME.LOGIN));
		    centerPanel.add(panelMap.get(MainFrame.PANELNAME.CREATE1));
		    centerPanel.add(panelMap.get(MainFrame.PANELNAME.CREATE2));
		    centerPanel.add(panelMap.get(MainFrame.PANELNAME.CREATE3));
		    centerPanel.add(panelMap.get(MainFrame.PANELNAME.BIRD));
		    centerPanel.add(panelMap.get(MainFrame.PANELNAME.MYPAGE));
		    centerPanel.add(panelMap.get(MainFrame.PANELNAME.DELETE1));
		    centerPanel.add(panelMap.get(MainFrame.PANELNAME.DELETE2));
		    this.getContentPane().add(centerPanel, BorderLayout.CENTER); 
		    this.revalidate(); 
		    this.repaint();
		}
	

	public void PageChange(PANELNAME name) {
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
		case CREATE1:
			panelMap.get(MainFrame.PANELNAME.CREATE1).setVisible(true);
			break;
		case CREATE2:
			panelMap.get(MainFrame.PANELNAME.CREATE2).setVisible(true);
			break;
		case CREATE3:
			panelMap.get(MainFrame.PANELNAME.CREATE3).setVisible(true);
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

	public void Set_SeatValue(List<Integer> seat_no) {
		((AnCont2) panelMap.get(MainFrame.PANELNAME.SELECT)).PageInit(seat_no);
	}

	public void Set_movie(String[] select_movie) {
		((AnCont3) panelMap.get(MainFrame.PANELNAME.PAYMENT)).pageInt_movie(select_movie);
	}

	public void Set_SeatValue2(List<Integer> select_seat) {
		((AnCont3) panelMap.get(MainFrame.PANELNAME.PAYMENT)).PageInit2(select_seat);
	}
	
	public void Set_SeatValue4(List<String> loding) {
		((AnCont4) panelMap.get(MainFrame.PANELNAME.TICKET)).PageInit4(loding);
	}
	
	public void Set_SeatValue5(String[] loding2) {
		((AnCont4) panelMap.get(MainFrame.PANELNAME.TICKET)).PageInit5(loding2);
	}
	

	@Override
	public void loginSuccessful(LoginEvent event) {
		// 로그인 클래스에서 로그인 성공시, loginSuccessful 메소드를 호출.
		System.out.println("로그인 클래스에서 로그인 성공하여, 메인프레임의 loginSuccessful 메소드를 호출.");
		String userId = event.getUserId();
		int userNo = event.getUserNo();
		System.out.println(userId + "님 환영합니다. 사용자 번호: " + userNo);
		((AnCont3) panelMap.get(MainFrame.PANELNAME.PAYMENT)).PageInit3(userNo);
		
	}

}
