package com.fezda.physicsgame;





import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import com.fezda.graphics.Sprite;

public class PhysicsGame {
	private PhysGameHero player1;
	private ArrayList<PhysGameNPC> objects;	// Stores objects to be updated and displayed
	
	public PhysicsGame () {
		try {
			objects = new ArrayList<PhysGameNPC>();
			
			BufferedImage heroImage = ImageIO.read(new File("demoImage.png"));
			Sprite heroSprite = new Sprite(heroImage,64,64,1);
			player1 = new PhysGameHero(heroSprite,100,100,64,64);
			player1.setXVel(0);
			player1.setYVel(0);
					
			BufferedImage spriteSheetImage = ImageIO.read(new File("demoSprite.png"));
			Sprite sprite = new Sprite(spriteSheetImage,64,64,4);
			objects.add( new PhysGameNPC(sprite,40,30,64,64));
			objects.add( new PhysGameNPC(sprite,140,230,64,64));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public PhysGameHero getPlayer1() {return this.player1;}
	public ArrayList<PhysGameNPC> getObjects() {return this.objects;}
}
