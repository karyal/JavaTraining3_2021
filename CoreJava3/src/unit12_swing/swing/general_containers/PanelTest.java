package unit12_swing.swing.general_containers;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelTest {
	JFrame frame;
	JPanel panel1;
	JPanel panel2;
	
	public PanelTest() {
		frame = new JFrame("Panel Test");
		frame.setSize(new Dimension(500, 500)); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
	
		//Panels
		panel1 = new JPanel();
		panel1.setSize(new Dimension(250, 250));
		//panel1.setBackground(Color.cyan);
		panel1.add(new JButton("OK"));
		
		panel2 = new JPanel();
		panel2.setSize(new Dimension(250, 250));
		//panel2.setBackground(Color.blue);
		panel2.add(new JButton("OK"));
	
		frame.add(panel1);
		frame.add(panel2);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new PanelTest();
	} 
}
