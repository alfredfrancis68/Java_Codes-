// Java Program to illustrate the 
// ArrayList toArray() method in Java -Non parameterized method

import java.util.*; 

public class ToArray1 
{ 
	public static void main(String[] args) 
	{ 
		ArrayList<Integer> ArrLis = new ArrayList<Integer>();  
		ArrLis.add(32); 
		ArrLis.add(67); 
		ArrLis.add(98); 
		ArrLis.add(100);
		System.out.println(ArrLis);    

		Object arr[] = ArrLis.toArray(); 

		String s=Arrays.toString(arr);
		System.out.println(s);
		
	} 
} 
