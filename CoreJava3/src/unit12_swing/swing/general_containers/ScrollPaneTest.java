package unit12_swing.swing.general_containers;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ScrollPaneTest {
	JFrame frame;
	JPanel panel;
	JTextArea textArea1;
	
	public ScrollPaneTest() {
		frame = new JFrame("Panel Test");		
		frame.setSize(new Dimension(500, 500)); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setLocationByPlatform(true);
						
		textArea1 = new JTextArea(10,10);
		JScrollPane scrollPane = new JScrollPane(textArea1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(scrollPane);
		
		frame.setContentPane(panel);
		frame.setVisible(true);		
	}
	
	public static void main(String[] args) {
		new ScrollPaneTest();
	}
}