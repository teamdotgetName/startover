package com.namegui;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	private JFrame mainWindow;
	
	//The menu where we can click on the button to go to our name panels
	private JPanel mainMenu;
	private ArrayList<NamePanel> nameList;
	
	public Window(String name) {
		this.nameList = new ArrayList<>();
		this.createNameList();
		this.mainMenu = new MainMenu(this.nameList);
		
		this.mainWindow = new JFrame(name);
		this.mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.buildFrame();
		this.mainWindow.pack();
		this.mainWindow.setResizable(false);
		this.mainWindow.setLocationRelativeTo(null);
	}
	
	//ADD AN INSTANCE OF YOUR SUB-CLASS PANEL OF NAMEPANEL TO THE NAMELIST HERE
	private void createNameList() {
		
	}
	
	//add the components to the main frame, including the name panels
	private void buildFrame() {
		this.mainWindow.getContentPane().add(this.mainMenu);
	}
	
	//changes the current panel being displayed
	public void showView(JPanel view) {
		//1. remove the panel that is being displayed (remove the only component from the frame --> the panel)
		this.mainWindow.getContentPane().remove(this.mainWindow.getContentPane().getComponent(0));
		//2. add the new panel from the parameter
		this.mainWindow.getContentPane().add(view, BorderLayout.CENTER);
	}
	
	//accessible to button listeners to go back to the main menu
	public void displayMenu() {
		this.showView(this.mainMenu);
	}
	
	public void run() {
		this.mainWindow.setVisible(true);
		this.displayMenu();
	}
	
	public static void main(String[] args) {
		Window w = new Window("This is a Git Project test");
		w.run();
	}
}
