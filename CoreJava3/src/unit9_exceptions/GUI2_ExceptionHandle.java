package unit9_exceptions;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUI2_ExceptionHandle extends JFrame implements ActionListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
			int nums[]= {4, 5, 6, 7, 8};
			
			try {//input, process, output
				//Read value from TextBox
				num1 = Integer.parseInt(txt_1.getText());
				num2 = Integer.parseInt(txt_2.getText());
				
				if ((num1<=0) || (num1>100)){
					throw new MyException("Please enter value of range 1 to 100 only");
				}
				if ((num2<=0) || (num2>=5)){
					throw new MyException("Please enter value of range 0 to 4 only");
				}
				
				//Calculate
				num3 = num1/num2;//
				
				//Display Result
				lbl_4.setText(Integer.toString(num3));//output Swing (GUI)
				System.out.println(num3);
				System.out.println(nums[num2]);
			}
			catch(MyException ex) {
				JOptionPane.showMessageDialog(this, "Error1 : "+ex.getMessage());
			}
			catch(ArithmeticException ex) {
				JOptionPane.showMessageDialog(this, "Error2 : "+ex.getMessage());
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				JOptionPane.showMessageDialog(this, "Error3 : "+ex.getMessage());
			}
			catch(Exception ex) {//display exception to user
				//lbl_4.setText(ex.getMessage());
				JOptionPane.showMessageDialog(this, ex.getMessage());
				//System.out.println(ex.getMessage());
			}
			finally {
				System.out.println("");
			}
		}
	}
}