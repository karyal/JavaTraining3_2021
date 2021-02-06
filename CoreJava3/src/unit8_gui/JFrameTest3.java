package unit8_gui;

import javax.swing.JFrame;

public class JFrameTest3 extends JFrame{
	
	public JFrameTest3() {
		this.setTitle("Third Window");
		this.setSize(450, 250);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		new JFrameTest3();
	}
}
