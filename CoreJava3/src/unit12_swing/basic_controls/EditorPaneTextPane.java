package unit12_swing.basic_controls;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JTextPane;

public class EditorPaneTextPane {
	JFrame frame;
	
	JEditorPane ep1;
	JTextPane tp1;
	
	public EditorPaneTextPane () {
		frame=new JFrame("Button Test");
		frame.setSize(new Dimension(250, 250));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		ep1 = new JEditorPane();
		tp1 = new JTextPane();
		
		ep1.setSize(new Dimension(225, 150));
		tp1.setSize(new Dimension(225, 150));
		
		//frame.add(ep1);
		frame.add(tp1);
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new EditorPaneTextPane();
	}
}