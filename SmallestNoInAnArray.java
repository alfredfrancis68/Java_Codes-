/*       PROGRAM 2      */

import java.util.Scanner;
public class SmallestNoInAnArray
{
    public static void main(String args[])
    {
        int small,size,i;
        int arr[] = new int[50];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        size = sc.nextInt();
        System.out.println("Enter the Array Elements :");
        for(i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        small = arr[0];
        for(i=0;i<size;i++)
        {
            if(small>arr[i])
            {
                small=arr[i];
            }
        }
        System.out.println("The Smallest Element is :"+small);
    }
}

/*

OUTPUT:

Enter array size :
2
Enter the Array Elements :
23
34
The Smallest Element is :23
*/