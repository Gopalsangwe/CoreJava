package utils;

import java.time.LocalDate;

//import java.time.LocalDate;

import com.code.Customer;
import com.code.ServicePlan;

import custom_exception.InvalidException;



public class customerValidation {
	

public static ServicePlan parseAndValidatePlan(String plan) throws IllegalArgumentException
{
	return ServicePlan.valueOf(plan.toUpperCase());
}

//add a method to validate reg amount with the plan
public static void validatePlanAmount(ServicePlan plan, double registrationAmount) throws InvalidException {
	if (plan. getCharges() != registrationAmount)
		throw new InvalidException("Reg amount doesn't match with the plan !!!!!");

}

public static LocalDate parseDate(String date) {
	return LocalDate.parse(date);
}

public static Customer validateAllInputs(String firstName, String lastName, String email, String password,
		double registrationAmount, String dob, String plan) throws InvalidException {
	ServicePlan validatedPlan = parseAndValidatePlan(plan);
	validatePlanAmount(validatedPlan, registrationAmount);
	LocalDate date = parseDate(dob);
	return new Customer(firstName, lastName, email, password, registrationAmount, date, validatedPlan);
}


}


