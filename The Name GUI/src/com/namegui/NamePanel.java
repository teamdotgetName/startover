package com.namegui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public abstract class NamePanel extends JPanel {
	private static final long serialVersionUID = -6775643175780450465L;
	//have the window as an instance for communication
	Window window;
	
	//each name panel will have a label to hold the name, and a button to go back to the name list
	private JLabel name;
	private JButton back;
	
	//construct the label and button
	public NamePanel(Window window, String name) {
		this.window = window;
		
		//IN SUB-CLASSES: DO NOT ADD A STRING PARAMETER: just write super(your name as a String) in a constructor with no parameters
		this.name = new JLabel(name);
		this.back = new JButton("Back to Main Menu");
		this.back.addActionListener(new BackListener());
		this.build();
	}
	
	protected abstract void build();
	
	//to access the name label in subclasses (I didn't want to do protected on the name itself because of encapsulation issues)
	public JLabel getNameLabel() {
		return this.name;
	}
	
	//access the back button in the subclass
	public JButton getBackButton() {
		return this.back;
	}
	
	//for the Window-to-MainMenu communication
	public String getName() {
		return this.name.getText();
	}
	
	//Go back to the menu of names
	private class BackListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			window.displayMenu();
		}
	}
}
