import java.awt.Font;

import javax.swing.*;

public class WelcomePage {

	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Hello!");
	
	WelcomePage() {
		welcomeLabel.setBounds(120,100,200,35);
		welcomeLabel.setFont(new Font("Aria",Font.CENTER_BASELINE,25));
		welcomeLabel.setText("WelCome!");
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
