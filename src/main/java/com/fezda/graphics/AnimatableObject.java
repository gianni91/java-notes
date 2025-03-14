package com.fezda.graphics;

public class AnimatableObject {
	private Sprite sprite;
	private int x = 0;
	private int y = 0;
	private int xVelocity = 0;
	private int yVelocity = 0;
	
	public AnimatableObject(Sprite sprite, int x, int y) {
		this.sprite = sprite;
		this.x = x;
		this.y = y;
		this.xVelocity = 1 + (int)(Math.random()*4);
		this.yVelocity = 1 + (int)(Math.random()*4);
	}
	
	public void update () {
		this.sprite.update();
		this.x += xVelocity;
		this.y += yVelocity;
	}
	
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	public void setXVel(int setTo) { this.xVelocity = setTo; }
	public void setYVel(int setTo) { this.yVelocity = setTo; }
	public Sprite getSprite() { return this.sprite; }
	
}
