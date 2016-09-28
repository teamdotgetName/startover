package com.namegui;

import javax.swing.*;

public class Window {
	private JFrame mainWindow;
	
	public Window(String name) {
		this.mainWindow = new JFrame(name);
		this.mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.buildFrame();
		this.mainWindow.pack();
		this.mainWindow.setResizable(false);
		this.mainWindow.setLocationRelativeTo(null);
	}
	
	private void buildFrame() {
		
	}
	
	public void run() {
		this.mainWindow.setVisible(true);
	}
	
	public static void main(String[] args) {
		Window w = new Window("This is a Git Project test");
		w.run();
	}
}
