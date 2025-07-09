import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
	
	Image image;
	MyPanel() {
		
		image = new ImageIcon("Smile.png").getImage();
		this.setPreferredSize( new Dimension(500,500));
		
	}
	
	public void paint(Graphics g) {
		Graphics2D g2D = (Graphics2D) g ;
		
		g2D.drawImage(image, 0, 0,null);
		g2D.setPaint(Color.red);
		g2D.setStroke(new BasicStroke(5));
		g2D.drawLine(0, 0, 500, 500);
		
		g2D.drawRect(100, 100, 200, 200);
		g2D.fillRect(300, 200, 100, 100);
		
		g2D.setPaint(Color.magenta);
		g2D.drawOval(0, 0, 500, 500);
		
		g2D.setStroke(new BasicStroke(2));
		g2D.drawArc(250, 0, 100, 100, 180, 270);
		
		int[] xPoints = {150,250,350};
		int[] yPoints = {300,150,300};
		g2D.drawPolygon(xPoints,yPoints,3);
		
		g2D.setStroke(new BasicStroke(20));
		g2D.setPaint(Color.blue);
		g2D.setFont(new Font("Ink Free",Font.BOLD,50));
		g2D.drawString("Hello World!", 250, 500);
		
		
		
	}

}
