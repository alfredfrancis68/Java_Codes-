//Program for Reading from one text file and Writing into another text file.

//Reading Content From One File

import java.io.*;
class Rcfof      
{
public static void main(String args[])throws IOException
{
	FileInputStream fi = new FileInputStream("Rcfof.txt");
	int n;
	while((n=fi.read())!=-1)
	{
	System.out.print((char)n);
	}
	fi.close();


//Writing Content Into Another File

FileOutputStream fo = new FileOutputStream("Wciaf.txt");
String s1 = "Written into this text file while compiling";
byte b1[]=s1.getBytes();   //converting String into Byte array.
fo.write(b1);
fo.close(); 
}
}


//RCFOF= Reading Content From One File
//WCIAF= Writing Content Into Another File



