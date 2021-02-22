/*            PROGRAM 11              */

import java.util.Scanner;
class Concatenation
{
    public static void main(String aa[])
    {
        String s1,s2,s3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings:");
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = s1+s2;

        System.out.println("New String : "+s3);
    }
}