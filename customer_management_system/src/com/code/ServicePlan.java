package com.code;


//2. ServicePlan : enum
//ServicePlan charges : 
//SILVER : 1000 
//GOLD : 2000
//DIAMOND : 5000
//PLATINUM : 10000

public enum ServicePlan {
  
	SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);

	private int charges;
	private ServicePlan(int charges) {
		
	this.charges=charges;	
		
	}
	public int getCharges() {
		return charges;
	}
	
	
	@Override
	public String toString()
	{
		return name().toLowerCase()+" charages "+charges;
	}
	
	
		
}
