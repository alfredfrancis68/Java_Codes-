class MultiException
{
public static void main(String alfred[])
{
	try
	{
	int n="args.length";
	System.out.println("Number of commandline arguments="+n);
	int b=10/n;
	int a[] ={100};
	a[n]=200;
	}
catch(ArithmeticException e)
{
	System.out.println("Divide by 0");
}
catch(ArrayOutOfBoundsException e)
{
	System.out.println("Array Out Of Bounds Exception");
}
	System.out.println("After try/catch blocks.");
}
}