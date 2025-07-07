import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements KeyListener {
	
	
	JLabel label;
	ImageIcon icon;
	
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,500);
		this.setLayout(null);
		
		icon = new ImageIcon("Burger.png");
		
		label = new JLabel();
		label.setBounds(0,0,100,100);
		//label.setBackground(Color.green);
		//label.setOpaque(true);
		label.setIcon(icon);
		
		this.getContentPane().setBackground(Color.black);
		this.add(label);
		this.addKeyListener(this);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
		case 'a':label.setLocation(label.getX() - 1,label.getY());break;
		case 'd':label.setLocation(label.getX() + 1,label.getY());break;
		case 'w':label.setLocation(label.getX() ,label.getY() - 1);break;
		case 's':label.setLocation(label.getX() ,label.getY() + 1);break;
		}
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		switch(e.getKeyChar()) {
		case 'a':label.setLocation(label.getX() - 10,label.getY());break;
		case 'd':label.setLocation(label.getX() + 10,label.getY());break;
		case 'w':label.setLocation(label.getX() ,label.getY() - 10);break;
		case 's':label.setLocation(label.getX() ,label.getY() + 10);break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("You released key char: " + e.getKeyChar() + " " + e.getKeyCode());
		
	}

}
