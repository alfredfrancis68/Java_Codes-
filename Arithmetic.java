/*            PROGRAM 10               */


public class Arithmetic 
{
    public static void main(String args[])
    {
        add obj1 = new add(10,5);
        obj1.sum();

        sub obj2 = new sub(10,5);
        obj2.sum();

        div obj3 = new div(10,5);
        obj3.sum();

        multi obj4 = new multi(10,5);
        obj4.sum();
    }    
}

class add
{
    int x,y;
    add(int xx,int yy)
    {
        x=xx;
        y=yy;
    }
    void sum()
    {
        System.out.println(x+y);
    }
}

class sub
{
    int x,y;
    sub(int xx,int yy)
    {
        x=xx;
        y=yy;
    }
    void sum()
    {
        System.out.println(x-y);
    }
}

class div
{
    int x,y;
    div(int xx,int yy)
    {
        x=xx;
        y=yy;
    }
    void sum()
    {
        System.out.println(x/y);
    }
}

class multi{
    int x,y;
    multi(int xx,int yy)
    {
        x=xx;
        y=yy;
    }
    void sum()
    {
        System.out.println(x*y);
    }
}

/*
OUTPUT:

C:\MyPrograms\JAVA PROGRAMS\LAB PROGRAMS>java Arithmetic.java
15
5
2
50
*/