package com.fezda.games;

import com.fezda.graphics.Sprite;

public class Collectable {
	private Sprite sprite;
	private int x = 0;
	private int y = 0;
	
	public Collectable(Sprite sprite, int x, int y) {
		this.sprite = sprite;
		this.x = x;
		this.y = y;
	}
	
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	public void setX (int setTo) {this.x = setTo;}
	public void setY (int setTo) {this.y = setTo;}
	public Sprite getSprite() { return this.sprite; }
	
}
