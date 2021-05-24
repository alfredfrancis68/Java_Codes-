/*
import java.io.*;
class FileWriteByte
{
public static void main(String args[])throws IOException
{
FileOutputStream fo = new FileOutputStream("FileWriteByte.txt");
String s1 = "God loves you";
byte b1[]=s1.getBytes();   //converting String into Byte array.
fo.write(b1);
fo.close(); 
}
}
*/



import java.io.*;
class FileWriteByte
{
public static void main(String args[])throws IOException
{
InputStreamReader in = new InputStreamReader(System.in);
BufferedReader b1 = new BufferedReader(in);
FileOutputStream fo = new FileOutputStream("FileWriteByte2.txt");
System.out.print("Enter Some String :");
String s1 = b1.readLine();
byte b2[]=s1.getBytes();   //converting String into Byte array.
fo.write(b2);
fo.close(); 
}
}
*/

