package unit12_swing.events_handling;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class MouseListener1 extends JFrame implements MouseListener{

	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;

	public MouseListener1() {
		setTitle("Mouse Listener");
		setSize(new Dimension(250, 250));
		setLayout(new FlowLayout());
		addMouseListener(this);							
		setVisible(true);
	}		


	public static void main(String[] args) {
		new ActionListener1();		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Clicked!");
		System.out.println(e.getX()+", "+e.getY()+" "+e.getClickCount());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Presses!");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Released!");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Entered!");

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Mouse Exited!");
	}	
}