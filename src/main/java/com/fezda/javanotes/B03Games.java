package com.fezda.javanotes;


import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.fezda.graphics.AnimatableObject;
import com.fezda.graphics.GameObject;
import com.fezda.graphics.MyAnimatablePanel;
import com.fezda.graphics.MyAnimationPanel;
import com.fezda.graphics.MyGamePanel;
import com.fezda.graphics.MyKeyInteractionPanel;
import com.fezda.graphics.MySpriteAnimationPanel;
import com.fezda.graphics.Sprite;

public class B03Games {
	
	public static void main (String[] args) {
		simpleGame();
	}
	
	public static void simpleGame () {
		try {
			BufferedImage spriteSheetImage = ImageIO.read(new File("demoSprite.png"));
			
			ArrayList<GameObject> gameObjects = new ArrayList<GameObject>(); 
			Sprite sprite = new Sprite(spriteSheetImage,64,64,4);		// See graphics:Sprite.java, encapsulates animation frame selection
			gameObjects.add( new GameObject(sprite,40,30));				// See graphics:AnimatableObject.java, object can update position
			gameObjects.add( new GameObject(sprite,140,230));
			
			// TODO - Make 1 game object controllable with key interaction
			
			MyGamePanel myPanel = new MyGamePanel (gameObjects);		// See graphics:MyKeyInteractionPanel for code
			myPanel.setPreferredSize( new Dimension(400,400) );	
			
			JFrame myFrame = new JFrame();
			myFrame.add(myPanel);
			myFrame.pack();
			myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			myFrame.setVisible(true);
			myFrame.setLocationRelativeTo(null);
		} 
		catch (Exception e) {
			
		}
	}
}
