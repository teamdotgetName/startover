package com.namegui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JLabel;

public class TymanPanel extends NamePanel
{
	private static final long serialVersionUID = -757006825137387310L;

	public TymanPanel(Window window)
	{
		super(window ,"Tyman");
		System.out.println(this.getNameLabel().getText());
	}
	
	@Override
	public void build()
	{
		this.setLayout(new GridBagLayout());
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx = 0;
		gbc.gridy = 0;
		
		JLabel quote = new JLabel("Tyman is Awesome!!!!!");
		
		this.add(this.getNameLabel(), gbc);
		gbc.gridx = 1;
		this.add(this.getBackButton(), gbc);
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		this.add(quote, gbc);
	}
}