import java.util.*;
public class prac2 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        int n;
        n=sc.nextInt();
        int []arr=new int[n];
        my_method(arr);
        sc.close();
    }
    public static void my_method(int arr[])
    {
        Scanner sc=new Scanner (System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        print_arr(arr);
        sc.close();
    }
    public static void print_arr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+",");
    }
    
    
}
