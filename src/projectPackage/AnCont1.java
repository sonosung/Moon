package projectPackage;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
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

    public AnCont1(MainFrame mainFrame) {
		
		//sadsadsad
    	//asd
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
		
		JLabel lblNewLabel_2 = new JLabel("     시간");
		lblNewLabel_2.setBounds(563, 100, 194, 59);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 20));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		
		JLabel lblNewLabel_1 = new JLabel("     지역");
		lblNewLabel_1.setBounds(245, 100, 100, 59);
		panel_2.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 20));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(0, 0, 0));
		panel_3.setBounds(260, 100, 100, 59);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBackground(Color.BLACK);
		panel_3_1.setBounds(66, 100, 100, 59);
		panel_2.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("     영화");
		lblNewLabel.setBounds(0, 0, 100, 59);
		panel_3_1.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(64, 0, 64));
		lblNewLabel.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setBackground(Color.BLACK);
		panel_3_1_1.setBounds(366, 100, 100, 59);
		panel_2.add(panel_3_1_1);
		panel_3_1_1.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("     극장");
		lblNewLabel_1_1.setBounds(0, 0, 100, 59);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("여기어때 잘난체 고딕 TTF", Font.PLAIN, 20));
		panel_3_1_1.add(lblNewLabel_1_1);
		
		JPanel panel_3_1_1_1 = new JPanel();
		panel_3_1_1_1.setBackground(Color.BLACK);
		panel_3_1_1_1.setBounds(478, 100, 279, 59);
		panel_2.add(panel_3_1_1_1);
		panel_3_1_1_1.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\새로고침.png"));
		btnNewButton.setBounds(620, 15, 100, 30);
		panel_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("오늘");
		btnNewButton_1.setBounds(40, 50, 100, 30);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("내일");
		btnNewButton_1_1.setBounds(180, 50, 100, 30);
		panel_2.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("모래");
		btnNewButton_1_1_1.setBounds(330, 50, 100, 30);
		panel_2.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("사흘");
		btnNewButton_1_1_1_1.setBounds(470, 50, 100, 30);
		panel_2.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1_1_1 = new JButton("나흘");
		btnNewButton_1_1_1_1_1.setBounds(620, 50, 100, 30);
		panel_2.add(btnNewButton_1_1_1_1_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Desktop\\버튼들\\확인 버튼 - 복사본 - 복사본.png"));
		btnNewButton_2.setBounds(653, 470, 100, 50);
		panel_2.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionHandler());	
		
	
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(128, 128, 128));
		panel_4.setBounds(10, 165, 745, 3);
		panel_2.add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(255, 255, 255));
		panel_5.setBounds(12, 10, 745, 80);
		panel_2.add(panel_5);
		
		this.mainFrame = mainFrame;
		this.setSize(1280,800);
		this.setPreferredSize(new Dimension(1280, 650));
		this.setBackground(Color.green);
		
		Vector<String> testvec = new Vector<String>();
		testvec.add("영화1");
		testvec.add("영화2");
		testvec.add("영화3");
		testvec.add("영화4");
		testvec.add("영화5");
		testvec.add("영화6");
		testvec.add("영화7");
		testvec.add("영화8");
		testvec.add("영화9");
		testvec.add("영화10");
		testvec.add("영화11");
//		getContentPane().setLayout(null);
		
		
		JList<String> list = new JList<String>(testvec);
		list.setCellRenderer(new MyCellRenderer());
		list.setBounds(192, 199, 271, 222);
		
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(15, 180, 230, 270);

//		getContentPane().add(scrollPane);
//		this.setVisible(false);	
		panel_2.add(scrollPane);
        this.setVisible(false);
		
		//------------------------------------------------------------------
		
		Vector<String> testvec2 = new Vector<String>();
		testvec2.add("지역1");
		testvec2.add("지역2");
		testvec2.add("지역3");
		testvec2.add("지역4");
		testvec2.add("지역5");
		testvec2.add("지역6");
		testvec2.add("지역7");
		testvec2.add("지역8");
		testvec2.add("지역9");
		testvec2.add("지역10");
		testvec2.add("지역11");
        this.setVisible(false);

//		getContentPane().add(scrollPane2);
//		this.setVisible(false);	
		//-------------------------------------------------------
		
		Vector<String> testvec3 = new Vector<String>();
		testvec3.add("극장1");
		testvec3.add("극장2");
		testvec3.add("극장3");
		testvec3.add("극장4");
		testvec3.add("극장5");
		testvec3.add("극장6");
		testvec3.add("극장7");
		testvec3.add("극장8");
		testvec3.add("극장9");
		testvec3.add("극장10");
		this.setVisible(false);
		//-----------------------------------------------------------------------
		
		
		Vector<String> testvec4 = new Vector<String>();
		testvec4.add("시간");
		testvec4.add("시간2");
		testvec4.add("시간3");
		testvec4.add("시간4");
		testvec4.add("시간5");
		testvec4.add("시간6");
		testvec4.add("시간7");
		testvec4.add("시간8");
		testvec4.add("시간9");
		testvec4.add("시간10");
		testvec4.add("시간11");
				
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
}