package unit12_swing.basic_controls;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;
import javax.swing.JSlider;
import javax.swing.JSpinner;

public class ProgressbarSliderSpinner {
	JFrame frame;
	JProgressBar jpb1;//Timer - Start from (time) to (time)
	JSlider jsl1;
	JSpinner jsn1;//Slider and Spinner (Integrate)
	
	public ProgressbarSliderSpinner () {
		frame=new JFrame("Button Test");
		frame.setSize(new Dimension(250, 250));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		jpb1 = new JProgressBar();
		jsl1 = new JSlider();
		jsn1 = new JSpinner();		
		
		frame.add(jpb1);
		frame.add(jsl1);
		frame.add(jsn1);
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new ProgressbarSliderSpinner();
	}
}