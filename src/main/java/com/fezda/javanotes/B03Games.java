package com.fezda.javanotes;


import java.awt.Dimension;
import javax.swing.JFrame;

import com.fezda.games.MyGamePanel;
import com.fezda.games.SimpleGameClass;

import physicsgame.MyPhysGamePanel;
import physicsgame.PhysicsGame;

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
		
		PhysicsGame game = new PhysicsGame();
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
