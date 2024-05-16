package projectPackage;

import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.EmptyBorder;

public class TopPanelTest extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextField textField_1;
    private MainFrame mainFrame;
    private JTextField txtOhtani;
    private UserInfo_DAO dao;
    ArrayList<UserInfoVo> list;


    public TopPanelTest(MainFrame mainFrame) {
        setLayout(null);
        
        dao = new UserInfo_DAO();
        
        this.mainFrame = mainFrame;
        this.setSize(1280,150);
        this.setPreferredSize(new Dimension(1280,150));
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.BLACK);
        panel_1.setBounds(0, 0, 1280, 150);
        panel_1.setLayout(null);
        add(panel_1);
        
        JLabel imageLabel = new JLabel(new ImageIcon(TopPanelTest.class.getResource("/image/ohtani/cgving2.png")));
        imageLabel.setBounds(45, 48, 200, 51);
        panel_1.add(imageLabel);
        imageLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mainFrame.PageChange(MainFrame.PANELNAME.MAIN);
            }
        });
        
        JLabel lblNewLabel = new JLabel("C U L T U R E P L E X");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 16));
        lblNewLabel.setBounds(246, 77, 174, 15);
        panel_1.add(lblNewLabel);
        
        //검색창
        textField_1 = new JTextField();
        textField_1.setBorder(new EmptyBorder(0, 10, 0, 0));
        textField_1.setBounds(953, 101, 250, 21);
        panel_1.add(textField_1);
        textField_1.setColumns(40);
        
        JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.setBorderPainted(false);
        btnNewButton_1.setIcon(new ImageIcon(TopPanelTest.class.getResource("/image/button/search_s.png")));
        btnNewButton_1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 14));
        btnNewButton_1.setBounds(1209, 92, 32, 32);
        panel_1.add(btnNewButton_1);
        
        //검색창에 영화이름 입력후 버튼 클릭시, 해당 영화의 팝업 출력. 해당영화 없을 시 예외처리.
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String searchText = textField_1.getText().toLowerCase();
                switch (searchText) {
                    case "범죄도시4":
                        new CrimePopup().setVisible(true);
                        break;
                    case "쿵푸팬더4":
                        new KungfuPopup().setVisible(true);
                        break;
                    case "스턴트맨":
                        new StuntPopup().setVisible(true);
                        break;
                    case "챌린저스":
                        new ChalPopup().setVisible(true);
                        break;
                    case "몬스터 프렌즈":
                        new MonPopup().setVisible(true);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "검색 결과가 없습니다.");
                        break;
                }
            }
        });	
        


        JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.setBorderPainted(false);
        btnNewButton_2.setIcon(new ImageIcon(TopPanelTest.class.getResource("/image/button/login_s.png")));
        btnNewButton_2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 14));
        btnNewButton_2.setBounds(1170, 20, 32, 32);
        
        //로그인 화면으로 이동하는 이벤트.
        btnNewButton_2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		mainFrame.PageChange(MainFrame.PANELNAME.LOGIN);
        		
        	}
        });
        panel_1.add(btnNewButton_2);
        

        JButton btnNewButton_3 = new JButton("");
        btnNewButton_3.setBorderPainted(false);
        btnNewButton_3.setIcon(new ImageIcon(TopPanelTest.class.getResource("/image/button/join_s.png")));
        btnNewButton_3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 14));
        btnNewButton_3.setBounds(1209, 20, 32, 32);
        
<<<<<<< HEAD
        //회원가입 페이지로 이동하는 이벤트
        btnNewButton_3.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		mainFrame.PageChange(MainFrame.PANELNAME.CREATE1);
        	}
        });
        panel_1.add(btnNewButton_3);
        
          //로그인 성공시 띄울 라벨
//        txtOhtani = new JTextField();
//        txtOhtani.setEditable(false);
//        txtOhtani.setHorizontalAlignment(SwingConstants.CENTER);
//        txtOhtani.setText("님 환영합니다.");
//        txtOhtani.setBounds(1031, 31, 134, 21);
//        txtOhtani.setColumns(10);
//        panel_1.add(txtOhtani);
          
          //로그아웃 버튼
        JButton bt_logout = new JButton("");
        bt_logout.setForeground(Color.WHITE);
        bt_logout.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                mainFrame.PageChange(MainFrame.PANELNAME.MAIN);
            }
        });
        bt_logout.setOpaque(false);
        bt_logout.setIcon(new ImageIcon(TopPanelTest.class.getResource("/image/button/logout_s.png")));
        bt_logout.setBounds(1173, 62, 30, 25);
        panel_1.add(bt_logout);
        
        JButton btnNewButton_4 = new JButton("");
        btnNewButton_4.setIcon(new ImageIcon(TopPanelTest.class.getResource("/image/button/mypage_s.png")));
        btnNewButton_4.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mainFrame.PageChange(MainFrame.PANELNAME.MYPAGE);
        	}
        });
        btnNewButton_4.setBounds(1209, 62, 30, 25);
        panel_1.add(btnNewButton_4);
        
<<<<<<< HEAD
=======
        JLabel lblNewLabel_1 = new JLabel("추후에 수정할 예정!");
        lblNewLabel_1.setFont(new Font("나눔고딕", Font.PLAIN, 15));
        lblNewLabel_1.setForeground(Color.WHITE);
        lblNewLabel_1.setBounds(1031, 62, 134, 20);
        panel_1.add(lblNewLabel_1);
        
=======
        txtOhtani = new JTextField();
        txtOhtani.setText("ohtani님 환영합니다.");
        txtOhtani.setBounds(1031, 31, 134, 21);
        panel_1.add(txtOhtani);
        txtOhtani.setColumns(10);
        
        JButton btnNewButton = new JButton("");
        btnNewButton.setIcon(new ImageIcon(TopPanelTest.class.getResource("/image/button/reserve.png")));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mainFrame.PageChange(MainFrame.PANELNAME.TICKETING);
        	}
        });
        btnNewButton.setBounds(784, 91, 110, 40);
        panel_1.add(btnNewButton);
        

        

>>>>>>> refs/remotes/origin/sanghwan
>>>>>>> refs/heads/main
        this.setVisible(true);
    }
}
