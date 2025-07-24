import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{

	Random random = new Random();
	JFrame frame = new JFrame();
	JPanel title_panel = new JPanel();
	JPanel button_panel = new JPanel();
	JLabel textfield = new JLabel();
	JButton[] buttons = new JButton[9];
	boolean player1_turn;
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<9;i++) {
			if(e.getSource()==buttons[i]) {
				if(player1_turn) {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(255,0,0));
						buttons[i].setText("X");
						player1_turn=false;
						textfield.setText("O turn");
						try {
							check();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
				else {
					if(buttons[i].getText()=="") {
						buttons[i].setForeground(new Color(0,0,255));
						buttons[i].setText("O");
						player1_turn=true;
						textfield.setText("X turn");
						try {
							check();
						} catch (InterruptedException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				}
			}
			
			
		}
	}
	
	TicTacToe() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800,800);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(new BorderLayout());
		
		textfield.setBackground(Color.black);
		textfield.setForeground(Color.green);
		textfield.setFont(new Font("Simsun",Font.BOLD,75));
		textfield.setHorizontalAlignment(JLabel.CENTER);
		textfield.setText("Tic-Tac-Toe");
		textfield.setOpaque(true);
		
		title_panel.setLayout(new BorderLayout());
		title_panel.setBounds(0,0,800,100);
		title_panel.add(textfield);
		
		button_panel.setLayout(new GridLayout(3,3));
		button_panel.setBackground(new Color(100,100,100));
		;
		for(int i =0;i<9;i++) {
			buttons[i] = new JButton();
			button_panel.add(buttons[i]);
			buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
			buttons[i].setFocusable(false);
			buttons[i].addActionListener(this);
		}

		frame.add(button_panel);
		frame.add(title_panel,BorderLayout.NORTH);
		frame.setVisible(true);
		
		firstTurn();
	}

	public void firstTurn() {
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(random.nextInt(2)==0) {
			player1_turn=true;
			textfield.setText("X turn");
		}
		else {
			player1_turn=false;
			textfield.setText("O turn");
		}
		
	}
	
	public void check() throws InterruptedException {
		
		if ( 
				(buttons[0].getText()=="X") &&
				(buttons[1].getText()=="X") &&
				(buttons[2].getText()=="X")
				) {
			xWins(0,1,2);
			
		}
		if ( 
				(buttons[3].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[5].getText()=="X")
				) {
			xWins(3,4,5);
			
		}
		if ( 
				(buttons[6].getText()=="X") &&
				(buttons[7].getText()=="X") &&
				(buttons[8].getText()=="X")
				) {
			xWins(6,7,8);
			
		}
		if ( 
				(buttons[0].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[8].getText()=="X")
				) {
			xWins(0,4,8);
			
		}
		if ( 
				(buttons[2].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[6].getText()=="X")
				) {
			xWins(2,4,6);
			
		}
		if ( 
				(buttons[2].getText()=="X") &&
				(buttons[5].getText()=="X") &&
				(buttons[8].getText()=="X")
				) {
			xWins(2,5,8);
			
		}
		if ( 
				(buttons[1].getText()=="X") &&
				(buttons[4].getText()=="X") &&
				(buttons[7].getText()=="X")
				) {
			xWins(1,4,7);
			
		}
		if ( 
				(buttons[0].getText()=="X") &&
				(buttons[3].getText()=="X") &&
				(buttons[6].getText()=="X")
				) {
			xWins(0,3,6);
			
		}
		
		if ( 
				(buttons[0].getText()=="O") &&
				(buttons[1].getText()=="O") &&
				(buttons[2].getText()=="O")
				) {
			oWins(0,1,2);
			
		}
		if ( 
				(buttons[3].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[5].getText()=="O")
				) {
			oWins(3,4,5);
			
		}
		if ( 
				(buttons[6].getText()=="O") &&
				(buttons[7].getText()=="O") &&
				(buttons[8].getText()=="O")
				) {
			oWins(6,7,8);
			
		}
		if ( 
				(buttons[0].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[8].getText()=="O")
				) {
			oWins(0,4,8);
			
		}
		if ( 
				(buttons[2].getText()=="O") &&
				(buttons[3].getText()=="O") &&
				(buttons[6].getText()=="O")
				) {
			oWins(2,4,6);
			
		}
		
		if ( 
				(buttons[2].getText()=="O") &&
				(buttons[5].getText()=="O") &&
				(buttons[8].getText()=="O")
				) {
			oWins(2,5,8);
			
		}
		if ( 
				(buttons[1].getText()=="O") &&
				(buttons[4].getText()=="O") &&
				(buttons[7].getText()=="O")
				) {
			oWins(1,4,7);
			
		}
		if ( 
				(buttons[0].getText()=="O") &&
				(buttons[3].getText()=="O") &&
				(buttons[6].getText()=="O")
				) {
			oWins(0,3,6);
			
		}
		
	}
	
	public void xWins( int a, int b, int c) throws InterruptedException {
		buttons[a].setBackground(Color.green);
		buttons[a].setForeground(Color.red);
		buttons[b].setBackground(Color.green);
		buttons[b].setForeground(Color.red);
		buttons[c].setBackground(Color.green);
		buttons[c].setForeground(Color.red);
		
		System.out.println("X IS WIN!");
		
		textfield.setText("X IS WIN!!!!");
		
			Thread.sleep(500);	
			for(int i = 0; i<9;i++) {
				buttons[i].setEnabled(false);
				
			}
	}
	
	public void oWins( int a, int b, int c) throws InterruptedException {
		buttons[a].setBackground(Color.green);
		buttons[a].setForeground(Color.red);
		buttons[b].setBackground(Color.green);
		buttons[b].setForeground(Color.red);
		buttons[c].setBackground(Color.green);
		buttons[c].setForeground(Color.red);
		
		System.out.println("O IS WIN!");
		textfield.setText("O IS WIN!!!!");
		
			Thread.sleep(500);
		for(int i = 0; i<9;i++) {
			buttons[i].setEnabled(false);
			
		}
				
	}
}
