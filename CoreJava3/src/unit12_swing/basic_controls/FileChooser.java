package unit12_swing.basic_controls;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class FileChooser implements ActionListener{
	JFrame frame;
	JButton btn_open;
	
	JFileChooser fc;
	
	public FileChooser () {
		frame=new JFrame("Button Test");
		frame.setSize(new Dimension(250, 250));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		btn_open = new JButton("OPEN");
		btn_open.addActionListener(this);
		
		fc = new JFileChooser();
		
		frame.add(btn_open);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new FileChooser();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btn_open) {
			System.out.println("OK");
			//fc.showOpenDialog(frame);
			fc.showSaveDialog(frame);			
		}		
	}
}