package projectPackage;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;

public class AnCont5_1panel extends JPanel {
	private MainFrame mainFrame;
	private static final long serialVersionUID = 1L;
	private JList<String> list;
	private DefaultListModel<String> movieListModel;
	private JScrollPane scrollPane;
	private HashMap<Integer, String> movieMap;
	An_SQL ansql = new An_SQL();
	JLabel lblNewLabel = new JLabel("");

	/**
	 * Create the panel.
	 */
	public AnCont5_1panel(MainFrame mainFrame) {

		this.mainFrame = mainFrame;
		this.setSize(1280, 800 - 150);
		this.setPreferredSize(new Dimension(1280, 800 - 150));
		setLayout(null);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(AnCont5_1panel.class.getResource("/image/button/ok.png")));
		btnNewButton_1.setBounds(893, 498, 110, 40);
		add(btnNewButton_1);

		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openAnCont2Panel();
				setVisible(false);
			}
		});

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(AnCont5_1panel.class.getResource("/image/button/back.png")));
		btnNewButton.setBounds(262, 498, 110, 40);
		add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MainGo();
				setVisible(false);
			}
		});

		lblNewLabel.setIcon(new ImageIcon(AnCont5_1panel.class.getResource("/anSH_img/Yamae.png")));
		lblNewLabel.setBounds(0, 0, 1280, 650);
		add(lblNewLabel);

		this.setVisible(false);

		ansql.An_SQL1();
		HashMap<Integer, String> movieMap = ansql.Movielist();
		Vector<String> movieNames = new Vector<>(movieMap.values());
		JList<String> list = new JList<String>(movieNames);
		list.setCellRenderer(new MyCellRenderer());
		list.setBounds(300, 0, 270, 225);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(264, 205, 233, 270);
		lblNewLabel.add(scrollPane);
		this.setVisible(false);

		list.addListSelectionListener(e -> {
			if (e.getValueIsAdjusting()) {
				String selectedMovie = list.getSelectedValue();
				int movieNo = 0;

				for (Map.Entry<Integer, String> entry : movieMap.entrySet()) {
					if (entry.getValue().equals(selectedMovie)) {
						movieNo = entry.getKey();
						break;
					}
				}

				ansql.setSelectedMovieNo(movieNo);
				list2();
			}
		});
	}

	public void list2() {
		HashMap<Integer, String> LocalMap = ansql.Allsearch();
		Vector<String> LocalName = new Vector<>(LocalMap.values());
		JList<String> list2 = new JList<String>(LocalName);
		list2.setCellRenderer(new MyCellRenderer());
		list2.setBounds(300, 0, 270, 222);
		JScrollPane scrollPane2 = new JScrollPane(list2);
		scrollPane2.setBounds(500, 205, 110, 270);
		lblNewLabel.add(scrollPane2);
		
        lblNewLabel.revalidate();
        lblNewLabel.repaint();
        
		list2.addListSelectionListener(o -> {
			if (o.getValueIsAdjusting()) {
				String selectedLocal = list2.getSelectedValue();
				int LocalNo = 0;
				for (Map.Entry<Integer, String> entry : LocalMap.entrySet()) {
					if (entry.getValue().equals(selectedLocal)) {
						LocalNo = entry.getKey();
						break;
					}
				}
				ansql.setSelectedLocalNo(LocalNo);
				list3();
			}
		});
	}

	public void list3() {
		HashMap<Integer, String> TheaterMap = ansql.Allsearch2();
		Vector<String> TheaterName = new Vector<>(TheaterMap.values());
		JList<String> list3 = new JList<String>(TheaterName);
		list3.setCellRenderer(new MyCellRenderer());
		list3.setBounds(300, 0, 270, 222);
		JScrollPane scrollPane3 = new JScrollPane(list3);
		scrollPane3.setBounds(615, 205, 110, 270);
		lblNewLabel.add(scrollPane3);
		
	       lblNewLabel.revalidate();
	        lblNewLabel.repaint();

		list3.addListSelectionListener(i -> {
			if (i.getValueIsAdjusting()) {
				String selectedTheater = list3.getSelectedValue();
				int TheaterNo = 0;
				for (Map.Entry<Integer, String> entry : TheaterMap.entrySet()) {
					if (entry.getValue().equals(selectedTheater)) {
						TheaterNo = entry.getKey();
						break;
					}
				}
				ansql.setSelectedTheaterNo(TheaterNo);
				list4();
			}
		});
	}

	public void list4() {
		HashMap<Integer, String> TimeMap = ansql.Allsearch3();
		Vector<String> TimeName = new Vector<>(TimeMap.values());
		JList<String> list4 = new JList<String>(TimeName);
		list4.setCellRenderer(new MyCellRenderer());
		list4.setBounds(300, 0, 270, 222);
		JScrollPane scrollPane4 = new JScrollPane(list4);
		scrollPane4.setBounds(730, 205, 270, 270);
		lblNewLabel.add(scrollPane4);
		
	       lblNewLabel.revalidate();
	        lblNewLabel.repaint();

		list4.addListSelectionListener(p -> {
			if (p.getValueIsAdjusting()) {
				String Timess = list4.getSelectedValue();
				int Times = 0;
				for (Map.Entry<Integer, String> entry : TimeMap.entrySet()) {
					if (entry.getValue().equals(Timess)) {
						Times = entry.getKey();
						break;
					}
				}
			}
		});

	}

	class MyCellRenderer extends JLabel implements ListCellRenderer<Object> {
		MyCellRenderer() {
			setOpaque(true);
		}

		public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected,
				boolean cellHasFocus) {
			setText(value.toString());

			setPreferredSize(new Dimension(50, 50));
			setHorizontalAlignment(SwingConstants.LEFT);

			Font font = getFont();
			setFont(font.deriveFont(15f));
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

	private void openAnCont2Panel() {
		AnCont2 anCont2Panel = new AnCont2(mainFrame);
		mainFrame.PageChange(MainFrame.PANELNAME.SELECT);
		this.setVisible(false);
	}

	private void MainGo() {
		OhtanisPanel anCont2Panel = new OhtanisPanel(mainFrame);
		mainFrame.PageChange(MainFrame.PANELNAME.MAIN);
	}

}