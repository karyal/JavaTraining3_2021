package unit12_swing.basic_controls;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;

public class List {
	JFrame frame;
	JComboBox cmb1;
	JList list1;
	
	public List () {
		frame=new JFrame("List and ComboBox");
		frame.setSize(new Dimension(250, 250));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		String items []= {"One","Two","Three","Four","Five"};		
		list1 = new JList(items);
		cmb1 = new JComboBox(items);
		
		frame.add(list1);
		frame.add(cmb1);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new List();
	}
}