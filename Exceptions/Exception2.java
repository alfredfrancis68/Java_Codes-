class Exception2
{
	public static void main(String args[])
	{
		int d=0;
		int a=0;
		int b=100;
		try
		{
		a=b/d;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by zero error.plz enter non-zero number!!!");
		}
		System.out.println("CODE EXECUTION!!!!!!");
	}
}