package com.fezda.javanotes;


import java.awt.Dimension;
import javax.swing.JFrame;

import com.fezda.games.SimpleGamePanel;
import com.fezda.games.SimpleGame;
import com.fezda.physicsgame.PhysGamePanel;
import com.fezda.physicsgame.PhysicsGame;

public class B03Games {
	
	public static void main (String[] args) {
		simpleGame();
//		physicsGame();
	}
	
	public static void simpleGame () {
		
		SimpleGame game = new SimpleGame();
		SimpleGamePanel myPanel = new SimpleGamePanel (game);		// See games:SimpleGamePanel for code
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
		PhysGamePanel myPanel = new PhysGamePanel (game);
		myPanel.setPreferredSize( new Dimension(400,400) );	
		
		JFrame myFrame = new JFrame();
		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
	
	}
}
