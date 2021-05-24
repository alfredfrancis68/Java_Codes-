import java.io.*;
class FileReadCharacter
{
public static void main(String args[])throws IOException
	{
	FileReader fr = new FileReader("FileReadCharacter.txt");
	int i;
	while((i=fr.read())!=-1)
	System.out.print((char)i);
	fr.close();
	}
}