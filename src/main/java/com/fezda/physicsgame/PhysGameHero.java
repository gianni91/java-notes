package com.fezda.physicsgame;

import com.fezda.graphics.Sprite;

public class PhysGameHero extends PhysGameObj{
	
	public PhysGameHero(Sprite sprite, int x, int y, int width, int height) {
		super(sprite, x, y, width, height);
	}
	
	public void onLeftKeyPress() {
		this.setXVel(-6);
		this.setYVel(0);
	}
	
	public void onRightKeyPress() {
		this.setXVel(6);
		this.setYVel(0);
	}
	
	public void onSpaceKeyPress() {
		this.setYVel(-6);
	}
	
}
