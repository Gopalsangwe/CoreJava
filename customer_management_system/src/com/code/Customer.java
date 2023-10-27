package com.code;

import java.time.LocalDate;

public class Customer {
	
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private double registrationAmount;
	private LocalDate dob;
	private ServicePlan plan;
	private static int customerCount;
	
	static {
		customerCount=1;
	}

	public Customer( String firstname, String lastname, String email, String password,double registrationAmount, LocalDate dob,
			ServicePlan plan) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.registrationAmount=registrationAmount;
		this.dob = dob;
		this.plan = plan;
		this.id=customerCount++;
	}
	
	

//	public Customer(String firstname2, String lastname2, String email2, double registrationAmount2, ServicePlan sp2,
//			LocalDate d1) {
//	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public LocalDate getDob() {
		return dob;
	}



	public void setDob(LocalDate dob) {
		this.dob = dob;
	}



	public ServicePlan getPlan() {
		return plan;
	}



	public void setPlan(ServicePlan plan) {
		this.plan = plan;
	}



	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", registrationAmount=" + registrationAmount + ", dob=" + dob + ", plan=" + plan + "]";
	}
	
	@Override
	 public boolean equals(Object anotherObj) 
	 {
		System.out.println("in costomer eq");
		
		if(anotherObj instanceof Customer)
			return this.email.equals(((Customer)anotherObj).email);
		return false;
	 }	

}
