import java.util.*;
public class arraysort
{
    public static void main(String []args)
    {
        Scanner sc =new Scanner(System.in);
        int [] arr=new int[10];
        int n;
        System.out.println("enter elements of array");
        for(int i=0;i<10;i++)
        {
            n=sc.nextInt();
            arr[i]=n;
        } 
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = i + 1; j < arr.length; j++) 
            {
                int temp = 0;
                if (arr[j] < arr[i])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        arraysort obj=new arraysort();
        obj.ziggy(arr);
        sc.close();
    }
    void ziggy(int[] arr)
    {
        int temp=0;
        for(int i=0;i<9;i=i+2)
        {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
