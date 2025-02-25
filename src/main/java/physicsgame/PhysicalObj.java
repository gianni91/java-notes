package physicsgame;

import com.fezda.graphics.Sprite;

public class PhysicalObj {
	protected Sprite sprite;
	protected int x = 0;
	protected int y = 0;
	protected int width = 2;		// Collision box width
	protected int height = 2;		// Collision box height
	protected int xVelocity = 0;
	protected int yVelocity = 0;
	
	public PhysicalObj(Sprite sprite, int x, int y, int width, int height) {
		this.sprite = sprite;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void update () {
		this.sprite.update();
		this.x += xVelocity;
		this.y += yVelocity;
	}
	
	public boolean checkCollision(PhysicalObj other) {
		return Math.abs(this.x - other.x) < (this.width/2 + other.width/2) && 
				Math.abs(this.y - other.y) < (this.height/2 + other.height/2);
	}
	
	public void onCollision () {
		this.x -= xVelocity;
		this.y -= yVelocity;
	}
	
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	public int getWidth() { return this.width; }
	public int getHeight() { return this.height; }
	public void setXVel(int setTo) { this.xVelocity = setTo; }
	public void setYVel(int setTo) { this.yVelocity = setTo; }
	public Sprite getSprite() { return this.sprite; }
}
