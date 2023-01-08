import java.util.*;
class exceptionhand
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        int n=100;
        try
        {
            int res=n/0;
            System.out.println(res);
            System.out.println("code inside try block");
        }
        catch (ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("code inside catch block");
        }
        finally
        {
            System.out.println("code inside finally block");
        }
        System.out.println("code inside main");
        sc.close();
    }
    
}
