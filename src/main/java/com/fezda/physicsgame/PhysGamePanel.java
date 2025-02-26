package com.fezda.physicsgame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.Timer;



public class PhysGamePanel extends JPanel implements ActionListener {
	PhysicsGame game;
	
	public PhysGamePanel(PhysicsGame game) {
		this.game = game;
		try {
			this.setBackground(Color.blue);
			
			Timer timer = new Timer (100, this);
			timer.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		PressRightAction pressRightAction = new PressRightAction();
		this.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT,0, false), "pressRight");		// Change false to true for activation on key release, change 0 to InputEvent.SHIFT_DOWN_MASK for shift+key
		this.getActionMap().put("pressRight", pressRightAction	);
		
		PressLeftAction pressLeftAction = new PressLeftAction();
		this.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT,0, false), "pressLeft");		// Change false to true for activation on key release, change 0 to InputEvent.SHIFT_DOWN_MASK for shift+key
		this.getActionMap().put("pressLeft", pressLeftAction	);
		
		PressSpaceAction pressSpaceAction = new PressSpaceAction();
		this.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE,0, false), "pressSpace");		// Change false to true for activation on key release, change 0 to InputEvent.SHIFT_DOWN_MASK for shift+key
		this.getActionMap().put("pressSpace", pressSpaceAction	);
		
	}
	
	@Override
	public void actionPerformed (ActionEvent event) {
		
		// Update the objects (position and sprite frame)
		for (PhysGameNPC obj : game.getObjects()) {
			obj.update();
		}
		game.getPlayer1().update();
		
		// Handle collisions
		for (PhysGameNPC obj : game.getObjects()) {
			if (game.getPlayer1().checkCollision(obj)) {
				game.getPlayer1().onCollision();
			}
		}
		
		repaint();
	}
	
	public void paint (Graphics gra) {
		Graphics2D g = (Graphics2D) gra;
		super.paint(g);
		
		// Display player 1
		g.drawImage(game.getPlayer1().getSprite().getFrame(), game.getPlayer1().getX(), game.getPlayer1().getY(), null);
		
		// Display NPCs
		for (PhysGameNPC obj : game.getObjects()) {
			g.drawImage(obj.getSprite().getFrame(), obj.getX(), obj.getY(), null);	
		}
	}
	
	
	// Define the action to be performed when key is pressed
	public class PressRightAction extends AbstractAction {
		@Override
		public void actionPerformed (ActionEvent ae) {
			game.getPlayer1().onRightKeyPress();
		}
	}
	
	public class PressLeftAction extends AbstractAction {
		@Override
		public void actionPerformed (ActionEvent ae) {
			game.getPlayer1().onLeftKeyPress();
		}
	}
	
	public class PressSpaceAction extends AbstractAction {
		@Override
		public void actionPerformed (ActionEvent ae) {
			game.getPlayer1().onSpaceKeyPress();
		}
	}

}
