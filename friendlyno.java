import java.util.*;
class friendly_num
{
    boolean check(int a,int b)
    {
        int sum1=0,sum2=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                sum1+=i;
        }
        for(int i=1;i<=b;i++)
        {
            if(b%i==0)
                sum2+=i;
        }
        if((sum1/a)==(sum2/b))
            return true;
        else
            return false;
    }
}
class friendlyno 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        int a,b;
        System.out.println("enter two numbers");
        a=sc.nextInt();
        b=sc.nextInt();
        friendly_num f=new friendly_num();
        boolean tf;
        tf=f.check(a,b);
        if(tf==true)
            System.out.println("Friendly");
        else
            System.out.println("Not friendly");
        sc.close();
    }
    
}
