import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
		//JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.INFORMATION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.QUESTION_MESSAGE);
		//JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.WARNING_MESSAGE);
		//JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.ERROR_MESSAGE);
		
		//System.out.println(JOptionPane.showConfirmDialog(null, "bro do you even code?","This is my title",JOptionPane.YES_NO_OPTION));
		
		//String name = JOptionPane.showInputDialog("What is your name?");
		//System.out.println(name);
		
		String[] response = {"No, You're awesome!", "Thank you!","blush"};
		
		JOptionPane.showOptionDialog(null, "YOU are awesome!", "Secret message", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, response, 0);
	}

}
