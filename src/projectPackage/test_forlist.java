package projectPackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

import projectPackage.ContentPanel.MyCellRenderer;
import javax.swing.ImageIcon;

public class test_forlist extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;

	/**
	 * Create the panel.
	 */
	public test_forlist(MainFrame mainFrame) {
		
		this.mainFrame = mainFrame;
		
		setLayout(null);
		this.setSize(1280,800-150);
		this.setPreferredSize(new Dimension(1280,800-150));
		this.setBackground(Color.red);
		
		
		Vector<String> testvec = new Vector<String>();
		testvec.add("100");
		testvec.add("002");
		testvec.add("300");
		testvec.add("004");
		testvec.add("500");
		testvec.add("006");
		testvec.add("7");
		testvec.add("8");
		testvec.add("9");
		testvec.add("10");
		testvec.add("11");
		setLayout(null);
		
		
		JList<String> list = new JList<String>(testvec);
		
		list.setCellRenderer(new MyCellRenderer());
		list.setBounds(192, 199, 271, 222);
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(0, 252, 258, 133);
		//scrollPane.setPreferredSize(new Dimension(200, 150));
		
		
		add(scrollPane);		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(test_forlist.class.getResource("/image/TEST_forPersonal/ring.jpg")));
		lblNewLabel.setBounds(256, 130, 372, 411);
		add(lblNewLabel);
		
		this.setVisible(false);		
	}
	
	 class MyCellRenderer extends JLabel implements ListCellRenderer<Object> {
	        MyCellRenderer() {
	            setOpaque(true);
	        }

	        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
	            setText(value.toString());

	            // Customize size of each list item
	            setPreferredSize(new Dimension(50, 50)); // Set preferred width and height for each item
	            setHorizontalAlignment(SwingConstants.RIGHT);
	            
	            Font font = getFont();
	            setFont(font.deriveFont(20f));

	            // Set background and foreground colors based on selection
	            if (isSelected) {
	                setBackground(list.getSelectionBackground());
	                setForeground(list.getSelectionForeground());
	            } else {
	                setBackground(list.getBackground());
	                setForeground(list.getForeground());
	            }

	            return this;
	        }
	    }
}
