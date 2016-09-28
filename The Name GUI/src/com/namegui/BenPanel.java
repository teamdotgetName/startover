package com.namegui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class BenPanel extends NamePanel {
	private static final long serialVersionUID = 8970392054558376728L;

	public BenPanel(Window window) {
		super(window, "Ben");
	}
	
	@Override
	protected void build() {
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		final int SPACE = 3;
		gbc.insets = new Insets(SPACE, SPACE, SPACE, SPACE);
		this.add(this.getNameLabel(), gbc);
		this.add(this.getBackButton(), gbc);
	}
}
