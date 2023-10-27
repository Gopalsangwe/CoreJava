package utils;

import java.time.LocalDate;

import com.code.Customer;
import com.code.ServicePlan;

import custom_exception.InvalidException;

public class customerValidation {
	

public static ServicePlan parseAndValidatePlan(String plan) throws IllegalArgumentException
{
	return ServicePlan.valueOf(plan.toUpperCase());
}

public static double checkPlanAmount(ServicePlan plan,double price) throws InvalidException{
	
	if(plan.getCharges()!=price) {
		throw new InvalidException("price is not matching with given plan");
	} 
	return price;
}



//public static Customer validateAll(String firstname,String lastname,String email,String password,double registrationAmount,String plan,String dob1) throws InvalidException
//{
//ServicePlan sp2= parseAndValidatePlan(plan);
//	
//LocalDate d1=LocalDate.parse(dob1);
//double registrationAmount1=checkPlanAmount(sp2,registrationAmount1);
//return new Customer(firstname,lastname,email,registrationAmount1,sp2,d1);
//}


}
