import javax.swing.JFrame;

public class MyFrame extends JFrame {

	
	DragPanel dragPanel = new DragPanel();
	
	
	MyFrame() {
		
		this.add(dragPanel);
		this.setTitle("Drag & Drop demo");
		this.setSize(1500,1500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
