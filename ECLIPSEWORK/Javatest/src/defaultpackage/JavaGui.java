package defaultpackage;
import javax.swing.JOptionPane;
public class JavaGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("Enter your name");
		JOptionPane.showMessageDialog(null, "Hello " + name);
		int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age")) ;
		JOptionPane.showMessageDialog(null, "Your age is " + age);
		double height = Double.parseDouble(JOptionPane.showInputDialog("How much your height(cm)?"));
		JOptionPane.showMessageDialog(null,"You are" + height + "cm tall");
	}

}
