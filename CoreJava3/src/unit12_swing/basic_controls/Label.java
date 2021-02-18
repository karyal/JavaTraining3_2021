package unit12_swing.basic_controls;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Label {
	JFrame frame;
	JLabel lbl_1;
	
	public Label () {
		frame=new JFrame("Button Test");
		frame.setSize(new Dimension(250, 250));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		lbl_1 = new JLabel("Enter First Name : ");
		
		frame.add(lbl_1);		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Label();
	}
}