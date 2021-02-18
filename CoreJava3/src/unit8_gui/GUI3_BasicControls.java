package unit8_gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListModel;

public class GUI3_BasicControls extends JFrame implements ActionListener {
	JLabel lbl_1;
	JTextField txt_1;
	JButton btn_1;
	JRadioButton rb1, rb2;
	ButtonGroup rbg1;
	JCheckBox chk1, chk2, chk3;
	
	JList lst1;
	ListModel lstModel;
	
	JComboBox cmb1;
	ComboBoxModel cmbModel;
	
	JPasswordField pw1;
	JTextArea ta1;
	
	JScrollBar jsb;
	JScrollPane jsp;
	
	JMenuBar jmb1;
	JMenu jm1;
	JMenuItem jmi1;
	//Add Seperator
	
	public GUI3_BasicControls() {
		this.setTitle("Basic Swing Controls");
		this.setSize(250, 400);
		this.setLayout(new FlowLayout());
		
		//Initialize Objects (Controls)
		lbl_1 = new JLabel("SN : ");
		txt_1 = new JTextField(10);
		
		btn_1 = new JButton("Click Me");
		btn_1.addActionListener(this);
				
		rb1 = new JRadioButton("Java");
		rb2 = new JRadioButton("Python");
		
		rbg1 = new ButtonGroup();
		rbg1.add(rb1);
		rbg1.add(rb2);
		
		chk1 = new JCheckBox("Reading");
		chk2 = new JCheckBox("Playing");
		chk3 = new JCheckBox("Others");		
		
		//JList<>()
		lst1 = new JList<>();//None
		
		String states[] ={"State-1","State-2","State-3","State-4","State-5","State-6","State-7"};		
		lst1 = new JList(states);
		
		Vector vct = new Vector();
		vct.add("State-1");
		vct.add("State-2");
		vct.add("State-3");
		vct.add("State-4");
		vct.add("State-5");
		vct.add("State-6");
		vct.add("State-7");
		
		lst1 = new JList(vct);
		//lst1.setVisibleRowCount(4);
		//lst1.setSize(50, 75);
		
		//lst1 = new JList();
		lstModel = lst1.getModel();
		
		//ComboBox
		cmb1 = new JComboBox(states);
		cmb1 = new JComboBox(vct);
		cmb1.setEditable(true);
		
		//System.out.println(lstModel.getSize());
		//System.out.println(lstModel.getElementAt(0));
		
		//Add Controls
		//this.add(lbl_1);
		//this.add(txt_1);		
		//this.add(rb1);
		//this.add(rb2);
		//this.add(chk1);
		//this.add(chk2);
		//this.add(chk3);
		
		//JList
		this.add(lst1);	
		this.add(cmb1);
		this.add(btn_1);				
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new GUI3_BasicControls();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn_1) {
			
			//List
				//System.out.println(lst1.getSelectedValue());
				//System.out.println(lst1.getSelectedIndex());			
				//int []selectedIndexes = lst1.getSelectedIndices();
				//System.out.println(selectedIndexes.length);
			
				//for(int i=0; i<selectedIndexes.length; i++) {
				//	System.out.println(selectedIndexes[i]+" = "+lstModel.getElementAt(selectedIndexes[i]));
				//}
			
		}		
	}
}
