package utils;

import static tester.CustomerTester.mylist;

import java.time.LocalDate;
import java.util.Scanner;

import com.iacsd.core.Customer;
import com.iacsd.core.ServicePlan;

import custom_exception.ValidateException;

public class CustomerUtils {
	  public static Customer singinCustomer(String email,String pass) throws ValidateException {
	       Customer c=new Customer(email);
	       if(mylist.indexOf(c)!=-1) {
	    	   int index=mylist.indexOf(c);
	    	   Customer v=mylist.get(index);
	    	   if(pass.equals(v.getPassword())) {
	    		   return v;
	    	   }
	    	   
	       }
     throw new ValidateException("Email or Password Wrong...");
 }
	  public static void changePassword(String email,String pass,Scanner sc) throws ValidateException {
		   Customer c=new Customer(email);
	       if(mylist.indexOf(c)!=-1) {
	    	   int index=mylist.indexOf(c);
	    	   Customer v=mylist.get(index);
	    	   if(pass.equals(v.getPassword())) {
	    		   System.out.println("Enter New Password");
	    		   v.setPassword(sc.next());
	    		   System.out.println("Password Changed");
	    		   return;
	    	   }
	    	   
	       }
	  throw new ValidateException("Email or Password Wrong ...");
	  }
	  public static void unsubscribeCustomer(String email) throws ValidateException {
		  Customer c=new Customer(email);
		  if(mylist.contains(c)) {
			  int index=mylist.indexOf(c);
			  Customer robj=mylist.get(index);
			  mylist.remove(robj);
			  System.out.println("removed Successfully");
			  return;
		  }
		  throw new ValidateException("User Not Found");
	  }
	  public static void populateCustomer() {
		  mylist.add(new Customer("Gopal","Sangwe","gopalsangwe15@gmail.com","gopigs",10000,LocalDate.parse("2001-03-15"),LocalDate.parse("2023-09-08"),ServicePlan.PLATINUM));
		  mylist.add(new Customer("Shreyash","Kohale","kohaleshreyash@gmail.com","shreyash123",5000,LocalDate.parse("2001-03-20"),LocalDate.parse("2023-08-12"),ServicePlan.DIAMOND));
		  mylist.add(new Customer("Vishwa","Kukde","vishwakukde@gmail.com","piu123",2000,LocalDate.parse("2000-05-25"),LocalDate.parse("2023-05-01"),ServicePlan.GOLD));
		  mylist.add(new Customer("Rohit","Bhuyar","Bhuyarrohit@gmail.com","rohit123",1000,LocalDate.parse("2000-08-20"),LocalDate.parse("2023-03-20"),ServicePlan.SILVER));
		  mylist.add(new Customer("Sudarshan","Upadhayay","sudarshanupadhyay@gmail.com","sudarshan123",10000,LocalDate.parse("1996-12-29"),LocalDate.parse("2023-05-09"),ServicePlan.PLATINUM));
	  }
}
