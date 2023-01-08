import java.util.*;
class invalid_input extends Exception 
{
    public invalid_input(String str)
    {
        super(str);
    }
}
class calculator 
{
    public void power(int n,int p)
    {
        System.out.println(Math.pow(n,p));
    }
}

public class calc
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n,p;
        n=sc.nextInt();
        p=sc.nextInt();
        calculator obj=new calculator();
        try
        {
            if(n<0 || p<0)
            {
                sc.close();
                throw new invalid_input("wrong range of characters");
            }
            else
                obj.power(n,p);

        }
        catch(invalid_input s)
        {
           System.out.println(s);
        }
        sc.close();
    }   

}