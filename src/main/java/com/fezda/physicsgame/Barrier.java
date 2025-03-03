package com.fezda.physicsgame;

public class Barrier extends GameObj {
	
	public Barrier (int tlX, int tlY, int width, int height) {
		super(tlX + width/2, tlY + height/2, width, height);
	}
}
