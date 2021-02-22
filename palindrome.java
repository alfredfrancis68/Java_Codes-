/*      PROGRAM 3        */ 

import java.util.Scanner;
public class palindrome 
{
    public static void main(String args[])
    {
        String original,rev="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        original = sc.nextLine();
        int length = original.length();
        for(int i=length-1;i>=0;i--)
            rev = rev+original.charAt(i);
            if(original.equalsIgnoreCase(rev)) 
                System.out.println(original+" is a Palindrome");
            else    
                System.out.println(original+" is not a Palindrome");
    }
}

/*
import java.util.Scanner;
public class palindrome 
{
    public static void main(String args[])
    {
        String str,rev="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        str = sc.nextLine();
        int length = str.length();
        for(int i=length-1;i>=0;i--)
            rev = rev+str.charAt(i);
            if(str.equals(rev))
                System.out.println(str+" is a Palindrome");
            else    
                System.out.println(str+" is not a Palindrome");
    }
}



OUTPUT:

Enter the String
mom
mom is a Palindrome
*/

