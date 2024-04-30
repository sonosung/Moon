package projectPackage;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JinsungPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;	
	/**
	 * Create the panel.
	 */

	public JinsungPanel(MainFrame mainFrame) {

		this.mainFrame = mainFrame;
		System.out.println("1232131");
		
		  Connection conn = null; 
		  try {
			  Class.forName("oracle.jdbc.OracleDriver");
		  
		  conn= DriverManager.getConnection(
				  "jdbc:oracle:thin:@localhost:1521/xe",
				  "c##green",
				  "green1234" ); 
		  
		  String sql = "" + " SELECT * FROM MOVIE ";
		  //" SELECT movie_id, title, location, screen " + " FROM movie " +
		  //" WHERE title =? ";
		  
		  PreparedStatement pstmt = conn.prepareStatement(sql);
		  //pstmt.setString(1,"범죄도시4");
		  
		  ResultSet rs = pstmt.executeQuery(); while(rs.next()) { Movi movi = new
		  Movi(); movi.setMovie_id(rs.getString("movie_id"));
		  movi.setTitle(rs.getString("title"));
		  movi.setLocation(rs.getString("location"));
		  movi.setScreen(rs.getInt("screen")); movi.setTicket(rs.getInt("ticket"));
		  
		  System.out.println("init " + movi); } pstmt.close(); } catch
		  (ClassNotFoundException e) { // TODO Auto-generated catch block
		  e.printStackTrace(); } catch (SQLException e) { e.printStackTrace(); }
		  finally { if(conn !=null) { try { conn.close(); } catch (SQLException e) {} }
		  }
		 
		setLayout(null);
		this.setSize(1280, 800 - 150);
		this.setPreferredSize(new Dimension(1280, 800 - 150));
		this.setBackground(Color.white);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 0, 1280, 650);
		add(panel);
		panel.setLayout(null);
		  JLabel show_image = new JLabel(""); show_image.setIcon(new ImageIcon(JinsungPanel.class.getResource("/image/jinsung/poster3.jpg")));
		  show_image.setBounds(151, 71, 152, 234); panel.add(show_image);
		 
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Manic-063\\Downloads\\사진모음\\cgving2.png"));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("휴먼둥근헤드라인", Font.BOLD, 38));
		lblNewLabel.setBounds(343, 0, 212, 84);
		panel.add(lblNewLabel);
		
		// 고정
		JLabel lblNewLabelfix = new JLabel("상세 내역");
		lblNewLabelfix.setForeground(Color.WHITE);
		lblNewLabelfix.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 30));
		lblNewLabelfix.setBounds(378, 86, 143, 51);
		panel.add(lblNewLabelfix);
		
		JLabel lblNewLabelfix2 = new JLabel("영화명");
		lblNewLabelfix2.setForeground(Color.WHITE);
		lblNewLabelfix2.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabelfix2.setBounds(54, 300, 111, 41);
		panel.add(lblNewLabelfix2);
		
		JLabel lblNewLabelfix3 = new JLabel("예매 번호");
		lblNewLabelfix3.setForeground(Color.WHITE);
		lblNewLabelfix3.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabelfix3.setBounds(777, 146, 152, 51);
		panel.add(lblNewLabelfix3);
		
		//db 불러와서 출력
		JLabel lblNewLabel_4 = new JLabel("1234-567");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(1010, 130, 196, 77);
		panel.add(lblNewLabel_4);
		lblNewLabel_4.setText("0000-001");
		 try { String sql =" SELECT * FROM MOVIE ";
				
				 // " select * from TICKET " + " where TICKET_NO=? ";
		  
		  PreparedStatement pstmt1 = conn.prepareStatement(sql);
		  pstmt1.setString(1,"1");
		  
		  ResultSet rs = pstmt1.executeQuery(); 
		  while(rs.next())   { 
		  Movi movi1 = new Movi(); 
		  movi1.setMovie_id(rs.getString("movie_id"));
		  movi1.setLocation(rs.getString("location"));
		  movi1.setScreen(rs.getInt("screen")); 
		  movi1.setTicket(rs.getInt("ticket"));
		  movi1.setTitle(rs.getString("title"));
		  
		  System.out.println( movi1); 
		  } pstmt1.close(); 
		  } 
		 catch (SQLException
		  e) { e.printStackTrace();
		  } 
		 finally { if(conn !=null) 
		  { try { conn.close();
		  }
		  catch (SQLException e) {} } }
		
		JLabel lblNewLabel_2_1_2 = new JLabel("영화");
		lblNewLabel_2_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_2.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabel_2_1_2.setBounds(897, 300, 202, 41);
		panel.add(lblNewLabel_2_1_2);
		lblNewLabel_2_1_2 .setText("범죄도시 4");
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("상영일시");
		lblNewLabel_2_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1.setBounds(54, 361, 111, 41);
		panel.add(lblNewLabel_2_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_4 = new JLabel("극장명");
		lblNewLabel_2_1_1_4.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_4.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabel_2_1_1_4.setBounds(54, 412, 111, 41);
		panel.add(lblNewLabel_2_1_1_4);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("상영관");
		lblNewLabel_2_1_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_2_1.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabel_2_1_1_2_1.setBounds(54, 463, 111, 41);
		panel.add(lblNewLabel_2_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_3_1 = new JLabel("관람수");
		lblNewLabel_2_1_1_3_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_3_1.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabel_2_1_1_3_1.setBounds(54, 514, 111, 41);
		panel.add(lblNewLabel_2_1_1_3_1);
		
		JLabel lblNewLabel_title_1 = new JLabel("null");
		lblNewLabel_title_1.setForeground(Color.WHITE);
		lblNewLabel_title_1.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabel_title_1.setBounds(1059, 361, 205, 41);
		panel.add(lblNewLabel_title_1);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2 = new JLabel("CGV의정부");
		lblNewLabel_2_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_2.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_1_2.setBounds(1059, 412, 179, 41);
		panel.add(lblNewLabel_2_1_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_2 = new JLabel("1관");
		lblNewLabel_2_1_1_1_1_1_1_2.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1_2.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_1_1_2.setBounds(1059, 463, 189, 41);
		panel.add(lblNewLabel_2_1_1_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1_1 = new JLabel("2명");
		lblNewLabel_2_1_1_1_1_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1_1_1_1_1_1.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabel_2_1_1_1_1_1_1_1_1.setBounds(1059, 514, 124, 41);
		panel.add(lblNewLabel_2_1_1_1_1_1_1_1_1);
		
		JButton btnNewButton_2 = new JButton("뒤로가기");
		btnNewButton_2.setFont(new Font("나눔고딕", Font.BOLD, 26));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBounds(912, 575, 143, 44);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("티켓 취소하기");
		btnNewButton_1_1.setFont(new Font("나눔고딕", Font.BOLD, 26));
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.setBounds(1068, 575, 196, 44);
		panel.add(btnNewButton_1_1);

		this.setVisible(false);
	}
}