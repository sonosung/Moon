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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.DropMode;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DeleteId_1 extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;
	private Connection conn;
	/**
	 * Create the panel.
	 */
	Color bg = new Color(0xdfeff0);
	private JPasswordField JPwFiled;
	private UserInfo_DAO dao;
	ArrayList<UserInfoVo> Delete;

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

		JPwFiled = new JPasswordField();
		JPwFiled.setBorder(new EmptyBorder(0, 10, 0, 0));
		JPwFiled.setHorizontalAlignment(SwingConstants.CENTER);
		JPwFiled.setEchoChar('*');
		JPwFiled.setBounds(389, 260, 501, 30);
		panel.add(JPwFiled);
		
		JButton bt_deleteConfirm = new JButton("");
		bt_deleteConfirm.setIcon(new ImageIcon(DeleteId_1.class.getResource("/image/seungho/bt_delete_small.png")));

		// 회원탈퇴 버튼을 클릭시 데이터베이스에서 회원정보가 삭제되며, DeletId_2 클래스 화면으로 이동.
		bt_deleteConfirm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("DB에 해당 아이디의 비밀번호와 일치하는지 확인");
				
				String inPw = new String(JPwFiled.getPassword());
				dao = new UserInfo_DAO();
				Delete = dao.Delete(inPw); // DAO 클래스 출력값 호출

				if (Delete.size() > 0) {
					for (int i = 0; i < Delete.size(); i++) {
						UserInfoVo data = (UserInfoVo) Delete.get(i);
						String gpwd = data.getUserPw();

						char[] pw = (JPwFiled.getPassword());
						
						System.out.println (gpwd);
						
						if (String.valueOf(pw).equals(gpwd)) {
							
							JPopupMenu popupMenu = new JPopupMenu();
							popupMenu.addKeyListener(new KeyAdapter() {
								@Override
								public void keyPressed(KeyEvent e) {
									JOptionPane.showMessageDialog(null, "정말 탈퇴 하시겠습니까?." , "회원탈퇴", 1);
								}
							});
							System.out.println("회원탈퇴가 완료되었습니다.");

							mainFrame.PageChange(MainFrame.PANELNAME.MAIN);
								};
						} 
				}else {
					JOptionPane.showMessageDialog(null, "아이디나 패스워드가 올바르지 않습니다.", "로그인 실패", 1);
					System.out.println("회원탈퇴가 실패됬습니다.");
					JPwFiled.setText("");
			}
			}
		});
		
//		addPopup(JPwFiled, popupMenu);
		bt_deleteConfirm.setFont(new Font("나눔고딕", Font.PLAIN, 12));
		bt_deleteConfirm.setBounds(390, 470, 245, 50);
		panel.add(bt_deleteConfirm);

		JButton bt_cancel = new JButton("");
		bt_cancel.setFont(new Font("굴림", Font.PLAIN, 12));
		bt_cancel.setBounds(645, 470, 245, 50);
		bt_cancel.setIcon(new ImageIcon(DeleteId_1.class.getResource("/image/seungho/bt_cancel.png")));

		// 취소버튼 클릭시, 메인페이지로 화면 전환.
		bt_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("메인페이지로 이동");
				mainFrame.PageChange(MainFrame.PANELNAME.MAIN);
			}
		});
		
		panel.add(bt_cancel);

		this.setVisible(false);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
