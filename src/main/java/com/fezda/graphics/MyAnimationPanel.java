package com.fezda.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;


public class MyAnimationPanel extends JPanel implements ActionListener {
	public int x = 0;
	public Image sprite;
	
	public MyAnimationPanel( ) {
		Timer timer = new Timer (100, this);				// To activate the actionPerformed method every 100 milliseconds
		timer.start();
		this.setBackground(Color.blue);
		
		this.sprite = new ImageIcon("demoImage.png").getImage();	// Set image to display
	}
	
	@Override
	public void actionPerformed (ActionEvent event) {		// Needs to implement ActionListener for this, executes when timer ticks
		x+=1;												// Change the position each frame
		repaint();											// This calls paint function, preferable when repeatedly called
	}
	
	public void paint (Graphics gra) {
		Graphics2D g = (Graphics2D) gra;					// Cast to child class, which has more methods
		super.paint(g);										// Display background
		
		g.drawImage(sprite,x,10,null);						// Display image at x, which is changing
	}

}
