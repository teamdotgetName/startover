package com.namegui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class MainMenu extends JPanel {
	private static final long serialVersionUID = -3277223080829135674L;
	
	/*
	 * Main menu design:
	 * 
	 * - title that says "The List of Names:"
	 * 
	 * - for every name panel available:
	 * 	- add a label that tells who's name the panel is for
	 *  - a button to go to that panel
	 */
	public MainMenu() {
		this.build();
	}
	
	private void build() {
		
	}
	
	private class GotoListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
