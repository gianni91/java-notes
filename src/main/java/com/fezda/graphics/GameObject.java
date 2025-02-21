package com.fezda.graphics;

public class GameObject {
	private Sprite sprite;
	private int x = 0;
	private int y = 0;
	private int xVelocity = 0;
	private int yVelocity = 0;
	
	public GameObject(Sprite sprite, int x, int y) {
		this.sprite = sprite;
		this.x = x;
		this.y = y;
		changeDirection();
	}
	
	public void update () {
		this.sprite.update();
		if (Math.random() < .1) changeDirection();
		this.x += xVelocity;
		this.y += yVelocity;
	}
	
	public void changeDirection() {
		this.xVelocity = -2 + (int)(Math.random()*5);
		this.yVelocity = -2 + (int)(Math.random()*5);
	}
	
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	public void setXVel(int setTo) { this.xVelocity = setTo; }
	public void setYVel(int setTo) { this.yVelocity = setTo; }
	public Sprite getSprite() { return this.sprite; }
	
}
