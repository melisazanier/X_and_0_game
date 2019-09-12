package dev.codenmore.firstGame.gfx;


import java.awt.image.BufferedImage;



public class Assets {
	
public static final int width =40, height=40;

public static BufferedImage backgroundMenu,backgroundPlayer,backgroundTheme1,backgroundTheme2,backgroundTheme3,backgroundPlayerIn,b;

public static BufferedImage imageX,image0,xTheme1,OTheme1,xTheme2,OTheme2,xTheme3,OTheme3,xThemeStandard,OThemeStandard;

public static BufferedImage buttonMultiPlayer,buttonSinglePlayer,buttonSettings,buttonBack,soundOff,soundOn;

public static BufferedImage player1Turn,player2Turn,yourTurn;
public static BufferedImage textThemeStandard,textTheme1,textTheme2,textTheme3;



public static void init() {
	    backgroundMenu =ImageLoader.loadImage("/textures/backgroundMenu.png");
		backgroundPlayer =ImageLoader.loadImage("/textures/background.png");
		backgroundPlayerIn =ImageLoader.loadImage("/textures/background.png");
		backgroundTheme1 =ImageLoader.loadImage("/textures/backgroundTheme1.png");
		backgroundTheme2 =ImageLoader.loadImage("/textures/backgroundTheme2.png");
		backgroundTheme3 =ImageLoader.loadImage("/textures/backgroundTheme3.png");
		b =ImageLoader.loadImage("/textures/b.png");
		
		imageX =ImageLoader.loadImage("/textures/x.png");
		image0 =ImageLoader.loadImage("/textures/0.png");
		xTheme1=ImageLoader.loadImage("/textures/x3.png");
		OTheme1=ImageLoader.loadImage("/textures/03.png");
		xTheme2=ImageLoader.loadImage("/textures/x1.png");
		OTheme2=ImageLoader.loadImage("/textures/01.png");
		xTheme3=ImageLoader.loadImage("/textures/x2.png");
		OTheme3=ImageLoader.loadImage("/textures/02.png");
		xThemeStandard=ImageLoader.loadImage("/textures/x.png");
		OThemeStandard=ImageLoader.loadImage("/textures/0.png");

		
		
		 
		buttonMultiPlayer =ImageLoader.loadImage("/textures/button.png");
		buttonSinglePlayer =ImageLoader.loadImage("/textures/button1.png");
		buttonSettings =ImageLoader.loadImage("/textures/button2.png");
		buttonBack=ImageLoader.loadImage("/textures/back.png");
		soundOn=ImageLoader.loadImage("/textures/soundOn.png");
		soundOff=ImageLoader.loadImage("/textures/soundOff.png");

		player1Turn=ImageLoader.loadImage("/textures/player's1Turn.png");
		player2Turn=ImageLoader.loadImage("/textures/player's2Turn.png");
		yourTurn=ImageLoader.loadImage("/textures/yourTurn.png");
		
        textTheme1=	ImageLoader.loadImage("/textures/text1.png");
        textTheme2=	ImageLoader.loadImage("/textures/text2.png");
        textTheme3=	ImageLoader.loadImage("/textures/text3.png");
        textThemeStandard=	ImageLoader.loadImage("/textures/textStandard.png");
        

	}
}
