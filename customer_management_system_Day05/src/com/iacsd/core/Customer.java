package com.iacsd.core;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
  private static int customerIdG;
  private String firstName,LastName,Email,Password;
  private double regAmount;
  private LocalDate dob;
  private ServicePlan sp;
  private int customerId;
  private LocalDate lastSubscriptionPaidDate ;
  private LocalDate regDate;
  static {
	  customerIdG=1;
  }
public Customer(String firstName, String lastName, String Email, String password, double regAmount,
		LocalDate dob,LocalDate lastSubscriptionPaidDate ,
		ServicePlan sp) {
	
	this.firstName = firstName;
	LastName = lastName;
	this.Email = Email;
	Password = password;
	this.regAmount = regAmount;
	this.dob = dob;
	this.sp = sp;
	this.lastSubscriptionPaidDate=lastSubscriptionPaidDate;
	regDate=LocalDate.now();
	this.customerId=customerIdG;
	customerIdG++;
}
public Customer(String Email) {
	super();
  this.Email=Email;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public double getRegAmount() {
	return regAmount;
}
public void setRegAmount(double regAmount) {
	this.regAmount = regAmount;
}
public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public ServicePlan getSp() {
	return sp;
}
public void setSp(ServicePlan sp) {
	this.sp = sp;
}
public int getCustomerId() {
	return customerId;
}



@Override
public String toString() {
	return "Customer [firstName=" + firstName + ", LastName=" + LastName + ", Email=" + Email + ", Password=" + Password
			+ ", regAmount=" + regAmount + ", dob=" + dob + ", sp=" + sp + ", customerId=" + customerId
			+ ", lastSubscriptionPaidDate=" + lastSubscriptionPaidDate + ", regDate=" + regDate + "]";
}
public LocalDate getLastSubscriptionPaidDate() {
	return lastSubscriptionPaidDate;
}
public void setLastSubscriptionPaidDate(LocalDate lastSubscriptionPaidDate) {
	this.lastSubscriptionPaidDate = lastSubscriptionPaidDate;
}
public LocalDate getRegDate() {
	return regDate;
}
public void setRegDate(LocalDate regDate) {
	this.regDate = regDate;
}
public boolean equals(Object anObject) {
	if(anObject instanceof Customer) {
		Customer c=(Customer)anObject;
	   return this.Email.equals(c.Email);
			
	}
	return false;
}
@Override
public int compareTo(Customer o) {

	return this.Email.compareTo(o.Email);
}
  
}
