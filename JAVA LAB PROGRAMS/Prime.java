/*          PROGRAM 7          */

import java.util.Scanner;
class Prime
{
   public static void main(String args[])
   {		
	int temp;
	boolean isPrime=true;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");
	//capture the input in an integer
	int num=scan.nextInt();
        scan.close();
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	//If isPrime is true then the number is prime else not
	if(isPrime) 
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}

/*
import java.util.Scanner;
public class Prime
{
    public static void main(String aa[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = s.nextInt();
        if(isPrime(n))
        {
            System.out.println(n+" is a Prime Number.");
        }
        else
        {
            System.out.println(n+" is not a Prime Number.");
        }
    }
}

public static boolean isPrime(int n)
{
    if(n<=1)
    {
        return false;
    }
    for(int i= 2;i<Math.sqrt(n);i++)
    {
        if(n%i==0)
            return false;
        else
            return true;
    }
}
*/


