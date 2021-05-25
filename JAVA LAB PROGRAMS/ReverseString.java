/*      PROGRAM 1        */
import java.util.Scanner;
class ReverseString 
{
    public static void main(String arr[])
    {
        String str,rev="";
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the String");
        str=s.nextLine();
        int length = str.length();
        for(int i = length-1;i>=0;i--)
        rev = rev + str.charAt(i);
        System.out.println("Reverse of a String is :"+rev);
    }
}
/*
OUTPUT:

Enter the String
qwerty
Reverse of a String is :ytrewq
*/