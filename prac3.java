import java.util.*;
public class prac3 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str=sc.nextLine();
        str=show_str(str);
        System.out.print(str);
        sc.close();
    }
    public static String show_str(String str)
    {   
        str=str.toUpperCase();
        return str;
    }
    
}
