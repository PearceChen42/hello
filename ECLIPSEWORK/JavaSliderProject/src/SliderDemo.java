
import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderDemo implements ChangeListener {

	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	
	SliderDemo() {
		frame = new JFrame("Slider Demo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100,50);
		
		slider.setPreferredSize(new Dimension(400,200));
		
		slider.setPaintLabels(true);
		
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing(25);
		
		
		slider.setPaintLabels(true);
		slider.setFont(new Font("MV Boli",Font.PLAIN,15));
		
		
		slider.setOrientation(SwingConstants.VERTICAL);
		slider.addChangeListener(this);
		
		label.setText("℃ = " + slider.getValue());
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
		
	}
	
	
	@Override
	public void stateChanged(ChangeEvent e) {
		// TODO Auto-generated method stub
	
		label.setText("℃ = " + slider.getValue());
	}

	
	
}
