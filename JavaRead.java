/*
import java.io.*;
class JavaRead
{
	public static void main(String alfred[])throws IOException
	{
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader b1 = new BufferedReader(in);
	int x = b1.read();
	char c =(char)x;
	System.out.println(c);
	}
	
}
*/
/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<CMD OUTPUT>>>>>>>>>>>>>>>>>>>>>>>
D:\JAVA PROGRAMS>java javaread.java
Q
Q
*/


/*
import java.io.*;
class JavaRead
{
	public static void main(String alfred[])throws IOException
	{
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader b1 = new BufferedReader(in);
	int c = b1.read();
	System.out.println(c);
	}
	
}
*/
/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<CMD OUTPUT>>>>>>>>>>>>>>>>>>>>>>>
D:\JAVA PROGRAMS>java javaread.java
Q
81
*/



/*
import java.io.*;
class JavaRead
{
	public static void main(String alfred[])throws IOException
	{
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader b1 = new BufferedReader(in);
	String s1 = b1.readLine();
	System.out.println(s1);
	}	
}
*/
/*
D:\JAVA PROGRAMS>java javaread.java
It reads the whole input which is given into the input
It reads the whole input which is given into the input
*/





/*
import java.io.*;
class JavaRead
{
	public static void main(String alfred[])throws IOException
	{
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader b1 = new BufferedReader(in);
	System.out.println("Enter a number:");
	String s1 = b1.readLine();
	int x = Integer.parseInt(s1);
	x++;
	System.out.println(x);
	}	
}
*/
/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<CMD OUTPUT>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
D:\JAVA PROGRAMS>java javaread.java
Enter a number:
456
457
*/




/*
import java.io.*;
class JavaRead
{
	public static void main(String alfred[])throws IOException
	{
	InputStreamReader in = new InputStreamReader(System.in);
	BufferedReader b1 = new BufferedReader(in);
	System.out.println("Enter a number:");
	String s1 = b1.readLine();
	Float x = Float.parseFloat(s1);
	x++;
	System.out.println(x);
	}	
}
*/
/*
<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<CMD OUTPUT>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
D:\JAVA PROGRAMS>java javaread.java
Enter a number:
23.5
24.5
*/