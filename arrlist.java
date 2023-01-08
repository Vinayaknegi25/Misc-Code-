import java.util.*;
class arrlist 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        int num;
        ArrayList<Integer> arr=new ArrayList<Integer>(n);
        for(int i=0; i<n; i++)
        {
            num=sc.nextInt();
            arr.add(num);
        }
        System.out.println(arr);
        Collections.sort(arr);
        System.out.println("After sort"+arr);
        System.out.println("After zigzag"+arr);
        sc.close();
    }    
}
