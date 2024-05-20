package projectPackage;

import java.awt.Dimension;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class An_zzz extends JPanel {
	private MainFrame mainFrame;
	private static final long serialVersionUID = 1L;
	private String[] jinsung;
	JLabel lblNewLabel_1 = new JLabel();
	JLabel lblNewLabel_2 = new JLabel();
	JLabel lblNewLabel_3 = new JLabel();
	/**
	 * Create the panel.
	 */
	public An_zzz(MainFrame mainFrame) {
		jinsung = new String[4];
		this.mainFrame = mainFrame;
		this.setSize(1280,800-150);
		this.setPreferredSize(new Dimension(1280,800-150));
		setLayout(null);	
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 1280, 650);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("내 예매");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 26));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(67, 275, 272, 193);
		panel.add(lblNewLabel);
		
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(692, 250, 576, 60);
		panel.add(lblNewLabel_1);
		
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 26));
		lblNewLabel_2.setBounds(692, 350, 563, 60);
		panel.add(lblNewLabel_2);
		
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 26));
		lblNewLabel_3.setBounds(692, 350, 630, 60);
		panel.add(lblNewLabel_3);
				
		this.setVisible(false);
	}
	
	public void Page_jin(String[] jinsung) {
		this.jinsung = jinsung;
		jin();
	}
	
	public void jin() {
		StringBuilder labelText = new StringBuilder();
        for (int i = 0; i < jinsung.length; i++) {
            System.out.println("시트  " + jinsung[i]);
            labelText.append( jinsung[i]);
            if (i <  jinsung.length - 1) {
                labelText.append(" ");
            }
        }
        
        lblNewLabel_1.setText(labelText.toString());
        lblNewLabel_1.setText(jinsung[0] + "   \n   "+ jinsung[1]);
        lblNewLabel_2.setText(jinsung[2] + "  \n  "+jinsung[3]);
	}
}
