package com.fezda.games;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;

import com.fezda.graphics.Sprite;

public class SimpleGame {
	private Hero player1;
	private ArrayList<Collectable> collectables;	// Stores collectables to be updated and displayed
	
	public SimpleGame () {
		try {
			collectables = new ArrayList<Collectable>();
					
			BufferedImage spriteSheetImage = ImageIO.read(new File("collectable.png"));
			Sprite sprite = new Sprite(spriteSheetImage,64,64,1);
			collectables.add( new Collectable(sprite,40,30));
			collectables.add( new Collectable(sprite,140,230));
			
			BufferedImage heroImage = ImageIO.read(new File("demoImage.png"));
			Sprite heroSprite = new Sprite(heroImage,64,64,1);
			player1 = new Hero(heroSprite,100,100);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update () {
		player1.update();
		
		for (Collectable coll : collectables) {
			if ( Math.abs(player1.getX() - coll.getX()) < 64 
			  && Math.abs(player1.getY() - coll.getY()) < 64) 
			{
				coll.setX( (int)(Math.random() * 350) );
				coll.setY( (int)(Math.random() * 350) );
			}
		}
	}
	
	public void display (Graphics2D g) {
		// Display GameObjects
		for (Collectable obj : collectables) {
			g.drawImage(obj.getSprite().getFrame(), obj.getX(), obj.getY(), null);	
		}
		
		// Display player 1
		g.drawImage(player1.getSprite().getFrame(), player1.getX(), player1.getY(), null);
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
		player1.setYVel(-6);
	}
	
	public void onDownKeyPress() {
		player1.setXVel(0);
		player1.setYVel(6);
	}

}
