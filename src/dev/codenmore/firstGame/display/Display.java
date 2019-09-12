package dev.codenmore.firstGame.display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

import dev.codenmore.firstGame.munuBar.MenuBar;

public class Display {

	private static  JFrame frame;
	private Canvas canvas;
	
	private String title;
	private int width, height;
	
	public Display(String title, int width, int height) {
		this.title=title;
		this.width=width;
		this.height=height;
		
		createDisplay();
	}
	
	private void createDisplay() {
		frame=new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );  //asa se inchide corect programul cand apasam pe x
	    frame.setResizable(false);
	    frame.setLocationRelativeTo(null); //cand pornesti programul sa apara fereastra incadrata frumos pe mijlocul ecranului
	    frame.setVisible(true);
	    
	    //for seeing the graphics , otherwise we are not allowed to see it
	    canvas= new Canvas();
	    canvas.setPreferredSize(new Dimension(width,height));
	    canvas.setMaximumSize(new Dimension(width,height));
	    canvas.setMinimumSize(new Dimension(width,height));
	    canvas.setFocusable(false);
	    
	    
        MenuBar.setUpMenuBar();
		
	    frame.add(canvas);
	    frame.pack(); //redimensioneaza canvas ul ca sa l vedem pe tot

	}
	
	public Canvas getCanvas() {
		return canvas;
	}
	
	public static  JFrame getFrame() {
		return frame;
	}
}
