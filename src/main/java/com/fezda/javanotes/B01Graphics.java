package com.fezda.javanotes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class B01Graphics {

	public static void main (String[] args) {
		JPanel myPanel = new JPanel() {
			public void paint (Graphics gra) {
				Graphics2D g = (Graphics2D) gra;	// Cast to child class, which has more methods
				
				this.setBackground(Color.blue);
				super.paint(g);
				
				// Call your draw functions here, demos provided
				drawLinesDemos(g);
				drawShapesDemos(g);
				drawTextDemo(g);
				drawImageDemo(g);
			}
		};
		myPanel.setPreferredSize( new Dimension(400,400) );	// Set window size
		
		JFrame myFrame = new JFrame();
		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
	}
	
	
	public static void drawLinesDemos (Graphics2D g) {
		g.setPaint(Color.green);			// Set simple line color
		g.setStroke(new BasicStroke(3));	// Set line thickness
		
		g.drawLine(20, 240, 120, 340);
		g.drawLine(30, 280, 20, 340);
	}
	
	public static void drawShapesDemos (Graphics2D g) {
		g.setPaint(Color.black);			// Set shape fill/outline color
		g.setStroke(new BasicStroke(3));	// Set outline thickness
		
		// Draw outlines of shapes
		g.drawRect(100,20,50,60);
		g.drawOval(170,30,20,40);
		g.drawArc(200,10,40,30,0,180);
		g.drawPolygon(new int[]{10,50,90,70,30},new int[]{50,10,50,90,90},5);
		
		// Draw solid shapes with fill functions
		g.setPaint(new Color(20,210,220));	// Custom colors can be defined with their RGB values
		g.fillOval(50,150,20,40);
		g.fillRect(10,130,25,35);
		g.fillArc(80,130,40,30,0,180);
		
	}
	
	public static void drawTextDemo (Graphics2D g) {
		g.setPaint(Color.red);
		g.setFont(new Font("Serif",Font.PLAIN,40));
		g.drawString("Demo text", 200,120);
	}
	
	public static void drawImageDemo (Graphics2D g) {
		g.drawImage(new ImageIcon("demoImage.png").getImage(),200,200,null);
	}
	

}
