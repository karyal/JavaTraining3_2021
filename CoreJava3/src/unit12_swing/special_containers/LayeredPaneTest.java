package unit12_swing.special_containers;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLayeredPane;

public class LayeredPaneTest {
	JFrame frame;
	JLayeredPane lPane;
	JButton btn_1;
	JButton btn_2;
	JButton btn_3;
		
	public LayeredPaneTest() {
		frame = new JFrame("LayeredPane Test");		
		frame.setSize(new Dimension(500, 500));
		
		btn_1=new JButton();
		btn_1.setBackground(Color.red);
		btn_1.setBounds(50, 30, 100, 100);
		
		btn_2=new JButton();
		btn_2.setBackground(Color.green);
		btn_2.setBounds(140, 60, 100, 100);
		
		btn_3=new JButton();
		btn_3.setBackground(Color.white);
		btn_3.setBounds(230,90,100,100);
		
		lPane = new JLayeredPane();
		lPane.add(btn_1, new Integer(1));
		lPane.add(btn_2, new Integer(2));
		lPane.add(btn_3, new Integer(3));
		
		frame.add(lPane);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new LayeredPaneTest();
	}
}