import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.Border;
public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImageIcon image = new ImageIcon("logo.png");
		Border border = BorderFactory.createLineBorder(Color.green,3);
		
		
		JLabel label = new JLabel();
		label.setText("Bro, do you even code? ");
	
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setForeground(new Color(0x00FF00));
		label.setFont(new Font("MV Boli",Font.BOLD,20));
		label.setIconTextGap(-25);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
		//label.setBounds(0,0,620,620);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setSize(620,620);
		//frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
		frame.pack();
		
		
	}

}
