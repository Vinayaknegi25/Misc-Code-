import java.util.*;
class cannot_be_larger extends Exception 
{
    public cannot_be_larger(String str)
    {
        super(str);
    }
}
class same_digit extends Exception 
{
    public same_digit(String str)
    {
        super(str);
    }
}
class custom_exception 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int num=1;
        try
        {
            int x=sc.nextInt(); 
            if(num==x)
            {
                throw new same_digit("both numbers cannot be same");
            }
            if(num>x)
            {
                throw new cannot_be_larger("number cannot be greater than " + x);
            }
            else
            {
                System.out.println("Normal execution");
            }
        }
        catch(same_digit s)
        {
            System.out.println(s);
        }
        catch(cannot_be_larger s)
        {
            System.out.println(s);
        }
        finally
        {
            System.out.println("this block is executed");   
        }

        
    }

    
}
