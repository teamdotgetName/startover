package com.namegui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;

public class MauricePanel extends NamePanel
{
	private static final long serialVersionUID = 1L;
	public MauricePanel(Window window)
	{
		super(window, "Maurice");
	}
	@Override
	protected void build()
	{
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		
		final int SPACE = 3;
		gbc.insets = new Insets(SPACE, SPACE, SPACE, SPACE);
		this.add(this.getNameLabel(), gbc);
		this.add(new JLabel("panel best panel."), gbc);
		this.add(this.getBackButton(), gbc);
	}
}
