import java.util.*;
public class palindromestr 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        String str=sc.nextLine();
        int low=0;int high=str.length()-1;
        int f=0;
        while(low<high)
        {
            if(str.charAt(low)!=str.charAt(high))
            {
                System.out.println("NO");
                f=1;
                break;
            }
            low++;
            high--;
        }
        if(f==0)
            System.out.println("YES");
        sc.close();
    }
    
}
