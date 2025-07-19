import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Calculator implements ActionListener {

	JFrame frame;
	JTextField textfield;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[9];
	JButton addButton,subButton,mulButton,divButton;
	JButton decButton,equButton,delButton,clrButton,negButton;
	
	JPanel panel;
	
	Font myFont = new Font("Ink Free",Font.BOLD,30);
	
	double num1=0,num2=0,result=0;
	char operator;
	
	Calculator() {
		frame = new JFrame("Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,550);
		
		textfield = new JTextField();
		textfield.setBounds(50,25,300,50);
		textfield.setFont(myFont);
		textfield.setEditable(false);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Del");
		clrButton = new JButton("Clr");
		negButton = new JButton("(-)");
		
		functionButtons[0] = addButton;
		functionButtons[1] = subButton;
		functionButtons[2] = mulButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = negButton;
		
		for(int i=0;i<functionButtons.length;i++ ) {
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		
		for(int i=0;i<10;i++ ) {
			int num = i;
			String number = "" + num;
			numberButtons[i] = new JButton(number);
			
			
		}
		
	
		
		
		for(int i=0;i<10;i++ ) {
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}
		
		delButton.setBounds(150,430,100,50);
		clrButton.setBounds(250,430,100,50);
		negButton.setBounds(50,430,100,50);
		
		panel = new JPanel();
		panel.setBounds(50,100,300,300);
		panel.setLayout(new GridLayout(4,4,10,10));
		panel.setBackground(Color.gray);
		
		
		panel.add(addButton);
		panel.add(subButton);
		panel.add(mulButton);
		panel.add(divButton);
		panel.add(decButton);
		panel.add(equButton);
		
		
		for (int i =0; i<numberButtons.length-1;i++) {
			panel.add(numberButtons[i+1]);
		}
		panel.add(numberButtons[0]);
		
		
		
		frame.add(panel);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(textfield);
		frame.add(negButton);
		frame.setLocationRelativeTo(null);
		frame.setLayout(null);
		frame.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++) {
			if (e.getSource() == numberButtons[i]) {
				textfield.setText(textfield.getText().concat(String.valueOf(i)));
				
			}
		}
		

		if(e.getSource()==negButton) {
			num1=Double.parseDouble(textfield.getText());
			num1 = 0-num1;
			textfield.setText(String.valueOf(num1));
		}
		
		if(e.getSource()==equButton) {
			num2=Double.parseDouble(textfield.getText());
			
			switch(operator) {
			case '+': result = num1 + num2;break;
			case '-': result = num1 - num2;break;
			case '*': result = num1 * num2;break;
			case '/': result = num1 / num2;break;
			}
			num1 = result;		
			textfield.setText(String.valueOf(result));
			
		}
		
		if(e.getSource()==decButton) {
			textfield.setText(textfield.getText().concat("."));
		}
		
		if(e.getSource()==divButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '/';
			
			textfield.setText("");
		}
		if(e.getSource()==mulButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '*';
			
			textfield.setText("");
		}
		if(e.getSource()==subButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '-';
			
			textfield.setText("");
		}
		if(e.getSource()==addButton) {
			num1 = Double.parseDouble(textfield.getText());
			operator = '+';
			
			textfield.setText("");
		}
		if(e.getSource()==delButton) {
			String text = textfield.getText() ;
			char[] ch =  text.toCharArray();
									
			text = "";

			for (int i = 0; i<ch.length-1;i++) {
				text += ch[i];
			}
			textfield.setText(text);
			num1 = Double.parseDouble(textfield.getText());
			
		}
		if(e.getSource()==clrButton) {
			textfield.setText("");
			num1=0;num2=0;result=0;
		}
	}
}
