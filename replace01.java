import java.util.*;
public class replace01 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        n=replace_num(n);
        System.out.println(n);
        sc.close();
    }
    public static int replace_num(int num)
    {
        int a=num;
        int d;
        while(a!=0)
        {
            d=a%10;
            if(d==0)
                num=num*10+1;
            else
                num=num*10+d;
            a=a/10;
        }
        return num;
        
    }
    
}
