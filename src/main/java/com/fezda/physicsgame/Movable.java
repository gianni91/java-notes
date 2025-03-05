package com.fezda.physicsgame;

import java.util.ArrayList;

import com.fezda.graphics.Sprite;

public class Movable extends GameObj{
	protected Sprite sprite;
	protected float xVelocity = 0;
	protected float yVelocity = 0;
	protected float xAccel = 0;
	protected float yAccel = 1;
	protected boolean grounded = false;
	
	public Movable(Sprite sprite, int x, int y, int width, int height) {
		super(x, y, width, height);
		this.sprite = sprite;
	}
	
	public void update (ArrayList<GameObj> solids ) {
		this.sprite.update();
		this.xVelocity += xAccel;
		this.yVelocity += yAccel;
		
		int collisionCheck = 0;
		this.grounded = false;
		
		if (xVelocity != 0 || yVelocity != 0) {
			for (GameObj other : solids) {
				if (this != other) {
					collisionCheck = this.willCollide(other);
					// If collision above
					if (collisionCheck == 1) {
						this.yVelocity = 0;
						this.y = other.y + this.height/2 + other.height/2;
					}
					// If collision below
					else if (collisionCheck == 3) {
						this.yVelocity = 0;
						this.y = other.y - this.height/2 - other.height/2;
						this.grounded = true;
					}
					// If collision on right
					if (collisionCheck == 2) {
						this.xVelocity = 0;
						this.x = other.x - this.width/2 - other.width/2;
					}
					// If collision on left
					else if (collisionCheck == 4) { 
						this.xVelocity = 0;
						this.x = other.x + this.width/2 + other.width/2;
					}
					// If collision is diagonal
					else if (collisionCheck == 5) {
						this.xVelocity = 0;
						this.yVelocity = 0;
						break;
					}
				}
			}
			this.x += xVelocity;
			this.y += yVelocity;
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
			if (Math.abs(this.y - other.y) < (this.height/2 + other.height/2)) {
				if (this.xVelocity > 0) return 2;												// Collision on right
				else return 4;																	// Collision on left
			}
			else if (Math.abs(this.x - other.x) < (this.width/2 + other.width/2)) {
				if (this.yVelocity < 0) return 1;												// Collision above
				else return 3;																	// Collision below
			}
			else return 5; 																		// Diagonal collision
		}
		return 0;																				// No collision
	}
	
	public void setXVel(int setTo) { this.xVelocity = setTo; }
	public void setYVel(int setTo) { this.yVelocity = setTo; }
	public Sprite getSprite() { return this.sprite; }
}
