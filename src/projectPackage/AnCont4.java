package projectPackage;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;

public class AnCont4 extends JPanel {
	private MainFrame mainFrame;
	private static final long serialVersionUID = 1L;
	private List<String> loding;
	JPanel panel_1 = new JPanel();
	JLabel lblNewLabel_2 = new JLabel();
	JLabel lblNewLabel_3 = new JLabel();
	JLabel lblNewLabel_4 = new JLabel();
	JLabel lblNewLabel_5 = new JLabel();
	private String[] loding2;
	/**
	 * Create the panel.
	 */
	public AnCont4(MainFrame mainFrame) {
		
		this.mainFrame = mainFrame;
		this.setSize(1280,800-150);
		this.setPreferredSize(new Dimension(1280,800-150));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 1280, 650);
		add(panel);
		panel.setLayout(null);
		
		
		panel_1.setBounds(364, 0, 553, 650);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		lblNewLabel_3.setBounds(257, 95, 137, 128);
		panel_1.add(lblNewLabel_3);
		
		
		lblNewLabel_2.setBounds(186, 315, 169, 42);
		panel_1.add(lblNewLabel_2);
		
		
		lblNewLabel_5.setBounds(170, 370, 239, 29);
		panel_1.add(lblNewLabel_5);
		
		lblNewLabel_4.setBounds(196, 248, 216, 36);
		panel_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AnCont4.class.getResource("/anSH_img/마동석이 2.png")));
		lblNewLabel_1.setBounds(155, 95, 90, 128);
		panel_1.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OtanP();
			}
		});
		btnNewButton.setIcon(new ImageIcon(AnCont4.class.getResource("/image/button/ok.png")));
		btnNewButton.setBounds(441, 536, 110, 42);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(AnCont4.class.getResource("/anSH_img/영화티케토.png")));
		lblNewLabel.setBounds(0, 0, 553, 650);
		panel_1.add(lblNewLabel);
	    panel_1.setLayout(null);
		
		this.setVisible(false);
	}
	
	public void PageInit4(List<String> loding) {
		this.loding = loding;
		lo();
	}
	
	public void PageInit5(String[] loding2) {
		this.loding2 = loding2;
	}
	
	
	public void lo() {
	        
		StringBuilder labelText = new StringBuilder();
        for (int i = 0; i < loding.size(); i++) {
            System.out.println("시트 예매한거: " + loding.get(i));
            labelText.append(loding.get(i));
            if (i < loding.size() - 1) {
                labelText.append(" ");
            }
        }
        
        lblNewLabel_2.setText(labelText.toString());
        lblNewLabel_3.setText(loding2[0]);
        lblNewLabel_5.setText(loding2[2] +"  "+loding2[1]);
        lblNewLabel_4.setText(loding2[3]);
	}

	
	private void OtanP() {
        mainFrame.PageChange(MainFrame.PANELNAME.MAIN); 
        this.setVisible(false);
    }
}