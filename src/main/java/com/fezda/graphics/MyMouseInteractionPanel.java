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
	private int clickX = 0;
	private int clickY = 0;
	
	private boolean dragging = false;
	private int startX = 0;
	private int startY = 0;
	private int endX = 0;
	private int endY = 0;
		
	public MyMouseInteractionPanel( ) {
		this.setBackground(Color.blue);
		this.addMouseListener(this);			// For mouseClicked, mousePressed, mouseReleased, mouseEntered, mouseExited
		this.addMouseMotionListener(this);		// For mouseMoved and mouseDragged
	}

	public void paint (Graphics gra) {
		Graphics2D g = (Graphics2D) gra;
		super.paint(g);
		g.setPaint(Color.black);
		g.setFont(new Font("Serif",Font.PLAIN,40));
		
		g.drawString("Click and Drag", 10, 40);
		
		// Displays at last clicked position
		g.drawString(".", clickX, clickY);
		
		// Draws rectangle when dragged
		if (dragging) {
			g.drawRect(startX, startY, endX-startX, endY-startY);
		}
	}
	
	
	/****************************************
	 * Functions for MouseListener
	 ***************************************/
	@Override
	public void mouseClicked (MouseEvent me) {
		clickX = me.getX();
		clickY = me.getY();
		this.repaint();
	}
	@Override
	public void mousePressed (MouseEvent me) {
		startX = me.getX();
		startY = me.getY();
	}
	@Override
	public void mouseReleased (MouseEvent me) {
		dragging = false;
	}
	@Override
	public void mouseEntered (MouseEvent me) {
		// Called when mouse enters panel with listener
	}
	@Override
	public void mouseExited (MouseEvent me) {
		// Called when mouse exits panel with listener
	}
	
	
	/****************************************
	 * Functions for MouseMotionListener
	 ***************************************/
	@Override
	public void mouseMoved (MouseEvent me) {
		// Called when mouse is moved
	}
	@Override
	public void mouseDragged (MouseEvent me) {
		dragging = true;
		endX = me.getX();
		endY = me.getY();
		this.repaint();
	}

}