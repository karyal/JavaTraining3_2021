package unit12_swing.basic_controls;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Template {
	JFrame frame;
	public Template () {
		frame=new JFrame("Button Test");
		frame.setSize(new Dimension(250, 250));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Template();
	}
}