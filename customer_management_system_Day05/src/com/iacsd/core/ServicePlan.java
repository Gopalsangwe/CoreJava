package com.iacsd.core;

public enum ServicePlan {
     SILVER(1000),GOLD(2000),DIAMOND(5000),PLATINUM(10000);
     private double servicePlanAmount;
	private ServicePlan(double servicePlanAmount){
		  this.servicePlanAmount=servicePlanAmount;
	}
	public double getServicePlanAmount() {
		return servicePlanAmount;
	}
	public void setServicePlanAmount(double servicePlanAmount) {
		this.servicePlanAmount = servicePlanAmount;
	}
}
