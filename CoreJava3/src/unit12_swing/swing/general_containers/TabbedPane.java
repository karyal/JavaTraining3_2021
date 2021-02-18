package unit12_swing.swing.general_containers;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

public class TabbedPane extends JFrame {
	JTabbedPane t1=new JTabbedPane();
	JPanel p1,p2,p3;
	Container c;
	Container c1;
	JLabel l1,l2,l3;
	JTextField text1,text2,text3;
	JRadioButton r21,r22,r23;
	JCheckBox ch1,ch2,ch3;

	public TabbedPane() {
		p1=new JPanel();
		p2=new JPanel();
		p3=new JPanel();

		c1=getContentPane();
		p1.setLayout(new GridLayout(3,2));

		l1=new JLabel("Name");
		l2=new JLabel("Date of Birth (dd.mm.yyyy)");
		l3=new JLabel("Identification Number");

		text1=new JTextField(10);
		text2=new JTextField(10);
		text3=new JTextField(10);

		p1.add(l1);
		p1.add(text1);
		p1.add(l2);
		p1.add(text2);
		p1.add(l3);
		p1.add(text3);
		c1.add(p1);

		r21=new JRadioButton("Graduate");
		r22=new JRadioButton("Post Graduate");
		r23=new JRadioButton("Ph.D");
		p2.add(r21);
		p2.add(r22);
		p2.add(r23);

		ch1=new JCheckBox("Computers");
		ch2=new JCheckBox("Electronics");
		ch3=new JCheckBox("Marketing");
		p3.add(ch1);
		p3.add(ch2);
		p3.add(ch3);

		c=getContentPane();
		c.setLayout(new GridLayout(2,2));

		t1.addTab("Personal Information",p1);
		t1.addTab("Educational Qualification",p2);
		t1.addTab("Areas of Interest",p3);
		c.add(t1);
	}
	public static void main(String args[])	{
		TabbedPane tdemo=new TabbedPane();
		tdemo.setSize(450,250);
		tdemo.setVisible(true);                
	}
}
