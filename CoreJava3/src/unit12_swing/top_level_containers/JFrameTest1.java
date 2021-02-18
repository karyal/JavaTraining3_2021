package unit12_swing.top_level_containers;

import javax.swing.JFrame;
import java.awt.Dimension;

public class JFrameTest1 {
	JFrame frame;
	
	public JFrameTest1 () {
		frame = new JFrame();//Default Constructor
		//frame = new JFrame("First Window");
		
		//frame.setSize(275, 250);		
		Dimension d = new Dimension(275, 250);
		frame.setSize(d);
		
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new JFrameTest1();
	}
}
