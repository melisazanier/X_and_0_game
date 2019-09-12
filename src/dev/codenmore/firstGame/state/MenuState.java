package dev.codenmore.firstGame.state;


import java.awt.Graphics;

import dev.codenmore.firstGame.Game;
import dev.codenmore.firstGame.gfx.Assets;

public class MenuState extends State {

public MenuState(Game game) {
    super(game);	
}
	
	
	public void tick() {
		//System.out.println(game.getMouseManager().getMouseX() + "  " + game.getMouseManager().getMouseY());
	
	}


	public void render(Graphics g) {
	
		g.drawImage(Assets.backgroundMenu, 0, 0, null);
		g.drawImage(Assets.buttonMultiPlayer, 50, 50, null);
		g.drawImage(Assets.buttonSinglePlayer, 50, 100, null);
		g.drawImage(Assets.buttonSettings, 50, 150, null);

		//g.setColor(Color.RED);
		//g.fillRect(game.getMouseManager().getMouseX(), game.getMouseManager().getMouseY(), 8, 8);

}
}