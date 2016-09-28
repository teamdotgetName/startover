package com.namegui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainMenu extends JPanel {
	private static final long serialVersionUID = -3277223080829135674L;
	//for communication with the Window's frame
	private Window window;
	
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
	public MainMenu(Window window, ArrayList<NamePanel> nameList) {
		this.window = window;
		
		this.nameList = new ArrayList<>();
		for (int i = 0; i < nameList.size(); ++i)
			this.nameList.add(nameList.get(i).getName());
		this.build();
	}
	
	private void build() {
		/*
		 * Main menu layout:
		 * BorderLayout: using two panels: a panel for the title and a panel for the links
		 * 
		 * title:
		 * FlowLayout, NORTH side of the main menu
		 * 
		 * link:
		 * FlowLayout, CENTER of the main menu
		 */
		
		this.setLayout(new BorderLayout());
		JPanel titlePanel = new JPanel(),
				linkPanel = new JPanel();
		
		//title
		JLabel title = new JLabel("The List of Names:");
		
		//double the font size
		title.setFont(title.getFont().deriveFont(title.getFont().getSize() * 2F));
		
		titlePanel.add(title);
		
		//create labels and buttons based off of the string list
		for (String s: this.nameList) {
			/*
			 * Layout:
			 *  each set (a name and a link button) will be fitted top to bottom using a JPanel with GridBagLayout.
			 *  These JPanels will be layed out with the linkPanel's default flow layout
			 */
			JPanel nameItem = new JPanel();
			JLabel name = new JLabel(s);
			JButton link = new JButton("Go to " + s + "'s Panel");
			
			GridBagConstraints gbc = new GridBagConstraints();
			nameItem.setLayout(new GridBagLayout());
			
			link.addActionListener(new GotoListener(s));
			
			gbc.gridx = 0;
			gbc.gridy = 0;
			
			nameItem.add(name, gbc);
			++gbc.gridy;
			nameItem.add(link, gbc);
			
			linkPanel.add(nameItem);
		}
		
		this.add(titlePanel, BorderLayout.NORTH);
		this.add(linkPanel, BorderLayout.CENTER);
	}
	
	private class GotoListener implements ActionListener {
		private String name;
		
		private GotoListener(String name) {
			this.name = name;
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//switch to the selected NamePanel's view
			try {
				NamePanel np = window.getPanelByName(this.name);
				window.showView(np);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
