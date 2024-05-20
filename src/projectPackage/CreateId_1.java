package projectPackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JScrollBar;
import javax.swing.ButtonGroup;
import javax.swing.DropMode;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.Icon;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;



public class CreateId_1 extends JPanel implements ItemListener {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private Object rbt_agree;
//	private Object rbt_dagree;
	private JButton bt_next;


	public CreateId_1(MainFrame mainFrame) {
		bt_next = new JButton("");
		reset();
		
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
		
		JLabel lb_join = new JLabel("회원가입");
		lb_join.setForeground(Color.WHITE);
		lb_join.setHorizontalAlignment(SwingConstants.CENTER);
		lb_join.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		lb_join.setBounds(530, 80, 220, 50);
		panel.add(lb_join);
		
		JLabel lb_terms = new JLabel("1.(필수) 개인정보 이용 약관");
		lb_terms.setForeground(Color.WHITE);
		lb_terms.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_terms.setBounds(390, 150, 160, 20);
		panel.add(lb_terms);
		
		TextArea ta_terms = new TextArea();
		ta_terms.setBackground(Color.WHITE);
		ta_terms.setEditable(false);
		ta_terms.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus venenatis aliquam sapien et \n"
				+ " rhoncus. In sagittis, ante faucibus dictum condimentum, mi erat pretium nisl, eu congue odio magna in nulla. Aenean \n"
				+ "bibendum pulvinar porttitor. Cras nec purus diam. Sed tristique turpis ut ante semper gravida. Curabitur ac \n"
				+ "feugiat lectus. Morbi tempus interdum laoreet.nPhasellus iaculis a felis in maximus. Mauris ut mattis \n"
				+ "dui, sed condimentum sem. Etiam facilisis nibh quis lorem mollis commodo. Phasellus imperdiet lorem vitae urna \n"
				+ "dignissim, ut ornare erat aliquam. Pellentesque sagittis ultricies est, eu lobortis augue facilisis id. Donec \n"
				+ "volutpat ipsum eget sem pretium elementum. Morbitempus, tortor nec tempus accumsan, nunc mauris porttitor eros, \n"
				+ "ac pretium mi sapien venenatis lectus. Fusce luctus mauris id orci finibus vulputate. Mauris eros sapien, dictum \n"
				+ "vel hendrerit sit amet, tincidunt eget nibh. Nuncrcursus vulputate justo. Cras ut velit nunc. Vestibulum gravida \n"
				+ "auctor ipsum eu dapibus. Maecenas vitae rutrum nulla. In at urna lobortis, bibendum sapien at, imperdiet tortor. \n"
				+ "Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. nNullam ut quam \n"
				+ "justo. Ut condimentum sapien et sem ornare, aceleifend diam lobortis. Sed commodo sapien et neque sagittis, sit \n"
				+ "amet volutpat massa fermentum. Ut luctus, odio ut condimentum venenatis, quam nisi laoreet ipsum, id aliquet est \n"
				+ "velit id felis. Etiam mollis consequat ullamcorper. Aliquam rhoncus ligula et dui sagittis, malesuada suscipit nunc \n"
				+ "volutpat. Morbi dignissim ipsum eget sapien tincidunt, sit amet faucibus nunc congue. Fusce vitae suscipit enim. \n"
				+ "Nulla auctor dolor vitae libero sagittis maximus. Aliquam erat volutpat. Integer lacinia sagittis tristique. \n"
				+ "Nulla at ante a velit pretium iaculis. nNulla luctus pharetra odio vehicula accumsan. Ut ultricies est in ");
				
		ta_terms.setBounds(390, 170, 500, 210);
		panel.add(ta_terms);
		
		JRadioButton rbt_agree = new JRadioButton("약관에 동의함");
		rbt_agree.setBackground(Color.BLACK);
		rbt_agree.setForeground(Color.WHITE);
		rbt_agree.setFont(new Font("나눔고딕", Font.BOLD, 12));
		rbt_agree.setBounds(770, 410, 120, 25);
		panel.add(rbt_agree);
		
		JButton bt_next = new JButton("");
		bt_next.setIcon(new ImageIcon(CreateId_1.class.getResource("/image/seungho/bt_next.png")));
		bt_next.setEnabled(false);
		
		//동의함 버튼 클릭시 '다음' 버튼 활성화
		rbt_agree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bt_next.setEnabled(true);
			}
		});
				
		buttonGroup.add(rbt_agree);
		
		//동의함 버튼 클릭시 '다음' 버튼 비활성화, 가입약관 동의 팝업 구현하기!
		JRadioButton rbt_dagree = new JRadioButton("약관에 동의안함");
		rbt_dagree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "가입약관 동의는 필수입니다");
				bt_next.setEnabled(false);
			}
		});
		rbt_dagree.setBackground(Color.BLACK);
		rbt_dagree.setForeground(Color.WHITE);
		rbt_dagree.setSelected(true);
		rbt_dagree.setFont(new Font("나눔고딕", Font.BOLD, 12));
		rbt_dagree.setBounds(770, 390, 120, 25);
		
		panel.add(rbt_dagree);
		buttonGroup.add(rbt_dagree);
			
//		JButton bt_next = new JButton("");
//		bt_next.setIcon(new ImageIcon(CreateId_1.class.getResource("/image/seungho/bt_next.png")));
		
		//약관 동의 후 다음 버튼 클릭시, Create_2 클래스 화면으로 이동
		bt_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("CREATE2 페이지로 이동");
				reset();
				mainFrame.PageChange(MainFrame.PANELNAME.CREATE2);
			}
		});
		bt_next.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		bt_next.setBounds(390, 470, 500, 50);
		panel.add(bt_next);

		this.setVisible(false);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void reset() {
		
	    // Reset all components to their initial state here
	    buttonGroup.clearSelection(); // Clear radio button selection
	    bt_next.setEnabled(false);   // Disable the "Next" button
	}

}