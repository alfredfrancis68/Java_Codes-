import java.io.*;
public class ExceptionHandling
{
public static void main(String args[])
{
try
{
	ExceptionHandling eh = new ExceptionHandling("Exceptionhandling.txt");
	fw.write("Welcome to javaTPoint.");	
	fw.close();
}
catch(Exception e)
	{
		System.out.print(e);
	}
		System.out.print("Success :)");
}
}