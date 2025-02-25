package physicsgame;

import com.fezda.graphics.Sprite;

public class PhysGameNPC extends PhysicalObj {
	
	public PhysGameNPC(Sprite sprite, int x, int y, int width, int height) {
		super(sprite, x, y, width, height);
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
