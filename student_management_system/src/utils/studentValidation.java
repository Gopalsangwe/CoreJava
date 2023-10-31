package utils;

import com.code.student.Course;
import com.code.student.Student;

import custom_exception.InvaliInputException;

public class studentValidation {
	
	
    public static 

	public static Student validateAllInputs(int rollno,String firstname,String lastname,double percentage,int fees,Course CDAC) throws InvaliInputException
	{	
 	return new Student(rollno,firstname,lastname,percentage,fees,CDAC);
   }
}