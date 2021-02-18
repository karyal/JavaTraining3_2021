package unit12_swing.basic_controls;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBox {
	JFrame frame;
	JCheckBox chk_1;
	JCheckBox chk_2;
	JCheckBox chk_3;
	JCheckBox chk_4;
	
	public CheckBox () {
		frame=new JFrame("CheckBox Test");
		frame.setSize(new Dimension(250, 250));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		chk_1 =new JCheckBox();
		chk_2 =new JCheckBox("Playing");
		chk_3 =new JCheckBox("Swimming", true);
		
		Icon icon =  new ImageIcon("icon.png");
		chk_4 =new JCheckBox("Cricket", icon, true);
		
		chk_1.setText("Reading");
		
		frame.add(chk_1);
		frame.add(chk_2);
		frame.add(chk_3);
		frame.add(chk_4);
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new CheckBox();
	}
}