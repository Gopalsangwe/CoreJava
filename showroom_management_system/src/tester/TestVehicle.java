package tester;

import java.util.Scanner;

import com.code.Vehicle;

import static utils.VehicleValidation.validateAll;

public class TestVehicle {

	public static void main(String[] args) {
		
		
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter Vehicle Details : chasisNo Color Price ManuFactureDate Company ");
			
			Vehicle veh = validateAll (sc.next(),sc.next(),sc.nextDouble(),sc.next(),sc.next());
			
			System.out.println(veh);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}


}
