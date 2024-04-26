package testProject;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class jFrameTest extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JEditorPane editorPane;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    jFrameTest frame = new jFrameTest();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public jFrameTest() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1080, 800);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JPanel panel1 = new JPanel();
        panel1.setBounds(0, 0, 1064, 110);
        contentPane.add(panel1);
        panel1.setLayout(null);
        
        JButton btnNewButton = new JButton("Search");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                loadPage();
            }
        });
        btnNewButton.setBounds(955, 77, 97, 23);
        panel1.add(btnNewButton);
        
        textField = new JTextField();
        textField.setBounds(827, 78, 116, 21);
        panel1.add(textField);
        textField.setColumns(10);
        
        JPanel panel2 = new JPanel();
        panel2.setBounds(0, 110, 1064, 651);
        contentPane.add(panel2);
        panel2.setLayout(null);
        
        editorPane = new JEditorPane();
        editorPane.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(editorPane);
        scrollPane.setBounds(10, 11, 1044, 629);
        panel2.add(scrollPane);
    }

    private void loadPage() {
        new Thread(() -> {
            try {
                String url = "";
                switch (textField.getText()) {
                    case "범죄도시4":
                        url = "http://www.cgv.co.kr/movies/detail-view/?midx=88104";
                        break;
                    case "쿵푸팬더4":
                        url = "http://www.cgv.co.kr/movies/detail-view/?midx=87948";
                        break;
                    case "스턴트맨":
                        url = "http://www.cgv.co.kr/movies/detail-view/?midx=88153";
                        break;
                    case "챌린저스":
                        url = "http://www.cgv.co.kr/movies/detail-view/?midx=88179";
                        break;
                    case "몬스터 프렌즈":
                    case "몬스터프렌즈":
                        url = "http://www.cgv.co.kr/movies/detail-view/?midx=88179";
                        break;
                }
                editorPane.setPage(url); // Load the page on a separate thread
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }
}
