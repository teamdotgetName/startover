package com.namegui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JLabel;

public class DustinPanel20 extends NamePanel
{
	private static final long serialVersionUID = 1L;
	public DustinPanel20(Window r)
	{
		super(r, "NOOOO Dustin");
	}
	@Override
	protected void build()
	{
		this.setLayout(new GridBagLayout());
		GridBagConstraints rd = new GridBagConstraints();
		
		
	rd.insets = new Insets(5,5,5,5);
		this.add(this.getNameLabel(),rd);
		this.add(new JLabel("go away"), rd);
		this.add(this.getBackButton(), rd);
	}
}