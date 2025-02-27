package com.fezda.physicsgame;





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
			
			BufferedImage heroImage = ImageIO.read(new File("demoImage.png"));
			Sprite heroSprite = new Sprite(heroImage,64,64,1);
			player1 = new PhysGameHero(heroSprite,150,300,64,64);
			player1.setXVel(0);
			player1.setYVel(0);
			solids.add(player1);
					
			BufferedImage spriteSheetImage = ImageIO.read(new File("demoSprite.png"));
			Sprite sprite = new Sprite(spriteSheetImage,64,64,4);
			PhysGameNPC npc1 = new PhysGameNPC(sprite,40,300,64,64);
			PhysGameNPC npc2 = new PhysGameNPC(sprite,240,300,64,64);
			npcs.add(npc1);
			npcs.add(npc2);
			solids.add(npc1);
			solids.add(npc2);
			
			Barrier b1 = new Barrier(0,0,30,400);
			Barrier b2 = new Barrier(30,370,370,30);
			barriers.add(b1);
			barriers.add(b2);
			solids.add(b1);
			solids.add(b2);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public PhysGameHero getPlayer1() {return this.player1;}
	public ArrayList<PhysGameNPC> getNPCs() {return this.npcs;}
	public ArrayList<Barrier> getBarriers() {return this.barriers;}
	public ArrayList<GameObj> getSolids() {return this.solids;}
}
