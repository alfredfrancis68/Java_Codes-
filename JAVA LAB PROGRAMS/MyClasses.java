/*              PROGRAM 9               */

import java.util.Scanner;
class MyClasses
{
    public static void main(String aa[])
    {
        AdditionalClass obj = new AdditionalClass();
        obj.read();
        obj.display(); 
    }    
}

class AdditionalClass
{
    int a,b;
    public void read()
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    public void display()
    {
        
        int sum = a+b;
        System.out.println("Sum of numbers :"+sum);
    }
}