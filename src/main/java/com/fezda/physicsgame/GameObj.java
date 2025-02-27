package com.fezda.physicsgame;

public class GameObj {
	protected int x = 0;
	protected int y = 0;
	protected int width = 2;		// Collision box width
	protected int height = 2;		// Collision box height
	
	public GameObj (int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public int getX() { return this.x; }
	public int getY() { return this.y; }
	public int getWidth() { return this.width; }
	public int getHeight() { return this.height; }
	
}
