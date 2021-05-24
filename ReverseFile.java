import java.io.FileReader;

public class ReverseFile 
{
	public static void main(String[] args) 
	{

	try {
		FileReader fr = new FileReader("ReverseFile.txt");
		String str = "ReverseFileExample";
		int ch;
            
		//reading characters in to string variable
		while ((ch = fr.read()) != -1) 
		{
		str += Character.toString((char) ch);
		}
		System.out.println("Original String : " + str);
            

		//converting string variable to String Builder object
		StringBuilder sb = new StringBuilder(str);
            

		//reversing the string and printing
		System.out.println("Reverse order : " + sb.reverse());
		fr.close();
		} 
		catch (Exception e) 
		{
			System.out.println("error");
		}
	}
}