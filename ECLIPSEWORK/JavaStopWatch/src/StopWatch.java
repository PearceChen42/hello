import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class StopWatch implements ActionListener{

	JFrame frame = new JFrame();
	JButton startButton = new JButton("STRAT");
	JButton resetButton = new JButton("RESET");
	JLabel timeLabel = new JLabel();
	int elapsedTime = 0;
	int seconds = 0;
	int minutes =0;
	int hours = 0;
	boolean started = false;
	String seconds_string = String.format("%02d", seconds);
	String minutes_string = String.format("%02d", minutes);
	String hours_string = String.format("%02d", hours);
	
	Timer timer = new Timer(1000,new ActionListener() {
		
		public void actionPerformed(ActionEvent e) {
			elapsedTime+=1000;
			hours =(elapsedTime/3600000);
			minutes = (elapsedTime/60000) %60;
			seconds = (elapsedTime/1000) %60 ;
			
			seconds_string = String.format("%02d", seconds);
			minutes_string = String.format("%02d", minutes);
			hours_string = String.format("%02d", hours);
			
			timeLabel.setText(hours_string + ":" + minutes_string + ":" +seconds_string);
			
		}
	});
	
	StopWatch() {
		
		timeLabel.setText(hours_string + ":" + minutes_string + ":" +seconds_string);
		timeLabel.setBounds(100,100,200,100);
		timeLabel.setFont(new Font("Aria",Font.BOLD,30));
		timeLabel.setBorder(BorderFactory.createBevelBorder(1));
		timeLabel.setOpaque(true);
		timeLabel.setHorizontalAlignment(JTextField.CENTER);
		
		startButton.setBounds(100,200,100,50);
		startButton.setFont(new Font("Simsun",Font.BOLD,20));
		startButton.setFocusable(false);
		startButton.addActionListener(this);
		
		resetButton.setBounds(200,200,100,50);
		resetButton.setFont(new Font("Simsun",Font.BOLD,20));
		resetButton.setFocusable(false);
		resetButton.addActionListener(this);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420,420);
		frame.setLayout(null);
		frame.add(timeLabel);
		frame.add(startButton);
		frame.add(resetButton);
		frame.setVisible(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		
		if(e.getSource()==startButton) {
			
			if(started == false) {
				started = true;
				startButton.setText("STOP");
				start();
			}
			else {
				started = false;
				startButton.setText("START");
				stop();
			}
			
		}
		
		if(e.getSource()==resetButton) {
			started=false;
			startButton.setText("START");
			reset();
		}
		
	}
	
	void start() {
		timer.start();
		
	}
	
	void stop() {
		timer.stop();
	}

	void reset() {
		timer.stop();
		
		elapsedTime=0;
		hours = 0;
		minutes = 0;
		seconds = 0;
		
		seconds_string = String.format("%02d", seconds);
		minutes_string = String.format("%02d", minutes);
		hours_string = String.format("%02d", hours);
		timeLabel.setText(hours_string + ":" + minutes_string + ":" +seconds_string);
		
	}
	
	
	
	
}
