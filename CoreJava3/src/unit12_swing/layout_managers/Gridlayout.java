package unit12_swing.layout_managers;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Gridlayout {
	JFrame frame;
	
	JLabel lbl_1, lbl_2, lbl_3;
	JTextField txt_1, txt_2, txt_3;
	JButton btn_save, btn_close;
	
	public Gridlayout () {
		frame=new JFrame("Grid Layout");
		frame.setSize(new Dimension(250, 150));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
		
		lbl_1 = new JLabel("ID : ");
		lbl_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_2 = new JLabel("NAME : ");
		lbl_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl_3 = new JLabel("ADDRESS : ");
		lbl_3.setHorizontalAlignment(SwingConstants.RIGHT);
		
		txt_1 = new JTextField(15);
		txt_2 = new JTextField(15);
		txt_3 = new JTextField(15);
		
		btn_save = new JButton("SAVE");
		btn_close = new JButton("CLOSE");
		
		frame.setLayout(new GridLayout(4,2));
		frame.add(lbl_1);
		frame.add(txt_1);
		frame.add(lbl_2);
		frame.add(txt_2);
		frame.add(lbl_3);
		frame.add(txt_3);
		frame.add(btn_save);
		frame.add(btn_close);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Gridlayout();
	}
}