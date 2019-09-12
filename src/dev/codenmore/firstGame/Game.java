package dev.codenmore.firstGame;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;


import dev.codenmore.firstGame.display.Display;
import dev.codenmore.firstGame.gfx.Assets;
import dev.codenmore.firstGame.input.MouseManager;
import dev.codenmore.firstGame.multyPlayer.MultyPlayer;
import dev.codenmore.firstGame.multyPlayer.SinglePlayer;
import dev.codenmore.firstGame.state.GameState;
import dev.codenmore.firstGame.state.GameStateAI;
import dev.codenmore.firstGame.state.MenuState;
import dev.codenmore.firstGame.state.SettingsState;
import dev.codenmore.firstGame.state.State;



public class Game implements Runnable {
	
	private Display display;
	public  int width, height;
	public String title;
	public static int curentStateValue=0;
	
	private Thread thread;
	private boolean running=false;
	
	private BufferStrategy bs;
	private Graphics g;
		
	//STATES
	public State gameState;
	public State gameStateAI;
	public State menuState;
	public State settingsState;
	
	//INPUT
	private MouseManager mouseManager;
	
	public Game(String title,int width, int height) {
	   this.width=width;
	   this.height=height;
	   this.title=title;

	   mouseManager=new MouseManager();
	}
	
	
	//aici initializam toata grafica
	@SuppressWarnings("static-access")
	private void init() {
		display= new Display(title,width,height);
		display.getFrame().addMouseListener(mouseManager);
		display.getFrame().addMouseMotionListener(mouseManager);
		display.getCanvas().addMouseListener(mouseManager);
		display.getCanvas().addMouseMotionListener(mouseManager);

		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Declarare imagini~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        Assets.init();
        
		gameState= new GameState(this);
		gameStateAI= new GameStateAI(this);
		menuState = new MenuState(this);
		settingsState= new SettingsState(this);
		State.setState(menuState);	
		
	
	}
	
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MENU ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public void stateDecision()
	{   
		if(getMouseManager().isLeftPressed()==true && State.getState()==menuState &&  (getMouseManager().getMouseY() >70 && getMouseManager().getMouseY()<100) && (getMouseManager().getMouseX() >50 && getMouseManager().getMouseX()<250) )
		{ State.setState(gameState); //doar pt game state
		  curentStateValue=1;
		  
		}
		if(getMouseManager().isLeftPressed()==true && State.getState()==menuState && (getMouseManager().getMouseY() >120 && getMouseManager().getMouseY()<150) && (getMouseManager().getMouseX() >50 && getMouseManager().getMouseX()<250) )
		{   State.setState(gameStateAI); //doar pt game state
		    curentStateValue=2;
		}
		if(getMouseManager().isLeftPressed()==true && State.getState()==menuState && (getMouseManager().getMouseY() >170 && getMouseManager().getMouseY()<200) && (getMouseManager().getMouseX() >50 && getMouseManager().getMouseX()<250) ) 
		{ State.setState(settingsState); //doar pt game state
		  curentStateValue=3;
		}
	}
	
	
	public MouseManager getMouseManager() {
		return mouseManager;
	}
	
	
	private void tick() {
		
		stateDecision();
		
		if(State.getState()!=null)
		{
			if(State.getState()==gameState) 
	
			      State.getState().tick();	
			if(State.getState()==gameStateAI) 
				
			      State.getState().tick();	
			if(State.getState()==menuState) 
				
			      State.getState().tick();	
			
			if(State.getState()==settingsState) 
				
			      State.getState().tick();	
			
		}
		
	}
	
	
	private void render() { //draw everything on the screen, that means

	bs=display.getCanvas().getBufferStrategy();	
	
	if(bs==null) 
	   {	
		display.getCanvas().createBufferStrategy(3);
		return ;
	   }
	
	g=bs.getDrawGraphics();

	//Clear Screen
	g.clearRect(0, 0, width, height);
	
	if(State.getState()!=null  )
		State.getState().render(g);
	
	//End Drawing!
	bs.show();
	g.dispose();
	
	}
	
	                       
	
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`Don't edit here~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~	
	
	public void run () {   
		
		init();
		
		int fps=60; //frames per sec we call it 60 times every single sec
		double timePerTick=1000000000/fps; //time in nano sec
		double delta=0;
		long now;
		long lastTime=System.nanoTime();//return the time in nano sec
		long timer=0;
		int ticks=0;
		
		while(running) {
			
		   now=System.nanoTime();
		   delta+=(now-lastTime)/timePerTick;
		   timer+=now-lastTime;
		   lastTime=now;
		
		   if(delta >= 1) {	
			   
			  tick();
			  render();
			  ticks++;
			  delta--;
		      }
		   
           if(timer>=1000000000) {
        	   
	             System.out.println("Ticks and Frames:" +ticks);
	             ticks=0;
	             timer=0;
                 }
		}
		stop();
	}
	

	

	
	public synchronized void start() { 
		
		if(running) //daca jocul este deja pornit
			return;
		
		running =true; //altfel
		thread= new Thread(this); 
		thread.start();//apeleaza functia run de mai sus
	}
	
	
	public synchronized void stop() {
		
		if(!running)
			return;
		
		running =false;
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
 public static void reset() {
	 for(int i=0;i<3;i++)
		 for(int j=0;j<3;j++)
		 {
			 MultyPlayer.matrix[i][j]=0;
			 MultyPlayer.setNrMutare(0);
			 MultyPlayer.setVar(1);
			 
			 SinglePlayer.setNrMutare(0);
			 SinglePlayer.matrix1[i][j]=0;
			 SinglePlayer.setValue();
		 }
 }
}
