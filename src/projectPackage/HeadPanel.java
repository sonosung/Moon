package projectPackage;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HeadPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;
	private JPanel thisPanel;

	/**
	 * Create the panel.
	 */
	public HeadPanel(MainFrame mainFrame) {
		
		this.mainFrame = mainFrame;
		this.thisPanel = this;
		
		this.setSize(1280,150);
		this.setPreferredSize(new Dimension(1280,150));
		this.setBackground(Color.cyan);
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("HeadPanel --");
		lblNewLabel.setFont(new Font("Adobe 고딕 Std B", Font.PLAIN, 15));
		lblNewLabel.setBounds(24, 10, 246, 64);
		add(lblNewLabel);
		
		JButton btnNewButton = new JButton("New button");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.PageChange(MainFrame.PANELNAME.MAIN);
			}
		});
		
		btnNewButton.setBounds(24, 66, 127, 41);
		add(btnNewButton);
		//-------------------------------------------------//
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.PageChange(MainFrame.PANELNAME.PAGE0);
			}
		});
		btnNewButton_1.setBounds(163, 66, 107, 41);
		add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainFrame.PageChange(MainFrame.PANELNAME.PAGE1);
			}
		});
		btnNewButton_2.setBounds(282, 66, 111, 41);
		add(btnNewButton_2);
	}
	
	class actionDefineClass implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println(1111);
		}
	}
}