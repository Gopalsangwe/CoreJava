package lists;

import java.util.ArrayList;
//import java.util.Collections; 
import java.util.Collections;

public class IntList {

	public static void main(String[] args) {
		
		int[] data= {1,2,13,-20,45,10,12,100,10,20};
         
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println("ArrayList contents");
		
		for(int i:list)
			System.out.println(i);
		
		for(int i:data)
			list.add(i);
			System.out.println("list via toString" + list);
			
		for(int i:list)
			System.out.println(i+" ");
		
		list.add(0,99);
		System.out.println("again"+list);
		
		System.out.println(list.contains(10));
		
		Collections.sort(list);
		System.out.println("sorted"+list);
	}

}
