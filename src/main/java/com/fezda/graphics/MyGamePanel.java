package com.fezda.graphics;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.AbstractAction;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;



public class MyGamePanel extends JPanel implements ActionListener {
	private ArrayList<GameObject> objects;	// Stores objects to be updated and displayed
	
	public MyGamePanel(ArrayList<GameObject> objects) {
		this.objects = objects;
		try {
			this.setBackground(Color.blue);
			
			Timer timer = new Timer (100, this);
			timer.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// Map the space bar key press event to the action object
		PressSpaceAction pressSpaceAction = new PressSpaceAction();
		this.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE,0, false), "pressSpace");		// Change false to true for activation on key release, change 0 to InputEvent.SHIFT_DOWN_MASK for shift+key
		this.getActionMap().put("pressSpace", pressSpaceAction	);
	}
	
	@Override
	public void actionPerformed (ActionEvent event) {
		
		// Update the objects (position and sprite frame)
		for (GameObject obj : objects) {
			obj.update();
		}
		
		repaint();
	}
	
	public void paint (Graphics gra) {
		Graphics2D g = (Graphics2D) gra;
		super.paint(g);
		
		// Display each object
		for (GameObject obj : objects) {
			g.drawImage(obj.getSprite().getFrame(), obj.getX(), obj.getY(), null);	
		}
	}
	
	// Define the action to be performed when key is pressed
	public class PressSpaceAction extends AbstractAction {
		@Override
		public void actionPerformed (ActionEvent ae) {			
			//x += 1;		// Change variable x
			repaint();	// Update the display
		}
	}

}
