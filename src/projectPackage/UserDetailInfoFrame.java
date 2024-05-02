package projectPackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class UserDetailInfoFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField idText;
	private JLabel lblPw;
	private JTextField pwText;
	private JLabel lblName;
	private JTextField nameText;
	private JLabel lblEmail;
	private JTextField emailText;
	private JLabel lblPhone;
	private JTextField phoneText;

	/**
	 * Create the frame.
	 */
	public UserDetailInfoFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(1300, 100, 450, 585);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		idText = new JTextField();
		idText.setBounds(154, 10, 268, 34);		
		contentPane.add(idText);
		idText.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblNewLabel.setBounds(12, 10, 130, 34);
		lblNewLabel.setHorizontalAlignment(JLabel.LEFT);
		contentPane.add(lblNewLabel);
		
		lblPw = new JLabel("PW");
		lblPw.setHorizontalAlignment(SwingConstants.LEFT);
		lblPw.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblPw.setBounds(12, 54, 130, 34);
		contentPane.add(lblPw);
		
		pwText = new JTextField();
		pwText.setColumns(10);
		pwText.setBounds(154, 54, 268, 34);
		contentPane.add(pwText);
		
		lblName = new JLabel("NAME");
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		lblName.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblName.setBounds(12, 98, 130, 34);
		contentPane.add(lblName);
		
		nameText = new JTextField();
		nameText.setColumns(10);
		nameText.setBounds(154, 98, 268, 34);
		contentPane.add(nameText);
		
		lblEmail = new JLabel("EMAIL");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblEmail.setBounds(12, 142, 130, 34);
		contentPane.add(lblEmail);
		
		emailText = new JTextField();
		emailText.setColumns(10);
		emailText.setBounds(154, 142, 268, 34);
		contentPane.add(emailText);
		
		lblPhone = new JLabel("PHONE");
		lblPhone.setHorizontalAlignment(SwingConstants.LEFT);
		lblPhone.setFont(new Font("맑은 고딕", Font.PLAIN, 12));
		lblPhone.setBounds(12, 186, 130, 34);
		contentPane.add(lblPhone);
		
		phoneText = new JTextField();
		phoneText.setColumns(10);
		phoneText.setBounds(154, 186, 268, 34);
		contentPane.add(phoneText);
		this.setVisible(false);
	}
	
	public void FrameInit(UserInfoVo userInfo)
	{
		idText.setText(userInfo.getUser_id());
		pwText.setText(userInfo.getUser_pw());
		nameText.setText(userInfo.getUser_name());
		emailText.setText(userInfo.getUser_email());
		phoneText.setText(userInfo.getUser_phone());
	}
}
