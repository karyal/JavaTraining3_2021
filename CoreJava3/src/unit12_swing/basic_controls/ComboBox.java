package unit12_swing.basic_controls;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox {
	JFrame frame;
	JComboBox cmb1;
	JComboBox cmb2;
	JComboBox cmb3;
	JComboBox cmb4;
	
	public ComboBox () {
		frame=new JFrame("Button Test");
		frame.setSize(new Dimension(250, 250));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		cmb1 = new JComboBox();
		
		String items[]= {"ONE","TWO","THREE","FOUR","FIVE"}; //Database?
		
		Vector vlist1 = new Vector(); //Items from File, Database, Web, ... other sources
		vlist1.add("ONE");
		vlist1.add("TWO");
		vlist1.add("THREE");
		vlist1.add("FOUR");
		vlist1.add("FIVE");
		
		cmb2 = new JComboBox(items);
		cmb3 = new JComboBox(vlist1);
		
		ComboBoxModel cmb_model = cmb1.getModel();
		//cmb_model //Process on cmb_1
		
		frame.add(cmb1);
		frame.add(cmb2);
		frame.add(cmb3);
		
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new ComboBox();
	}
}