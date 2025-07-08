import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

public class Game {
	
	JFrame frame;
	JLabel label;
	Action upAction;
	Action downAction;
	Action leftAction;
	Action rightAction;
	private Game.UpAction upAaction;
	private Game.DownAction downAaction;
	private Game.LeftAction leftAaction;
	private Game.RightAction rightAaction;
	
	
	
	
	Game() {
		
		frame = new JFrame("KeyBinding Demo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		
		label = new JLabel();
		label.setBackground(Color.red);
		label.setBounds(100,100,100,100);
		label.setOpaque(true);
		
		upAaction = new UpAction();
		downAaction = new DownAction();
		leftAaction = new LeftAction();
		rightAaction = new RightAction();
		
		label.getInputMap().put(KeyStroke.getKeyStroke("UP") , "upAction");
		label.getActionMap().put("upAction", upAaction);
		label.getInputMap().put(KeyStroke.getKeyStroke("DOWN") , "downAction");
		label.getActionMap().put("downAction", downAaction);
		label.getInputMap().put(KeyStroke.getKeyStroke("LEFT") , "leftAction");
		label.getActionMap().put("leftAction", leftAaction);
		label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT") , "rightAction");
		label.getActionMap().put("rightAction", rightAaction);
		
		
		
		frame.add(label);
		frame.setVisible(true);
		
	}

	public class UpAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(),label.getY()-10);
		}
		
	}
	public class LeftAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX() - 10,label.getY());
		}
		
	}
	
	public class RightAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX() + 10,label.getY());
		}
		
	}
	public class DownAction extends AbstractAction{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			label.setLocation(label.getX(),label.getY()+10);
		}
		
	}
}
