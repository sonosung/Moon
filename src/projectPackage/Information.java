package projectPackage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Information extends JPanel {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	public Information() {
		setLayout(null);
		
		setLayout(null);
		this.setSize(1280, 800 - 150);
		this.setPreferredSize(new Dimension(1280, 800 - 150));
		this.setBackground(Color.white);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1280, 650);
		add(panel);
	}
}
