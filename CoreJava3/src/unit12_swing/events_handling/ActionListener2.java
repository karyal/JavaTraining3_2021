package unit12_swing.events_handling;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListener2 extends JFrame {
	
	JButton btn1;
	
	public ActionListener2() {
		setTitle("Action Listener Test1");
		setSize(new Dimension(250, 250));
		setLayout(new FlowLayout());
		
		btn1=new JButton("Close");		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				System.out.println("Hello from Close Button");
				//System.exit(0);
	        }
		});
		add(btn1);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ActionListener2();		
	}
}