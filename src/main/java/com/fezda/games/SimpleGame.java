package com.fezda.games;

import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class SimpleGame {
	private Hero player1;
	private ArrayList<Collectable> collectables;
	
	public SimpleGame () {
		try {
			// Initialize player 1
			Image heroSprite = new ImageIcon("demoImage.png").getImage();
			player1 = new Hero(heroSprite,100,100);
			
			// Initialize 2 collectables
			collectables = new ArrayList<Collectable>();
			Image colSprite = new ImageIcon("collectable.png").getImage();
			collectables.add( new Collectable(colSprite,40,30));
			collectables.add( new Collectable(colSprite,140,230));
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Define the game loop
	public void update () {
		player1.update();
		
		// If player 1 reaches a collectable, reset its position
		for (Collectable coll : collectables) {
			if ( Math.abs(player1.getX() - coll.getX()) < 64 
			  && Math.abs(player1.getY() - coll.getY()) < 64) 
			{
				coll.setX( (int)(Math.random() * 350) );
				coll.setY( (int)(Math.random() * 350) );
			}
		}
	}
	
	// Display game objects and player 1
	public void display (Graphics2D g) {
		for (Collectable obj : collectables) {
			g.drawImage(obj.getSprite(), obj.getX(), obj.getY(), null);	
		}
		g.drawImage(player1.getSprite(), player1.getX(), player1.getY(), null);
	}
	
	// Define actions for direction keys
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
