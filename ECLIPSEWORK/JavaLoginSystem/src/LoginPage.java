import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginPage implements ActionListener {
	
	
	JFrame frame = new JFrame();
	JButton loginButton = new JButton("Login");
	JButton ResetButton = new JButton("Reset");
	JTextField userIDField = new JTextField();
	JPasswordField userPasswordField = new JPasswordField();
	JLabel userIDLabel = new JLabel("userID: ");
	JLabel userPasswordLabel = new JLabel("Password: ");
	JLabel messageLabel = new JLabel();
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	LoginPage(HashMap<String,String> logininfo1) {
		
		logininfo = logininfo1;
		
		
		
		userIDLabel.setBounds(50,100,75,25);
		userPasswordLabel.setBounds(50,150,75,25);
		
		
		messageLabel.setBounds(125,30,250,40);
		messageLabel.setFont(new Font("Aria",Font.PLAIN,20) );
		messageLabel.setText("Please login");
		messageLabel.setOpaque(true);
		
		userIDField.setBounds(125,100,200,25);
		userPasswordField.setBounds(125,150,200,25);
		
		loginButton.setBounds(125,200,200,25);
		loginButton.addActionListener(this);
		
		
		ResetButton.setBounds(125,225,200,25);
		ResetButton.addActionListener(this);
		
		frame.add(userPasswordLabel);
		frame.add(messageLabel);
		frame.add(ResetButton);
		frame.add(loginButton);
		frame.add(userIDLabel);
		frame.add(userIDField);
		frame.add(userPasswordField);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ResetButton) {
			userIDField.setText("");
			userPasswordField.setText("");
		}
		
		if(e.getSource()==loginButton) {
			String userID = userIDField.getText();
			String password = String.valueOf(userPasswordField.getPassword());
			System.out.println("try Login...");
			if(logininfo.containsKey(userID)) {
				if (logininfo.get(userID).equals(password)) {
					messageLabel.setForeground(Color.green);
					messageLabel.setText("Login sucessful");
					frame.dispose();
					WelcomePage welcomPage = new WelcomePage();
					
				}
			}
			else {
				messageLabel.setForeground(Color.red);
				messageLabel.setText("Wrong password or userid");
				
				System.out.println(userID + " " + password);
			}
		}
	}

}
