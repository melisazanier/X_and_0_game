package dev.codenmore.firstGame.state;


import java.awt.Graphics;

import javax.swing.JOptionPane;


import dev.codenmore.firstGame.Game;
import dev.codenmore.firstGame.gfx.Assets;
import dev.codenmore.firstGame.multyPlayer.MultyPlayer;

public class GameState extends State{

private int count=0;

	
	public GameState(Game game) {
		super(game);
	}
		
	
    public static void infoBox(String infoMessage, String titleBar) {
    	JOptionPane.showMessageDialog(null, infoMessage, "" + titleBar, JOptionPane.INFORMATION_MESSAGE);
        
    }
    public static int valid=0;
	
	public void tick() {

			if(game.getMouseManager().isLeftPressed()==true && valid>30 ) 
				MultyPlayer.verificationPosition(game.getMouseManager().getMouseX(),game.getMouseManager().getMouseY());
		
			valid++;

			    
			//Aici lucru cu message box-urile, dupa cazuri
			if(MultyPlayer.r==true)
			{	            
		              if(count==2) 
		              {
		            	  if(MultyPlayer.getContor()==9 && MultyPlayer.findSolution()==0)
		            		  {
		            		  infoBox("Este egalitate :( ", " ");
		    
		            		  }
		            	  else
		            	  {
		            	  if(MultyPlayer.getVar()==1)
		            	  { 
		            		  infoBox("Player 1 a castigat", "Felicitari !!");
		      
		            	  }
		            	  
		            	  if(MultyPlayer.getVar()==2)
		            	  {
		            		  
		            		  infoBox("Player 2 a castigat", "Felicitari !!");
		        		
		            	  }
		            	  
		            	  }
		            	  System.exit(1);
			 		  }
		              else
		              
		            	  count++;
			    }
		
	}


	public void render(Graphics g) {
			


		g.drawImage(Assets.backgroundPlayer, 0, 50, null);

		g.drawLine(100, 50, 100, 400);
		g.drawLine(200, 50, 200, 400);
		g.drawLine(0, 150, 400, 150);
		g.drawLine(0, 250, 400, 250);
		
		//g.setColor(Color.RED);
		//g.fillRect(game.getMouseManager().getMouseX(), game.getMouseManager().getMouseY(), 8, 8);
		
		if(MultyPlayer.findSolution()==0 || MultyPlayer.matrix[0][0]==0)
          if(MultyPlayer.getVar()==0 || MultyPlayer.getVar()==2 && MultyPlayer.getNrMutare()%2==0)
    	   g.drawImage(Assets.player1Turn, 0, 0, null);
          else
          if( MultyPlayer.getVar()==1 && MultyPlayer.getNrMutare()%2==1)

    	   g.drawImage(Assets.player2Turn, 0, 0, null);
          else
           g.drawImage(Assets.player1Turn, 0, 0, null);

       
		//g.drawImage(Assets.buttonBack, 20, 310,80,30, null);
			
		for(int i=0;i<=2;i++)
			for(int j=0;j<=2;j++)
				
				{
				if(MultyPlayer.matrix[i][j]==1)
					g.drawImage(Assets.imageX,j*100+5 , i*100+55, 90, 90, null);
				
				if(MultyPlayer.matrix[i][j]==2)
					g.drawImage(Assets.image0,j*100+5 , i*100+55, 90, 90, null);

				}
	}  
	
}
