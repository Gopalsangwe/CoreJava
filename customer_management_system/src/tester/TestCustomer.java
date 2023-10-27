package tester;

import java.util.Scanner;

import com.code.Customer;
import com.code.ServicePlan;

import static utils.customerValidation.validateAllInputs;

public class TestCustomer {
	
	public static void main(String[] args) {
		
		System.out.println("TestCustomer Class");
		
         try(Scanner sc=new Scanner(System.in)){
        	 
        	 System.out.println("Enter Customer Details : firstname ,lastname ,email , password,registrationAmount,dob,Service plan");
        	 Customer cust = validateAllInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
        	 System.out.println(cust);
        	 
        	 System.out.println("Enter Customer Details : firstname ,lastname ,email , password,registrationAmount,dob,Service plan");
        	 Customer cust2 = validateAllInputs(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
        	 System.out.println(cust2);
         }
         catch (Exception e) {
        	 System.out.println(e);
        	 e.printStackTrace();
         }
		
		
		
	}



	


	

}
