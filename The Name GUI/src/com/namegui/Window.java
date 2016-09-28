package com.namegui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window {
	private JFrame mainWindow;
	
	//The menu where we can click on the button to go to our name panels
	private JPanel mainMenu;
	
	public Window(String name) {
		this.mainMenu = new MainMenu();
		
		this.mainWindow = new JFrame(name);
		this.mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.buildFrame();
		this.mainWindow.pack();
		this.mainWindow.setResizable(false);
		this.mainWindow.setLocationRelativeTo(null);
	}
	
	//add the components to the main frame, including the name panels
	private void buildFrame() {
		this.mainWindow.getContentPane().add(this.mainMenu);
	}
	
	public void run() {
		this.mainWindow.setVisible(true);
	}
	
	public static void main(String[] args) {
		Window w = new Window("This is a Git Project test");
		w.run();
	}
}
