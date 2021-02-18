package unit12_swing.swing.general_containers;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class ToolBar {
	JFrame frame;
	JToolBar toolbar;
	
	@SuppressWarnings("unchecked")
	public ToolBar() {
		frame = new JFrame("Toolbar Test");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contentPane = frame.getContentPane();  
		
		toolbar = new JToolBar(); 
		toolbar.setRollover(true);
		toolbar.add(new JButton("File"));
		toolbar.addSeparator();  
		toolbar.add(new JButton("Edit"));
		toolbar.add(new JComboBox(new String[] { "Opt-1", "Opt-2", "Opt-3", "Opt-4" }));  
		contentPane.add(toolbar, BorderLayout.NORTH);
		
		JTextArea textArea = new JTextArea(5, 10);  
        JScrollPane mypane = new JScrollPane(textArea);  
        contentPane.add(mypane, BorderLayout.CENTER);  
        
		frame.setSize(450, 250);  
        frame.setVisible(true);  
	}
	public static void main(String[] args) {
		new ToolBar();
	}
}
