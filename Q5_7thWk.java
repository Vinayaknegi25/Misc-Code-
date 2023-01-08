import java.util.*;
public class Q5_7thWk
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        String str;
        str=sc.nextLine();
        str=str_reverse(str);
        System.out.print(str);
        sc.close();
    }
    public static String str_reverse(String str)
    {
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        str=sb.toString();
        return str;
    } 
    
}
