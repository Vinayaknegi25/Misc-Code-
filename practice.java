import java.util.*;
class practice 
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in); 
        n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        print_arr(arr);       
        sc.close();
    }
    public static void print_arr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");  
        }
        return;
    }
}