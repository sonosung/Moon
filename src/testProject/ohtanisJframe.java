package testProject;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class ohtanisJframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ohtanisJframe frame = new ohtanisJframe();
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
	public ohtanisJframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 1264, 120);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JButton btnNewButton = new JButton("Join");
		btnNewButton.setFont(new Font("돋움", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(1180, 87, 72, 23);
		panel1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Login");
		btnNewButton_1.addActionListener(new ActionListener());
		btnNewButton_1.setBounds(1096, 87, 72, 23);
		panel1.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Search");
		btnNewButton_1_1.addActionListener(new ActionListener());
		btnNewButton_1_1.setBounds(972, 87, 72, 23);
		panel1.add(btnNewButton_1_1);
		
		textField = new JTextField();
		textField.setBounds(814, 88, 146, 21);
		panel1.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setAction(action_1);
		btnNewButton_2.setBounds(12, 87, 97, 23);
		panel1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(122, 87, 97, 23);
		panel1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(231, 87, 97, 23);
		panel1.add(btnNewButton_4);
		
		JPanel panel2 = new JPanel();
		panel2.setBounds(0, 118, 1264, 643);
		contentPane.add(panel2);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
