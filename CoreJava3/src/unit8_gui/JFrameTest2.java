package unit8_gui;

import javax.swing.JFrame;

public class JFrameTest2 {
	JFrame frame;
	
	public JFrameTest2() {
		frame=new JFrame("First Window");
		frame.setSize(500, 250);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameTest2();//Object Initialization with Unnamed Object
	}
}