package dev.codenmore.firstGame.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseManager implements MouseListener,MouseMotionListener {

	private boolean leftPressed;
	private int mouseX,mouseY;
	
	public MouseManager()
	{
		
	}
	
	//GETTERS
	
	public boolean isLeftPressed() {
		return leftPressed;
	}
	
	public int getMouseX() {
		return mouseX;
	}
	
	public int getMouseY() {
		return mouseY;
	}
	
	//IMPLEMENTED METHODS
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
         mouseX=e.getX();
         mouseY=e.getY();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
     if(e.getButton()==MouseEvent.BUTTON1)
    	 leftPressed =true;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	     if(e.getButton()==MouseEvent.BUTTON1)
	    	 leftPressed =false;
	}

}
