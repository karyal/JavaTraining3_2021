package unit12_swing.basic_controls;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Table {
	JFrame frame;
	JTable tbl1;
	
	public Table () {
		frame=new JFrame("Table");
		frame.setSize(new Dimension(250, 250));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		String []columns = {"SN","NAME","ADDRESS"};
		
		Object [][] data = {
				{"1","Raj Rai","KTM"},
				{"2","Kiran ","Lat"},
				{"3","Raju","BHK"}
		};
		
		tbl1 = new JTable(data, columns);
		
		frame.add(tbl1);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Table();
	}
}