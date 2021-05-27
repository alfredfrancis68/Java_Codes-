/*class CommandLine
{
public static void main(String args[])
	{
	int n=args.length;      
	System.out.println("Number of commandline arguments ="+n);
	//for(i=0;i<n;i++)
	//System.out.println(args[i]);
	}	
}
*/

 

class CommandLine
{
public static void main(String args[])
	{
	int n=args.length;      //Number of commandline arguments
	System.out.println("Number of commandline arguments ="+n);
	for(int i=0;i<n;i++)
	System.out.println(args[i]);
	}	
}

/*
<<<<<<<<<<<<<<<<<<<<<<<<<<COMMAND LINE OUTPUT>>>>>>>>>>>>>>>>>>>>>>>>>

D:\JAVA PROGRAMS\Exceptions>java CommandLine.java alfred francis beena aleena austin
Number of commandline arguments =5
alfred
francis
beena
aleena
austin
*/