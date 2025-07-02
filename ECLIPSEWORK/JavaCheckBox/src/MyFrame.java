

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class MyFrame  extends JFrame implements ActionListener{

	JButton button;
	JCheckBox checkBox;
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());	
		
		button = new JButton();
		button.setText("submit");
		//button.addActionListener(e -> System.out.println(checkBox.isSelected()));
		button.addActionListener(this);
		
		checkBox = new JCheckBox();
		checkBox.setText("I'm not a robot!");
		checkBox.setFocusable(false);
		checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
		
		this.add(button);
		this.add(checkBox);
		this.pack();
		this.setVisible(true);
		System.out.println(checkBox.isSelected());
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			;
		boolean i = checkBox.isSelected();
		System.out.println(i);
			
			button.setEnabled(false);
		}
	}
	

}
