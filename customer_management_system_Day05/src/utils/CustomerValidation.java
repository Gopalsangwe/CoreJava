package utils;

import java.time.LocalDate;


import com.iacsd.core.Customer;
import com.iacsd.core.ServicePlan;
import static tester.CustomerTester.mylist;
import custom_exception.ValidateException;

public class CustomerValidation {
  //public static String EmailValidate();
  public static ServicePlan ValidatePlan(String plan) throws IllegalArgumentException{
	  return ServicePlan.valueOf(plan.toUpperCase());
  }
  public static double ValidateAmount(ServicePlan sp,double amount) throws ValidateException {
	 if(sp.getServicePlanAmount()!=amount)
	 {
		 throw new ValidateException("Plan amount is not Correct");
	 }
	 return amount;

  }

  public static String ValidateEmail(String email) throws ValidateException {
	  System.out.println("Checking");
	  String pattern="[a-z]+[a-z0-9]+@[a-z]*\\.(com|org|net)";
	  if(!email.matches(pattern))
		 throw new ValidateException("Email Invalid");
	  
		  Customer v=new Customer(email);
		  if(mylist.contains(v)) {
			throw new ValidateException("Duplicate Email Already Exist");
	  }
		  return email;
	
  }



  public static Customer ValidateAll(String firstname,String lastname,String email,String password,double regAmount,
		  String date,String subDate,String sp)throws ValidateException, IllegalArgumentException {
	  String vemail=ValidateEmail(email);
	  LocalDate dobDate=LocalDate.parse(date);
	  ServicePlan serplan=ValidatePlan(sp);
	  LocalDate sDate=LocalDate.parse(subDate);
	  double amounnt=ValidateAmount(serplan,regAmount);


	  return new Customer(firstname,lastname,vemail,password,amounnt,dobDate,sDate,serplan);
	  
  }

  
  
  
}
