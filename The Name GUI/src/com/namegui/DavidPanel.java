package com.namegui;

public class DavidPanel extends NamePanel {
	private static final long serialVersionUID = 9097721004583627542L;

	public DavidPanel(Window window) {
		super(window, "David");
	}
	
	@Override
	protected void build() {
		this.add(this.getNameLabel());
		this.add(this.getBackButton());
	}
}
