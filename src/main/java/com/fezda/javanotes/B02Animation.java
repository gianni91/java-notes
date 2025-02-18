package com.fezda.javanotes;


import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.fezda.graphics.AnimatableObject;
import com.fezda.graphics.MyAnimatablePanel;
import com.fezda.graphics.MyAnimationPanel;
import com.fezda.graphics.MySpriteAnimationPanel;
import com.fezda.graphics.Sprite;

public class B02Animation {
	
	public static void main (String[] args) {
		//simpleAnimation();		// Move image across screen
		//spriteAnimation();		// Animate a sprite with frames
		objectAnimation();			// Pass objects to be animated
	}
	
	public static void simpleAnimation () {
		MyAnimationPanel myPanel = new MyAnimationPanel ();			// See graphics:MyAnimationPanel for animation code
		myPanel.setPreferredSize( new Dimension(400,400) );	
		
		JFrame myFrame = new JFrame();
		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
	}
	

	public static void spriteAnimation () {
		MySpriteAnimationPanel myPanel = new MySpriteAnimationPanel ();			// See graphics:MySpriteAnimationPanel for animation code
		myPanel.setPreferredSize( new Dimension(400,400) );	
		
		JFrame myFrame = new JFrame();
		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
	}
	
	public static void objectAnimation () {
		try {
			BufferedImage spriteSheetImage = ImageIO.read(new File("demoSprite.png"));
			
			// Make objects designed to be displayed by our panel
			ArrayList<AnimatableObject> objects = new ArrayList<AnimatableObject>(); 
			Sprite sprite = new Sprite(spriteSheetImage,64,64,4);	// See graphics:Sprite.java, encapsulates animation frame selection
			objects.add( new AnimatableObject(sprite,40,30));		// See graphics:AnimatableObject.java, object can update position
			objects.add( new AnimatableObject(sprite,140,230));
			
			
			MyAnimatablePanel myPanel = new MyAnimatablePanel (objects);	// See graphics:MyAnimatablePanel.java
			myPanel.setPreferredSize( new Dimension(400,400) );	
			
			JFrame myFrame = new JFrame();
			myFrame.add(myPanel);
			myFrame.pack();
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myFrame.setVisible(true);
			myFrame.setLocationRelativeTo(null);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
