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
	public int x = 0;
	public int frameIndex = 0;
	public BufferedImage spriteSheet;
	
	public MySpriteAnimationPanel( ) {
		Timer timer = new Timer (100, this);				// To activate the actionPerformed method every 100 milliseconds
		timer.start();
		this.setBackground(Color.blue);
		
		try {
			this.spriteSheet = ImageIO.read(new File("demoSprite.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void actionPerformed (ActionEvent event) {		// Needs to implement ActionListener for this, executes when timer ticks
		x++;												// Change the position each frame
		
		frameIndex++;										// Focus on next frame in spriteSheet
		if(frameIndex > 3) frameIndex = 0;					// Restart at the first frame if past the last one
		
		repaint();											// This calls paint function, preferable when repeatedly called
	}
	
	public void paint (Graphics gra) {
		Graphics2D g = (Graphics2D) gra;					// Cast to child class, which has more methods
		super.paint(g);										// Display background
		
		g.drawImage(spriteSheet.getSubimage( (64 * frameIndex), 0, 64, 64) ,x,10,null);	// Get the 64x64 view of the current frame, display it at x
	}

}
