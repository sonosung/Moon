package projectPackage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.Icon;
import javax.swing.JSeparator;
import javax.swing.DropMode;

public class MyPage extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	private JTextField tf_myTicket;
	private JTextField tf_user_id;
	private JTextField tf_user_name;
	private JTextField tf_user_phone;
	private JTextField tf_user_email;
	
	public MyPage(MainFrame mainFrame) {

		this.mainFrame = mainFrame;
		this.setSize(1280, 800 - 150);
		this.setPreferredSize(new Dimension(1280, 800 - 150));
		this.setBackground(bg);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 1280, 650);
		add(panel);
		panel.setLayout(null);
		
		JLabel lb_title_myPage = new JLabel("마이페이지");
		lb_title_myPage.setForeground(Color.WHITE);
		lb_title_myPage.setHorizontalAlignment(SwingConstants.CENTER);
		lb_title_myPage.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		lb_title_myPage.setBounds(565, 80, 150, 50);
		panel.add(lb_title_myPage);
		
		JLabel lb_subTitle = new JLabel("회원정보");
		lb_subTitle.setForeground(Color.WHITE);
		lb_subTitle.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_subTitle.setBounds(390, 150, 130, 20);
		panel.add(lb_subTitle);
		
		JLabel lb_user_name = new JLabel("이  름");
		lb_user_name.setForeground(Color.WHITE);
		lb_user_name.setHorizontalAlignment(SwingConstants.LEFT);
		lb_user_name.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_user_name.setBounds(340, 172, 50, 30);
		panel.add(lb_user_name);
		
		tf_user_name = new JTextField();
		tf_user_name.setBackground(Color.WHITE);
		tf_user_name.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_user_name.add(TOOL_TIP_TEXT_KEY, lb_user_name);
			}
		});
		tf_user_name.setEditable(false);
		tf_user_name.setColumns(125);
		tf_user_name.setDropMode(DropMode.INSERT);
		tf_user_name.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_user_name.setHorizontalAlignment(SwingConstants.LEFT);
		tf_user_name.setBounds(390, 172, 500, 30);
		panel.add(tf_user_name);
		
		JLabel lb_user_id = new JLabel("아이디");
		lb_user_id.setForeground(Color.WHITE);
		lb_user_id.setHorizontalAlignment(SwingConstants.LEFT);
		lb_user_id.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_user_id.setBounds(340, 226, 50, 30);
		panel.add(lb_user_id);
		
		tf_user_id = new JTextField();
		tf_user_id.setBackground(Color.WHITE);
		tf_user_id.setEditable(false);
		tf_user_id.setColumns(125);
		tf_user_id.setDropMode(DropMode.INSERT);
		tf_user_id.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_user_id.setHorizontalAlignment(SwingConstants.LEFT);
		tf_user_id.setBounds(390, 226, 500, 30);
		panel.add(tf_user_id);
		
		JLabel lb_user_email = new JLabel("이메일");
		lb_user_email.setForeground(Color.WHITE);
		lb_user_email.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_user_email.setBounds(340, 280, 50, 30);
		panel.add(lb_user_email);
		
		tf_user_email = new JTextField();
		tf_user_email.setBackground(Color.WHITE);
		tf_user_email.setHorizontalAlignment(SwingConstants.LEFT);
		tf_user_email.setEditable(false);
		tf_user_email.setColumns(125);
		tf_user_email.setDropMode(DropMode.INSERT);
		tf_user_email.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_user_email.setBounds(390, 280, 500, 30);
		panel.add(tf_user_email);
		
		JLabel lb_user_phone = new JLabel("휴대전화");
		lb_user_phone.setForeground(Color.WHITE);
		lb_user_phone.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_user_phone.setBounds(340, 334, 50, 30);
		panel.add(lb_user_phone);
		
		tf_user_phone = new JTextField();
		tf_user_phone.setBackground(Color.WHITE);
		tf_user_phone.setHorizontalAlignment(SwingConstants.LEFT);
		tf_user_phone.setEditable(false);
		tf_user_phone.setColumns(125);
		tf_user_phone.setDropMode(DropMode.INSERT);
		tf_user_phone.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_user_phone.setBounds(390, 334, 500, 30);
		panel.add(tf_user_phone);
		
		//회원탈퇴 버튼
		JButton bt_delete_myPage = new JButton("");
		bt_delete_myPage.setIcon(new ImageIcon(MyPage.class.getResource("/image/seungho/bt_delete.png")));
		bt_delete_myPage.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		bt_delete_myPage.setBounds(390, 470, 500, 50);
		bt_delete_myPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				mainFrame.PageChange(MainFrame.PANELNAME.DELETE1);
			}
		});
		panel.add(bt_delete_myPage);
		
		JLabel lb_myTicket = new JLabel("예매내역");
		lb_myTicket.setForeground(Color.WHITE);
		lb_myTicket.setHorizontalAlignment(SwingConstants.LEFT);
		lb_myTicket.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_myTicket.setBounds(340, 388, 50, 30);
		panel.add(lb_myTicket);
		
		tf_myTicket = new JTextField();
		tf_myTicket.setBackground(Color.WHITE);
		tf_myTicket.setColumns(125);
		tf_myTicket.setDropMode(DropMode.INSERT);
		tf_myTicket.setEditable(false);
		tf_myTicket.setBorder(new EmptyBorder(0, 10, 0, 0));
		tf_myTicket.setHorizontalAlignment(SwingConstants.LEFT);
		tf_myTicket.setBounds(390, 388, 500, 30);
		panel.add(tf_myTicket);
		


		this.setVisible(false);
	}
}

