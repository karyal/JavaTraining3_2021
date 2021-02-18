package unit12_swing.special_containers;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;

public class InternalFrameTest {
	JFrame frame;
	JDesktopPane dpane;
	JInternalFrame iframe;
	
	public InternalFrameTest() {
		//Frame Setting
		frame=new JFrame();
		frame.setTitle("JInternal Frame Test");
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setLayout(new FlowLayout());							
		
		//Panel
		JPanel panel=new JPanel();
		panel.add(new JButton("Hello"));
		
		//InternalFrame
		iframe = new JInternalFrame("Internal frame", true,true,true,true);
		iframe .setSize(250, 250);
		iframe.add(panel);
		iframe.setVisible(true);
		
		//Desktop Pane
		dpane = new JDesktopPane();
		dpane.add(iframe);
		
		frame.add(dpane);
		frame.setVisible(true);		
	}
	
	public static void main(String[] args) {
		new InternalFrameTest();
	}
}
