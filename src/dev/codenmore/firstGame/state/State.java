package dev.codenmore.firstGame.state;

import java.awt.Graphics;

import dev.codenmore.firstGame.Game;

public abstract class State {
   
	private static State curentState=null;
	
	public static void setState(State state) {
		curentState=state;
	}
	
	public static State getState() {
	return curentState;	
	
	}
	
	//class
	protected Game game;
	
	public State(Game game){
		this.game=game;
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
}
