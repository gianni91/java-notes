package com.fezda.graphics;

import java.awt.image.BufferedImage;

public class Sprite {
	private BufferedImage spriteSheetImage;
	private int frameWidth, frameHeight, frameCount, frameIndex, x, y;
	
	public Sprite (BufferedImage spriteSheetImage, int frameWidth, int frameHeight, int frameCount) {
		try {
			// A sprite sheet image should contain evenly spaced areas containing different frames of the animation)
			this.spriteSheetImage = spriteSheetImage;
			this.frameWidth = frameWidth;		// Width of each sprite frame/image in the sprite sheet
			this.frameHeight = frameHeight;		// Height of each sprite frame/image in the sprite sheet
			this.frameCount = frameCount;		// The number of frames/images in the sprite sheet
			this.frameIndex = 0;				// To keep track of which frame of the animation is in focus
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update() {
		frameIndex += 1;
		if (frameIndex == frameCount) frameIndex = 0;
	}
	
	public BufferedImage getFrame() {
		return spriteSheetImage.getSubimage( frameWidth*frameIndex, 0, frameWidth, frameHeight);
	}
}
