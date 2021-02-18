package unit8_gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI2_ExceptionHandle extends JFrame implements ActionListener{
	
	JLabel lbl_1, lbl_2, lbl_3, lbl_4;
	JTextField txt_1, txt_2;
	JButton btn_1;
	
	public GUI2_ExceptionHandle() {
		//Initialize
		lbl_1 = new JLabel("First No : ");
		lbl_2 = new JLabel("Second No : ");
		lbl_3 = new JLabel("Result : ");
		lbl_4 = new JLabel("");
		
		txt_1 = new JTextField(10);
		txt_2 = new JTextField(10);
		
		btn_1 = new JButton("DIV");
		btn_1.addActionListener(this);
		
		this.setTitle("Simple Calculator");
		this.setSize(250, 150);
		this.setResizable(false);		
		this.setLayout(new FlowLayout());
		
		this.add(lbl_1);
		this.add(txt_1);
		
		this.add(lbl_2);
		this.add(txt_2);
		
		this.add(btn_1);
		
		this.add(lbl_3);
		this.add(lbl_4);
		
		this.setVisible(true);			
	}
	
	public static void main(String[] args) {
		new GUI2_ExceptionHandle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn_1) {			
			//Declare
			int num1, num2, num3;
			try {
				//Read value from TextBox
				num1 = Integer.parseInt(txt_1.getText());
				num2 = Integer.parseInt(txt_2.getText());
				
				//Calculate
				num3 = num1/num2;
				
				//Display Result
				lbl_4.setText(Integer.toString(num3));
			}
			catch(Exception ex) {
				//lbl_4.setText(ex.getMessage());
				JOptionPane.showMessageDialog(this, ex.getMessage());
			}
		}
	}
}