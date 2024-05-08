package projectPackage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class ContentPanel2 extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainTestFrame mainTestFrame;

	/**
	 * Create the panel.
	 */
	public ContentPanel2(MainTestFrame mainTestFrame) {
		
		this.mainTestFrame = mainTestFrame;
		
		setLayout(null);
		this.setSize(1280,800-150);
		this.setPreferredSize(new Dimension(1280,800-150));
		this.setBackground(Color.red);
		this.setVisible(false);
	}

}
