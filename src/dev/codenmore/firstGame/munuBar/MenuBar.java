package dev.codenmore.firstGame.munuBar;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import dev.codenmore.firstGame.Game;
import dev.codenmore.firstGame.display.Display;





public class MenuBar {


	
	public static  void setUpMenuBar()
	{
		JMenuBar mb=new JMenuBar();
		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~FILE AND HELP/ FIRST LAYER~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
		JMenu file =new JMenu ("File");
		mb.add(file);
		
		JMenu help =new JMenu ("Help");
		mb.add(help);
		
		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~EXIT/ SECOND LAYER~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
		ImageIcon exitIcon = new ImageIcon("D:\\programs\\Eclipse Saves\\First Game\\res\\textures/exit.png");
		JMenuItem exit =new JMenuItem("Exit",exitIcon);
		file.add(exit);
		
		exit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.exit(0);
		}});
		
		
	   
/*
	    JMenuItem undo =new JMenuItem("Undo");
	    if ( Game.curentStateValue==0)
	    file.add(undo);
	     

    	undo.addActionListener(new ActionListener() {

		  public void actionPerformed(ActionEvent e) {
			  if ( Game.curentStateValue==0)
				    file.add(undo);
			  else
				  file.remove(undo);
             MultyPlayer.matrix[MultyPlayer.getLinie()][MultyPlayer.getColoana()]=0;
             if(MultyPlayer.getVar()==1 && MultyPlayer.getNrMutare()%2==1 )
             { MultyPlayer.setNrMutare(MultyPlayer.getNrMutare() - 1);
               
             }  
             if(MultyPlayer.getVar()==2 &&  MultyPlayer.getNrMutare()%2==0)
             { MultyPlayer.setNrMutare(MultyPlayer.getNrMutare() - 1);

             } 
			
          }  
	});*/
	     
			     
			     
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~GAMES'S RULES/ SECOND LAYER~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
		ImageIcon gameIcon = new ImageIcon("D:\\programs\\Eclipse Saves\\First Game\\res\\textures/gamesRule.png");
		JMenuItem gamesRules= new JMenuItem("Game's rules",gameIcon);
		help.add(gamesRules);
		
		gamesRules.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Auto-generated method stub
				if ( Game.curentStateValue==1)
				     JOptionPane.showMessageDialog(null, "  There are 2 players, you and your friend, each \none of you will get either an x or a 0 to play with.\nThe player who succeeds in placing three of their \nmarks in a horizontal, vertical, or diagonal row \nwins the game.\n\n            It can be equal as well! ");
				 
				if ( Game.curentStateValue==2)
				     JOptionPane.showMessageDialog(null, "  You are playing with the computer, you will \nget a mark either an x or a 0 to play with.If \nyou succeed in placing three of their marks in \na horizontal, vertical, or diagonal row you win \nthe game, if you don't succeed and the computer \ndoes, you lost.\n\n                It can be equal as well! ");
				
				if ( Game.curentStateValue==0)
				     JOptionPane.showMessageDialog(null, "Select one of the types of X and 0 games \nand read the rules for that specific type.");
				
				if ( Game.curentStateValue==3)
				     JOptionPane.showMessageDialog(null, "    Press the back button and select \none of the types of X and 0 games and \nread the rules for that specific type.");
			}});
		       

		
		
		//help.addSeparator();
		
		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ABOUT /SECOND LAYER~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
		JMenuItem about= new JMenuItem("About");
		help.add(about);
		about.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
		
				JOptionPane.showMessageDialog(null, "  You can select the theme you want to play with. \nFor more information check the game's rules.");
				
			}
			
		});
		

	   

		Display.getFrame().setJMenuBar(mb);
		
	
	}
	
	
	
	
	

}