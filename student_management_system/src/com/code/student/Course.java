package com.code.student;

public enum Course {
	
	DAC(90000),DBDA(115000),DITISS(80000);

	private int amount;
	
	Course(int amount) {
	  this.amount=amount;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
//	public String toString()

	
	
	
	
}
