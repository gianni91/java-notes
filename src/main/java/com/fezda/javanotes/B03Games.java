package com.fezda.javanotes;


import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.fezda.games.SimpleGamePanel;
import com.fezda.graphics.MyKeyInteractionPanel;
import com.fezda.graphics.MyMouseInteractionPanel;
import com.fezda.games.SimpleGame;
import com.fezda.physicsgame.PhysGamePanel;
import com.fezda.physicsgame.PhysicsGame;

public class B03Games {
	
	public static void main (String[] args) {
//		keyInteraction();		// Use the keyboard to interact with the window
		mouseInteraction();		// Use the mouse to interact with the window
//		simpleGame();			// A simple game with a controllable character
//		physicsGame();			// A game with simple physics applied
	}
	
	public static void setUpFrame (JPanel panel) {
		JFrame myFrame = new JFrame();
		myFrame.add(panel);
		myFrame.pack();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
	}
	
	public static void keyInteraction () {
		MyKeyInteractionPanel myPanel = new MyKeyInteractionPanel ();			// See graphics:MyKeyInteractionPanel for code
		myPanel.setPreferredSize( new Dimension(400,400) );	
		setUpFrame(myPanel);
	}
	
	public static void mouseInteraction () {
		MyMouseInteractionPanel myPanel = new MyMouseInteractionPanel ();		// See graphics:MyMouseInteractionPanel for code
		myPanel.setPreferredSize( new Dimension(400,400) );	
		setUpFrame(myPanel);
	}
	
	public static void simpleGame () {
		SimpleGame game = new SimpleGame();							// See games:SimpleGame for code
		SimpleGamePanel myPanel = new SimpleGamePanel (game);		// See games:SimpleGamePanel for code
		myPanel.setPreferredSize( new Dimension(400,400) );	
		setUpFrame(myPanel);
	}
	
	public static void physicsGame () {
		PhysicsGame game = new PhysicsGame();						// See physicsgame:PhysicsGame for code
		PhysGamePanel myPanel = new PhysGamePanel (game);			// See physicsgame:PhysicsGamePanel for code
		myPanel.setPreferredSize( new Dimension(400,400) );	
		setUpFrame(myPanel);
	}
	
	
}
