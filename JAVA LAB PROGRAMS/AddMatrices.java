/*       PROGRAM 5       */

public class AddMatrices
{
    public static void main(String args[])
    {
        int i=0,j=0;
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{1,1,1},{1,1,1},{1,1,1}};
        int c[][] = new int[3][3];

        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                c[i][j] = a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
           System.out.println(); 
        }
    }
}

/*
OUTPUT:

C:\MyPrograms\JAVA PROGRAMS\LAB PROGRAMS>javac AddMatrices.java

C:\MyPrograms\JAVA PROGRAMS\LAB PROGRAMS>java AddMatrices.java
2
3
4
5
6
7
8
9
10

*/