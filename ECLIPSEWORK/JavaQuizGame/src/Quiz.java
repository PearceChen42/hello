import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Quiz implements ActionListener {
	
	
	String[] questions = {
			"Which company created Java?",
			"Which year was Java created?",
			"What was Java or originally called?",
			"Who is credited with creating Java?"
	};
	
	String[][] options = {
		
			{"Sun Microsystems","Starbucks","Microsoft","Alphabet"},
			{"1989","1996","1972","1492"},
			{"Apple","Latte","Oak","Koffing"},
			{"Steve Jobs","Bill Gates","James Gosling","Mark Zuckerburg"}
	};
	
	char[] answers = {
			'A','B','C','C'
	};
	
	char guess;
	char answer;
	int index;
	int correct_guesses = 0;
	int total_questions = questions.length;
	int result;
	int seconds=10;
	
	JFrame frame =  new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel answer_labelA = new JLabel();
	JLabel answer_labelB = new JLabel();
	JLabel answer_labelC = new JLabel();
	JLabel answer_labelD = new JLabel();
	JLabel time_label = new JLabel();
	JLabel seconds_left = new JLabel();
	JTextField number_right = new JTextField();
	JTextField percentage = new JTextField();
	
	
	public Quiz() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setLayout(null);
		frame.setResizable(false);
		
		textfield.setBounds(0,0,650,50);
		textfield.setBackground(Color.black);
		textfield.setForeground(Color.green);
		textfield.setFont(new Font("Ink Free",Font.ITALIC,25));
		textfield.setBorder(BorderFactory.createBevelBorder(3));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		
		textarea.setBounds(0,50,650,50);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(Color.black);
		textarea.setForeground(Color.green);
		textarea.setFont(new Font("MV Boli",Font.ITALIC,25));
		textarea.setBorder(BorderFactory.createBevelBorder(3));
		textarea.setEditable(false);
		textarea.setText("SAMPLE TEXT");
		
		
		buttonA.setBounds(0,100,100,100);
		buttonA.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		buttonB.setBounds(0,200,100,100);
		buttonB.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		buttonC.setBounds(0,300,100,100);
		buttonC.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		buttonD.setBounds(0,400,100,100);
		buttonD.setFont(new Font("MV Boli",Font.BOLD,35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		answer_labelA.setBounds(125,100,500,100);
		answer_labelA.setBackground(new Color(50,50,50));
		answer_labelA.setForeground(new Color(25,255,0));
		answer_labelA.setFont(new Font("MV Boli",Font.PLAIN,35));
		
		
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(textfield);
		frame.add(textarea);
		frame.setVisible(true);
	}
	
	public void nextQuestion() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void displayAnswer() {
		
	}
	
	public void result() {
		
	}

}
