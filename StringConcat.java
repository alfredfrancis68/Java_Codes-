/*                PROGRAM 11              */

public class StringConcat 
{
    public static void main(String args[])throws IndexOutOfBoundsException
    {
        System.out.println("Enter first name :"+args[0]);
        System.out.println("Enter the last name :"+args[1]);
        System.out.println("Enter another name :"+args[2]);
        System.out.println("The entered name is :"+(args[0]+" "+args[1]+" "+args[2]));
    }
}

/*
public class StringConcat 
{
    public static void main(String args[])
    {
        System.out.println("Enter first name :"+args[0]);
        System.out.println("Enter the last name :"+args[1]);
        System.out.println("The entered name is :"+args[0].concat(args[1]));
    }
}
*/