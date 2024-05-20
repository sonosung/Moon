package projectPackage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.DropMode;

public class DeleteId_1 extends JPanel {
	Color bg = new Color(0xdfeff0);
	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;
	/**
	 * Create the panel.
	 */
	private JTextField tf_pw;
	private JPasswordField JPwFiled;
	private UserInfo_DAO dao;

	ArrayList<UserInfoVo> list_Id;
	private LoginEventListener listener;

	public void addLoginEventListener(LoginEventListener listener) {
		this.listener = listener;
	}

	public DeleteId_1(MainFrame mainFrame) {

		this.mainFrame = mainFrame;
		this.setSize(1280, 800 - 150);
		this.setPreferredSize(new Dimension(1280, 800 - 150));
		this.setBackground(bg);
		setLayout(null);

		this.dao = new UserInfo_DAO(); // DAO 객체 초기화

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
		
		JPwFiled = new JPasswordField();
		JPwFiled.setBorder(new EmptyBorder(0, 10, 0, 0));
		JPwFiled.setHorizontalAlignment(SwingConstants.CENTER);
		JPwFiled.setEchoChar('*');
		JPwFiled.setBounds(389, 260, 501, 30);
		panel.add(JPwFiled);
		
		JButton bt_deleteConfirm = new JButton("");
		bt_deleteConfirm.setIcon(new ImageIcon(DeleteId_1.class.getResource("/image/seungho/bt_delete_small.png")));
		bt_deleteConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//JPasswordField에 입력되는 값은 Char 타입이기 때문에, 스트링으로 타입캐스팅을 해줘야한다.
				String pw = new String(JPwFiled.getPassword());
				
				String userId = Session.getInstance().getUserId(); // 현재 세션에서 사용자 ID 가져오기

				System.out.println("userId : " + userId);

				boolean success = dao.deleteUser(userId, pw); // DAO에서 회원탈퇴 처리

				if (success) {
					JOptionPane.showMessageDialog(null, "회원탈퇴가 성공적으로 완료되었습니다.", "회원탈퇴 성공",
							JOptionPane.INFORMATION_MESSAGE);
					mainFrame.PageChange(MainFrame.PANELNAME.MAIN); // 메인 화면으로 전환
					Session.getInstance().resetSession();
					mainFrame.switchToTopPanel();
				} else {
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.", "회원탈퇴 실패", JOptionPane.ERROR_MESSAGE);
					tf_pw.setText(""); // 비밀번호 필드 초기화
				}
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

