import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

	static final int screen_width = 600;
	static final int screen_height = 600;
	static final int unit_size = 25;
	//static final int game_units = (screen_width*screen_height )/ unit_size*unit_size;
	static final int delay = 75;
	final int x[] = new  int[24*24];
	final int y[] = new int[24*24];
	int bodyParts = 6;
	int applesEaten;
	int appleX;
	int appleY;
	char direction = 'R';
	boolean running = false;
	Timer timer;
	Random random;
	
	
	
	GamePanel() {
		//System.out.println(game_units);
		random = new Random();
		this.setPreferredSize(new Dimension(screen_width,screen_height));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();
		
		
	}
	
	public void startGame() {
		newApple();
		running = true;
		timer = new Timer(delay,this);
		timer.start();
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
		
		
	}
	public void draw(Graphics g) {
		if(running) {
			for(int i=0;i<screen_height/unit_size;i++) {
				g.drawLine(i*unit_size,0 , i*unit_size, screen_height);
				g.drawLine(0, i*unit_size,screen_width , i*unit_size);
			}
			g.setColor(Color.red);
			g.fillOval(appleX, appleY, unit_size, unit_size);
		
			/*for(int i = bodyParts;i>0;i--) {
				System.out.println("x:"+x[i]+"y:"+y[i]);
			}
			*/
			for(int i = 0; i< bodyParts;i++) {
				if(i == 0) {
					g.setColor(Color.green);
					g.fillRect(x[i],y[ i], unit_size, unit_size);
					//System.out.println("x:"+x[i]+"y:"+y[i]);
				}
				else {
					g.setColor(new Color(45,180,0));
					g.fillRect(x[i],y[ i], unit_size, unit_size);
					//System.out.println("x:"+x[i]+"y:"+y[i]);
				}
			}
		}
		else {
			gameOver(g);
		}
		
	}
	
	public void newApple() {
		
		appleX = random.nextInt(screen_width/unit_size)*unit_size;
		appleY = random.nextInt(screen_height/unit_size)*unit_size;
		
		
		
	}
	public void move() {
		for(int i = bodyParts;i>0;i--) {
			x[i] = x[i-1];
			y[i] = y[i-1];
			//System.out.println("x:"+x[i]+"y:"+y[i]);
		}
		switch(direction) {
		case 'U':
			y[0] = y[0] - unit_size;
			break;
		case 'D':
			y[0] = y[0] + unit_size;
			break;
		case 'L':
			x[0] = x[0] - unit_size;
			break;
		case 'R':
			x[0] = x[0] + unit_size;
			break;
			
		
		}
		
		
	}
	
	public void check() {
		if((x[0] == appleX) && (y[0] == appleY)) {
			bodyParts++;
			applesEaten++;
			newApple();
		}
		
	}
	
	public void checkCollisions() {
		for(int i = bodyParts; i>0;i--) {
			if( (x[0] == x[i]) && ( y[0] == y[i] )  ) {
				running = false;
				
			}
		}
		if(x[0] < 0 || x[0] >=  screen_width) {
			running = false;
			
		}

		if(y[0] < 0 || y[0] >=  screen_height) {
			running = false;
			
		}
		
	}
	
	public void gameOver(Graphics g) {
		g.setColor(Color.red);
		g.setFont(new Font("Ink Free",Font.BOLD,75));
		FontMetrics metrics = getFontMetrics(g.getFont());
		String over = "Game Over";
		int x= ( screen_width/2 - metrics.stringWidth(over)/2);
		int y= screen_height/2;
		g.drawString("Game Over",x , y);
		g.setFont(new Font("Simsun",Font.BOLD,30));
		g.setColor(Color.blue);
		String score = "总得分: " + String.valueOf(applesEaten);
		metrics = getFontMetrics(g.getFont());
		x= ( screen_width/2 - metrics.stringWidth(score)/2);
		y= g.getFont().getSize();
		g.drawString(score,x , y);
	}
	
	
	public class MyKeyAdapter extends KeyAdapter {
		
		@Override 
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				if(direction != 'R') {
					direction = 'L';
				}
				break;
			case KeyEvent.VK_RIGHT:
				if(direction != 'L') {
					direction = 'R';
				}
				break;
			case KeyEvent.VK_UP:
				if(direction != 'D') {
					direction = 'U';
				}
				break;
			case KeyEvent.VK_DOWN:
				if(direction != 'U') {
					direction = 'D';
				}
				break;
			}
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(running) {
			move();
			check();
			checkCollisions();
			
		}
		repaint();
		
	}

	
}
