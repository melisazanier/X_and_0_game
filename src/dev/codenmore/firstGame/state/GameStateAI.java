package dev.codenmore.firstGame.state;

import java.awt.Color;
import java.awt.Graphics;


import javax.swing.JOptionPane;

import dev.codenmore.firstGame.Game;

import dev.codenmore.firstGame.gfx.Assets;

import dev.codenmore.firstGame.multyPlayer.Single;
import dev.codenmore.firstGame.multyPlayer.SinglePlayer;
import dev.codenmore.firstGame.multyPlayer.SinglePlayerAI;


public class GameStateAI extends State {
private int count=0;


	
	public GameStateAI(Game game) {
		super(game);
	}
		
	
    public static void infoBox(String infoMessage, String titleBar) {
    	
        JOptionPane.showMessageDialog(null, infoMessage, "" + titleBar, JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    private boolean activateAI = false;
    private int k = 0;
    private static int valid=0;
    
  
    public void useAI()
    {
    	while(activateAI == true)
    	{
    		if(k < 30)
    		{
    			k++;
    			return;
    			
    		}
    		else
    		{
    			k = 0;
    			activateAI = false;
    			SinglePlayerAI.thinkMelisaThink();
				Single.nrMutare++;
				
    		}
    	}
    }
    
	public void tick() {
      
		//System.out.println(game.getMouseManager().getMouseX() + "  " + game.getMouseManager().getMouseY());


			if(game.getMouseManager().isLeftPressed()==true && valid>30) 
			{
				SinglePlayer.verificationPosition(game.getMouseManager().getMouseX(),game.getMouseManager().getMouseY());
				System.out.println("check player");
				
				if(Single.nrMutare%2==1 && SinglePlayer.findSolution()==0 && Single.contor<9)//mai trebuia o cond, in cazul in care nu era nicio solutie
				{
					System.out.println("check AI");
					activateAI = true;
					SinglePlayerAI.thinkMelisaThink();
					Single.nrMutare++;
					
					
				}
				
			}
			
			//useAI();
			
		    valid++;
		    /*
		    if(game.getMouseManager().isLeftPressed()==true && valid>30 && (game.getMouseManager().getMouseY() >310 && game.getMouseManager().getMouseY()<340) && (game.getMouseManager().getMouseX() >20 && game.getMouseManager().getMouseX()<110)) 
				{ valid=0;
			      Game.reset();
				  State.setState(game.menuState);
				  game.stateDecision();
				 
	
				}*/
			//Aici lucru cu message box-urile, dupa cazuri
			if(SinglePlayer.r==true)
			{	            
	              if(count==2) 
	              {
	            	  if(SinglePlayer.getContor()==9 && SinglePlayer.findSolution()==0)
	            		  infoBox("Este egalitate :( ", " ");
	            	  else
	            	  {
	            	  if(SinglePlayer.getVar()==2)
	            	     infoBox("Ai pierdut", "");
	            	  
	            	  if(SinglePlayer.getVar()==1)
	            		  infoBox(" Ai castigat", "Felicitari !!");
	            	  }
	            	  
		 		  System.exit(1);
	
	              }
	              
	            count++;
		    }
		
		}

	

	public void render(Graphics g) {
		
		g.drawImage(Assets.backgroundPlayer, 0, 50, null);

		g.drawLine(100, 50, 100, 400);
		g.drawLine(200, 50, 200, 400);
		g.drawLine(0, 150, 400, 150);
		g.drawLine(0, 250, 400, 250);
		
		g.setColor(Color.RED);
		g.fillRect(game.getMouseManager().getMouseX(), game.getMouseManager().getMouseY(), 8, 8);
        
		//g.drawImage(Assets.buttonBack, 20, 310,80,30, null);  		
		
		for(int i=0;i<=2;i++)
			for(int j=0;j<=2;j++)
				
				{
				if(SinglePlayer.matrix1[i][j]==1)
					g.drawImage(Assets.imageX,j*100+5 , i*100+55, 90, 90, null);


				if(SinglePlayer.matrix1[i][j]==2)  
					        g.drawImage(Assets.image0,j*100+5 , i*100+55, 90, 90, null);
	
				}
		
		
		
	}  
	

}
