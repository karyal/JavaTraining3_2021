package unit12_swing.special_containers;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JRootPane;

public class RootPaneTest {
	JFrame frame;
	JRootPane rootPane;
	
	public RootPaneTest() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		rootPane = frame.getRootPane();
		
		JMenuBar menubar1 = new JMenuBar();  
        JMenu menu1 = new JMenu("File");  
        menubar1.add(menu1);  
        menu1.add("Open");  
        menu1.add("Close");  
        rootPane.setJMenuBar(menubar1);  
         
        rootPane.getContentPane().add(new JButton("Press Me"));  
        
        frame.pack();
        frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new RootPaneTest();
	}
}
