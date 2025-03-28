package com.fezda.graphics;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;


public class MyMouseInteractionPanel extends JPanel implements MouseListener, MouseMotionListener {
	private int x = 100;
	private int y = 100;
	
	public MyMouseInteractionPanel( ) {
		this.setBackground(Color.blue);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}

	public void paint (Graphics gra) {
		Graphics2D g = (Graphics2D) gra;
		super.paint(g);
		g.setPaint(Color.black);
		g.setFont(new Font("Serif",Font.PLAIN,40));
		
		// Displays at last clicked position
		g.drawString("Click", x,y);			
	}
	
	@Override
	public void mouseClicked (MouseEvent me) {
		x = me.getX();
		y = me.getY();
		this.repaint();
	}
	
	@Override
	public void mousePressed (MouseEvent me) {}
	
	@Override
	public void mouseReleased (MouseEvent me) {}
	
	@Override
	public void mouseEntered (MouseEvent me) {}
	
	@Override
	public void mouseExited (MouseEvent me) {}
	
	@Override
	public void mouseMoved (MouseEvent me) {}
	
	@Override
	public void mouseDragged (MouseEvent me) {}

}