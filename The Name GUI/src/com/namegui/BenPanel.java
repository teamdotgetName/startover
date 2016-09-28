package com.namegui;

import java.awt.BorderLayout;

public class BenPanel extends NamePanel {
	private static final long serialVersionUID = 8970392054558376728L;

	public BenPanel(Window window) {
		super(window, "Ben");
	}
	
	@Override
	protected void build() {
		this.setLayout(new BorderLayout());
		this.add(this.getNameLabel(), BorderLayout.NORTH);
		this.add(this.getBackButton(), BorderLayout.SOUTH);
	}
}
