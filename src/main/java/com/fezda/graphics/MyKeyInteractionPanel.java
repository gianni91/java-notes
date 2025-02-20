package com.fezda.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JPanel;
import javax.swing.KeyStroke;


public class MyKeyInteractionPanel extends JPanel {
	private int x = 0;
	
	public MyKeyInteractionPanel( ) {
		this.setBackground(Color.blue);
		
		// Map the space bar key press event to the action object
		PressSpaceAction pressSpaceAction = new PressSpaceAction();
		this.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE,0, false), "pressSpace");		// Change false to true for activation on key release, change 0 to InputEvent.SHIFT_DOWN_MASK for shift+key
		this.getActionMap().put("pressSpace", pressSpaceAction	);
	}

	public void paint (Graphics gra) {
		Graphics2D g = (Graphics2D) gra;
		super.paint(g);
		g.setPaint(Color.black);
		g.setFont(new Font("Serif",Font.PLAIN,40));
		
		// Example to display our variable x which will be changed with the key press
		g.drawString("Press Space Bar: " + x, 20,50);			
	}
	
	// Define the action to be performed when key is pressed
	public class PressSpaceAction extends AbstractAction {
		@Override
		public void actionPerformed (ActionEvent ae) {			
			x += 1;		// Change variable x
			repaint();	// Update the display
		}
	}

}