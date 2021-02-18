package unit12_swing.basic_controls;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class TextAreaTextField {
	
	JFrame frame;
	JTextArea ta1;
	JTextField tf1;
	JPasswordField pf1;
	
	public TextAreaTextField () {
		frame=new JFrame("Button Test");
		frame.setSize(new Dimension(250, 250));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		ta1 = new JTextArea(5, 20);
		tf1 = new JTextField(20);
		pf1 = new JPasswordField(20);
		
		
		frame.add(ta1);
		frame.add(tf1);
		frame.add(pf1);
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new TextAreaTextField();
	}
}