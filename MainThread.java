/*          PROGRAM 12           */
/*ArithmeticThread */
/*MainThread       */
public class MainThread 
{
    public static void main(String aa[])
    {
        ArithmeticThread t1 = new ArithmeticThread("add",30,70);
        ArithmeticThread t2 = new ArithmeticThread("sub",80,10);
        t1.start();
        t2.start();
    }    
}
class ArithmeticThread extends Thread
{
    int a,b;
    ArithmeticThread(String s,int a,int b)
    {
        super(s);
        this.a=a;
        this.b=b;
    }
    void add()
    {
        System.out.println("Sum is :"+(a+b));
    }
    void sub()
    {
        System.out.println("Difference is :"+(a-b));
    }
    public void run()
    {
        if(this.getName().equals("add"))
        {
            add();
        }
        if(this.getName().equals("sub"))
        {
            sub();
        }
    }
}
