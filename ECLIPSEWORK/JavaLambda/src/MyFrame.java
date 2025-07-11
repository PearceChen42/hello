import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	JButton myButton = new JButton("MY BUTTON");
	JButton myButton2 = new JButton("MY BUTTON");
	MyFrame() {
		
		myButton.setBounds(100,0,200,100);
		myButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("You clicked a button");
			}
		});
		
		
		myButton2.setBounds(100,100,200,100);
		myButton2.addActionListener(e -> {
			
			System.out.println("You clicked button2!");
			
		});
		
		this.add(myButton2);
		this.add(myButton);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(420,420);
		this.setLayout(null);
		this.setVisible(true);
	}
	
}
