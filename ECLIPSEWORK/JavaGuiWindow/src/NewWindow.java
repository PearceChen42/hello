import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class NewWindow {

	JFrame frame = new JFrame();
	JLabel label = new JLabel("Hello world!");
	NewWindow() {
		
		label.setBounds(0,0,200,100);
		label.setFont(new Font(null,Font.PLAIN,26));

		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
