package projectPackage;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import projectPackage.HeadPanel.popupDefine;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OhtanisPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;
	private JFrame crimePopup;
	private JFrame stuntPopup;
	private JFrame kungfuPopup;
	private JFrame chalPopup;
	private JFrame monPopup;


	/**
	 * Create the panel.
	 */
	public OhtanisPanel(MainFrame mainFrame) {

		this.mainFrame = mainFrame;

		setLayout(null);
		this.setSize(1280, 800 - 150);
		this.setPreferredSize(new Dimension(1280, 800 - 150));
		this.setBackground(new Color(0, 0, 0));

		try {

			// JFrame Initialize
			// 팝업 jframe 정의
			// 클릭시 이벤트 정의
			// --------------------------------------------------//
			crimePopup = new CrimePopup();
			JButton btnNewButton_1 = new JButton("");		
			btnNewButton_1.addActionListener(new crimePopupAction());
			btnNewButton_1.setIcon(new ImageIcon(OhtanisPanel.class.getResource("/image/ohtani/crimetown.jpg")));
			btnNewButton_1.setBounds(88, 326, 150, 214);
			add(btnNewButton_1);

			stuntPopup = new StuntPopup();
			JButton btnNewButton_2 = new JButton("");
			btnNewButton_2.addActionListener(new stuntPopupAction());
			btnNewButton_2.setIcon(new ImageIcon(OhtanisPanel.class.getResource("/image/ohtani/stuntman.jpg")));
			btnNewButton_2.setBounds(326, 326, 150, 214);
			add(btnNewButton_2);

			kungfuPopup = new KungfuPopup();
			JButton btnNewButton_3 = new JButton("");
			btnNewButton_3.addActionListener(new kungfuPopupAction());
			btnNewButton_3.setIcon(new ImageIcon(OhtanisPanel.class.getResource("/image/ohtani/kungfupanda.jpg")));
			btnNewButton_3.setBounds(560, 326, 150, 214);
			add(btnNewButton_3);

			chalPopup = new ChalPopup();
			JButton btnNewButton_4 = new JButton("");
			btnNewButton_4.addActionListener(new chalPopupAction());
			btnNewButton_4.setIcon(new ImageIcon(OhtanisPanel.class.getResource("/image/ohtani/challengers.jpg")));
			btnNewButton_4.setBounds(802, 326, 150, 214);
			add(btnNewButton_4);
			
			monPopup = new MonPopup();
			JButton btnNewButton_5 = new JButton("");
			btnNewButton_5.addActionListener(new monPopupAction());
			btnNewButton_5.setIcon(new ImageIcon(OhtanisPanel.class.getResource("/image/ohtani/monsterfriends.jpg")));
			btnNewButton_5.setBounds(1040, 326, 150, 214);
			add(btnNewButton_5);
			

			JButton btnNewButton_0 = new JButton("");
			btnNewButton_0.setIcon(new ImageIcon(OhtanisPanel.class.getResource("/image/ohtani/birds.jpg")));
			btnNewButton_0.setBounds(0, 0, 1280, 238);
			add(btnNewButton_0);

			JLabel label = new JLabel("1. 범죄도시4");
			label.setForeground(new Color(255, 255, 255));
			label.setFont(new Font("나눔고딕", Font.BOLD, 18));
			label.setBounds(111, 550, 100, 22);
			add(label);

			JLabel label_1 = new JLabel("2. 스턴트맨");
			label_1.setForeground(new Color(255, 255, 255));
			label_1.setFont(new Font("나눔고딕", Font.BOLD, 18));
			label_1.setBounds(351, 550, 100, 22);
			add(label_1);

			JLabel label_1_1 = new JLabel("3. 쿵푸팬더4");
			label_1_1.setForeground(new Color(255, 255, 255));
			label_1_1.setFont(new Font("나눔고딕", Font.BOLD, 18));
			label_1_1.setBounds(585, 550, 100, 22);
			add(label_1_1);

			JLabel label_1_1_1 = new JLabel("5. 몬스터 프렌즈");
			label_1_1_1.setForeground(new Color(255, 255, 255));
			label_1_1_1.setFont(new Font("나눔고딕", Font.BOLD, 18));
			label_1_1_1.setBounds(1046, 550, 139, 22);
			add(label_1_1_1);

			JLabel label_1_1_1_1 = new JLabel("4. 챌린저스");
			label_1_1_1_1.setForeground(new Color(255, 255, 255));
			label_1_1_1_1.setFont(new Font("나눔고딕", Font.BOLD, 18));
			label_1_1_1_1.setBounds(827, 550, 100, 22);
			add(label_1_1_1_1);

			JLabel label_2 = new JLabel("예매율 91.2%");
			label_2.setForeground(new Color(255, 255, 255));
			label_2.setFont(new Font("나눔고딕", Font.BOLD, 12));
			label_2.setBounds(130, 573, 85, 22);
			add(label_2);

			JLabel label_2_1 = new JLabel("예매율 1.4%");
			label_2_1.setForeground(new Color(255, 255, 255));
			label_2_1.setFont(new Font("나눔고딕", Font.BOLD, 12));
			label_2_1.setBounds(370, 573, 85, 22);
			add(label_2_1);

			JLabel label_2_1_1 = new JLabel("예매율 1.3%");
			label_2_1_1.setForeground(new Color(255, 255, 255));
			label_2_1_1.setFont(new Font("나눔고딕", Font.BOLD, 12));
			label_2_1_1.setBounds(609, 573, 85, 22);
			add(label_2_1_1);

			JLabel label_2_1_1_1 = new JLabel("예매율 1.2%");
			label_2_1_1_1.setForeground(new Color(255, 255, 255));
			label_2_1_1_1.setFont(new Font("나눔고딕", Font.BOLD, 12));
			label_2_1_1_1.setBounds(847, 573, 85, 22);
			add(label_2_1_1_1);

			JLabel label_2_1_1_1_1 = new JLabel("예매율 1.2%");
			label_2_1_1_1_1.setForeground(new Color(255, 255, 255));
			label_2_1_1_1_1.setFont(new Font("나눔고딕", Font.BOLD, 12));
			label_2_1_1_1_1.setBounds(1084, 573, 85, 22);
			add(label_2_1_1_1_1);

		} catch (Exception e) {
			e.printStackTrace();
		}

		this.setVisible(false);
	}

	// popup 이벤트 구현
	class crimePopupAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			crimePopup.setVisible(true);
			stuntPopup.setVisible(false);
			kungfuPopup.setVisible(false);
			chalPopup.setVisible(false);
			monPopup.setVisible(false);

		}
	}

	class stuntPopupAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			crimePopup.setVisible(false);
			stuntPopup.setVisible(true);
			kungfuPopup.setVisible(false);
			chalPopup.setVisible(false);
			monPopup.setVisible(false);
		}
	}

	class kungfuPopupAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			crimePopup.setVisible(false);
			stuntPopup.setVisible(false);
			kungfuPopup.setVisible(true);
			chalPopup.setVisible(false);
			monPopup.setVisible(false);
		}
	}

	class chalPopupAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			crimePopup.setVisible(false);
			stuntPopup.setVisible(false);
			kungfuPopup.setVisible(false);
			chalPopup.setVisible(true);
			monPopup.setVisible(false);
		}
	}
	
	class monPopupAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			crimePopup.setVisible(false);
			stuntPopup.setVisible(false);
			kungfuPopup.setVisible(false);
			chalPopup.setVisible(false);
			monPopup.setVisible(true);
		}
	}

}
