package unit12_swing.swing.general_containers;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

public class SplitPane {
	JFrame frame;
	JPanel panel1;
	JPanel panel2;
	JTextArea textArea1;
	JTextArea textArea2;
	JScrollPane scrollPane1;
	JScrollPane scrollPane2;
	JSplitPane splitPane;
	
	public SplitPane() {
		frame = new JFrame("Panel Test");		
		frame.setSize(new Dimension(500, 500)); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		frame.setLocationByPlatform(true);
						
		textArea1 = new JTextArea(5,10);
		scrollPane1 = new JScrollPane(textArea1,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		textArea2 = new JTextArea(5,10);
		scrollPane2 = new JScrollPane(textArea2,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(scrollPane1);
		
		panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
		panel2.add(scrollPane2);
		
		splitPane = new JSplitPane(SwingConstants.HORIZONTAL, panel1, panel2);
		
		frame.setContentPane(splitPane);
		frame.setVisible(true);		
	}
	
	public static void main(String[] args) {
		new SplitPane();
	}
}
