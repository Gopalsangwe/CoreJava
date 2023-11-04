package com.code.core;

import java.time.LocalDate;

public class Customer {

	private int customerId;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private String Address;
	private LocalDate RegisterDate;
	private LocalDate planEndDate;
	private String Phoneno;
	private Plan plan;
	private double final_amount;
	private static int custcounter;
	
	static {
		custcounter=1;
		
	}
	

	public Customer (String firstname, String lastname, String email, String password, String address,
			LocalDate registerDate, LocalDate planEndDate, String phoneno, Plan plan, double final_amount) {
		super();
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		Address = address;
		RegisterDate = registerDate;
		this.planEndDate = planEndDate;
		Phoneno = phoneno;
		this.plan = plan;
		this.final_amount = final_amount;
		this.customerId = custcounter;
		custcounter++;
	}




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







	public String getAddress() {
		return Address;
	}







	public void setAddress(String address) {
		Address = address;
	}







	public LocalDate getRegisterDate() {
		return RegisterDate;
	}







	public void setRegisterDate(LocalDate registerDate) {
		RegisterDate = registerDate;
	}







	public LocalDate getPlanEndDate() {
		return planEndDate;
	}







	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}







	public String getPhoneno() {
		return Phoneno;
	}







	public void setPhoneno(String phoneno) {
		Phoneno = phoneno;
	}







	public Plan getPlan() {
		return plan;
	}







	public void setPlan(Plan plan) {
		this.plan = plan;
	}







	public double getFinal_amount() {
		return final_amount;
	}







	public void setFinal_amount(double final_amount) {
		this.final_amount = final_amount;
	}







	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", password=" + password + ", Address=" + Address + ", RegisterDate=" + RegisterDate
				+ ", planEndDate=" + planEndDate + ", Phoneno=" + Phoneno + ", plan=" + plan + ", final_amount="
				+ final_amount + "]";
	}
	
	
	
	
	
}


