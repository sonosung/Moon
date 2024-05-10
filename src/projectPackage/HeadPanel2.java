//package projectPackage;
//
//import java.awt.Color;
//import java.awt.Container;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//
//public class HeadPanel2 extends JPanel {
//
//	private static final long serialVersionUID = 1L;
//	private MainTestFrame mainTestFrame;
//	private JPanel thisPanel;
//	private JFrame window;
//
//	/**
//	 * Create the panel.
//	 */
//	public HeadPanel2(MainTestFrame mainTestFrame) {
//		
//		this.mainTestFrame = mainTestFrame;
//		this.thisPanel = this;
//		
//		this.setSize(1280,150);
//		this.setPreferredSize(new Dimension(1280,150));
//		this.setBackground(Color.cyan);
//		setLayout(null);
//		
//		JLabel lblNewLabel = new JLabel("HeadPanel2 --");
//		lblNewLabel.setFont(new Font("Adobe 고딕 Std B", Font.PLAIN, 15));
//		lblNewLabel.setBounds(24, 10, 246, 64);
//		add(lblNewLabel);
//		
//		JButton btnNewButton = new JButton("New button");
//		
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				mainTestFrame.PageChange(MainTestFrame.PANELNAME.MAIN);
//			}
//		});
//		
//		btnNewButton.setBounds(24, 66, 127, 41);
//		add(btnNewButton);
//		//-------------------------------------------------//
//		
//		JButton btnNewButton_1 = new JButton("New button");
//		btnNewButton_1.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				mainTestFrame.PageChange(MainTestFrame.PANELNAME.PAGE0);
//				//테스트 하려고 페이지 0 를 페이지 1으로 바꿨음
//			}
//		});
//		btnNewButton_1.setBounds(163, 66, 107, 41);
//		add(btnNewButton_1);
//		
//		JButton btnNewButton_2 = new JButton("New button");
//		btnNewButton_2.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				mainTestFrame.PageChange(MainTestFrame.PANELNAME.PAGE1);
//			}
//		});
//		btnNewButton_2.setBounds(282, 66, 111, 41);
//		add(btnNewButton_2);
//		
//		JLabel lblNewLabel_1 = new JLabel("New label");
//		lblNewLabel_1.setBounds(592, 54, 93, 64);
//		add(lblNewLabel_1);
//		
//		//popup 을 위한 코드
//		JButton btnNewButton_2_1 = new JButton("popup");
//		btnNewButton_2_1.addActionListener(new popupDefine());
//		//btnNewButton_2_1.setIcon(new ImageIcon(HeadPanel.class.getResource("/image/TEST_forPersonal/google-play-badge.png")));
//		//lblNewLabel.setIcon(new ImageIcon(test_forlist.class.getResource("/image/TEST_forPersonal/ring.jpg")));
//		btnNewButton_2_1.setBounds(582, 66, 111, 41);
//		btnNewButton_2_1.setOpaque(false);
//		add(btnNewButton_2_1);		
//		
//		//google-play-badge
//		
//		
//		//--------------------------------------------------//
//		
//		window = new JFrame("제목 있는 윈도우");
//        window.setTitle("제목이 변경된 윈도우");
//        window.setBounds(800, 100, 400, 200);
//        
//        Container container = window.getContentPane();
//        container.setBackground(Color.ORANGE);
//        
//        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//        window.setVisible(false);
//		
//	}
//	
//	//popup 이벤트 구현
//	class popupDefine implements ActionListener
//	{
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			window.setVisible(true);
//		}
//	}
//	
//	class actionDefineClass implements ActionListener
//	{
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			System.out.println(1111);
//		}
//	}
//}