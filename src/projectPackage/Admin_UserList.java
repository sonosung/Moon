package projectPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Point;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class Admin_UserList extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;
	private JTextField textField;
	private JTable table;
	JScrollPane sPane;
	Container contentPane;
	
	Vector<String> columnName = null;   // String을 원소로 갖는 갖는 리스트
	Vector<Vector<String>> data = null; // String 여러개를 갖는 백터들을 원소로 갖는 리스트

	/**
	 * Create the panel.
	 */
	public Admin_UserList(MainFrame mainFrame) {
		
		this.mainFrame = mainFrame;
		this.setSize(1280,800-150);
		this.setPreferredSize(new Dimension(1280,800-150));
		this.setBackground(Color.darkGray);
		setLayout(null);
		
		this.setVisible(false);
		
		JLabel lblAdminUserlist = new JLabel("Admin - UserList");
		lblAdminUserlist.setForeground(new Color(255, 255, 255));
		lblAdminUserlist.setFont(new Font("나눔바른고딕", Font.PLAIN, 20));
		lblAdminUserlist.setBounds(12, 10, 1256, 55);
		add(lblAdminUserlist);
		/*---------------------------------------------------------*/
		
		textField = new JTextField();
		textField.setBounds(763, 119, 347, 30);
		add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("Search");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(1122, 118, 97, 30);
		add(btnNewButton_4);
		tableInit();
	}
	
	class UserInfoTableModel extends DefaultTableModel
	{
		public UserInfoTableModel(Vector<? extends Vector> data, Vector<?> columnNames) {
			setDataVector(data, columnNames);
		}
		
		 public boolean isCellEditable(int rowIndex, int mColIndex) {
             return false;
         }		
	}
	
	public void tableInit()
	{
		//<Table>
		columnName = new Vector<String>();
		data = new Vector<Vector<String>>();		
		
		Get_UserInfomation(data);
		
		columnName.add("USER_NO");
		columnName.add("USER_ID");
		columnName.add("USER_PW");
		columnName.add("USER_NAME");
		columnName.add("USER_EMAIL");
		columnName.add("USER_PHONE");
		columnName.add("AUTH_NO");
		
		UserInfoTableModel aa = new UserInfoTableModel(data,columnName);
		
		/*DefaultTableModel mod = new DefaultTableModel(data, columnName) 
		{		
	        public boolean isCellEditable(int rowIndex, int mColIndex) {
	                return false;
	            }
	    };*/
		
		table = new JTable(aa);
		table.getTableHeader().setReorderingAllowed(false); // 컬럼들 이동 불가
        table.getTableHeader().setResizingAllowed(false); // 컬럼 크기 조절 불가
        
        
        table.addMouseListener(new MouseAdapter() 
        {
        	 @Override public void mouseClicked(MouseEvent e) {
        		 JTable t = (JTable)e.getSource();
        		 
        		 if(e.getClickCount()==2)
        		 {
        			 TableModel m = t.getModel();
        			 Point pt = e.getPoint();
        			 int i = t.rowAtPoint(pt);
        			 
        			 if(i < 0)
        				 return;
        			 
        			 int row = t.convertRowIndexToModel(i);
        			 String s = String.format("%s (%s)", m.getValueAt(row, 0), m.getValueAt(row, 1));
        			 System.out.println(s);
        			 //JOptionPane.showMessageDialog(t, s, "title", JOptionPane.INFORMATION_MESSAGE);
        		 }
        	 }        	
		});
        
		
		
		sPane = new JScrollPane(table);
		sPane.setBounds(28, 159, 1199, 440);
		
		table.setBounds(41, 154, 1196, 453);
		
		contentPane = this;
		contentPane.add(sPane, BorderLayout.CENTER);
		
		//JButton btn = new JButton("출력");
		//contentPane.add(btn, BorderLayout.SOUTH);
		
		//add(table);		
		
	}
	
	public void Get_UserInfomation(Vector<Vector<String>> data)
	{
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@//14.42.124.35:1521/XE";
		String user = "c##wjrls";
		String pw = "881125";
		
		try {
			
			Class.forName(driver);
			System.out.println("jdbc driver lading success.");
			
			Connection conn = DriverManager.getConnection(url,user,pw);
			System.out.println("oralce connection success.");
			
			String sql = "select USER_NO, USER_ID, USER_PW, USER_NAME, USER_EMAIL, USER_PHONE, AUTH_NO from USER_INFO ORDER BY USER_NO";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{				
				UserInfoVo usinfo = 
						new UserInfoVo(	
						rs.getInt("USER_NO"),
						rs.getString("USER_ID"), 
						rs.getString("USER_PW"),
						rs.getString("USER_NAME"),
						rs.getString("USER_EMAIL"),
						rs.getString("USER_PHONE"),
						rs.getInt("AUTH_NO")				
						);
				
				usinfo.RenderInfo();
				
				Vector<String> info = new Vector<String>();
				info.add(Integer.toString(usinfo.getUser_no()));
				info.add(usinfo.getUser_id());
				info.add(usinfo.getUser_pw());
				info.add(usinfo.getUser_name());
				info.add(usinfo.getUser_email());
				info.add(usinfo.getUser_phone());
				info.add(Integer.toString(usinfo.getAuth_no()));
				
				data.add(info);
			}
			
			pstmt.close();
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}