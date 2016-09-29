package com.namegui;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;



public class DustinPanel extends NamePanel{
 public DustinPanel(Window r){
	 
			super(r, "NOOOO, Dustin");
			
			
		}
	@Override
	protected void build() {
		
		this.setLayout(new GridBagLayout());
		GridBagConstraints rd = new GridBagConstraints();
	rd.insets = new Insets(5,5,5,5);
	
	this.add(this.getBackButton(), rd);
	this.add(this.getNameLabel(), rd);	
	}

}

