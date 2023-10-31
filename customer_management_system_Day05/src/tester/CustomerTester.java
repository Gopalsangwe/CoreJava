package tester;


import static utils.CustomerValidation.ValidateAll;
import static utils.CustomerUtils.populateCustomer;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.ListIterator;
import java.util.Scanner;
import java.time.Period;

import com.iacsd.core.Customer;

import custom_exception.ValidateException;

import static utils.CustomerUtils.singinCustomer;
import static utils.CustomerUtils.changePassword;
import static utils.CustomerUtils.unsubscribeCustomer;
public class CustomerTester {
	public static ArrayList<Customer> mylist=new ArrayList<>();
	public static void main(String[] args) {
		
		try(Scanner sc=new Scanner(System.in)){        

			populateCustomer();
			boolean exit=false;
			 while(!exit){
				 System.out.println("1.Sign up 2.Display Information 3.Sign In "
				 		+ "4.Change Password 5.Unsubscribe Customer" 
				 		+" 6.Sort the List On Email 7.Sort as Per Date Of Birth "
				 		+ "8.Sort as per Date of Birth and Lastname "
				 		+ "9.Customer who have not paid Subscription for last 3 months"
				 		+"10.Customer who's subscription expired"
				 		+ " 0.Exit");
				 try {
				 //choice=sc.nextInt();
				 switch(sc.nextInt()) {
				 case 1:System.out.println("Enter Customer Details");
					      System.out.println("Enter firstName,lastName, email, password, regAmount, LocalDate dob,lastSubscriptionPaidDate ,sp");
				         Customer res=ValidateAll(sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next(),sc.next());
				         mylist.add(res);
				        break;
				 case 2:for(Customer c:mylist) {
					 System.out.println(c);
				     }
				 break;
				 case 3: 
					 System.out.println("Enter email and Password");
				              //String email=;
				              Customer c = singinCustomer(sc.next(),sc.next());
				              System.out.println("Logged In");
				              System.out.println(c);
				              break;
				 case 4: System.out.println("Enter email and password to Change Password");
				            changePassword(sc.next(),sc.next(),sc);
				         break;
				 case 5: System.out.println("Enter email to unsubscribe");
				         unsubscribeCustomer(sc.next());
				         System.out.println("Customer Unsubscribed");
				         break;
				 case 6:System.out.println("Sort The List");
				         Collections.sort(mylist);
				         break;
				 case 7:System.out.println("Sort on the basis of DOB"); 
					 Collections.sort(mylist,new Comparator<Customer>() {

					@Override
					public int compare(Customer o1, Customer o2) {
						// TODO Auto-generated method stub
						return o1.getDob().compareTo(o2.getDob());
					}
					 
				 });
				 break;
				 case 8:System.out.println("Sort on the basis of DOB and lastname");
				       Collections.sort(mylist,new Comparator<Customer>(){
                       
						@Override
						public int compare(Customer o1, Customer o2) {
							// TODO Auto-generated method stub
							int ret=o1.getDob().compareTo(o2.getDob());
							if(ret==0) {
								return o1.getLastName().compareTo(o2.getLastName());
							}
						return ret;
						}
				    	   
				       });
				       break;
				 case 9:System.out.println("Customer who have not paid Subscription for last 3 months");
				         for(Customer r: mylist) {
				        	 Period p=Period.between(r.getLastSubscriptionPaidDate(),r.getRegDate());
				        	 if(p.getMonths()>3 || p.getYears()>=1) {
				        		 System.out.println(r);
				        	 }
				         }
				         break;
				 case 10:System.out.println("Customer who have not paid Subscription for last 6 months");
				 ListIterator<Customer> l=mylist.listIterator();
				 while(l.hasNext()) {
					 Customer r=l.next();
					 
			        	 Period p=Period.between(r.getLastSubscriptionPaidDate(),r.getRegDate());
			        	 if(p.getMonths()>6 || p.getYears()>=1) {
			        		 System.out.println(r);
			        		 
			        		 mylist.remove(r);
			        		 System.out.println("you are removed");
			        
			         }
				 }
				  break;
				 case 0:exit=true;
				          break;
				 default :
					 System.out.println("Invalid");
					 break;
				 }
				 }catch(Exception e) {
					 sc.nextLine();
					 System.out.println(e);
					 e.getMessage();
					 e.getStackTrace();
				 }
				 
			 }

		}
	}



}
