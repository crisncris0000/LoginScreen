import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.xml.transform.Source;

public class LoginScreen implements ActionListener{
	
	JFrame frame;
	JButton myButton;
	
	public static JTextField userText;
	public static JPasswordField password;
		
	String userName;
	String myPassword;
	
		LoginScreen() {
		frame = new JFrame();
		
		myButton = new JButton();
			
		 userText = new JTextField();
		 password = new JPasswordField();
		
		JLabel label = new JLabel("Username");
		JLabel label2 = new JLabel("Password");
		
		label.setBounds(40, 100, 150, 20);
		label2.setBounds(40, 150, 150, 20);
		
		userText.setBounds(110, 100, 150, 20);
		password.setBounds(110, 150, 150, 20);
		
		myButton.setText("Login");
		myButton.setBounds(150, 250, 100, 50);
		myButton.setFocusable(false);
		myButton.setBackground(Color.gray);
		myButton.addActionListener(this);
		
		frame.add(userText);
		frame.add(password);
		frame.add(label);
		frame.add(label2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.add(myButton);
		frame.setVisible(true);

	}
		
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == myButton) 
		{
			 userName = userText.getText();
			 myPassword = password.getText();
			NewScreen screen =  new NewScreen();
			
		}
		
	}
	
}
