import java.awt.*;
import java.util.*;
import javax.swing.*;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();
		ArrayList<JLabel> deck = new ArrayList<JLabel>();
		
		//String AC = "A*A";
		//JLabel Aclabel = new JLabel(AC);
		//deck.add(Aclabel);
		
		//String twoC = "2*2";
		//JLabel twoclabel = new JLabel(twoC);
		//deck.add(twoclabel);
		
		//frame.add(deck.get(0));
		//frame.add(deck.get(1));
		
		for (int i = 1; i<=52; i++) {
		deck.add(new JLabel(new String( i +"*" + i)));
		frame.add(deck.get(i-1));
		}
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(new FlowLayout());
		frame.setVisible(true);
		
		
	}

}
