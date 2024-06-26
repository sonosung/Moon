package projectPackage;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.border.EmptyBorder;

public class TopPanel extends JPanel {
    private static final long serialVersionUID = 1L;
    private JTextField tf_search;
    private MainFrame mainFrame;

    public TopPanel(MainFrame mainFrame) {
        setLayout(null);
        
        this.mainFrame = mainFrame;
        this.setSize(1280,150);
        this.setPreferredSize(new Dimension(1280,150));
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.BLACK);
        panel_1.setBounds(0, 0, 1280, 150);
        panel_1.setLayout(null);
        add(panel_1);
        
        //로고 이미지
        JLabel logo = new JLabel(new ImageIcon(TopPanel.class.getResource("/image/ohtani/cgving2.png")));
        logo.setBounds(45, 48, 200, 51);
        panel_1.add(logo);
        logo.addMouseListener(new MouseAdapter() {
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
        tf_search = new JTextField();
        tf_search.setBorder(new EmptyBorder(0, 10, 0, 0));
        tf_search.setBounds(953, 101, 250, 21);
        panel_1.add(tf_search);
        tf_search.setColumns(40);
        
        //검색 버튼
        JButton btn_search = new JButton("");
        btn_search.setBorderPainted(false);
        btn_search.setIcon(new ImageIcon(TopPanel.class.getResource("/image/button/search_s.png")));
        btn_search.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 14));
        btn_search.setBounds(1209, 92, 32, 32);
        panel_1.add(btn_search);
        
        //검색창에 영화이름 입력후 버튼 클릭시, 해당 영화의 팝업 출력. 해당영화 없을 시 예외처리.
        btn_search.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String searchText = tf_search.getText().toLowerCase();
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
        
        //로그인 버튼
        JButton btn_login = new JButton("");
        btn_login.setBorderPainted(false);
        btn_login.setIcon(new ImageIcon(TopPanel.class.getResource("/image/button/login_s.png")));
        btn_login.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 14));
        btn_login.setBounds(1170, 20, 32, 32);
        btn_login.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {

        		mainFrame.PageChange(MainFrame.PANELNAME.LOGIN);

        	}
        });
        panel_1.add(btn_login);
        
        //회원가입 버튼
        JButton btn_join = new JButton("");
        btn_join = new JButton();
        btn_join.setBorderPainted(false);
        btn_join.setIcon(new ImageIcon(TopPanel.class.getResource("/image/button/join_s.png")));
        btn_join.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 14));
        btn_join.setBounds(1209, 20, 32, 32);
        
        //회원가입 페이지로 이동하는 이벤트
        btn_join.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		mainFrame.PageChange(MainFrame.PANELNAME.CREATE1);
        	}
        });
        panel_1.add(btn_join);
        
        JButton btnNewButton_5 = new JButton("");
        btnNewButton_5.setIcon(new ImageIcon(TopPanel.class.getResource("/image/button/reserve.png")));
        btnNewButton_5.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		mainFrame.PageChange(MainFrame.PANELNAME.TICKETING);
        	}
        });
        btnNewButton_5.setBounds(784, 91, 110, 40);
        panel_1.add(btnNewButton_5);
    }
        
}