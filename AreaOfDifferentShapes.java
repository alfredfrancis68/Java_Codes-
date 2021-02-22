/*           PROGRAM 8            */

import java.util.Scanner;
public class AreaOfDifferentShapes 
{
    public static void main(String aa[])
    {
        int l,b;
        double r,h;
        float q;

        System.out.println("Enter radius of the Circle:");
        Scanner s = new Scanner(System.in);
        r=s.nextDouble();

        System.out.println("Enter the height and Base of Triangle:");
        h=s.nextDouble();
        q=s.nextFloat();

        System.out.println("Enter the length and breadth of the Rectangle:");
        l=s.nextInt();
        b=s.nextInt();

        System.out.println("Area of circle :"+Circle(r,3.14));
        System.out.println("Area of Triangle :"+Triangle(h,q));
        System.out.println("Area of Rectangle :"+Rectangle(l,b));
    }    
    public static double Circle(double a,double pi)
    {
        double ar = pi*a*a;
        return ar;
    }
    public static double Triangle(double h,float q)
    {
        double ar = h*q/2;
        return ar;
    }
    public static int Rectangle(int l,int b)
    {
        int ar = l*b;
        return ar;
    }
}

/*
OUTPUT:

Enter radius of the Circle.
3
Enter the height and Base of Triangle.
5
2
Enter the length and breadth of the Rectangle.
8
2
Area of circle28.259999999999998
Area of Triangle5.0
Area of Rectangle16

*/