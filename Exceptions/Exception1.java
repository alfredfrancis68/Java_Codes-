class Exception1
{
public static void main(String args[])
{
	int d=0;
	int a=0;
	int f=1;
	try
	{
		a=40/d;
		System.out.println("This won't be printed!!!!");
	}
	catch(ArithmeticException e1) 
	{
		System.out.println("Division by Zero not defined...");
		System.out.println(e1);
	}
	System.out.println(a);
}
}




/*
class Exception1
{
public static void main(String args[])
{
	int d=0;
	int a=0;
	try
	{
		a=40/d;
	}
	catch(ArithmeticException e1) 
	{
		System.out.println("Division by Zero not defined...");
	}
	System.out.println(a);
}
}
*/

