package dev.codenmore.firstGame.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import java.io.InputStream;

public class ImageLoader {

	public static BufferedImage loadImage(String path) {
		try {
			return ImageIO.read(ImageLoader.class.getResourceAsStream(path));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("melisa");
			System.exit(1);
		}
		System.out.println("null");
	    return null;
	}
	
}
