package jdbc;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class JDBC_GUI_1 implements ActionListener{
	JFrame frame;
	JLabel lbl_1, lbl_2,lbl_3,lbl_4,lbl_5;
	JTextField txt_1, txt_2,txt_3,txt_4,txt_5;
	JButton btn_save, btn_close, btn_search, btn_update, btn_delete, show_table;
		
	public JDBC_GUI_1() {
		frame = new JFrame("JDBC-DEMO");
		frame.setSize(new Dimension(250, 370));
		frame.setResizable(false);
		
		lbl_1 = new JLabel("SN : ");
		lbl_2 = new JLabel("NAME : ");
		lbl_3 = new JLabel("ADDRESS : ");
		lbl_4 = new JLabel("EMAIL : ");
		lbl_5 = new JLabel("PHONE : ");
		
		txt_1 = new JTextField(20);
		txt_2 = new JTextField(20);
		txt_3 = new JTextField(20);
		txt_4 = new JTextField(20);
		txt_5 = new JTextField(20);
		
		btn_save = new JButton("SAVE");
		btn_close = new JButton("CLOSE");
		btn_search = new JButton("SEARCH");
		btn_update = new JButton("UPDATE");		
		btn_delete = new JButton("DELETE");
		show_table = new JButton("SHOW TABLE");
		
		btn_save.addActionListener(this);
		btn_close.addActionListener(this);
		btn_search.addActionListener(this);
		btn_update.addActionListener(this);
		btn_delete.addActionListener(this);
		show_table.addActionListener(this);
		
		frame.setLayout(new FlowLayout());
		frame.add(lbl_1);
		frame.add(txt_1);
		frame.add(lbl_2);
		frame.add(txt_2);
		frame.add(lbl_3);
		frame.add(txt_3);
		frame.add(lbl_4);
		frame.add(txt_4);
		frame.add(lbl_5);
		frame.add(txt_5);
		frame.add(btn_save);
		frame.add(btn_search);
		frame.add(btn_update);
		frame.add(btn_delete);
		frame.add(show_table);
		frame.add(btn_close);		
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JDBC_GUI_1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn_save) {
			//Getting Values
			int sn;
			String name, address, email, phone;
			sn = Integer.parseInt(txt_1.getText());
			name = txt_2.getText();
			address = txt_3.getText();
			email = txt_4.getText();
			phone = txt_5.getText();
			
			// Values to Object
			Contact contact = new Contact(sn, name, address, email, phone);
			MyDatabase mdb = new MyDatabase();
			boolean result = mdb.insert(contact);
			JDialog d;
			if (result == true) {
				JOptionPane.showMessageDialog(frame, "Save Record Successfully");
			}
			else {
				JOptionPane.showMessageDialog(frame, "Error to save record");
			}			
		}
		else if (e.getSource()==btn_search){
			//Search and display record
			int sn = Integer.parseInt(txt_1.getText());
			MyDatabase mdb = new MyDatabase();
			Contact contact = mdb.search(sn);
			if (contact.getSn()==sn) {
				//Display Record
				//txt_1.setEditable(false);
				txt_2.setText(contact.getName());
				txt_3.setText(contact.getAddress());
				txt_4.setText(contact.getEmail());
				txt_5.setText(contact.getPhone());
			}
			else {
				JOptionPane.showMessageDialog(frame, "Record Not Found!");
				txt_2.setText("");
				txt_3.setText("");
				txt_4.setText("");
				txt_5.setText("");
			}
		}
		else if (e.getSource()==btn_update){
			int sn;
			String name, address, email, phone;
			sn = Integer.parseInt(txt_1.getText());
			name = txt_2.getText();
			address = txt_3.getText();
			email = txt_4.getText();
			phone = txt_5.getText();
			Contact contact = new Contact(sn, name, address, email, phone);			
			MyDatabase mdb = new MyDatabase();
			boolean result = mdb.update(contact);			
			if (result ==true) {
				//txt_1.setEditable(true);
				JOptionPane.showMessageDialog(frame, "Record Update Successfully");				
			}
			else {
				JOptionPane.showMessageDialog(frame, "Error to update record");
			}
		}
		else if (e.getSource()==btn_delete){
			int sn = Integer.parseInt(txt_1.getText());
			MyDatabase mdb = new MyDatabase();
			boolean result = mdb.delete(sn);
			if (result ==true) {
				txt_1.setText("");
				txt_2.setText("");
				txt_3.setText("");
				txt_4.setText("");
				txt_5.setText("");
				JOptionPane.showMessageDialog(frame, "Record delete Successfully");				
			}
			else {
				JOptionPane.showMessageDialog(frame, "Error to delete record");
			}
		}
		else if (e.getSource()==show_table){
			JDialog my_dialog = new JDialog(frame, "Records of Contacts", true);
			
			JTable table;
			DefaultTableModel model = new DefaultTableModel();
			String[] columnNames = {"SN", "NAME", "ADDRESS", "EMAIL", "PHONE"};
			model.setColumnIdentifiers(columnNames);
			table = new JTable();
			table.setModel(model);
			
			table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
			table.setFillsViewportHeight(true);
			JScrollPane scroll = new JScrollPane(table);
			scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
			scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
			
			//Add Records from MySQL to Table
			MyDatabase mdb = new MyDatabase();
			List persons = mdb.get_all();			
			
			for(Object person: persons) {
				Contact p1 = (Contact) person;
				model.addRow(new Object[]{p1.getSn(), p1.getName(), p1.getAddress(), p1.getEmail(), p1.getPhone()});
			}
			
			my_dialog.setSize(new Dimension(550, 250));
			my_dialog.setLayout(new FlowLayout());
			my_dialog.add(scroll);
			my_dialog.setVisible(true);
			my_dialog.setResizable(false);
		}
		else if (e.getSource()==btn_close){
			System.out.println("Close");
			System.exit(0);
		}		
	}
	//Task-1: Display all records in JTable (table).?	
	//Task-2: Export all the records of database in csv file.? 
	//Task-3: Export all the records of database in pdf file.?	
}