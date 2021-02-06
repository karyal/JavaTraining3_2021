package unit8_gui;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JMenuBar;

public class JFrameTest {

	public static void main(String[] args) {
		JFrame frame1; //Create new Object		
		JFrame frame2;					    
		JFrame frame3;
		JFrame frame4;
		
		frame1 = new JFrame();//Initialize by default constructor
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	    GraphicsDevice gs = ge.getDefaultScreenDevice();
	    GraphicsConfiguration gc = gs.getDefaultConfiguration();
	    frame2=new JFrame(gc); //Initialize by Parameterized constructor
	    	    
	    frame3= new JFrame("Title1");
	    
	    frame4 = new JFrame("Title2", gc);
	    
	    //Call methods
	    //int getDefaultCloseOperation()
	    //JMenuBar	getJMenuBar()
	    
	    int n = frame1.getDefaultCloseOperation();
	    System.out.println(n);
	    
	    JMenuBar jmb = frame1.getJMenuBar();
	    	    
	}
}