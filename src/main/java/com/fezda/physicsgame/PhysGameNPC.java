package com.fezda.physicsgame;

import java.util.ArrayList;

import com.fezda.graphics.Sprite;

public class PhysGameNPC extends Movable {
	
	public PhysGameNPC(Sprite sprite, int x, int y, int width, int height) {
		super(sprite, x, y, width, height);
		changeDirection();
	}
	
	public void update (ArrayList<GameObj> solids) {
		super.update(solids);
		if (Math.random() < .1) changeDirection();
	}
	
	public void changeDirection() {
		this.xVelocity = -2 + (int)(Math.random()*5);
	}
	
	
}
