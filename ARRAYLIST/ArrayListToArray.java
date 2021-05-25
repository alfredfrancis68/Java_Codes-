//Collection as a group of Wrapper Class Objects or String Objects. 

import java.util.*;
class ArrayListToArray
{
public static void main(String aa[])
{
ArrayList<Integer> AL = new ArrayList<Integer>();

AL.add(10000);
AL.add(2000);
AL.add(00003047);
AL.add(4000);

System.out.println("Content of AL :"+AL);
Integer arr[] = new Integer[AL.size()];
arr = AL.toArray(arr);
int sum = 0;
for(int i:arr)
sum+=i;
System.out.println("Sum is :"+sum);
}
}