package com.fezda.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;


public class MySpriteAnimationPanel extends JPanel implements ActionListener {
	private BufferedImage spriteSheet;	// BufferedImage is used so you can access a part of the image at a time
	private int frameWidth, frameHeight, frameCount, frameIndex;
	
	public MySpriteAnimationPanel( ) {
		try {
			this.setBackground(Color.blue);
			
			// To activate the actionPerformed method every 100 milliseconds
			Timer timer = new Timer (100, this);
			timer.start();
			
			// Read image file from path
			// A sprite sheet image should contain evenly spaced areas containing different frames of the animation)
			this.spriteSheet = ImageIO.read(new File("demoSprite.png"));
			this.frameWidth = 64;		// Width of each sprite frame/image in the sprite sheet
			this.frameHeight = 64;		// Height of each sprite frame/image in the sprite sheet
			this.frameCount = 4;		// The number of frames/images in the sprite sheet
			this.frameIndex = 0;		// To keep track of which frame of the animation is in focus
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void actionPerformed (ActionEvent event) {		// Needs to implement ActionListener for this, executes when timer ticks
		frameIndex++;										// Focus on next frame in spriteSheet
		if (frameIndex >= frameCount) frameIndex = 0;		// Restart at the first frame if past the last one
		
		repaint();	// This reruns the paint function
	}
	
	public void paint (Graphics gra) {
		Graphics2D g = (Graphics2D) gra;
		super.paint(g);
		
		// Get the view of the current frame and display it at coordinate (10,20) for this demo
		// The first 2 parameters define the coordinate of the top left corner of the view area
		BufferedImage currentFrame = spriteSheet.getSubimage( frameWidth*frameIndex, 0, frameWidth, frameHeight) ;
		g.drawImage(currentFrame,10,20,null);	
	}

}
