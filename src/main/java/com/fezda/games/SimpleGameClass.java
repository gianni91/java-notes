package com.fezda.games;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import com.fezda.graphics.Sprite;

public class SimpleGameClass {
	private GameHero player1;
	private ArrayList<GameNPC> objects;	// Stores objects to be updated and displayed
	
	public SimpleGameClass () {
		try {
			objects = new ArrayList<GameNPC>();
			
			BufferedImage heroImage = ImageIO.read(new File("demoImage.png"));
			Sprite heroSprite = new Sprite(heroImage,64,64,1);
			player1 = new GameHero(heroSprite,100,100);
			player1.setXVel(0);
			player1.setYVel(0);
					
			BufferedImage spriteSheetImage = ImageIO.read(new File("demoSprite.png"));
			Sprite sprite = new Sprite(spriteSheetImage,64,64,4);
			objects.add( new GameNPC(sprite,40,30));
			objects.add( new GameNPC(sprite,140,230));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update () {
		// Update the objects (position and sprite frame)
		for (GameNPC obj : objects) {
			obj.update();
		}
		player1.update();
	}
	
	public void display (Graphics2D g) {
		// Display player 1
		g.drawImage(player1.getSprite().getFrame(), player1.getX(), player1.getY(), null);
		
		// Display GameObjects
		for (GameNPC obj : objects) {
			g.drawImage(obj.getSprite().getFrame(), obj.getX(), obj.getY(), null);	
		}
	}
	
	public void onLeftKeyPress() {
		player1.setXVel(-6);
		player1.setYVel(0);
	}
	
	public void onRightKeyPress() {
		player1.setXVel(6);
		player1.setYVel(0);
	}
	
	public void onUpKeyPress() {
		player1.setXVel(0);
		player1.setYVel(6);
	}
	
	public void onDownKeyPress() {
		player1.setXVel(0);
		player1.setYVel(-6);
	}
	
	public GameHero getPlayer1() {return this.player1;}
	public ArrayList<GameNPC> getObjects() {return this.objects;}
}
