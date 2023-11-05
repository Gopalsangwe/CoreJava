package utils;

import java.time.LocalDate;

import com.code.core.Customer;
import com.code.core.Plan;
import custom_exception.InvalidInput;

public class customerValidation {
    
//	private int customerId;
//	private String firstname;
//	private String lastname;
//	private String email;
//	private String password;
//	private String Address;
//	private LocalDate RegisterDate;
//	private LocalDate planEndDate;
//	private String Phoneno;
//	private Plan plan;
//	private double final_amount;
//	private static int custcounter;
	
	public static LocalDate parseDate1(String date) throws InvalidInput 
	{
		LocalDate RegisterDate=LocalDate.parse(date);
		return RegisterDate;
		
	}
	public static LocalDate parseDate(String date) throws InvalidInput 
	{
		LocalDate planEndDate=LocalDate.parse(date);
		return planEndDate;
		
	}
	
	public static Plan validatePlan(String plan) throws IllegalArgumentException
	{
		return Plan.valueOf(plan.toUpperCase());
	}

	public static Customer validateAllInputs(String firstname,String lastname,String email,String password,
			String Address,String RegisterDate,String planEndDate,String phoneno,String plan,double final_amount) throws InvalidInput
	{
		LocalDate date1=parseDate(RegisterDate);
		LocalDate date=parseDate(planEndDate);
		Plan vplan= validatePlan(plan);
		return new Customer(firstname,lastname,email,password,Address,date1,date,phoneno,vplan,final_amount);
	}
	
}
