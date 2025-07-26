import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame(){
		GamePanel panel = new GamePanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.add(panel);
		this.setTitle("Snake");
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);
	}
}
