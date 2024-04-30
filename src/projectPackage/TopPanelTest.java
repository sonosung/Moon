
package projectPackage;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.Icon;

public class TopPanelTest extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField textField_1;
    private MainFrame mainFrame;

    /**
     * Create the panel.
     */
    public TopPanelTest(MainFrame mainFrame)  {
        setLayout(null);
        
        this.mainFrame = mainFrame;
        JPanel panel_1 = new JPanel();
        this.setSize(1280,150);
		this.setPreferredSize(new Dimension(1280,150));
		
        panel_1.setBackground(Color.BLACK);
        panel_1.setBounds(0, 0, 1280, 150);
        add(panel_1);
        panel_1.setLayout(null);
        
        // Image loading
        try {
            JLabel imageLabel = new JLabel(new ImageIcon(TopPanelTest.class.getResource("/image/ohtani/cgving2.png")));
            imageLabel.setBounds(45, 48, 200, 51);  // x, y 위치와 이미지 사이즈 설정
            panel_1.add(imageLabel);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        textField_1 = new JTextField();
        textField_1.setBounds(790, 77, 158, 41);
        panel_1.add(textField_1);
        textField_1.setColumns(40);
        
        JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.setIcon(new ImageIcon(TopPanelTest.class.getResource("/image/ohtani/search2.png")));
        btnNewButton_1.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 14));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnNewButton_1.setBounds(960, 76, 128, 42);
        panel_1.add(btnNewButton_1);
        
        
        JButton btnNewButton_2 = new JButton("");
        btnNewButton_2.setIcon(new ImageIcon(TopPanelTest.class.getResource("/image/ohtani/login2.png")));
        btnNewButton_2.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 14));
        btnNewButton_2.setBounds(1118, 62, 50, 57);
        panel_1.add(btnNewButton_2);
        
        JButton btnNewButton_3 = new JButton("");
        btnNewButton_3.setIcon(new ImageIcon(TopPanelTest.class.getResource("/image/ohtani/join2.png")));
        btnNewButton_3.setFont(new Font("나눔고딕 ExtraBold", Font.PLAIN, 14));
        btnNewButton_3.setBounds(1180, 62, 50, 57);
        panel_1.add(btnNewButton_3);
        
        JLabel lblNewLabel = new JLabel("C U L T U R E P L E X");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("나눔고딕", Font.BOLD, 16));
        lblNewLabel.setBounds(246, 77, 174, 15);
        panel_1.add(lblNewLabel);
        
        this.setVisible(true);
    }
}

