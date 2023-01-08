import java.util.*;
public class sort 
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter size of n");
        int n=sc.nextInt();int num;
        ArrayList<Integer> arr=new ArrayList<Integer>(n);
        for(int i=0;i<n;i++)
        {
            num=sc.nextInt();
            arr.add(num);
        }
        Collections.sort(arr);
        System.out.println(arr);
        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);
        sc.close();
    }
    
}
