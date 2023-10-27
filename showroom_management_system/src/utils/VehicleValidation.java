package utils;

import java.time.LocalDate;

import com.code.Color;
import com.code.Vehicle;

import Custome_Exception.InvalidInputException;

public class VehicleValidation {
	
//	Vehicle color must be valid

	public static Color ValidateColor(String clr) 
	{
		return Color.valueOf(clr.toUpperCase());
	}
	
	public static LocalDate parseDate(String date) throws InvalidInputException
	{
		LocalDate manuFactureDate = LocalDate.parse(date);
		
		LocalDate CheckDate=LocalDate.of(2021, 1, 1) ;
		
		if(manuFactureDate.isBefore(CheckDate))
		{
			throw new InvalidInputException("manuFactureDate must be after Jan 2021");
		}
		return manuFactureDate;
		
	
		
	}
	public static Vehicle validateAll(String chasisNo,String color,double basePrice,String manuFactureDate,String company ) throws InvalidInputException
	{
		Color clr = ValidateColor(color);
		LocalDate Date= parseDate(manuFactureDate);
		return new Vehicle(chasisNo,clr,basePrice,Date,company);
	}

}
