package unit12_swing.events_handling;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ActionListener1 extends JFrame implements ActionListener{
	JButton btn1;
	public ActionListener1() {
		setTitle("Action Listener Test1");
		setSize(new Dimension(250, 250));
		setLayout(new FlowLayout());
		
		btn1=new JButton("Close");
		btn1.addActionListener(this);
		add(btn1);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn1) {
			System.out.println("Hello from Close Button");
			//System.exit(0);
		}		
	}	
	public static void main(String[] args) {
		new ActionListener1();		
	}
}
