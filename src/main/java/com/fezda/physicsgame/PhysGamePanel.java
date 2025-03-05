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
			
			Timer timer = new Timer (50, this);
			timer.start();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		PressRightAction pressRightAction = new PressRightAction();
		this.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT,0, false), "pressRight");
		this.getActionMap().put("pressRight", pressRightAction	);
		
		PressLeftAction pressLeftAction = new PressLeftAction();
		this.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT,0, false), "pressLeft");
		this.getActionMap().put("pressLeft", pressLeftAction	);
		
		PressSpaceAction pressSpaceAction = new PressSpaceAction();
		this.getInputMap().put(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE,0, false), "pressSpace");
		this.getActionMap().put("pressSpace", pressSpaceAction	);
		
	}
	
	@Override
	public void actionPerformed (ActionEvent event) {
		game.update();
		repaint();
	}
	
	public void paint (Graphics gra) {
		Graphics2D g = (Graphics2D) gra;
		super.paint(g);
		game.display(g);
	}
	
	public class PressRightAction extends AbstractAction {
		@Override
		public void actionPerformed (ActionEvent ae) {
			game.onRightKeyPress();
		}
	}
	
	public class PressLeftAction extends AbstractAction {
		@Override
		public void actionPerformed (ActionEvent ae) {
			game.onLeftKeyPress();
		}
	}
	
	public class PressSpaceAction extends AbstractAction {
		@Override
		public void actionPerformed (ActionEvent ae) {
			game.onSpaceKeyPress();
		}
	}

}
