package utils;

import java.time.LocalDate;

import com.code.Customer;
import com.code.ServicePlan;

import custom_exception.InvalidException;
import custom_exceptions.InvalidInputException;

public class customerValidation {
	

public static ServicePlan parseAndValidatePlan(String plan) throws IllegalArgumentException
{
	return ServicePlan.valueOf(plan.toUpperCase());
}

public static void checkPlanAmount(ServicePlan plan,double price) throws InvalidException{
	
	if(plan.getCharges()!=price) {
		throw new InvalidException("price is not matching with given plan");
	} 
	//return price;
}




}


////add a method to validate reg amount with the plan
//	public static void validatePlanAmount(ServicePlan plan, double regAmount) throws InvalidInputException {
//		if (plan.getPlanCost() != regAmount)
//			throw new InvalidInputException("Reg amount doesn't match with the plan !!!!!");
//
//	}
//
//	public static LocalDate parseDate(String date) {
//		return LocalDate.parse(date);
//	}
//
//	// add a method to call validation rules
//	public static Customer validateAllInputs(String firstName, String lastName, String email, String password,
//			double regAmount, String dob, String plan) throws InvalidInputException {
//		ServicePlan validatedPlan = parseAndValidatePlan(plan);
//		validatePlanAmount(validatedPlan, regAmount);
//		LocalDate date = parseDate(dob);
//		return new Customer(firstName, lastName, email, password, regAmount, date, validatedPlan);
//	}

