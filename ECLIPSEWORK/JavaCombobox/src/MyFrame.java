import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{

	JComboBox comboBox ;
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==comboBox) {
			System.out.println(comboBox.getSelectedItem());
		}
	}
	
	MyFrame(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		String[] animals = {"dog","cat","bird"};
		comboBox = new JComboBox(animals);
		comboBox.addActionListener(this);
		
		comboBox.setEditable(true);
		System.out.println(comboBox.getItemCount());
		
		comboBox.addItem("horse");
		comboBox.insertItemAt("pig", 1);
		comboBox.setSelectedIndex(1);
		comboBox.removeItemAt(1);
		
		this.add(comboBox);
		this.pack();
		this.setVisible(true);
	}

}
