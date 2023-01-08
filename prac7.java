import java.util.*;
public class prac7 
{    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        arr=insert_arr(arr);
        arr=sort_arr(arr);
        print_arr(arr);
        sc.close();
    } 
    public static int[] insert_arr(int arr[])
    {
        Scanner sc=new Scanner (System.in);
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        sc.close();
        return arr;
    } 
    public static int[] sort_arr(int arr[]) 
    {
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void print_arr(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    } 
}
