package com.code.core;

public enum Plan {

	MONTHLY (3000), QUARTERLY(11700), HALFYEAR(17500),YEARLY(32000);

	private double fee;
	Plan(double fee) {
		this.fee=fee;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
}
