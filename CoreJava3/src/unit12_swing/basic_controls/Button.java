package unit12_swing.basic_controls;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Button {
	JFrame frame;	
	JButton btn_ok; //Declare an object of JButton Class
	JButton btn_close;
	JButton btn_save;		
	
	public Button () {
		frame=new JFrame();
		frame.setTitle("Button Test");
		frame.setSize(new Dimension(250, 250));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		//Initialize an Object
		btn_ok = new JButton();
		
		btn_close = new JButton("Close");
		
		Icon icon =  new ImageIcon("icon.png");
		btn_save = new JButton("Save", icon);
		
		//We can call methods of JButton Class.
		btn_ok.setText("OK");
		btn_ok.setForeground(Color.green);// Text Color
		btn_ok.setBackground(Color.black);// BG Color
		
		Font font = new Font("Arial", 1, 20);
		btn_ok.setFont(font);
		
		Font font2 = btn_ok.getFont();
		btn_close.setFont(font2);
		
		frame.add(btn_ok);
		frame.add(btn_close);
		frame.add(btn_save);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new Button();
	}
}