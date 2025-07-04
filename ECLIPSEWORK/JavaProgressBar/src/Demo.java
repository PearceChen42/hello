
import java.awt.*;
import javax.swing.*;


public class Demo {
	
	JFrame frame = new JFrame();
	JProgressBar bar = new JProgressBar(0,100);

	Demo() {
		
		bar.setValue(0);
		bar.setBounds(0,0,420,120);
		bar.setStringPainted(true);
		bar.setFont(new Font("MV Boli",Font.BOLD,25));
		bar.setForeground(Color.red);
		bar.setBackground(Color.black);
	
		
		frame.add(bar);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.setVisible(true);
		
		fill();
	
		
		System.exit(0);
		
	
	}
	public void fill() {
		int counter = 0;
		
		bar.setValue(counter);
		while (counter<=100) {
			bar.setValue(counter);
			try {
				Thread.sleep(100);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			counter += 1;
			
		}
		bar.setString("Hello World!");
	}
}
