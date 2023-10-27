package com.code;

public enum Color {

	WHITE(5000),BLACK(10000),RED(15000),GREY(20000),RED_BLACK(30000);
	
	private double addCost;

	private Color(double addCost) {
		this.addCost = addCost;
	}

	public double getAddCost() {
		return addCost;
	}

	public void setAddCost(double addCost) {
		this.addCost = addCost;
	}
	
	
}
