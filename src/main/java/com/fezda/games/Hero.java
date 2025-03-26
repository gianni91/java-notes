package com.fezda.games;

import java.awt.Image;

public class Hero {
	private Image sprite;
	private int x = 0;
	private int y = 0;
	private int xVelocity = 0;
	private int yVelocity = 0;
	
	public Hero(Image sprite, int x, int y) {
		this.sprite = sprite;
		this.x = x;
		this.y = y;
	}
	
	public void update () {
		this.x += xVelocity;
		this.y += yVelocity;
	}
	
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	public void setXVel(int setTo) { this.xVelocity = setTo; }
	public void setYVel(int setTo) { this.yVelocity = setTo; }
	public Image getSprite() { return this.sprite; }
}
