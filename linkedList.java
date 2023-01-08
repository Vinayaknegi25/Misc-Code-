import java.util.*;
class linkedList 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner (System.in);
        LinkedList<Integer> l=new LinkedList<>();
        for(int i=0;i<10;i++)
        {
            int x=sc.nextInt();
            l.add(x);
        }
        l.set(0,0);
        for(int i=0;i<l.size();i++)
        {
            System.out.println(l.get(i));
        }
        sc.close();
    }
    
}
