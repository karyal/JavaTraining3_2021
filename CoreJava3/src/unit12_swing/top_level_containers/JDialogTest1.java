package unit12_swing.top_level_containers;

import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class JDialogTest1 {
	JFrame frame;
	
	public JDialogTest1() {
		frame=new JFrame();
		frame.setTitle("JDialog Test");
		frame.setSize(new Dimension(250, 250));
		frame.setVisible(true);
		
		//JDialog dialog = new JDialog(frame, "Test Dialog");
		JDialog dialog = new JDialog(frame, "Test Dialog", true);
		dialog.setSize(150, 150);
		dialog .setVisible(true);
	}
	
	public static void main(String[] args) {
		new JDialogTest1();
	}
}

