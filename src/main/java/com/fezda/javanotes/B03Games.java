package com.fezda.javanotes;


import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.fezda.games.GameNPC;
import com.fezda.games.MyGamePanel;
import com.fezda.games.MyPhysGamePanel;
import com.fezda.games.SimpleGameClass;
import com.fezda.graphics.AnimatableObject;
import com.fezda.graphics.MyAnimatablePanel;
import com.fezda.graphics.MyAnimationPanel;
import com.fezda.graphics.MyKeyInteractionPanel;
import com.fezda.graphics.MySpriteAnimationPanel;
import com.fezda.graphics.Sprite;

public class B03Games {
	
	public static void main (String[] args) {
//		simpleGame();
		physicsGame();
	}
	
	public static void simpleGame () {
		
		SimpleGameClass game = new SimpleGameClass();
		MyGamePanel myPanel = new MyGamePanel (game);		// See games:MyGamePanel for code
		myPanel.setPreferredSize( new Dimension(400,400) );	
		
		JFrame myFrame = new JFrame();
		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
	
	}
	
	public static void physicsGame () {
		
		SimpleGameClass game = new SimpleGameClass();
		MyPhysGamePanel myPanel = new MyPhysGamePanel (game);
		myPanel.setPreferredSize( new Dimension(400,400) );	
		
		JFrame myFrame = new JFrame();
		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
	
	}
}
