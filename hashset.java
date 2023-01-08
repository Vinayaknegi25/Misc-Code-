import java.util.*;
public class hashset 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        HashSet<String> hs=new HashSet<String>();
        for(int i=0;i<10;i++)
        {
            String s=sc.nextLine();
            hs.add(s);
        }
        Iterator<String> itr=hs.iterator();
        System.out.println("DATA");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        sc.close();
    }
    
}
