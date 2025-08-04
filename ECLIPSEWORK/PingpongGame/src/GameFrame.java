import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class GameFrame extends JFrame{

	GamePanel panel;
	
	GameFrame() {
		panel = new GamePanel();
		this.add(panel);
		this.setFont(new Font("SimSun",Font.BOLD,25));
		this.setTitle("兵乓球");
		this.setResizable(false);
		this.setBackground(Color.black);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
		
	}
}
