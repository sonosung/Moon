package projectPackage;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.List;
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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class AnCont5_1panel extends JPanel {
	private MainFrame mainFrame;
	private static final long serialVersionUID = 1L;
	private JList<String> list;
	private DefaultListModel<String> movieListModel;
	private JScrollPane scrollPane;
	private HashMap<Integer, String> movieMap;
	private HashMap<Integer, String> LocalMap;
	private HashMap<Integer, String> HouseMap;
	private HashMap<Integer, String> TimeMap;
	String select_movie[] = new String[4];
	JList<String> list2 = new JList<String>();
	JList<String> list3 = new JList<String>();
	JList<String> list4 = new JList<String>();
	JLabel lblNewLabel = new JLabel("");
	int key[] = new int[4];

	/**
	 * Create the panel.
	 */
	public AnCont5_1panel(MainFrame mainFrame) {
		this.mainFrame = mainFrame;
		this.setSize(1280, 800 - 150);
		this.setPreferredSize(new Dimension(1280, 800 - 150));
		setLayout(null);

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

		lblNewLabel.setIcon(new ImageIcon(AnCont5_1panel.class.getResource("/anSH_img/Yamae2.png")));
		lblNewLabel.setBounds(0, 0, 1280, 650);
		add(lblNewLabel);

		this.setVisible(false);

		mainFrame.ansql.An_SQL1();
		HashMap<Integer, String> movieMap = mainFrame.ansql.Movielist();
		Vector<String> movieNames = new Vector<>(movieMap.values());
		JList<String> list = new JList<String>(movieNames);
		list.setCellRenderer(new MyCellRenderer());
		list.setBounds(300, 0, 270, 225);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(264, 205, 233, 270);
		lblNewLabel.add(scrollPane);
		
//		JList<String> list2 = new JList<String>();
		list2.setCellRenderer(new MyCellRenderer());
		list2.setBounds(300, 0, 270, 225);
		JScrollPane scrollPane2 = new JScrollPane(list2);
		scrollPane2.setBounds(503, 205, 110, 270);
		lblNewLabel.add(scrollPane2);	
		
//		JList<String> list3 = new JList<String>();
		list3.setCellRenderer(new MyCellRenderer());
		list3.setBounds(300, 0, 270, 225);
		JScrollPane scrollPane3 = new JScrollPane(list3);
		scrollPane3.setBounds(617, 205, 110, 270);
		lblNewLabel.add(scrollPane3);	
		
//		JList<String> list4 = new JList<String>();
		list4.setCellRenderer(new MyCellRenderer());
		list4.setBounds(300, 0, 270, 225);
		JScrollPane scrollPane4 = new JScrollPane(list4);
		scrollPane4.setBounds(730, 205, 270, 270);
		lblNewLabel.add(scrollPane4);	

		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				if(e.getValueIsAdjusting())
					return;
								
				int movieno = 0;
				String selectedMovie = list.getSelectedValue();

				for (Map.Entry<Integer, String> entry : movieMap.entrySet()) 
				{
					if (entry.getValue().equals(selectedMovie)) {
						movieno = entry.getKey();
						break;
					}
				}
				String moviename = (String)movieMap.get(movieno);
				select_movie[0]= moviename;
				
				mainFrame.ansql.setSelectedMovieNo(movieno);
				key[0] = movieno;
				LocalMap = mainFrame.ansql.Allsearch();
				
				Vector<String> Localname = new Vector<>(LocalMap.values());
				list2.setListData(Localname);
				}
		});	
		
		list2.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {			
				if(e.getValueIsAdjusting())
					return;							
				int localno = 0;
				String selectedLocal = list2.getSelectedValue();
				for (Map.Entry<Integer, String> entry : LocalMap.entrySet()) 
				{
					if (entry.getValue().equals(selectedLocal)) {
						localno = entry.getKey();
						break;
					}
				}				
				String Localname = (String)LocalMap.get(localno);
				select_movie[1]= Localname;
				
				mainFrame.ansql.setSelectedLocalNo(localno);
				key[1] = localno;
				HouseMap = mainFrame.ansql.Allsearch2();				
				Vector<String> Housename = new Vector<>(HouseMap.values());
				list3.setListData(Housename);
				}
		});	
		
		list3.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {			
				if(e.getValueIsAdjusting())
					return;							
				int Houseno = 0;
				String selectedHouse = list3.getSelectedValue();
				for (Map.Entry<Integer, String> entry : HouseMap.entrySet()) 
				{
					if (entry.getValue().equals(selectedHouse)) {
						Houseno = entry.getKey();
						break;
					}
				}				
				String Housename = (String)HouseMap.get(Houseno);
				select_movie[2]= Housename;
				
				mainFrame.ansql.setSelectedHouseNo(Houseno);
				key[2] = Houseno;
				TimeMap = mainFrame.ansql.Allsearch3();				
				Vector<String> Timename = new Vector<>(TimeMap.values());
				list4.setListData(Timename);
				}
		});	
		
		list4.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {			
				if(e.getValueIsAdjusting())
					return;	
				int Timeno = 0;
				String selectedTime = list4.getSelectedValue();
				for (Map.Entry<Integer, String> entry : TimeMap.entrySet()) 
				{
					if (entry.getValue().equals(selectedTime)) {
						Timeno = entry.getKey();
						break;
					}
				}
				String Timename = (String)TimeMap.get(Timeno);
				select_movie[3]= Timename;
				
				key[3] = Timeno;
				mainFrame.ansql.setSelectedTime(Timeno);
		
			}
		});		

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(AnCont5_1panel.class.getResource("/image/button/ok.png")));
		btnNewButton_1.setBounds(893, 498, 110, 40);
		add(btnNewButton_1);

		btnNewButton_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				openAnCont2Panel();
//				setVisible(false);
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
		if((String)list2.getSelectedValue()!=null && (String)list3.getSelectedValue()!=null && (String)list4.getSelectedValue()!=null) {
		List<Integer> seat_no = mainFrame.ansql.seat_no();	
		mainFrame.Set_SeatValue(seat_no);
		mainFrame.Set_movie(select_movie);
		mainFrame.PageChange(MainFrame.PANELNAME.SELECT);
		this.setVisible(false);
		} else {
			
		}
	}
	private void MainGo() {
		mainFrame.PageChange(MainFrame.PANELNAME.MAIN);
		this.setVisible(false);
	}
}