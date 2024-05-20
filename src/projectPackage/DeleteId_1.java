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
//	private JPasswordField JPwFiled;
	private UserInfo_DAO dao;

	ArrayList<UserInfoVo> list_Id;
	ArrayList<UserInfoVo> delete_id;
	private int user_no;
	
	

	
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
//				String inId = Session.getInstance().getUserId();
				String pw = tf_pw.getText();
				
				dao = new UserInfo_DAO(); //UserInfo_DVO 클래스의 인스턴스 생성.
				list_Id = dao.Login(inId); //입력한 아이디를 사용하여 DAO가 접근해여 얻은 사용자의 ID를 가져옴.
				
				dao = new UserInfo_DAO();
				System.out.println("여기까지 됨.");
				delete_id = dao.DeleteId(inId, pw); // DAO 클래스 출력값 호출
				
				if (delete_id.size() != 0) {
					for (int i = 0; i < delete_id.size(); i++) {
						UserInfoVo data = (UserInfoVo) delete_id.get(i);
						
						String gpwd = data.getUserPw();
						
						if (String.valueOf(pw).equals(gpwd)) {
							System.out.println("회원탈퇴가 완료되었습니다.");
							System.out.println("탈퇴완료 화면으로 이동.");
							tf_pw.setText("");
							mainFrame.PageChange(MainFrame.PANELNAME.DELETE2);
							
						} else {
							System.out.println("비밀번호가 일치하지 않습니다.");
							JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.", "회원탈퇴 실패", 1);
							tf_pw.setText("");
						}
					}

				} else {
					System.out.println("비밀번호가 일치하지 않습니다.");
					JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.", "회원탈퇴 실패", 1);
					tf_pw.setText("");
				}

			}
			
		});

//		JPwFiled = new JPasswordField();
//		JPwFiled.setBorder(new EmptyBorder(0, 10, 0, 0));
//		JPwFiled.setHorizontalAlignment(SwingConstants.CENTER);
//		JPwFiled.setEchoChar('*');
//		JPwFiled.setBounds(389, 260, 501, 30);
//		panel.add(JPwFiled);
		
//		// 회원탈퇴 버튼을 클릭시 데이터베이스에서 회원정보가 삭제되며, DeletId_2 클래스 화면으로 이동.
//		bt_deleteConfirm.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//
//				System.out.println("DB에 해당 아이디의 비밀번호와 일치하는지 확인");
//
//				String inPw = new String(JPwFiled.getPassword());
//				dao = new UserInfo_DAO();
//				Delete = dao.Delete(inPw); // DAO 클래스 출력값 호출
//				System.out.println(inPw);//정상 출력됨.
//				
//				System.out.println(Delete);
//
//				if (Delete.size() > 0) {
//					for (int i = 0; i < Delete.size(); i++) {
//						UserInfoVo data = (UserInfoVo) Delete.get(i);
//						String gpwd = data.getUserPw();
//						
//						System.out.println("여기까지는 안옴.");
//
//						char[] pw = (JPwFiled.getPassword());
//
//						System.out.println (gpwd);
//
//						if (String.valueOf(pw).equals(gpwd)) {
//
//							JPopupMenu popupMenu = new JPopupMenu();
//							popupMenu.addKeyListener(new KeyAdapter() {
//								@Override
//								public void keyPressed(KeyEvent e) {
//									JOptionPane.showMessageDialog(null, "정말 탈퇴 하시겠습니까?." , "회원탈퇴", 1);
//								}
//							});
//							System.out.println("회원탈퇴가 완료되었습니다.");
//
//							mainFrame.PageChange(MainFrame.PANELNAME.MAIN);
//								};
//						} 
//				}else {
//					JOptionPane.showMessageDialog(null, "아이디나 패스워드가 올바르지 않습니다.", "로그인 실패", 1);
//					System.out.println("회원탈퇴가 실패됬습니다.");
//					JPwFiled.setText("");
//			}
//			}
//		});
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

	public void find_user_no(int user_no) {
		// TODO Auto-generated method stub
		this.user_no = user_no;
		System.out.println("삭제할 유저 넘버 표시하기 " + user_no);
	}
}
