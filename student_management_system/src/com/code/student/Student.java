package com.code.student;

public class Student {
	
	private int rollno;
	private String firstname;
	private String lastname;
	private double percentage;
	private int fees;
	private Course CDAC;
	
	
	public Student(int rollno, String firstname, String lastname, double percentage, int fees, Course cDAC) {
		super();
		this.rollno = rollno;
		this.firstname = firstname;
		this.lastname = lastname;
		this.percentage = percentage;
		this.fees = fees;
		CDAC = cDAC;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
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
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public Course getCDAC() {
		return CDAC;
	}
	public void setCDAC(Course cDAC) {
		CDAC = cDAC;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", firstname=" + firstname + ", lastname=" + lastname + ", percentage="
				+ percentage + ", fees=" + fees + ", CDAC=" + CDAC + "]";
	}
	
	
	

}
