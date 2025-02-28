package com.fezda.physicsgame;

import java.util.ArrayList;

import com.fezda.graphics.Sprite;

public class Movable extends GameObj{
	protected Sprite sprite;
	protected float xVelocity = 0;
	protected float yVelocity = 0;
	protected float xAccel = 0;
	protected float yAccel = 1;
	
	public Movable(Sprite sprite, int x, int y, int width, int height) {
		super(x, y, width, height);
		this.sprite = sprite;
	}
	
	public void update (ArrayList<GameObj> solids ) {
		this.sprite.update();
		this.xVelocity += xAccel;
		this.yVelocity += yAccel;
		
		int collisionCheck = 0;
		if (xVelocity != 0 || yVelocity != 0) {
			for (GameObj other : solids) {
				if (this != other) {
					collisionCheck = this.willCollide(other);
					if (collisionCheck == 1) {
						this.xVelocity = 0;
					}
					else if (collisionCheck == 2) {
						this.yVelocity = 0;
					}
					else if (collisionCheck == 3) {
						this.xVelocity = 0;
						this.yVelocity = 0;
						break;
					}
				}
			}
			this.y += yVelocity;
			this.x += xVelocity;
		}

	}
	
	public boolean checkCollision(GameObj other) {
		return Math.abs(this.x - other.x) < (this.width/2 + other.width/2) && 
				Math.abs(this.y - other.y) < (this.height/2 + other.height/2);
	}
	
	public int willCollide(GameObj other) {
		if (Math.abs(this.x + this.xVelocity - other.x) < (this.width/2 + other.width/2) && 
				Math.abs(this.y + this.yVelocity - other.y) < (this.height/2 + other.height/2)) 
		{
			if (Math.abs(this.y - other.y) < (this.height/2 + other.height/2)) return 1;		// Horizontal collision
			else if (Math.abs(this.x - other.x) < (this.width/2 + other.width/2)) return 2;		// Vertical collision
			else return 3; 																		// Diagonal collision
		}
		return 0;																				// No collision
	}
	
	public void onCollision () {
		this.x -= xVelocity;
		this.y -= yVelocity;
		this.xVelocity = 0;
		this.yVelocity = 0;
	}
	
	public void setXVel(int setTo) { this.xVelocity = setTo; }
	public void setYVel(int setTo) { this.yVelocity = setTo; }
	public Sprite getSprite() { return this.sprite; }
}
