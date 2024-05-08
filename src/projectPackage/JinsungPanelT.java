package projectPackage;

import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JinsungPanelT extends JPanel {

	private static final long serialVersionUID = 1L;
	private MainFrame mainFrame;	
	private TicketFrame ticketFrame;
	
	/**
	 * Create the panel.
	 */

	public JinsungPanelT(MainFrame mainFrame) {

		this.mainFrame = mainFrame;
		  Connection conn = null; 
		  try {
			  Class.forName("oracle.jdbc.OracleDriver");
		  
		  conn= DriverManager.getConnection(
				  "jdbc:oracle:thin:@14.42.124.35:1521/xe",
				  "C##wjrls",
				  "881125" ); 
		  
		  
		  String sql = "" + " SELECT * FROM MOVIE ";
		  //" SELECT movie_id, title, location, screen " + " FROM movie " +
		  //" WHERE title =? ";
		  
		  PreparedStatement pstmt = conn.prepareStatement(sql);
		  //pstmt.setString(1,"범죄도시4");
		  
		  ResultSet rs = pstmt.executeQuery();
		  while(rs.next()) { 
		  Movi movi = new Movi();
		  movi.setMovie_id(rs.getString("movie_id"));
		  movi.setTitle(rs.getString("title"));
		  movi.setLocation(rs.getString("location"));
		  movi.setScreen(rs.getInt("screen")); 
		  movi.setTicket(rs.getInt("ticket"));
		  
		  System.out.println(movi); 
		  
		  } /*pstmt.close();*/ } 
		  catch (ClassNotFoundException e) { 
			  // TODO Auto-generated catch block
			  e.printStackTrace();
		  } catch (SQLException e) { 
			  e.printStackTrace();
		  }
			/*
			 * finally { if(conn !=null) { try { conn.close(); } catch (SQLException e) {} }
			 * }
			 */
		 
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
		lblNewLabel.setBounds(485, 0, 212, 84);
		panel.add(lblNewLabel);
		
		// 고정값
		JLabel lblNewLabelfix = new JLabel("예매 내역");
		lblNewLabelfix.setForeground(Color.WHITE);
		lblNewLabelfix.setFont(new Font("나눔고딕 ExtraBold", Font.BOLD, 30));
		lblNewLabelfix.setBounds(518, 71, 143, 51);
		panel.add(lblNewLabelfix);
		
		JLabel lblNewLabelfix2 = new JLabel("영화명");
		lblNewLabelfix2.setForeground(Color.WHITE);
		lblNewLabelfix2.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		lblNewLabelfix2.setBounds(54, 300, 111, 41);
		panel.add(lblNewLabelfix2);
		
		JLabel lblNewLabelfix3 = new JLabel("예매 번호");
		lblNewLabelfix3.setForeground(Color.WHITE);
		lblNewLabelfix3.setFont(new Font("나눔고딕", Font.BOLD, 28));
		lblNewLabelfix3.setBounds(798, 143, 152, 51);
		panel.add(lblNewLabelfix3);
		
		//db 불러와서 출력
		JLabel ticketnum= new JLabel("1234-567");
		ticketnum.setForeground(Color.WHITE);
		ticketnum.setFont(new Font("나눔고딕", Font.BOLD, 28));
		ticketnum.setBounds(1016, 130, 196, 77);
		panel.add(ticketnum);
		Movi movi1 = new Movi(); 
		 try { String sql ="" + " select * from MOVIE " + " where Ticket =? ";
		  
		  PreparedStatement pstmt1 = conn.prepareStatement(sql);
		  pstmt1.setString(1,"1001");
		  
		  ResultSet rs = pstmt1.executeQuery(); 
		  while(rs.next())   { 
		  movi1.setMovie_id(rs.getString("movie_id"));
		  movi1.setLocation(rs.getString("location"));
		  movi1.setScreen(rs.getInt("screen")); 
		  movi1.setTicket(rs.getInt("ticket"));
		  movi1.setTitle(rs.getString("title"));
		  System.out.println("-----------------------------------------------------------------------------------");
		  System.out.println(movi1); 
		  } pstmt1.close(); 
		  } 
		 catch (SQLException
		  e) { e.printStackTrace();
		  } 
		ticketnum.setText(Integer.toString(movi1.getTicket()));
		
		JLabel Time = new JLabel("상영일시");
		Time.setForeground(Color.WHITE);
		Time.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		Time.setBounds(54, 361, 111, 41);
		panel.add(Time);
		
		JLabel movielocal= new JLabel("극장명");
		movielocal.setForeground(Color.WHITE);
		movielocal.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		movielocal.setBounds(54, 412, 111, 41);
		panel.add(movielocal);
		
		JLabel screen = new JLabel("상영관");
		screen.setForeground(Color.WHITE);
		screen.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		screen.setBounds(54, 463, 111, 41);
		panel.add(screen);
		
		JLabel person = new JLabel("관람수");
		person.setForeground(Color.WHITE);
		person.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		person.setBounds(54, 514, 111, 41);
		panel.add(person);	
		//      --------------------------------- db 입력받기  ------------------- //     
		JLabel Title = new JLabel("영화");
		Title.setForeground(Color.WHITE);
		Title.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		Title.setBounds(1059, 300, 202, 41);
		panel.add(Title);
		
		Movi movi2 = new Movi(); 
		 try { String sql ="" + " select * from MOVIE " + " where Title =? ";
		  
		  PreparedStatement pstmt1 = conn.prepareStatement(sql);
		  pstmt1.setString(1,"범죄도시4");
		  
		  ResultSet rs = pstmt1.executeQuery(); 
		  
		  while(rs.next())   { 
		  //movi1 = new Movi(); 
		  movi2.setMovie_id(rs.getString("movie_id"));
		  movi2.setLocation(rs.getString("location"));
		  movi2.setScreen(rs.getInt("screen")); 
		  movi2.setTicket(rs.getInt("ticket"));
		  movi2.setTitle(rs.getString("title"));  
		  } 
		  pstmt1.close(); 
		  } 
		 catch (SQLException e) { 
			 e.printStackTrace();  } 
			/*
			 * finally { if(conn !=null) { try { conn.close();
			 * 
			 * } catch (SQLException e) {} } }
			 */
		 Title.setText(movi2.getTitle());
		
		JLabel timep = new JLabel("00:00");
		timep.setForeground(Color.WHITE);
		timep.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		timep.setBounds(1059, 361, 205, 41);
		panel.add(timep);
		 try { String sql ="" + " select * from MOVIE " + " where Ticket =? ";
		  
		  PreparedStatement pstmt1 = conn.prepareStatement(sql);
		  pstmt1.setString(1,"1001");
		  
		  ResultSet rs = pstmt1.executeQuery(); 
		  
		  while(rs.next())   {	
		  movi2.setMovie_id(rs.getString("movie_id"));
		  movi2.setLocation(rs.getString("location"));
		  movi2.setScreen(rs.getInt("screen")); 
		  movi2.setTicket(rs.getInt("ticket"));
		  movi2.setTitle(rs.getString("title"));
		  
		 // System.out.println(movi2); 
		  } pstmt1.close(); 
		  } 
		 catch (SQLException
		  e) { e.printStackTrace();
		  } 
		timep.setText(Integer.toString(movi2.getTicket()));
		
		JLabel localp = new JLabel("CGV");
		localp.setForeground(Color.WHITE);
		localp.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		localp.setBounds(1059, 412, 179, 41);
		panel.add(localp);
		Movi movi3 = new Movi(); 
		 try { String sql ="" + " select * from MOVIE " + " where LOCATION =? ";
		  
		  PreparedStatement pstmt1 = conn.prepareStatement(sql);
		  pstmt1.setString(1,"CGV의정부");
		  
		  ResultSet rs = pstmt1.executeQuery(); 
		  
		  while(rs.next())   { 
		  //movi1 = new Movi(); 
		  movi3.setMovie_id(rs.getString("movie_id"));
		  movi3.setLocation(rs.getString("location"));
		  movi3.setScreen(rs.getInt("screen")); 
		  movi3.setTicket(rs.getInt("ticket"));
		  movi3.setTitle(rs.getString("title"));
		  } pstmt1.close(); 
		  } 
		 catch (SQLException
		  e) { e.printStackTrace();
		  } 
		localp.setText(movi3.getLocation());

		JLabel screenp = new JLabel("1관");
		screenp.setForeground(Color.WHITE);
		screenp.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		screenp.setBounds(1059, 463, 189, 41);
		panel.add(screenp);
		Movi movi4 = new Movi(); 
		 try { String sql ="" + " select * from MOVIE " + " where SCREEN =? ";
		  
		  PreparedStatement pstmt1 = conn.prepareStatement(sql);
		  pstmt1.setString(1,"1");
		  
		  ResultSet rs = pstmt1.executeQuery(); 
		  
		  while(rs.next())   { 
		  //movi1 = new Movi(); 
		  movi4.setMovie_id(rs.getString("movie_id"));
		  movi4.setLocation(rs.getString("location"));
		  movi4.setScreen(rs.getInt("screen")); 
		  movi4.setTicket(rs.getInt("ticket"));
		  movi4.setTitle(rs.getString("title"));
		  } pstmt1.close(); 
		  } 
		 catch (SQLException
		  e) { e.printStackTrace();
		  } 
		 finally { if(conn !=null) {
		 try { conn.close(); } 
		 catch (SQLException e) {
		 } 
		 } 
		 }
		screenp.setText(Integer.toString(movi1.getScreen()));
		
		JLabel personp = new JLabel("2명");
		personp.setForeground(Color.WHITE);
		personp.setFont(new Font("나눔고딕", Font.PLAIN, 25));
		personp.setBounds(1059, 514, 124, 41);
		panel.add(personp);
		
		//뒤로가기버튼
		JButton backButton = new JButton("");
		backButton.addActionListener(new BackAction());
		backButton.setIcon(new ImageIcon(JinsungPanelT.class.getResource("/image/button/back.png")));
		backButton.setBounds(614, 544, 110, 42);
		panel.add(backButton);
		
		ticketFrame = new TicketFrame();
		ticketFrame.setParentPage(this);
		
		JButton cancleButton = new JButton("");
		cancleButton.addActionListener(new CancleAction());
		//cancleButton.setForeground(new Color(0, 0, 0));
		//cancleButton.setFont(new Font("나눔고딕", Font.PLAIN, 15));
		cancleButton.setIcon(new ImageIcon(JinsungPanelT.class.getResource("/image/jinsung/ticketcancle.png")));
		cancleButton.setBounds(776, 544, 110, 42);
		panel.add(cancleButton);

		this.setVisible(false);
	}
	
	public MainFrame get_MainTestFrame() {return mainFrame;}

	public void progress()
	{//code
		Connection conn = null;
		try {
			 Class.forName("oracle.jdbc.OracleDriver");
			 conn= DriverManager.getConnection(
					  "jdbc:oracle:thin:@localhost:1521/xe",
					  "c##green",
					  "green1234" );
		
		String sql = "" + " DELETE FROM MOVIE " + "WHERE TICKET =? " ;
		PreparedStatement pstmt1 = conn.prepareStatement(sql);
		  pstmt1.setString(1,"1001");
		System.out.println("Progress in----");
		
		int rs = pstmt1.executeUpdate();
		
		if(rs < 0 || rs > 1)
			System.out.println("err : movie ticket delete rs cnt : " + rs);
		
		//
		  } 
	  catch (ClassNotFoundException e) { 
		  // TODO Auto-generated catch block
		  e.printStackTrace();
	  } catch (SQLException e) { 
		  e.printStackTrace();
	  }finally { if(conn !=null) { try { conn.close(); } catch (SQLException e) {} }
		  }
	
		//--> 전에 있던 텍스트 날려주세요.
		//TextInit();
		
	} 
	
	/* 텍스트 날린거 표시
	 * public void TextInit() {
	 * this.timep.setText("test null"); }
	 */
	
	class BackAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		mainFrame.PageChange(MainFrame.PANELNAME.PAGE1);
}
		
	}
	class CancleAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			ticketFrame.setVisible(true);
		}
}
}

	
