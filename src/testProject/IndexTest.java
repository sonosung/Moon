package testProject;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.net.URL;
import java.awt.FlowLayout;
import java.awt.Canvas;


public class IndexTest extends JFrame {

    public IndexTest() {
        super("CGVING"); // 윈도우 타이틀
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 800); // 윈도우 크기
        getContentPane().setLayout(new BorderLayout()); // 레이아웃 매니저 설정

        // 상단 패널 생성 및 설정
        JPanel topPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT)); // 상단 패널에 FlowLayout 매니저 사용
        topPanel.setPreferredSize(new Dimension(getWidth(), 120)); // 상단 패널 높이 설정
        getContentPane().add(topPanel, BorderLayout.NORTH);

        // 검색 필드 추가
        JTextField searchField = new JTextField(15); // 너비가 15인 텍스트 필드
        topPanel.add(searchField);

        // 검색 버튼 추가
        JButton searchButton = new JButton("검색");
        topPanel.add(searchButton);

        // 로그인 버튼 추가
        JButton loginButton = new JButton("로그인");
        topPanel.add(loginButton);

        // 회원 가입 버튼 추가
        JButton signUpButton = new JButton("회원 가입");
        topPanel.add(signUpButton);

        // 중간 패널 생성 및 설정
        JPanel middlePanel = new JPanel(new GridLayout(1, 5, 10, 10)); // 1행 5열의 그리드 레이아웃 설정
        middlePanel.setPreferredSize(new Dimension(getWidth(), 400)); // 중간 패널 높이 설정
        getContentPane().add(middlePanel, BorderLayout.CENTER); // BorderLayout의 CENTER에 중간 패널 추가

        // 이미지 URL 배열
        String[] imageUrls = {
            "https://ohtanis.com/wp-content/uploads/2024/04/crimetown.jpg",
            "https://ohtanis.com/wp-content/uploads/2024/04/stuntman.jpg",
            "https://ohtanis.com/wp-content/uploads/2024/04/kungfupanda.jpg",
            "https://ohtanis.com/wp-content/uploads/2024/04/challengers.jpg",
            "https://ohtanis.com/wp-content/uploads/2024/04/monsterfriends.jpg"
        };

        // 이미지 타이틀 배열
        String[] titles = {
            "범죄도시 예매율 91.2%",
            "스턴트맨 예매율 1.4%",
            "쿵푸팬더 예매율 1.3%",
            "첼린저스 예매율 1.2%",
            "몬스터 프렌즈 예매율 1.1%"
        };

        // 이미지와 타이틀을 레이블로 만들어 중간 패널에 추가
        for (int i = 0; i < imageUrls.length; i++) {
            try {
                URL imageUrl = new URL(imageUrls[i]);
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(imageUrl).getImage().getScaledInstance(200, 300, Image.SCALE_SMOOTH));
                JLabel imageLabel = new JLabel(titles[i], imageIcon, JLabel.CENTER);
                imageLabel.setHorizontalTextPosition(JLabel.CENTER);
                imageLabel.setVerticalTextPosition(JLabel.BOTTOM);
                middlePanel.add(imageLabel);
            } catch (Exception e) {
                e.printStackTrace();
                // 이미지 로드 실패 시 대체 텍스트 표시
                middlePanel.add(new JLabel("<html>이미지를 로드할 수 없습니다.<br>" + titles[i] + "</html>"));
            }
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new IndexTest().setVisible(true);
        });
    }
}
