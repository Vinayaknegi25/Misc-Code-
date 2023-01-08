import java.util.*;
public class Q12 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("size of array A") ;
        int p=sc.nextInt();
        int [] a=new int[p];
        for(int i=0;i<p;i++)
            a[i]=sc.nextInt();
        System.out.println("size of array B") ;
        int q=sc.nextInt();
        int []b=new int[q];
        for(int i=0;i<q;i++)
            b[i]=sc.nextInt();
        
        sc.close();
    }
    
}
