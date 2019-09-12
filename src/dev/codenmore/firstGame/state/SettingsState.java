package dev.codenmore.firstGame.state;

import java.awt.Graphics;

import dev.codenmore.firstGame.Game;
import dev.codenmore.firstGame.gfx.Assets;



public class SettingsState extends State {

	@SuppressWarnings("unused")
	private int countSound=0;
	
	public SettingsState(Game game) {
		super(game);
	}

	@Override
	public void tick() {
		
		System.out.println(game.getMouseManager().getMouseX() + "  " + game.getMouseManager().getMouseY());
		
		if(game.getMouseManager().isLeftPressed()==true && (game.getMouseManager().getMouseY() >310 && game.getMouseManager().getMouseY()<340) && (game.getMouseManager().getMouseX() >20 && game.getMouseManager().getMouseX()<110)) 
		{
		  State.setState(game.menuState);
		  game.stateDecision();
		}	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Work in progress~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		if(game.getMouseManager().isLeftPressed()==true && (game.getMouseManager().getMouseY() >300 && game.getMouseManager().getMouseY()<350) && (game.getMouseManager().getMouseX() >200 && game.getMouseManager().getMouseX()<250))
		    countSound++;
		
	}
	

	@Override
	public void render(Graphics g) {
	
		g.drawImage(Assets.backgroundPlayer,0,0,null);
		g.drawImage(Assets.b,0,300,null);
		
		g.drawImage(Assets.buttonBack, 20, 310,80,30, null);
		//g.drawRect(15, 310, 95, 29);
		
		g.drawImage(Assets.OTheme1,70,10,50,50,null);
		g.drawImage(Assets.xTheme1,5,10,50,50,null);
		
		g.drawImage(Assets.OTheme2,70,60,50,50,null);
		g.drawImage(Assets.xTheme2,5,60,50,50,null);
		
		g.drawImage(Assets.OTheme3,70,110,50,50,null);
		g.drawImage(Assets.xTheme3,5,110,50,50,null);
		
		g.drawImage(Assets.OThemeStandard,70,160,50,50,null);
		g.drawImage(Assets.xThemeStandard,5,160,50,50,null);
		
		
		
		
		
		
		 
		if(game.getMouseManager().isLeftPressed()==true && (game.getMouseManager().getMouseY() >10 && game.getMouseManager().getMouseY()<50) && (game.getMouseManager().getMouseX() >5 && game.getMouseManager().getMouseX()<120) )
			{
			  Assets.backgroundPlayer=Assets.backgroundTheme1;
			  Assets.imageX=Assets.xTheme1;
			  Assets.image0=Assets.OTheme1;

			}
		
		if(game.getMouseManager().isLeftPressed()==true && (game.getMouseManager().getMouseY() >60 && game.getMouseManager().getMouseY()<100) && (game.getMouseManager().getMouseX() >5 && game.getMouseManager().getMouseX()<120) )
		{
			Assets.backgroundPlayer=Assets.backgroundTheme2;
		    Assets.imageX=Assets.xTheme2;
		    Assets.image0=Assets.OTheme2;
		}
		
		if(game.getMouseManager().isLeftPressed()==true && (game.getMouseManager().getMouseY() >110 && game.getMouseManager().getMouseY()<150) && (game.getMouseManager().getMouseX() >5 && game.getMouseManager().getMouseX()<120) )
			{
			  Assets.backgroundPlayer=Assets.backgroundTheme3;
			  Assets.imageX=Assets.xTheme3;
			  Assets.image0=Assets.OTheme3;
			}
		
		if(game.getMouseManager().isLeftPressed()==true && (game.getMouseManager().getMouseY() >160 && game.getMouseManager().getMouseY()<200) && (game.getMouseManager().getMouseX() >5 && game.getMouseManager().getMouseX()<120) )
     		{
			  Assets.backgroundPlayer=Assets.backgroundPlayerIn;
			  Assets.imageX=Assets.xThemeStandard;
			  Assets.image0=Assets.OThemeStandard;
     		}
			
		
		
		if(Assets.imageX==Assets.xTheme1 ) 
		    {g.draw3DRect(0, 10, 120,50, true);
		     g.drawImage(Assets.textTheme1,130,15,150,15,null);
		    }
		    
		if(Assets.imageX==Assets.xTheme2 ) 
		{ g.draw3DRect(0, 60, 120,50, true);
		  g.drawImage(Assets.textTheme2,130,65,150,15,null);
		}
	     
		if(Assets.imageX==Assets.xTheme3 ) 
	      {g.draw3DRect(0, 110, 120,50, true);
	       g.drawImage(Assets.textTheme3,130,115,150,15,null);
	      }
	
		if(Assets.imageX==Assets.xThemeStandard )
			{g.draw3DRect(0, 160, 120,50, true);
			 g.drawImage(Assets.textThemeStandard,130,165,150,15,null);
			}
	     
			

	
	}

}