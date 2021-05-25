/*

// Java Program to illustrate the 
// ArrayList toArray(T[]) method in Java 

import java.util.*; 

public class ToArray2
{ 
	public static void main(String[] args) 
	{ 

		ArrayList<Integer> ArrLis = new ArrayList<Integer>();  
		ArrLis.add(32); 
		ArrLis.add(67); 
		ArrLis.add(98); 
		ArrLis.add(100);  
		
		 
		Integer arr1[] = new Integer[ArrLis.size()];    //size 4
		
		
		arr1 = ArrLis.toArray(arr1); 
		
		for(int i : arr1) 
			System.out.println(i); 


		String s = Arrays.toString(arr1);
		System.out.println(s);

	} 
} 
*/




// Java Program to illustrate the 
// ArrayList toArray(T[]) method in Java 

import java.util.*; 

public class ToArray2
{ 
	public static void main(String[] args) 
	{ 

		ArrayList<Integer> ArrLis = new ArrayList<Integer>();  
		ArrLis.add(32); 
		ArrLis.add(67); 
		ArrLis.add(98); 
		ArrLis.add(100);  
		//System.out.println("ArrayList:"+ArrLis);
		 
		Integer arr[] = new Integer[ArrLis.size()];    //size 4
		Integer arr1[] = new Integer[ArrLis.size()];
		
		arr1 = ArrLis.toArray(arr); 
		
		for(int i : arr1) 
		
		System.out.println(i); 

	} 
} 
