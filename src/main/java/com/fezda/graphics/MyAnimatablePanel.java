package com.fezda.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;


public class MyAnimatablePanel extends JPanel implements ActionListener {
	private ArrayList<AnimatableObject> objects;	// Stores objects to be updated and displayed
	
	public MyAnimatablePanel(ArrayList<AnimatableObject> objects) {
		this.objects = objects;
		try {
			this.setBackground(Color.blue);
			
			Timer timer = new Timer (100, this);
			timer.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void actionPerformed (ActionEvent event) {
		
		// Update the objects (position and sprite frame)
		for (AnimatableObject obj : objects) {
			obj.update();
		}
		
		repaint();
	}
	
	public void paint (Graphics gra) {
		Graphics2D g = (Graphics2D) gra;
		super.paint(g);
		
		// Display each object
		for (AnimatableObject obj : objects) {
			g.drawImage(obj.getSprite().getFrame(), obj.getX(), obj.getY(), null);	
		}
	}

}
