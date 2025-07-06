import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener {

	
	JButton button;
	JLabel label;
	
	
	MyFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Pick a color");
		button.addActionListener(this);
		
		label = new JLabel();
		label.setBackground(Color.white);
		label.setOpaque(true);
		label.setText("This is some text :D");
		label.setFont(new Font("MV Boli",Font.PLAIN,45));
		
		this.add(button);
		this.add(label);
		this.pack();
		this.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			JColorChooser colorChooser = new JColorChooser();
			Color color = JColorChooser.showDialog(null,"Pick a color..I guess",Color.white);
			
			label.setForeground(color);
			
		}
	}

	
}
