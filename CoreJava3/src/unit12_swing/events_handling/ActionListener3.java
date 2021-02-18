package unit12_swing.events_handling;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ActionListener3 extends JFrame{

	JButton btn1;

	public ActionListener3() {
		setTitle("Action Listener Test1");
		setSize(new Dimension(250, 250));
		setLayout(new FlowLayout());

		btn1=new JButton("Close");
		btn1.addActionListener(new Button1Handler());
		add(btn1);
		setVisible(true);
	}

	private class Button1Handler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.out.println("Hello from Button1-Handler");
		}
	}
	
	public static void main(String[] args) {
		new ActionListener3();		
	}
}