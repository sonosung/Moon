package projectPackage;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.Canvas;
import java.awt.Label;

public class TopPanelTest extends JPanel {

	private static final long serialVersionUID = 1L;
	private final Label label = new Label("New label");

	/**
	 * Create the panel.
	 */
	public TopPanelTest() {
		setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(1062, 117, 97, 23);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Join");
		btnNewButton_2.setBounds(1171, 117, 97, 23);
		add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Search");
		btnNewButton_3.setBounds(953, 117, 97, 23);
		add(btnNewButton_3);
		
		Image image.ohtani = new ImageIcon(this.getClass().getResource("/cgving2.png")).getImage();
		label.setIcon(new ImageIcon(image.ohtani));
		label.setBounds(616, 87, 128, 31);
		add(label);

	}
}
