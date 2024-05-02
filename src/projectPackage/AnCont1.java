package projectPackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListCellRenderer;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;

public class AnCont1 extends JPanel {
	private MainFrame mainFrame;
	private static final long serialVersionUID = 1L;
	private An_SQL ansql;
	private JList<String> list;
	

    public AnCont1(MainFrame mainFrame) {  
    	
    	this.mainFrame = mainFrame;
		setLayout(null);
		this.setSize(1280, 800-150);
		this.setPreferredSize(new Dimension(1280, 800-150));
		this.setBackground(Color.gray);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 1280, 650);
		add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(245, 20, 790, 550);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 0, 0));
		panel_2.setBounds(12, 10, 765, 530);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("      시  간");
		lblNewLabel_2.setBounds(563, 100, 194, 59);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 16));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBounds(260, 100, 100, 59);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("    지  역");
		lblNewLabel_1.setBounds(12, 0, 100, 59);
		panel_3.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 16));
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.BLACK);
		panel_3_1.setBounds(66, 100, 100, 59);
		panel_2.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("        영  화");
		lblNewLabel.setBounds(12, 0, 100, 59);
		panel_3_1.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(64, 0, 64));
		lblNewLabel.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 16));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(Color.BLACK);
		panel_3_1_1.setBounds(366, 100, 100, 59);
		panel_2.add(panel_3_1_1);
		panel_3_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("    극  장");
		lblNewLabel_1_1.setBounds(12, 0, 100, 59);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 16));
		panel_3_1_1.add(lblNewLabel_1_1);
		
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBackground(Color.BLACK);
		panel_3_1_1_1.setBounds(478, 100, 279, 59);
		panel_2.add(panel_3_1_1_1);
		panel_3_1_1_1.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon(AnCont1.class.getResource("/image/button/select.png")));
		btnNewButton_2.setBounds(643, 470, 110, 42);
		panel_2.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
		    public void actionPerformed(ActionEvent e) {
				openAnCont2Panel();
		    	setVisible(false);
		    }
		});
		

		
	
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(128, 128, 128));
		panel_4.setBounds(10, 165, 745, 3);
		panel_2.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 0, 0));
		panel_5.setBounds(12, 10, 745, 80);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(AnCont1.class.getResource("/image/ohtani/cgving2.png")));
		lblNewLabel_3.setBounds(12, 0, 200, 80);
		panel_5.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(623, 21, 110, 30);
		panel_5.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(AnCont1.class.getResource("/image/button/again.png")));
		
		this.mainFrame = mainFrame;
		this.setSize(1280,800);
		this.setPreferredSize(new Dimension(1280, 650));
		this.setBackground(Color.green);
		
		ansql = new An_SQL();

		HashMap<String, Integer> movieMap = ansql.list();
	    Vector<String> movieNames = new Vector<>(movieMap.keySet());
		JList<String> list = new JList<String>(movieNames);
		list.setCellRenderer(new MyCellRenderer());
		list.setBounds(192, 199, 271, 222);
//		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(15, 180, 230, 270);
		panel_2.add(scrollPane);
        this.setVisible(false);
        
        list.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                String selectedMovie = list.getSelectedValue();
                int movieNo = movieMap.get(selectedMovie);
                ansql.setSelectedMovieNo(movieNo);
            }
        });
        
		
		//------------------------------------------------------------------
		
		Vector<String> testvec2 = new Vector<String>();
//		testvec2.add("지역1");

        this.setVisible(false);


		
		Vector<String> testvec3 = new Vector<String>();
//		testvec3.add("극장1");

		this.setVisible(false);

		
		
		Vector<String> testvec4 = new Vector<String>();
//		testvec4.add("시간");

				
				JList<String> list3 = new JList<String>(testvec3);
				panel_2.add(list3);
				list3.setCellRenderer(new MyCellRenderer());
				list3.setBounds(365, 180, 93, 268);				
				list3.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
				
				JScrollPane scrollPane3 = new JScrollPane(list3);
				scrollPane3.setBounds(365, 180, 110, 270);
				panel_2.add(scrollPane3);
		        this.setVisible(false);

						JList<String> list4 = new JList<String>(testvec4);
						panel_2.add(list4);					
						list4.setCellRenderer(new MyCellRenderer());
						list4.setBounds(470, 180, 275, 268);
						list4.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
						
						JScrollPane scrollPane4 = new JScrollPane(list4);
						scrollPane4.setBounds(480, 180, 270, 270);
						panel_2.add(scrollPane4);
				        this.setVisible(false);


								JList<String> list2 = new JList<String>(testvec2);
								panel_2.add(list2);
								list2.setCellRenderer(new MyCellRenderer());
								list2.setBounds(260, 180, 93, 268);

								list2.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
								
								JScrollPane scrollPane2 = new JScrollPane(list2);
								scrollPane2.setBounds(250, 180, 110, 270);
								panel_2.add(scrollPane2);
								
								JButton btnNewButton_3 = new JButton("");
								btnNewButton_3.setIcon(new ImageIcon(AnCont1.class.getResource("/image/button/back.png")));
								btnNewButton_3.addActionListener(new ActionListener() {
									public void actionPerformed(ActionEvent e) {
										OtanP();
								    	setVisible(false);
									}
								});
								btnNewButton_3.setBounds(12, 470, 110, 42);
								panel_2.add(btnNewButton_3);
								this.setVisible(false);
								
		
	}
   
	class MyCellRenderer extends JLabel implements ListCellRenderer<Object> {
        MyCellRenderer() {
            setOpaque(true);
        }

        public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
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
    }
	
	private void OtanP() {
		OhtanisPanel Otan = new OhtanisPanel(mainFrame);
        mainFrame.PageChange(MainFrame.PANELNAME.MAIN); 
    }
}