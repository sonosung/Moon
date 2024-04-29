package projectPackage;

import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PopupTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PopupTest frame = new PopupTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PopupTest() {
		 this.setTitle("제목이 변경된 윈도우");
	        this.setBounds(800, 100, 400, 200);
	        
	        Container container = this.getContentPane();
	        container.setBackground(Color.ORANGE);
	        
	        JButton btnNewButton = new JButton("New button");
	        btnNewButton.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        	}
	        });
	        getContentPane().add(btnNewButton, BorderLayout.CENTER);
	        
	        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        this.setVisible(false);
	}

}
