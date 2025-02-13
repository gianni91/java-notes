package com.fezda.javanotes;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

import com.fezda.graphics.MyAnimationPanel;

public class B02Animation {
	
	public static void main (String[] args) {
		MyAnimationPanel myPanel = new MyAnimationPanel ();			// See MyAnimationPanel for animation code
		myPanel.setPreferredSize( new Dimension(400,400) );	
		
		JFrame myFrame = new JFrame();
		myFrame.add(myPanel);
		myFrame.pack();
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		myFrame.setLocationRelativeTo(null);
	}
	
}
