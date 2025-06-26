import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame{

	public MyFrame() {
		// TODO Auto-generated constructor stub
		
		this.setTitle("Jthis title ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setSize(420,420);
		this.setVisible(true);
		
		ImageIcon image = new ImageIcon("logo-search-grid-2x.png");

		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(new Color(255,255,255));
		
	}

}
