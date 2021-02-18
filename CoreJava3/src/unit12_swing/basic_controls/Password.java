package unit12_swing.basic_controls;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

public class Password {
	JFrame frame;
	JPasswordField password;
	
	public Password () {
		frame=new JFrame("Button Test");
		frame.setSize(new Dimension(250, 250));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		password = new JPasswordField();
		password.setColumns(10);
		
		frame.add(password);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Password();
	}
}