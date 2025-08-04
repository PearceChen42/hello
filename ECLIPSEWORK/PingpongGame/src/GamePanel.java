import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GamePanel extends JPanel implements Runnable{
	
	static final int GAME_WIDTH = 1000;
	static final int GAME_HEIGHT = (int) (GAME_WIDTH*(0.55));
	static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH,GAME_HEIGHT);
	static final int BALL_DIAMETER = 20;
	static final int PADDLE_WIDTH = 25;
	static final int PADDLE_HEIGHT = 100;
	Thread gameThread;
	Image image;
	Graphics graphics;
	Random random;
	Paddle paddle;
	Paddle paddle2;
	Ball ball;
	Score score;
	private GamePanel.Paddle paddle1;
	
	
	
	GamePanel() {
		newPaddles();
		newBall();
		score = new Score(GAME_WIDTH,GAME_HEIGHT);
		this.setFocusable(true);
		this.addKeyListener(new AL());
		this.setPreferredSize(SCREEN_SIZE);
		
		gameThread = new Thread(this);
		gameThread.start();
		
	}
	
	public void newBall() {
		//random = new Random();
		ball = new Ball( (GAME_WIDTH/2-BALL_DIAMETER/2),(GAME_HEIGHT/2-BALL_DIAMETER/2), BALL_DIAMETER,BALL_DIAMETER) ;
	}

	public void newPaddles() {
		paddle1 = new Paddle(0,(GAME_HEIGHT/2)-(PADDLE_HEIGHT/2),PADDLE_WIDTH,PADDLE_HEIGHT,1);
		paddle2 = new Paddle(GAME_WIDTH-PADDLE_WIDTH,(GAME_HEIGHT/2)-(PADDLE_HEIGHT/2),PADDLE_WIDTH,PADDLE_HEIGHT,2);
		
	}
	
	public void paint(Graphics g) {
		image = createImage(getWidth(),getHeight());
		graphics = image.getGraphics();
		draw(graphics);
		g.drawImage(image,0,0,this);
	}
	
	public void draw(Graphics g) {
		paddle1.draw(g);
		paddle2.draw(g);
		ball.draw(g);
		score.draw(g);
	}
	
	public void move() {
		paddle1.move();
		paddle2.move();
		ball.move();
		
	}
	
	public void checkCollision() {
		
		//ball collision with edges
		if(ball.y<=0 || ball.y>=(GAME_HEIGHT-BALL_DIAMETER)) {
			ball.setYDirection(-ball.yVelocity);
			
		}
		
		//ball collision with paddle
		if(ball.intersects(paddle1) || ball.intersects(paddle2)) {
			ball.setYDirection((int)(-(ball.yVelocity)*1.3));
			ball.setXDirection((int) (-(ball.xVelocity)*1.3));
		}
		
		
		//paddle collision with edges
		if(paddle1.y<=0) {
			paddle1.y=0;
		}
		if(paddle1.y >= (GAME_HEIGHT-PADDLE_HEIGHT)) {
			paddle1.y = (GAME_HEIGHT-PADDLE_HEIGHT);
		}
		if(paddle2.y<=0) {
			paddle2.y=0;
		}
		if(paddle2.y >= (GAME_HEIGHT-PADDLE_HEIGHT)) {
			paddle2.y = (GAME_HEIGHT-PADDLE_HEIGHT);
		}
		
		//Give Player 1 score
		if(ball.x<=0) {
			score.player2++;
			newPaddles();
			newBall();
			
		}
		if(ball.x>= GAME_WIDTH-BALL_DIAMETER) {
			score.player1++;
			newPaddles();
			newBall();
			
		}
	}
	
	public void run() {
		
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		while(true) {
			long now = System.nanoTime();
			delta += (now - lastTime)/ns;
			lastTime = now;
			if(delta >=1) {
				move();
				checkCollision();
				repaint();
				delta--;
				
				
			}
		}
	}
	
	public class AL extends KeyAdapter{
		public void keyPressed(KeyEvent e) {
			paddle1.keyPressed(e);
			paddle2.keyPressed(e);
		}
		public void keyReleased(KeyEvent e) {
			paddle1.keyReleased(e);
			paddle2.keyReleased(e);
		}
		
	}
	
	public  class Paddle extends Rectangle{
		
		int id;
		int yVelocity;
		
		
		Paddle(int x , int y, int PADDLE_WIDTH, int PADDLE_HEIGHT, int id) {
			super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
			this.id=id;
			
		}
		public void keyPressed(KeyEvent e) {
			switch(id) {
			case 1:
				if (e.getKeyCode()==KeyEvent.VK_W) {
					setYDirection(-10);
					move();
					
				}
				if (e.getKeyCode()==KeyEvent.VK_S) {
					setYDirection(+10);
					move();
					
				}
				break;
			case 2:
				if (e.getKeyCode()==KeyEvent.VK_UP) {
					setYDirection(-10);
					move();
					
				}
				if (e.getKeyCode()==KeyEvent.VK_DOWN) {
					setYDirection(+10);
					move();
					
				}
				break;
				
			}
		}
		public void keyReleased(KeyEvent e) {
			switch(id) {
			case 1:
				if (e.getKeyCode()==KeyEvent.VK_W) {
					setYDirection(0);
					move();
					
				}
				if (e.getKeyCode()==KeyEvent.VK_S) {
					setYDirection(0);
					move();
					
				}
				break;
			case 2:
				if (e.getKeyCode()==KeyEvent.VK_UP) {
					setYDirection(0);
					move();
					
				}
				if (e.getKeyCode()==KeyEvent.VK_DOWN) {
					setYDirection(0);
					move();
					
				}
				break;
				
			}
			
		}
		public void setYDirection(int yDirection) {
			yVelocity = yDirection;
			
		}
		public void move() {
			y= y + yVelocity;
			
		}
		public void draw(Graphics g) {
			if(id==1) {
				g.setColor(Color.blue);
			}
			else {
				g.setColor(Color.red);
			}
			g.fillRect(x, y, width, height);
		}
		
	}
	
	public  class Ball extends Rectangle {
		
		Random random;
		int xVelocity;
		int yVelocity;
		
		Ball(int x, int y,int width, int height) { 
			super(x,y,width,height);
			random = new Random();
			int randomXDirection = random.nextInt(2);
			//System.out.println(randomXDirection);
			if(randomXDirection == 0) {
				randomXDirection -=3;
				setXDirection(randomXDirection);
				
			}
			if(randomXDirection == 1) {
				randomXDirection +=3;
				setXDirection(randomXDirection);
			}
			
			int randomYDirection = random.nextInt(2);
			if(randomYDirection == 0) {
				randomYDirection -=3;
				setYDirection(randomYDirection);
				
			}else {
				randomYDirection +=3;
				setYDirection(randomYDirection);
			}
		}
		
		public void setXDirection(int randomXDirection) {
			xVelocity = randomXDirection;
		}
		public void setYDirection(int randomYDirection) {
			yVelocity = randomYDirection;
		}
		public void move() {
			x += xVelocity;
			y += yVelocity;
		}
		public void draw(Graphics g) {
			g.setColor(Color.gray);
			g.fillOval(x, y , height, width);
		}
		
	}
	public  class Score  extends Rectangle{
		
		static int GAME_WIDTH;
		static int GAME_HEIGHT;
		int player1;
		int player2;
		
		Score(int GAME_WIDTH,int GAME_HEIGHT) {
			Score.GAME_HEIGHT = GAME_HEIGHT;
			Score.GAME_WIDTH = GAME_WIDTH;
		}
		
		public void draw(Graphics g) {
			g.setColor(Color.white);
			g.setFont(new Font("Consoles",Font.PLAIN,30));
			g.drawString(player1+ " : " +player2,(int) (GAME_WIDTH/2)-30,30);
		}
	}
}

