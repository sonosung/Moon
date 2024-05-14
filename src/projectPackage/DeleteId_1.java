package projectPackage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.DropMode;

public class DeleteId_1 extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;
	private Connection conn;
	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	private JTextField tf_pw;

//	public deleteId_1() {
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//
//			conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/XE", "c##green", "green1234");
//		} catch (Exception e) {
//			e.printStackTrace();
//			exit();
//		}
//	}

	public DeleteId_1(MainFrame mainFrame) {

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

		JLabel lb_title_delete = new JLabel("회원탈퇴");
		lb_title_delete.setForeground(Color.WHITE);
		lb_title_delete.setHorizontalAlignment(SwingConstants.CENTER);
		lb_title_delete.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 25));
		lb_title_delete.setBounds(540, 80, 200, 50);
		panel.add(lb_title_delete);

		JLabel lb_typePw = new JLabel("회원탈퇴를 위해 비밀번호를 입력해주세요");
		lb_typePw.setForeground(Color.WHITE);
		lb_typePw.setHorizontalAlignment(SwingConstants.CENTER);
		lb_typePw.setFont(new Font("나눔고딕", Font.BOLD, 12));
		lb_typePw.setBounds(490, 230, 300, 30);
		panel.add(lb_typePw);

		tf_pw = new JTextField();
		tf_pw.setDropMode(DropMode.INSERT);
		tf_pw.setHorizontalAlignment(SwingConstants.CENTER);
		tf_pw.setColumns(125);
		tf_pw.setBounds(390, 260, 500, 30);
		panel.add(tf_pw);

		JButton bt_deleteConfirm = new JButton("");
		bt_deleteConfirm.setIcon(new ImageIcon(DeleteId_1.class.getResource("/image/seungho/bt_delete_small.png")));

		// 회원탈퇴 버튼을 클릭시 데이터베이스에서 회원정보가 삭제되며, DeletId_2 클래스 화면으로 이동.
		bt_deleteConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("DB에 해당 아이디의 비밀번호와 일치하는지 확인");
				mainFrame.PageChange(MainFrame.PANELNAME.DELETE2);

			}
		});
		bt_deleteConfirm.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		bt_deleteConfirm.setBounds(390, 470, 245, 50);
		panel.add(bt_deleteConfirm);

		JButton bt_cancel = new JButton("");
		bt_cancel.setIcon(new ImageIcon(DeleteId_1.class.getResource("/image/seungho/bt_cancel.png")));

		// 취소버튼 클릭시 메인페이지로 화면 전환.
		bt_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.PageChange(MainFrame.PANELNAME.MAIN);
			}
		});
		bt_cancel.setFont(new Font("굴림", Font.PLAIN, 12));
		bt_cancel.setBounds(645, 470, 245, 50);
		panel.add(bt_cancel);

		this.setVisible(false);
	}
}
