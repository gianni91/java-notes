package com.fezda.physicsgame;

import com.fezda.graphics.Sprite;

public class PhysGameObj extends PhysObj{
	protected Sprite sprite;
	protected int xVelocity = 0;
	protected int yVelocity = 0;
	
	public PhysGameObj(Sprite sprite, int x, int y, int width, int height) {
		super(x, y, width, height);
		this.sprite = sprite;
	}
	
	public void update () {
		this.sprite.update();
		this.x += xVelocity;
		this.y += yVelocity;
	}
	
	public boolean checkCollision(PhysGameObj other) {
		return Math.abs(this.x - other.x) < (this.width/2 + other.width/2) && 
				Math.abs(this.y - other.y) < (this.height/2 + other.height/2);
	}
	
	public void onCollision () {
		this.x -= xVelocity;
		this.y -= yVelocity;
	}
	
	public void setXVel(int setTo) { this.xVelocity = setTo; }
	public void setYVel(int setTo) { this.yVelocity = setTo; }
	public Sprite getSprite() { return this.sprite; }
}
