import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame  extends JFrame implements ActionListener{

	JButton button;
	JTextField textField;
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		textField = new JTextField();
		textField.setPreferredSize(new Dimension(250,40));
		textField.setFont(new Font( "Consolas",Font.PLAIN,25));
		textField.setForeground(new Color(0x00FF00));
		textField.setBackground(Color.black);
		textField.setCaretColor(Color.red);
		textField.setText("UserName");
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		this.add(button);
		this.add(textField);
		this.pack();
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			String i = textField.getText();
			System.out.println(i);
			textField.setEditable(false);
			button.setEnabled(false);
		}
		
	}
	
	
	

}
