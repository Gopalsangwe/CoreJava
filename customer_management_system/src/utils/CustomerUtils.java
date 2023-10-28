package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.code.Customer;
import com.code.ServicePlan;



public class CustomerUtils {

	
	public static List<Customer> CustomerRecord(){
		
		List<Customer> customer=new ArrayList<>();
	    customer.add(new Customer("Gopal","Sangwe","gopalsangwe","123456",155000,LocalDate.parse("2001-04-22"),ServicePlan.DIAMOND));
	    customer.add(new Customer("Vishwa","Kukde","vishwakukde","456789",150000,LocalDate.parse("2000-04-15"),ServicePlan.PLATINUM));
	    customer.add(new Customer("Rohit","Bhuyar","rohitbhuyar","000000",10000,LocalDate.parse("2005-04-22"),ServicePlan.GOLD));
	    customer.add(new Customer("Sudarshan","upadhyay","sudarshan","111111",100000,LocalDate.parse("2010-04-22"),ServicePlan.SILVER));
	    customer.add(new Customer("Rohan","biradar","rohanbiradar","333333",120000,LocalDate.parse("2020-04-22"),ServicePlan.DIAMOND));
	    customer.add(new Customer("amit","ramteke","amitramteke","555555",140000,LocalDate.parse("2011-04-22"),ServicePlan.SILVER));
		return customer;
	}

	
	
}
