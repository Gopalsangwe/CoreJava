package com.code;

import java.time.LocalDate;


public class Vehicle {
  private String chasisNo;
  private Color color; 
  private double basePrice;
  private LocalDate manuFactureDate;
  private String company;
  private boolean isAvailable;
    
  
    public Vehicle(String chasisNo, Color color, double basePrice, LocalDate manuFactureDate, String company) {
	super();
	this.chasisNo = chasisNo;
	this.color = color;
	this.basePrice = basePrice;
	this.manuFactureDate = manuFactureDate;
	this.company = company;
	this.isAvailable = true;
}


	@Override
	public String toString() {
		return "Vehicle [chasisNo=" + chasisNo + ", color=" + color + ", basePrice=" + basePrice + ", manuFactureDate="
				+ manuFactureDate + ", company=" + company + ", isAvailable=" + isAvailable + "]";
	}
  
  
}
