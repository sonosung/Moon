package projectPackage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class ContentPanel2 extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	public ContentPanel2(MainFrame mainFrame) {
		
		this.mainFrame = mainFrame;
		
		setLayout(null);
		this.setSize(1280,800-150);
		this.setPreferredSize(new Dimension(1280,800-150));
		this.setBackground(Color.red);
		this.setVisible(false);
	}

}
