import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyPanel extends JPanel implements ActionListener {

	final int PANEL_WIDTH = 1250 ;
	final int PANEL_HEIGHT = 750 ;
	Image enemy;
	Image backgroundImage;
	Timer timer;
	int xVelocity = 3;
	int yVelocity = 2;
	int x = 0;
	int y =0;
	
	MyPanel() {
		this.setPreferredSize(new Dimension(PANEL_WIDTH,PANEL_HEIGHT));
		this.setBackground(Color.black);
		backgroundImage = new ImageIcon("space.png").getImage();
		enemy = new ImageIcon("R.png").getImage();
		timer = new Timer(10,this);
		timer.start();
	}
	
	public void paint(Graphics g) {
		
		super.paint(g);
		
		
		Graphics2D g2D = (Graphics2D) g;
		
		g2D.drawImage(backgroundImage, 0, 0, null);
		g2D.drawImage(enemy, x, y, null);	
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(x>=PANEL_WIDTH-enemy.getWidth(null)) {
			xVelocity = xVelocity * -1;
			
		}else if(x==0 && xVelocity < 0) {
			xVelocity = xVelocity * -1;
		}
		
		
		x= x + xVelocity;
		
		if(y>=PANEL_HEIGHT-enemy.getHeight(null)) {
			yVelocity = yVelocity * -1;
			
		}else if(y==0 && yVelocity < 0) {
			yVelocity = yVelocity * -1;
		}
		
		
		y= y + yVelocity;
		
		repaint();
	}
}
