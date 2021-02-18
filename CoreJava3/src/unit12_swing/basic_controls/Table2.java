package unit12_swing.basic_controls;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Table2 {
	JFrame frame;
	JTable tbl_1;
	DefaultTableModel dtm;
	
	public Table2() {
		frame = new JFrame("Table-2");
		frame.setSize(new Dimension(500, 250));
		
		dtm = new DefaultTableModel();
		tbl_1 = new JTable(dtm);
		
		dtm.addColumn("SN");
		dtm.addColumn("NAME");
		dtm.addColumn("ADDRESS");
		
		/*
		Vector row1 = new Vector();
		Vector row2 = new Vector();
		
		row1.add("1");
		row1.add("Prakash Thapa");
		row1.add("Ktm");
		
		row2.add("2");
		row2.add("Roshan");
		row2.add("Ktm");
		
		Vector persons = new Vector();
		
		persons.add(row1);
		persons.add(row2);		
		
		System.out.println(persons.size());
		for(int i=0; i<persons.size(); i++) {
			Vector row = (Vector) persons.get(i);
			for(int j=0; j<row.size(); j++) {
				System.out.print(row.get(j)+" ");
			}
			System.out.println();			
		}
		*/
		
		frame.setLayout(new FlowLayout());
		frame.add(new JScrollPane(tbl_1));
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Table2();
	}
}