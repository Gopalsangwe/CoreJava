package tester;

import java.util.List;
import java.util.Scanner;

import static utils.CustomerUtils.*;
import com.code.Customer;

public class TestCustomer {
	
	public static void main(String[] args) {
		
		System.out.println("TestCustomer Class");
		
         try(Scanner sc=new Scanner(System.in)){
        	 
        	 List<Customer> Display=CustomerRecord();
        	 
        	 boolean exit=false;
        	 
        	 while(!exit) {
        		 
        		 System.out.println("Options : 1.Add Customer \n" + "2.Show All Customers \n" + "3.Exit \n");
        		 
        	      switch(sc.nextInt()) {
        	      
        	      case 1:
        	    	  System.out.println("Add Customer");
        	    	  break;
        	      case 2:
        	    	  System.out.println("Showing All Customers");
        	    	  for(Customer c: Display) {
        	    		  System.out.println(c);
        	    	  }
        	    	  break;
        	      case 3:
        	    	  break;
        	      }	 
        	 
        	 }
        	 
         	
//        	 System.out.println("Enter Customer Details : firstname ,lastname ,email , password,registrationAmount,dob,Service plan");
//        	 Customer cust = validateAllInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
//        	 System.out.println(cust);
//        	 
//        	 System.out.println("Enter Customer Details : firstname ,lastname ,email , password,registrationAmount,dob,Service plan");
//        	 Customer cust2 = validateAllInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
//        	 System.out.println(cust2);
         }
         
         
         
         
         catch (Exception e) {
        	 System.out.println(e);
        	 e.printStackTrace();
         }
		
		
		
	}



	


	

}
