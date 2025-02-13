package com.fezda.javanotes;


import java.awt.Dimension;
import javax.swing.JFrame;

import com.fezda.graphics.MyAnimationPanel;
import com.fezda.graphics.MySpriteAnimationPanel;

public class B02Animation {
	
	public static void main (String[] args) {
		//simpleAnimation();		// Move image across screen
		spriteAnimation();		// Animate a sprite with frames
	}
	
	public static void simpleAnimation () {
		MyAnimationPanel myPanel = new MyAnimationPanel ();			// See MyAnimationPanel for animation code
		myPanel.setPreferredSize( new Dimension(400,400) );	
		
		JFrame myFrame = new JFrame();
		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
	}
	

	public static void spriteAnimation () {
		MySpriteAnimationPanel myPanel = new MySpriteAnimationPanel ();			// See MySpriteAnimationPanel for animation code
		myPanel.setPreferredSize( new Dimension(400,400) );	
		
		JFrame myFrame = new JFrame();
		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
	}
}
