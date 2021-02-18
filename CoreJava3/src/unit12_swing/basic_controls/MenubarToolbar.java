package unit12_swing.basic_controls;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;

public class MenubarToolbar {
	JFrame frame;
	
	JMenuBar mnuBar1;
	JToolBar tbar1;
	
	JMenu mnu1;//File
	JMenu mnu2;//Edit
	JMenu mnu3;//Help
	
	//File
	JMenuItem item_new;
	JMenuItem item_save;
	JMenuItem item_exit;

	//Edit
	JMenuItem item_copy;
	JMenuItem item_cut;
	JMenuItem item_paste;
	
	//Help
	JMenuItem item_about;
		
	public MenubarToolbar () {
		frame=new JFrame("Menu Bar, Menu, Menu Item, Toolbar");
		frame.setSize(new Dimension(250, 250));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		mnuBar1 = new JMenuBar();
		
		mnu1 = new JMenu("File");
		mnu2 = new JMenu("Edit");
		mnu3 = new JMenu("Help");
		
		//File
		item_new = new JMenuItem("New");
		item_save = new JMenuItem("Save");
		item_exit= new JMenuItem("Exit");
		
		//Edit
		item_copy = new JMenuItem("Copy");
		item_cut = new JMenuItem("Cut");
		item_paste= new JMenuItem("Paste");
		
		//Help
		item_about= new JMenuItem("About");
		
		mnu1.add(item_new);
		mnu1.add(item_save);
		mnu1.addSeparator();
		mnu1.add(item_exit);
		
		mnu2.add(item_copy);
		mnu2.add(item_cut);
		mnu2.add(item_paste);
		
		mnu3.add(item_about);
		
		mnuBar1.add(mnu1);
		mnuBar1.add(mnu2);
		mnuBar1.add(mnu3);
		
		tbar1 = new JToolBar();
		tbar1.add(new JButton(new ImageIcon("icon_file.png")));
		tbar1.add(new JButton(new ImageIcon("icon_file.png")));
		tbar1.add(new JButton(new ImageIcon("icon_file.png")));
				
		frame.add(mnuBar1);
		frame.add(tbar1);
		
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new MenubarToolbar();
	}
}