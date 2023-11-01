package tester;

import java.util.ArrayList;

import com.app.core.Student;

import static utils.StudentCollectionUtils.*;

public class Test1 {

	public static ArrayList<Student> studlist = new ArrayList<>();

	public static void main(String[] args) {

		for (Student s : studlist) {
			System.out.println(s);
		}
	}
}
