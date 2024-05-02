package projectPackage;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AnCont4 extends JPanel {
	private MainFrame mainFrame;
	private static final long serialVersionUID = 1L;

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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(364, 0, 553, 650);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OtanP();
		    	setVisible(false);
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(AnCont4.class.getResource("/anSH_img/마동석이 2.png")));
		lblNewLabel_1.setBounds(155, 95, 90, 128);
		panel_1.add(lblNewLabel_1);
		btnNewButton.setIcon(new ImageIcon(AnCont4.class.getResource("/image/button/ok.png")));
		btnNewButton.setBounds(441, 536, 110, 42);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\제목 없음.png"));
		lblNewLabel.setBounds(0, 0, 553, 650);
		panel_1.add(lblNewLabel);
		
		this.setVisible(false);
	}
	
	private void OtanP() {
		OhtanisPanel Otan = new OhtanisPanel(mainFrame);
        mainFrame.PageChange(MainFrame.PANELNAME.MAIN); 
    }
}
