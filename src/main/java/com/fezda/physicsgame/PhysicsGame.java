package com.fezda.physicsgame;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import com.fezda.graphics.Sprite;

public class PhysicsGame {
	private PhysGameHero player1;
	private ArrayList<PhysGameNPC> npcs;
	private ArrayList<Barrier> barriers;
	private ArrayList<GameObj> solids;
	
	public PhysicsGame () {
		try {
			npcs = new ArrayList<PhysGameNPC>();
			barriers = new ArrayList<Barrier>();
			solids = new ArrayList<GameObj> ();
			
			// Create player 1
			BufferedImage heroImage = ImageIO.read(new File("demoImage.png"));
			Sprite heroSprite = new Sprite(heroImage,64,64,1);
			player1 = new PhysGameHero(heroSprite,200,300,64,64);
			player1.setXVel(0);
			player1.setYVel(0);
			solids.add(player1);
			
			// Create NPCs
			BufferedImage spriteSheetImage = ImageIO.read(new File("demoSprite.png"));
			Sprite sprite = new Sprite(spriteSheetImage,64,64,4);
			PhysGameNPC npc1 = new PhysGameNPC(sprite,80,330,64,64);
			npcs.add(npc1);
			solids.add(npc1);
			
			// Create walls and platforms
			addBarrier(0,0,30,400);		// Left Wall
			addBarrier(30,370,370,30);	// Floor
			addBarrier(370,0,400,400);	// Right Wall
			addBarrier(250,270,150,30);	// Platform 1
			addBarrier(0,190,150,30);	// Platform 2
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update () {
		// Update the NPCs (position and sprite frame) and check for collisions
		for (PhysGameNPC obj : npcs) {
			obj.update(solids);
		}
		
		// Update player 1 and check for collisions
		player1.update(solids);
	}
	
	public void display(Graphics2D g) {

		// Display player 1
		g.drawImage(player1.getSprite().getFrame(), 
				player1.getX() -  player1.getWidth()/2, 
				player1.getY() -  player1.getHeight()/2, 
				null);
		
		// Display NPCs
		for (PhysGameNPC obj : npcs) {
			g.drawImage(obj.getSprite().getFrame(), obj.getX() - obj.getWidth()/2, obj.getY() - obj.getHeight()/2, null);	
		}
		
		// Display barriers
		g.setPaint(Color.black);
		for (Barrier obj : barriers) {
			g.fillRect( obj.getX() - obj.getWidth()/2, obj.getY() - obj.getHeight()/2, obj.getWidth(),obj.getHeight());	
		}
	}
	
	public void onLeftKeyPress() {
		player1.setXVel(-6);
	}
	
	public void onRightKeyPress() {
		player1.setXVel(6);
	}
	
	public void onSpaceKeyPress() {
		if (player1.grounded) {
			player1.setYVel(-16);
		}
	}
	
	public void addBarrier(int topLeftX, int topLeftY, int width, int height) {
		Barrier toAdd = new Barrier(topLeftX, topLeftY, width, height);
		barriers.add(toAdd);
		solids.add(toAdd);
	}
	
	public PhysGameHero getPlayer1() {return this.player1;}
	public ArrayList<PhysGameNPC> getNPCs() {return this.npcs;}
	public ArrayList<Barrier> getBarriers() {return this.barriers;}
	public ArrayList<GameObj> getSolids() {return this.solids;}
}
