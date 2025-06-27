import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ImageIcon icon = new ImageIcon("logo-search-grid-2x.png");
		
		JLabel label = new JLabel();
		label.setText("HI");
		label.setIcon(icon);
		//label.setVerticalAlignment(JLabel.TOP);
		label.setBounds(100,0,250,250);
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(0,0,250,250);
		redpanel.setLayout(new BorderLayout());
		
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.blue);
		bluePanel.setBounds(250,0,250,250);		
		
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.green);
		greenPanel.setBounds(0,250,500,250);	
		greenPanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		greenPanel.add(label);
		frame.add(redpanel);
		frame.add(bluePanel);
		frame.add(greenPanel);
		
		
		
		
		
	}

}
