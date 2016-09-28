package com.namegui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class MainMenu extends JPanel {
	private static final long serialVersionUID = -3277223080829135674L;
	
	//used to make the labels and buttons to create this main menu
	private ArrayList<String> nameList;
	
	/*
	 * Main menu design:
	 * 
	 * - title that says "The List of Names:"
	 * 
	 * - for every name panel available:
	 * 	- add a label that tells who's name the panel is for
	 *  - a button to go to that panel
	 */
	public MainMenu(ArrayList<NamePanel> nameList) {
		this.nameList = new ArrayList<>();
		for (int i = 0; i < nameList.size(); ++i)
			this.nameList.add(nameList.get(i).getName());
		this.build();
	}
	
	private void build() {
		//create labels and buttons based off of the string list
	}
	
	private class GotoListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
