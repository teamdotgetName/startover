package com.namegui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public abstract class NamePanel extends JPanel {
	private static final long serialVersionUID = -6775643175780450465L;
	//each name panel will have a label to hold the name, and a button to go back to the name list
	private JLabel name;
	private JButton back;
	
	//construct the label and button
	public NamePanel(String name) {
		//IN SUB-CLASSES: DO NOT ADD A STRING PARAMETER: just write super(your name as a String) in a constructor with no parameters
		this.name = new JLabel(name);
		this.back = new JButton();
		this.back.addActionListener(new BackListener());
		this.build();
	}
	
	protected abstract void build();
	
	public JLabel getNameLabel() {
		return this.name;
	}
	
	//Go back to the menu of names
	private class BackListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			
		}
	}
}
